package action;

import javax.servlet.http.HttpServletRequest;

public class SelectAction {

	//戻り値に設定するページを初期設定しておく
	String page="/WEB-INF/jsp/login.jsp";

	//検索して、検索一覧ページに飛ぶメソッド
	public String serch(HttpServletRequest request) {

		return page;
	}

	//詳細画面に飛ぶメソッド
	public String goToDetail(HttpServletRequest request) {

		//リクエスト領域からsIdを持ってくる。
		String sId = request.getParameter("sId");

		//StudentDaoを実体化
		//EventDaoを実体化
		//InternDaoを実体化
		//SelectionEasyDaoを実体化
		//SelectionFaceDaoを実体化
		//SelectionText

		return page;
	}

	//テンプレを選択するし、次のページに飛ぶメソッド
	public String selectTemplate(HttpServletRequest request) {

		return page;
	}

	//フィードバックページに飛ぶメソッド
	public String goToFeedbak(HttpServletRequest request) {

		return page;
	}


}
