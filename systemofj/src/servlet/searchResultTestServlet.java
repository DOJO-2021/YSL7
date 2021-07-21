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
@WebServlet("/SearchResultTestServlet")
public class SearchResultTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("FLG")!=null) {
			this.doPost(request, response);
		}else {
			//serchs.jpにフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/search.jsp");
			dispatcher.forward(request, response);
		}
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
					path = "/WEB-INF/jsp/studentResult.jsp";
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
				if(FLG.equals("login")) {
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
				//検索画面
				if(page_id.equals("search")) {
					//検索
					if(submit.equals("検索") || submit.equals("検索する")) {
						path = SelectAction.search(request);
					}
				}
				//検索結果画面
				if(page_id.equals("searchResult")) {
					//チェックボックス入力時
					//*************************注意***********************
					if(submit.equals("aj")) {
						path = UpdateDeleteAction.flagUpdate(request);
					}
					//編集ボタン
					if(submit.equals("編集")) {
						path = "/WEB-INF/jsp/allEdit.jsp";
					}
					//メール作成ボタン
					if(submit.equals("メール作成")) {
						path = SelectAction.selectTemplate(request);
					}
					//詳細ボタン
					if(submit.equals("詳細")) {
						path = SelectAction.goToDetail(request);
					}
				}
			}
			//検索ページへとぶ
			if(FLG!= null) {
				if(FLG.equals("search")) {
					//検索ページへのパスを入れる
					path = "/WEB-INF/jsp/search.jsp";
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

				}
				//データ編集画面
				if(page_id.equals("studentsEdit")) {
					//更新ボタン
					if(submit.equals("更新")) {
						path = UpdateDeleteAction.studentUpdate(request);
						UpdateDeleteAction.selectionEasyUpdate(request);
						UpdateDeleteAction.eventUpdate(request);
						UpdateDeleteAction.internUpdate(request);
						UpdateDeleteAction.selectionFaceUpdate(request);
						UpdateDeleteAction.selectionTextUpdate(request);
					}
					if(submit.equals("詳細")) {
						path = SelectAction.goToDetail(request);
					}
				}
				//一括編集画面
				if(page_id.equals("allEdit")) {
					//更新ボタン
					if(submit.equals("一括更新")) {
						path = UpdateDeleteAction.allUpdate(request);
					}
				}


				//メール作成（テンプレ選択）画面
				if(page_id.equals( "mailtemplate")) {
					//テンプレ選択ボタン
					if(submit.equals("テンプレ使用")){
						path = SelectAction.selectTemplate(request);
					}
					if(submit.equals("テンプレ編集")){
						path = SelectAction.selectTemplate(request);
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


			RequestDispatcher dispatcher = request.getRequestDispatcher(path);
			dispatcher.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}

