package action;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import service.UpdateDeleteService;

public class UpdateDeleteAction {

	public String TemplateUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int tId = Integer.parseInt(request.getParameter("tId"));
		String tTitle = request.getParameter("tTitle");
		String tContent = request.getParameter("tContent");
		String tCategory = request.getParameter("tCategory");

		//出力値を格納するBean
		boolean temp = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			temp = service.TemplateUpdate(tId, tTitle, tContent, tCategory);

			if (temp == true) {

				request.setAttribute("template", temp);
				//（成功）
				request.setAttribute("errMsg", "編集成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "編集失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}


	public String StudentUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));
		String sName = request.getParameter("sName");
		String sKana = request.getParameter("sKana");
		String sContents = request.getParameter("sContents");
		String sUnivercity = request.getParameter("sUnivercity");
		String sFaculy = request.getParameter("sFaculy");
		String sDepartment = request.getParameter("sDepartment");
		String sAddress = request.getParameter("sAddress");
		String sPcMail = request.getParameter("sPcMail");
		String sMobileMail = request.getParameter("sMobileMail");
		String sCareertasu = request.getParameter("sCareertasu");
		String sMynavi = request.getParameter("sMynavi");
		String sRikunavi = request.getParameter("sRikunavi");
		String sOther = request.getParameter("sOther");
		int allEditFlag = Integer.parseInt(request.getParameter("allEditFlag"));

		//出力値を格納するBean
		boolean student = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			student = service.StudentUpdate(sId,sName, sKana, sContents, sUnivercity, sFaculy, sDepartment, sAddress, sPcMail, sMobileMail, sCareertasu, sMynavi, sRikunavi, sOther, allEditFlag );

			if (student == true) {

				request.setAttribute("template", student);
				//（成功）
				request.setAttribute("errMsg", "編集成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "編集失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}

	public String EventeUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));
		String eCategory = request.getParameter("eCategory");
		String eDatetest =request.getParameter("eDate");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = sdf.format(eDatetest);
		Date  eDate  = Date.valueOf(str);
		//String eDate =request.getParameter("eDate");
		int eId = Integer.parseInt(request.getParameter("eId"));


		//出力値を格納するBean
		boolean event = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			event = service.EventUpdate(sId, eCategory, eDate, eId);

			if (event == true) {

				request.setAttribute("Event", event);
				//（成功）
				request.setAttribute("errMsg", "編集成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "編集失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}

	public String InternUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));
		String iCategory = request.getParameter("iCategory");
		String iDatetest =request.getParameter("iDate");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = sdf.format(iDatetest);
		Date  iDate  = Date.valueOf(str);
		String iMeeting = request.getParameter("iMeeting");
		String iSubmit = request.getParameter("iSubmit");
		String iAcceptace = request.getParameter("iAcceptace");
		String iDocument = request.getParameter("iDocument");
		int   iId = Integer.parseInt(request.getParameter("iId"));
		String iAttend = request.getParameter("iAttend");
		String applyFlagtest =request.getParameter("applyFlag");
		SimpleDateFormat aft = new SimpleDateFormat("yyyy-MM-dd");
		String apl = aft.format(applyFlagtest);
		Date  applyFlag  = Date.valueOf(apl);

		//出力値を格納するBean
		boolean intern = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			intern = service.InternUpdate(sId, iCategory, iDate, iMeeting, iSubmit, iAcceptace, iDocument, iId, iAttend, applyFlag);

			if (intern == true) {

				request.setAttribute("intern", intern);
				//（成功）
				request.setAttribute("errMsg", "編集成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "編集失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}

	public String SelectionTextUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));
		String stCategory = request.getParameter("stCategory");
		String stName = request.getParameter("stName");
		int stScore = Integer.parseInt(request.getParameter("stScore"));
		int stId = Integer.parseInt(request.getParameter("stId"));

		//出力値を格納するBean
		boolean st = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			st = service.SelectionTextUpdate(sId, stCategory, stName, stScore, stId);

			if (st == true) {

				request.setAttribute("SelectionText", st);
				//（成功）
				request.setAttribute("errMsg", "編集成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "編集失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}

	public String FeedbackUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int fId = Integer.parseInt(request.getParameter("fId"));
		int sId= Integer.parseInt(request.getParameter("sId"));
		String fCategory = request.getParameter("fCategory");
		String fName = request.getParameter("fName");
		String fContent = request.getParameter("fContent");


		//出力値を格納するBean
		boolean fb = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			fb = service.FeedbackUpdate(fId, sId, fCategory, fName, fContent);

			if (fb == true) {

				request.setAttribute("feedback", fb);
				//（成功）
				request.setAttribute("errMsg", "編集成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "編集失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}


	public String SelectionEasyUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));
		String SEtest =request.getParameter("seSelectionDate");
		SimpleDateFormat se = new SimpleDateFormat("yyyy-MM-dd");
		String str = se.format(SEtest);
		Date  seSelectionDate  = Date.valueOf(str);

		String iMeeting = request.getParameter("iMeeting");
		String iSubmit = request.getParameter("iSubmit");
		String iAcceptace = request.getParameter("iAcceptace");
		String iDocument = request.getParameter("iDocument");
		int   iId = Integer.parseInt(request.getParameter("iId"));
		String iAttend = request.getParameter("iAttend");
		String applyFlagtest =request.getParameter("applyFlag");
		SimpleDateFormat aft = new SimpleDateFormat("yyyy-MM-dd");
		String apl = aft.format(applyFlagtest);
		Date  applyFlag  = Date.valueOf(apl);

		//出力値を格納するBean
		boolean intern = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			intern = service.InternUpdate(sId, iCategory, iDate, iMeeting, iSubmit, iAcceptace, iDocument, iId, iAttend, applyFlag);

			if (intern == true) {

				request.setAttribute("intern", intern);
				//（成功）
				request.setAttribute("errMsg", "編集成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "編集失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}

}
