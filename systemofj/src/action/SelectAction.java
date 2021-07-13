package action;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import model.SEvent;
import model.SIntern;
import model.SSelectionEasy;
import model.SSelectionFace;
import model.SSelectionText;
import model.Student;
import service.SelectService;

public class SelectAction {

	//検索して、検索一覧ページに飛ぶメソッド
	public String serch(HttpServletRequest request) {
		try {

			//何で検索されたかを判断するためのmode
			String mode = request.getParameter("mode");


		} catch(SQLException e) {
			request.setAttribute("errMsg", "SQLExceptionだよー");
			return "/WEB-INF/jsp/search.jsp";
		} catch(ClassNotFoundException e) {
			request.setAttribute("errMsg", "lassNotFoundExceptionだよー");
			return "/WEB-INF/jsp/search.jsp";
		}

		return "/WEB-INF/jsp/searchResult.jsp";
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
			ArrayList<SIntern> interns = service.internSelect(sId);

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

	//テンプレを選択するし、次のページに飛ぶメソッド
	public String selectTemplate(HttpServletRequest request) {

		return;
	}

	//フィードバックページに飛ぶメソッド
	public String goToFeedbak(HttpServletRequest request) {

		return ;
	}


}
