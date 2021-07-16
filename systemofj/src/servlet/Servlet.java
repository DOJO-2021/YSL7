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
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("user") == null) {
			response.sendRedirect("/systemofj/LoginAction");
			return;
		}
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("user") == null) {
			response.sendRedirect("/systemofj/LoginAction");
			return;
		}
		request.setCharacterEncoding("UTF-8");
		String path = null;
		String result = null;
		String submit = request.getParameter("submit");

		UpdateDeleteAction UpdateDeleteAction = new UpdateDeleteAction();
		SelectAction SelectAction = new SelectAction();
		RegistAction RegistAction = new RegistAction();
		LoginAction LoginAction = new LoginAction();
		UploadAction UploadAction = new UploadAction();

		if(request.getParameter("FLG")== null) {
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
			if(request.getParameter("FLG").equals("テンプレート検索")) {
				//テンプレート編集ページへのパスを入れる
				path = SelectAction.templateInternTitleSelect(request);
				path = SelectAction.template

			}
			if(request.getParameter("FLG").equals("ログアウト")) {
				//ログインページへのパスを入れる
				path = "/WEB-INF/jsp/login.jsp";
			}
		}
		if(request.getParameter("t_upload")!= null){
			path = "/WEB-INF/jsp/upload.jsp";
		}
		if(request.getParameter("t_search")!= null){
			path = "/WEB-INF/jsp/search.jsp";
		}
		if(request.getParameter("t_template")!= null){
			path = "/WEB-INF/jsp/templateRegist.jsp";
		}
		if(request.getParameter("t_analysis")!= null){
			path = "/WEB-INF/jsp/analysis.jsp";
		}
		if(request.getParameter("t_regist")!= null){
			path = "/WEB-INF/jsp/studentRegist.jsp";
		}
		if(request.getParameter("t_logout")!= null){
			session.invalidate();
			path = "/WEB-INF/jsp/login.jsp";
		}
		if(request.getParameter("login")!= null){
			path = LoginAction.login(request);
		}

	//ログイン画面


	//アップロード画面
		//アップロード
		if(request.getParameter("FLG")== null) {
			if(submit == "u_upload"){
				path = UploadAction.studentUpload(request);
			}
			//削除
			if(submit == "u_delete") {
				result = "アップロードした内容を削除しました。";
				request.setAttribute("result", result);
				path = "/WEB-INF/jsp/result.jsp";
			}

		//検索画面
			//検索
			if(submit == "search") {
				path = SelectAction.search(request);
			}
//			//インターンで検索
//			if(submit == "searchIntern") {
//				path = SelectAction.searchInternList(request);
//			}
//			//イベントで検索
//			if(submit == "searchEvent") {
//				path = SelectAction.searchEventList(request);
//			}
//			//進捗状況で検索
//			if(submit == "searchEntry") {
//				path = SelectAction.searchEntryList(request);
//			}
		//検索結果画面
			//チェックボックス入力時
			//*************************注意******************
			String checkbox = null;
			checkbox = request.getParameter(checkbox);
			//*************************注意***********************
			if(checkbox != null) {
				path = UpdateDeleteAction.flagUpdate(request);
			}
			//編集ボタン
			if(submit == "selectEdit") {
				path = "/WEB-INF/jsp/allEdit.jsp";
			}
			//詳細ボタン
			if(submit == "detail" || submit == "backToDetail") {
				path = SelectAction.goToDetail(request);

			}
		//詳細画面
			//メール作成ボタン
			if(submit == "createMail" || submit == "ts_regist_button") {
				path = SelectAction.selectTemplate(request);
			}
			//フィードバックボタン
			if(submit == "feedback") {
				SelectAction.fFeedbackSelect(request);
			}


			//編集ボタン
			if(submit == "Edit") {
				path = SelectAction.studentSelect(request);
				SelectAction.selectionEasySelect(request);
				SelectAction.eventSelect(request);
				SelectAction.internSelect(request);
				SelectAction.selectionFaceSelect(request);
				SelectAction.selectionTextSelect(request);
			}
			//削除ボタン
			if(submit == "Delete") {
				path = UpdateDeleteAction.studentDelete(request);
				UpdateDeleteAction.selectionEasyDelete(request);
				UpdateDeleteAction.eventDelete(request);
				UpdateDeleteAction.internDelete(request);
				UpdateDeleteAction.selectionFaceDelete(request);
				UpdateDeleteAction.selectionTextDelete(request);
			}
		//データ編集画面
			//更新ボタン
			if(submit == "update") {
				path = UpdateDeleteAction.studentUpdate(request);
				UpdateDeleteAction.selectionEasyUpdate(request);
				UpdateDeleteAction.eventUpdate(request);
				UpdateDeleteAction.internUpdate(request);
				UpdateDeleteAction.selectionFaceUpdate(request);
				UpdateDeleteAction.selectionTextUpdate(request);
			}
		//一括編集画面
			//更新ボタン
			if(submit == "allUpdate") {

				path = UpdateDeleteAction.allUpdate(request);
			}
		//学生の新規登録画面
			//登録ボタン
			if(submit == "Regist") {
				path = RegistAction.studentInsert(request);
				RegistAction.selectionEasyInsert(request);
				RegistAction.eventInsert(request);
				RegistAction.internInsert(request);
				RegistAction.selectionFaceInsert(request);
				RegistAction.selectionTextInsert(request);
			}
		//フィードバック画面
			//検索ボタン
			if(submit == "fr_search_button") {
				path = SelectAction.feedbackSelect(request);
			}
			//登録ボタン・フィードバックまとめ登録ボタン
			if(submit == "fr_regist_button" || submit == "f_regist_button") {
				path = RegistAction.feedbackInsert(request);
			}
			//更新ボタン・フィードバックまとめ更新ボタン
			if(submit == "fr_update_button" || submit == "f_update_button") {
				path = UpdateDeleteAction.feedbackUpdate(request);
			}
		//テンプレ登録画面
			//テンプレ登録ボタン
			if(submit == "tr_regist_button") {
				path = RegistAction.templateInsert(request);
			}
		//テンプレ検索画面
			//検索ボタン
			if(submit == "ts_regist_button") {
				path =
			}
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
}
