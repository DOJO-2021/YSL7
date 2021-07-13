package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import model.SEvent;
import model.Student;
import service.SelectService;

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
		int sId = Integer.parseInt(request.getParameter("sId"));

		//selectServiceを実体化
		SelectService service = new SelectService();

		//Studentの情
		Student student = service.studentSelect(sId);

		//SEvent
		ArrayList<SEvent> events = service.eventSelect(sId);

		//SIntern
		//SSelectionEazy
		//SSelectionFace
		//SSelectionText


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
