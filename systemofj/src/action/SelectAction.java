package action;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import model.SEvent;
import model.SFeedback;
import model.SIntern;
import model.SSelectionEasy;
import model.SSelectionFace;
import model.SSelectionText;
import model.SearchResult;
import model.Student;
import model.Template;
import service.SelectService;

public class SelectAction {

	//検索して、検索一覧ページに飛ぶメソッド
	public String serch(HttpServletRequest request) {
		try {

			//何で検索されたかを判断するためのmode
			String mode = request.getParameter("mode");
			//ラジオボタンのvalueを取得
			String searchValue = request.getParameter("search");
			String year = "";
			String date = "";
			//検索結果を入れる配列
			ArrayList<SearchResult> list = new ArrayList<>();

			//年か日付は必ず注力した状態でのみ検索できる
			//ただし、選考で検索された場合は日付、年ともに送られてこない
			if (!mode.equals("selection")) {
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

				list = service.searchInternList(searchValue, date);

			} else if(mode.equals("event")) {//イベント検索がされた場合

				//説明会だけはインターンテーブルに入ってるから
				if (searchValue.equals("説明会")) {

					list = service.searchInternList(searchValue, date);

				} else {

					list = service.searchEventList(searchValue, date);

				}


			} else if(mode.equals("selection")) {//選考検索がされた場合

				list = service.searchSelection(searchValue);


			} else {//個人名検索

				list = service.searchName(searchValue);


			}

			request.setAttribute("list", list);
			return "/WEB-INF/jsp/searchResult.jsp";


		} catch(SQLException e) {
			request.setAttribute("errMsg", "SQLExceptionだよー");
			return "/WEB-INF/jsp/search.jsp";
		} catch(ClassNotFoundException e) {
			request.setAttribute("errMsg", "lassNotFoundExceptionだよー");
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

			//SInternの情報取得
			ArrayList<SIntern> interns = service.internDSelect(sId);

			//SSelectionEazyの情報取得
			SSelectionEasy eazy = service.selectioneasySelect(sId);

			//SSelectionFaceの情報取得
			ArrayList<SSelectionFace> faces = service.selectionfaceSelect(sId);

			//SSelectionTextの情報取得
			ArrayList<SSelectionText> texts = service.selectiontextSelect(sId);

			//上で取得した情報をすべてsetAttribute
			request.setAttribute("student", student);
			request.setAttribute("events", events);
			request.setAttribute("interns", interns);
			request.setAttribute("eazy", eazy);
			request.setAttribute("faces", faces);
			request.setAttribute("texts", texts);

			return "/WEB-INF/jsp/detail.jsp";

		} catch(SQLException e) {
			request.setAttribute("errMsg", "SQLExceptionだよー");
			return "/WEB-INF/jsp/search.jsp";
		} catch(ClassNotFoundException e) {
			request.setAttribute("errMsg", "lassNotFoundExceptionだよー");
			return "/WEB-INF/jsp/search.jsp";
		}
	}

	//テンプレを選択し、次のページに飛ぶメソッド
	public String selectTemplate(HttpServletRequest request) {

		//どのテンプレが選択されたかの情報を入手
		String title = request.getParameter("title");

		if (title == null) {//テンプレ選択のページに飛ぶ
			return "/WEB-INF/jsp/mailTemplate.jsp";
		} else {
			//selectServiceを実体化
			SelectService service = new SelectService();

			Template template = service.tenplateSelect(title);

			request.setAttribute("template", template);
			return "/WEB-INF/jsp/mail.jsp";
		}
	}

	//フィードバックページに飛ぶメソッド
	public String goToFeedbak(HttpServletRequest request) {

		//リクエスト領域からsIdを持ってくる。
		int sId = Integer.parseInt(request.getParameter("sId"));
		String fCategory = request.getParameter("fCategory");
		//selectServiceを実体化
		SelectService service = new SelectService();

		if (fCategory == null) {
			request.setAttribute("list.sId", sId);
			return "/WEB-INF/jsp/feedback.jsp";
		} else {
			//フィードバックを入れるリスト
			ArrayList<SFeedback> list = service.feedbackSelect(sId, fCategory);
			request.setAttribute("list", list);
			return "/WEB-INF/jsp/feedback.jsp";
		}

	}


}
