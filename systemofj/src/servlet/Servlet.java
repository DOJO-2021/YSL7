package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.LoginAction;
import action.RegistAction;
import action.SelectAction;
import action.UpdateDeleteAction;
import action.UploadAction;
/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("user") == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			dispatcher.forward(request, response);
		}
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			//			if (session.getAttribute("user") == null) {
			//				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			//				dispatcher.forward(request, response);
			//			}
			request.setCharacterEncoding("UTF-8");
			String path = null;
			String result = null;
			String submit = request.getParameter("submit");
			String page_id = request.getParameter("page_id");
			String FLG = request.getParameter("FLG");
			String pageload = request.getParameter("pageload");
			String checkbox = request.getParameter("checkbox");

			System.out.println(FLG);
			UpdateDeleteAction UpdateDeleteAction = new UpdateDeleteAction();
			SelectAction SelectAction = new SelectAction();
			RegistAction RegistAction = new RegistAction();
			LoginAction LoginAction = new LoginAction();
			UploadAction UploadAction = new UploadAction();
			if (session.getAttribute("user") == null) {
				path = "/WEB-INF/jsp/login.jsp";
			}
			if(FLG!= null) {
				if(FLG.equals("upload")) {
					//アップロードページへのパスを入れる
					path = "/WEB-INF/jsp/upload.jsp";
				}
				if(FLG.equals("search")) {
					//検索ページへのパスを入れる
					path = "/WEB-INF/jsp/search.jsp";
				}
				if(FLG.equals("analysis")) {
					//分析ぺージへのパスを入れる
					path = "/WEB-INF/jsp/analysis.jsp";
				}
				if(FLG.equals("studentRegist")) {
					//学生登録ページへのパスを入れる
					path = "/WEB-INF/jsp/studentsRegist.jsp";
				}
				if(FLG.equals("templateRegist")) {
					//テンプレート登録ページへのパスを入れる
					path = "/WEB-INF/jsp/templateRegist.jsp";
					System.out.println(path);
				}
				if(FLG.equals("templateEdit")) {
					//テンプレート編集ページへのパスを入れる
					path = SelectAction.selectTemplate(request);

				}
				if(FLG.equals("logout")) {
					//ログインページへのパスを入れる
					session.invalidate();
					path = "/WEB-INF/jsp/login.jsp";
				}
			}
			System.out.println(FLG);
			//ログイン画面
			if(FLG == null && page_id != null) {
				if(page_id.equals("login")) {
					if(submit.equals("LOGIN")) {
						path = LoginAction.Login(request);
					}
				}
				//アップロード画面
				//アップロード
				if(page_id.equals("upload")) {
					if(submit.equals("アップロード")){
						path = UploadAction.upload(request, getServletContext());
					}
					//削除
					if(submit.equals("削除")) {
						result = "アップロードした内容を削除しました。";
						request.setAttribute("result", result);
						path = "/WEB-INF/jsp/result.jsp";
					}
				}
				//トップページ
				//検索画面
				if(page_id.equals("search")) {
					//検索
					if(submit.equals("検索") || submit.equals("検索する")) {
						path = SelectAction.search(request);
					}
				}
				//検索結果画面
				if(page_id.equals("searchResult")) {
					//検索結果画面に遷移したタイミングでフラグ1のものを0に
					//*************************注意***********************
					if(pageload != null) {
						if(pageload.equals("aj")) {
							path = UpdateDeleteAction.flagDelete(request);
						}
					}
					//チェックボックスに記入された人のフラグを1に
					if(checkbox != null) {
						if(checkbox.equals("checkbox")) {
							path = UpdateDeleteAction.flagUpdate(request);
						}
					}
					//編集ボタン
					if(submit.equals("編集")) {
						path = "/WEB-INF/jsp/allEdit.jsp";
					}
					//詳細ボタン
					if(submit.equals("詳細")) {
						path = SelectAction.goToDetail(request);
					}
					//メール送信ボタン
					if(submit.equals("メール送信")) {
						path = SelectAction.selectTemplate(request);
					}
				}
				//詳細画面
				if(page_id.equals("detail")) {
					//メール作成ボタン
					if(submit.equals("メール作成") || submit.equals("ts_regist_button")) {
						path = SelectAction.selectTemplate(request);
					}
					//フィードバックボタン
					if(submit.equals("フィードバック")) {
						path = SelectAction.goToFeedbak(request);
					}
					//編集ボタン
					if(submit.equals("編集")) {
						path = SelectAction.goToDetail(request);
					}
					//削除ボタン
					if(submit.equals("削除")) {
						path = UpdateDeleteAction.studentDelete(request);
					}
				}
				//データ編集画面
				if(page_id.equals("studentsEdit")) {
					//更新ボタン
					if(submit.equals("更新")) {
						path = UpdateDeleteAction.studentUpdate(request);
					}
					if(submit.equals("戻る")) {
						path = SelectAction.goToDetail(request);
					}
				}
				//一括編集画面
				if(page_id.equals("allEdit")) {
					//更新ボタン
					if(submit.equals("一括更新")) {
						path = UpdateDeleteAction.allUpdate(request);
					}
					if(submit.equals("戻る")) {

					}
				}
				//学生の新規登録画面
				if(page_id.equals("studentRegist")) {
					//登録ボタン
					if(submit.equals( "登録")) {
						path = RegistAction.StudentRegist(request);
						System.out.println(path);
					}
				}
				//フィードバック画面
				if(page_id.equals("feedback")) {
					//検索ボタン
					if(submit.equals("検索")) {
						path = SelectAction.goToFeedbak(request);
					}
					//登録ボタン・フィードバックまとめ登録ボタン
					if(submit.equals("登録ボタン") || submit.equals( "フィードバックまとめ登録ボタン")) {
						path = RegistAction.FeedbackRegist(request);
					}
					//更新ボタン・フィードバックまとめ更新ボタン
					if(submit.equals("更新ボタン" )|| submit.equals( "フィードバックまとめ更新ボタン")) {
						path = UpdateDeleteAction.feedbackUpdate(request);
					}
				}
				//テンプレ登録画面
				if(page_id.equals( "templateRegist")) {
					//テンプレ登録ボタン
					if(submit.equals("テンプレ登録ボタン")){
						path = RegistAction.TemplateRegist(request);
					}
				}
				//テンプレ検索画面
				if(page_id.equals("templateEdit")) {
					//検索ボタン
					if(submit.equals("検索")) {
						path = SelectAction.selectTemplate(request);
					}
				}
				//テンプレ更新画面
				if(page_id.equals("templateEdit")) {
					//テンプレ更新ボタン
					if(submit.equals("テンプレ更新ボタン")) {
						path = UpdateDeleteAction.templateUpdate(request);
					}
				}
				System.out.println("最後です");
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(path);
			dispatcher.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
