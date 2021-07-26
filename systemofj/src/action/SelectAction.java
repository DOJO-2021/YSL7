package action;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.SEvent;
import model.SFeedback;
import model.SIntern;
import model.SSelectionEasy;
import model.SSelectionFace;
import model.SSelectionText;
import model.SearchResult;
import model.Student;
import model.Template;
import model.User;
import service.SelectService;

public class SelectAction {

	//検索して、検索一覧ページに飛ぶメソッド
	public String search(HttpServletRequest request) {
		try {

			//何で検索されたかを判断するためのmode
			String mode = request.getParameter("mode");
			//ラジオボタンのvalueを取得
			String searchValue = request.getParameter("search_item");
			System.out.println(mode);

			String year = "";
			String date = "";
			//検索結果を入れる配列
			ArrayList<SearchResult>list = new ArrayList<>();

			//年か日付は必ず注力した状態でのみ検索できる
			//ただし、選考で検索された場合は日付、年ともに送られてこない
			if (!mode.equals("selection") || !mode.equals("name")) {
				year = request.getParameter("year");
				date = request.getParameter("date");
				if (year == null) {//年未入力の場合
					//何もしない
				} else if (date == null) {//日付未入力の場合
					date = year + "%";
				} else {//日付も年度も入力されていた場合
					//何もしない（日付が優先）
				}

			}


			//SelectServiceを実体化
			SelectService service = new SelectService();

			if(mode.equals("intern")) {//インターン検索がされた場合
				if (searchValue.equals("internAll")) {
					list = service.searchInternList("%", date);
				} else {
					list = service.searchInternList(searchValue, date);
				}

			} else if(mode.equals("event")) {//イベント検索がされた場合

				//説明会だけはインターンテーブルに入ってるから
//				if (searchValue.equals("説明会")) {
//
//					list = service.searchInternList(searchValue, date);
//
//				} else {

					list = service.searchEventList(searchValue, date);
					System.out.println(searchValue);
				}


			 else if(mode.equals("selection")) {//選考検索がされた場合

				list = service.searchEntryList(searchValue);
				System.out.println(searchValue);


			} else {//個人名検索

				list = service.searchName(searchValue);
				System.out.println(searchValue);

			}

			request.setAttribute("list",list);
			request.setAttribute("mode", mode);
			for(SearchResult e : list ) {
				System.out.println(e.getsName()+"aaa");

			}
			return "/WEB-INF/jsp/searchResult.jsp";


		} catch(SQLException e) {
			request.setAttribute("errMsg", "SQLExceptionだよー");
			System.out.println("SQLExceptionだよー");
			return "/WEB-INF/jsp/search.jsp";
		} catch(ClassNotFoundException e) {
			request.setAttribute("errMsg", "lassNotFoundExceptionだよー");
			System.out.println("lassNotFoundExceptionだよー");
			return "/WEB-INF/jsp/search.jsp";
		}

	}

	//詳細画面に飛ぶメソッド
	public String goToDetail(HttpServletRequest request) {

		try {
			//リクエスト領域からsIdを持ってくる。
			int sId = Integer.parseInt(request.getParameter("sId"));

			//selectServiceを実体化
			SelectService service = new SelectService();

			//Studentの情報取得
			Student student = service.studentSelect(sId);

			//SEventの情報取得
			ArrayList<SEvent> events = service.eventSelect(sId);
			//模擬面接、座談会、合説で分ける
			ArrayList<SEvent> mock = new ArrayList<>();
			ArrayList<SEvent> talk = new ArrayList<>();
			String con = "　";

			for (SEvent e : events) {
				if (e.geteCategory().contains("模擬")) {//模擬面接だった場合
					mock.add(e);
				} else if (e.geteCategory().contains("座談会")) {//座談会だった場合
					talk.add(e);
				} else if (e.geteCategory().contains("合")) {//合説だった場合
					con = e.geteDate();
				}

			}

			//SInternの情報取得
			ArrayList<SIntern> interns = service.internDSelect(sId);
			ArrayList<SIntern> intern = new ArrayList<>();
			SIntern exp = new SIntern();
			//説明会とそれ以外を分ける。

			for (SIntern e : interns) {
				System.out.println(e.getiCategory());
				if(e.getiCategory().contains("説明会")) {
					exp = e;
				} else {
					intern.add(e);
				}

			}

			//SSelectionEazyの情報取得
			SSelectionEasy eazy = service.selectionEasySelect(sId);


			//SSelectionFaceの情報取得
			ArrayList<SSelectionFace> faces = service.selectionfaceSelect(sId);
			ArrayList<SSelectionFace> face1 = new ArrayList<>();
			ArrayList<SSelectionFace> face2 = new ArrayList<>();

			//1次面接、２次面接に分類する
			for (SSelectionFace e : faces) {
				if (e.getSfCategory().contains("一次")) {
					face1.add(e);
				} else if (e.getSfCategory().contains("二次")) {
					face2.add(e);
				}
			}



			//SSelectionTextの情報取得
			ArrayList<SSelectionText> texts = service.selectiontextSelect(sId);

			//履歴書、PR、書類に分類する。
			ArrayList<SSelectionText> resume = new ArrayList<>();
			ArrayList<SSelectionText> pr = new ArrayList<>();
			ArrayList<SSelectionText> text = new ArrayList<>();

			for (SSelectionText e : texts) {
				if (e.getStCategory().contains("履歴書")) {
					resume.add(e);
				} else if(e.getStCategory().contains("PR")) {
					pr.add(e);
				} else if (e.getStCategory().contains("書類")) {
					text.add(e);
				}
			}


			//上で取得した情報をすべてsetAttribute
			request.setAttribute("student", student);
			request.setAttribute("mock", mock);
			request.setAttribute("talk", talk);
			request.setAttribute("con", con);
			request.setAttribute("intern", intern);
			request.setAttribute("exp", exp);
			request.setAttribute("eazy", eazy);
			request.setAttribute("face1", face1);
			request.setAttribute("face2", face2);
			request.setAttribute("resume", resume);
			request.setAttribute("pr", pr);
			request.setAttribute("text", text);


			String submit = request.getParameter("submit");

			//編集画面に飛びます
			if (submit != null) {
				if (submit.equals("編集")) {
					return "/WEB-INF/jsp/studentsEdit.jsp";
				}
			}

			//詳細画面に飛びます
			return "/WEB-INF/jsp/detail.jsp";

		} catch(SQLException e) {
			e.printStackTrace();
			request.setAttribute("errMsg", "SQLExceptionだよー");
			System.out.println("SQLExceptionだよー");
			return "/WEB-INF/jsp/search.jsp";
		} catch(ClassNotFoundException e) {
			request.setAttribute("errMsg", "lassNotFoundExceptionだよー");
			System.out.println("lassNotFoundExceptionだよー");
			return "/WEB-INF/jsp/search.jsp";
		}
	}

