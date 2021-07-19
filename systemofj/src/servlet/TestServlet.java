package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		if(request.getParameter("FLG")!=null) {
			this.doPost(request, response);
		}else {
			//トップページにフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/top.jsp");
			dispatcher.forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String path = null;

		if(request.getParameter("FLG")!= null) {
			if(request.getParameter("FLG").equals("アップロード")) {
				//アップロードページへのパスを入れる
				path = "/WEB-INF/jsp/upload.jsp";
			}
			if(request.getParameter("FLG").equals("検索")) {
				//検索ページへのパスを入れる
				path = "/WEB-INF/jsp/search.jsp";
			}
			if(request.getParameter("FLG").equals("分析")) {
				//分析ぺージへのパスを入れる
				path = "/WEB-INF/jsp/analysis.jsp";
			}
			if(request.getParameter("FLG").equals("学生の新規登録")) {
				//学生登録ページへのパスを入れる
				path = "/WEB-INF/jsp/studentResult.jsp";
			}
			if(request.getParameter("FLG").equals("テンプレート登録")) {
				//テンプレート登録ページへのパスを入れる
				path = "/WEB-INF/jsp/templateRegist.jsp";
			}
			if(request.getParameter("FLG").equals("ログアウト")) {
					//ログインページへのパスを入れる
					path = "/WEB-INF/jsp/login.jsp";
				}




			//その他のjspにも直で飛べるようにする
			if(request.getParameter("FLG").equals("学生データ詳細")) {
				//詳細ページへのパスを入れる
				path = "/WEB-INF/jsp/detail.jsp";
			}
			if(request.getParameter("FLG").equals("フィードバック登録・更新")) {
				//フィードバックページへのパスを入れる
				path = "/WEB-INF/jsp/feedback.jsp";
			}

			if(request.getParameter("FLG").equals("検索結果")) {
				//検索結果ページへのパスを入れる
				path = "/WEB-INF/jsp/searchResult.jsp";
			}
			if(request.getParameter("FLG").equals("一括編集")) {
				//一括編集ページへのパスを入れる
				path = "/WEB-INF/jsp/allEdit.jsp";
			}

			if(request.getParameter("FLG").equals("テンプレ編集")) {
				//テンプレ編集ページへのパスを入れる
				path = "/WEB-INF/jsp/templateEdit.jsp";
			}
			if(request.getParameter("FLG").equals("処理結果")) {
				//処理結果ページへのパスを入れる
				path = "/WEB-INF/jsp/result.jsp";
			}




		}
//		if(request.getParameter("t_upload")!= null){
//			path = "/WEB-INF/jsp/upload.jsp";
//		}
//		if(request.getParameter("t_search")!= null){
//			path = "/WEB-INF/jsp/search.jsp";
//		}
//		if(request.getParameter("t_template")!= null){
//			path = "/WEB-INF/jsp/templateRegist.jsp";
//		}
//		if(request.getParameter("t_analysis")!= null){
//			path = "/WEB-INF/jsp/analysis.jsp";
//		}
//		if(request.getParameter("t_regist")!= null){
//			path = "/WEB-INF/jsp/studentRegist.jsp";
//		}
//		if(request.getParameter("t_logout")!= null){
//			path = "/WEB-INF/jsp/login.jsp";
//		}
//		if(request.getParameter("login")!= null){
//			path = LoginAction.Login(request);
//		}

		System.out.println(path+"aaaaa");

		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);

	}

}