	//テンプレを選択し、次のページに飛ぶメソッド
	public String selectTemplate(HttpServletRequest request) {

		try {
			//どのテンプレが選択されたかの情報を入手
			String stringtId = request.getParameter("tId");
			//ボタンの値を入手
			String submit = request.getParameter("submit");

			if (stringtId == null) {//テンプレ選択のページに飛ぶ

				SelectService service = new SelectService();
				//プルダウンに表示するものを入手する処理
				ArrayList<Template> intern = service.templateInternTitleSelect();
				ArrayList<Template> event = service.templateSeminarTitleSelect();
				ArrayList<Template> selection = service.templateFaceTitleSelect();
				ArrayList<Template> other = service.templateOtherTitleSelect();
				request.setAttribute("intern", intern);
				request.setAttribute("event", event);
				request.setAttribute("selection", selection);
				request.setAttribute("other", other);


				return "/WEB-INF/jsp/mailTemplate.jsp";
			} else {
				int tId = Integer.parseInt(stringtId);

				//学生の名前を入手
				String sName = request.getParameter("sName");

				//人事の名前を入手
				HttpSession session = request.getSession();
				User user = (User)session.getAttribute("user");
				String uName = user.getuName();

				//大学名を入手
				String sUnivercity = request.getParameter("sUnivercity");


				//selectServiceを実体化
				SelectService service = new SelectService();

				//テンプレに実名や大学名を入れる。
				Template template = service.templateSelect(tId);

				//テンプレ検索の場合
				if(submit != null) {
					if(submit.equals("検索")) {
						request.setAttribute("template", template);
						return "/WEB-INF/jsp/templateEdit.jsp";
					}
				}

				//テンプレ選択の場合
				String content = template.gettContent();
				content = content.replace("学生の名前が入ります", sName);
				content = content.replace("あなたの名前が入ります", uName);
				content = content.replace("学生の大学名が入ります", sUnivercity);
				template.settContent(content);

				request.setAttribute("template", template);
				return "/WEB-INF/jsp/mail.jsp";
			}
		}catch(SQLException e) {
			e.printStackTrace();
			request.setAttribute("errMsg", "SQLExceptionだよー");
			System.out.println("SQLExceptionだよー");
			return "/WEB-INF/jsp/detail.jsp";
		} catch(ClassNotFoundException e) {
			e.printStackTrace();

			request.setAttribute("errMsg", "lassNotFoundExceptionだよー");
			System.out.println("lassNotFoundExceptionだよー");
			return "/WEB-INF/jsp/detail.jsp";
		}
	}

	//フィードバックページに飛ぶメソッド
	public String goToFeedbak(HttpServletRequest request) {

		try {
			//リクエスト領域からsIdとfCategoryを持ってくる。
			int sId = Integer.parseInt(request.getParameter("sId"));
			String fCategory = request.getParameter("category");

			//フィードバックを入れるリスト
			ArrayList<SFeedback> subList = new ArrayList<>();

			//入れ替えるためのリスト
			//まとめ以外
			ArrayList<SFeedback> list = new ArrayList<>();

			//まとめのみ
			SFeedback all = new SFeedback();

			//selectServiceを実体化
			SelectService service = new SelectService();


			if (fCategory == null) {//詳細ページからフィードバックページに飛ぶとき
				subList = (ArrayList<SFeedback>)service.feedbackSelect(sId, "インターン1DAY");

				if (subList != null) {
				//まとめとそれ以外に分類する
					for (SFeedback i : subList) {
						if (i.getfName().equals("まとめ")) {
							all = i;
						} else {
							list.add(i);
						}
					}
				}


			} else {//フィードバックのカテゴリーを変更した場合
				request.setAttribute("fCategory", fCategory);
				subList = (ArrayList<SFeedback>)service.feedbackSelect(sId, fCategory);

				if (subList != null) {
				//まとめとそれ以外に分類する
					for (SFeedback i : subList) {
						if (i.getfName().equals("まとめ")) {
							all = i;
						} else {
							list.add(i);
						}
					}
				}

			}

			request.setAttribute("list", list);
			request.setAttribute("all", all);
			return "/WEB-INF/jsp/feedback.jsp";

		} catch(SQLException e) {
			request.setAttribute("errMsg", "SQLExceptionだよー");
			System.out.println("SQLExceptionだよー");
			return "/WEB-INF/jsp/feedback.jsp";
		} catch(ClassNotFoundException e) {
			request.setAttribute("errMsg", "lassNotFoundExceptionだよー");
			System.out.println("lassNotFoundExceptionだよー");
			return "/WEB-INF/jsp/feedback.jsp";
		}

	}


}
