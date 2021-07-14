package action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import service.UpdateDeleteService;

public class UpdateDeleteAction {


	public String update(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int uId = Integer.parseInt(request.getParameter("uId"));

		//出力値を格納するBean
		boolean update = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			update = service.studentDelete(uId);

			if (update == true) {

				request.setAttribute("update", update);
				//（成功）
				request.setAttribute("errMsg", "削除成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "削除失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}

	public String delete(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int uId = Integer.parseInt(request.getParameter("uId"));

		//出力値を格納するBean
		boolean delete = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			delete = service.delete(uId);

			if (delete == true) {

				request.setAttribute("update", delete);
				//（成功）
				request.setAttribute("errMsg", "削除成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "削除失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}


	public String studentUpdate(HttpServletRequest request) {

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

		//出力値を格納するBean
		boolean student = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			student = service.studentUpdate(sId,sName, sKana, sContents, sUnivercity, sFaculy, sDepartment, sAddress, sPcMail, sMobileMail, sCareertasu, sMynavi, sRikunavi, sOther );

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

	public String studentDelete(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));

		//出力値を格納するBean
		boolean SDelete = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			SDelete = service.studentDelete(sId);

			if (SDelete == true) {

				request.setAttribute("studentdelete", SDelete);
				//（成功）
				request.setAttribute("errMsg", "削除成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "削除失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}

	public String flagUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));
		int alleditflag = Integer.parseInt(request.getParameter("alleditflag"));

		//出力値を格納するBean
		boolean flag = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			flag= service.flagUpdate(sId,alleditflag);

			if (flag == true) {

				request.setAttribute("flagupdate", flag);
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

	public String selectionEasyUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));

		String seSelectionDate =request.getParameter("seSelectionDate");

		int seScore = Integer.parseInt(request.getParameter("seScore"));

		int seTextScore = Integer.parseInt(request.getParameter("seTextScore"));

		String seTextResult = request.getParameter("seTextResult");

		String seGetTextDate =request.getParameter("seGetTextDate");

		String seNo =request.getParameter("seNo");

		String seOk =request.getParameter("seOk");

		String seNoreason = request.getParameter("seNoreason");

		String seSendOk =request.getParameter("seSendOk");

		String seEarlyOk =request.getParameter("seEarlyOk");

		String seEarlyNo =request.getParameter("seEarlyNo");

		String seFirstResult = request.getParameter("seFirstResult");
		String seSecondResult = request.getParameter("seSecondResult");

		String seFirstNo =request.getParameter("seFirstNo");

		String seFirstDate =request.getParameter("seFirstDate");

		String seSecondNo =request.getParameter("seSecondNo");

		String seSecondDate =request.getParameter("seSecondDate");

		String seThirdDate =request.getParameter("seThirdDate");


		String seThirdResult = request.getParameter("seThirdResult");

		String seRemarks =request.getParameter("seRemarks");

		String seSituation = request.getParameter("seSituation");


		//出力値を格納するBean
		boolean SelectionEasy = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			SelectionEasy = service.selectionEasyUpdate(sId, seSelectionDate, seScore, seTextScore, seTextResult, seGetTextDate, seNo, seOk, seNoreason, seSendOk, seEarlyOk, seEarlyNo, seFirstResult, seSecondResult,seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate, seThirdResult, seRemarks, seSituation);

			if (SelectionEasy == true) {

				request.setAttribute("selectioneasy", SelectionEasy);
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



	public String selectionEasyDelete(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));


		//出力値を格納するBean
		boolean EasyDelete = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			EasyDelete = service.templateUpdate(sId);

			if (temp == true) {

				request.setAttribute("selectioneasydelete", EasyDelete);
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


	public String TemplateUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int tId = Integer.parseInt(request.getParameter("tId"));
		String tTitle = request.getParameter("tTitle");
		String tContent = request.getParameter("tContent");

		//出力値を格納するBean
		boolean temp = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			temp = service.templateUpdate(tId, tTitle, tContent);

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



	public String eventeUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int eId = Integer.parseInt(request.getParameter("eId"));
		String eDate = request.getParameter("eDate");

//		String eDatetest =request.getParameter("eDate");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		String str = sdf.format(eDatetest);
//		Date  eDate  = Date.valueOf(str);
//		//String eDate =request.getParameter("eDate");
//		int eId = Integer.parseInt(request.getParameter("eId"));


		//出力値を格納するBean
		boolean event = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			event = service.eventUpdate( eId, eDate);

			if (event == true) {

				request.setAttribute("event", event);
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

	public String eventeDelete(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));

//		String eDatetest =request.getParameter("eDate");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		String str = sdf.format(eDatetest);
//		Date  eDate  = Date.valueOf(str);
//		//String eDate =request.getParameter("eDate");
//		int eId = Integer.parseInt(request.getParameter("eId"));


		//出力値を格納するBean
		boolean eDelete = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			eDelete = service.eventUpdate( sId);

			if (eDelete == true) {

				request.setAttribute("eventdelete", eDelete);
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

	public String feedbackUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int fId = Integer.parseInt(request.getParameter("fId"));
		String fName = request.getParameter("fName");
		String fContent = request.getParameter("fContent");


		//出力値を格納するBean
		boolean fb = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			fb = service.feedbackUpdate(fId, fName, fContent);

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

	public String feedbackDelete(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));


		//出力値を格納するBean
		boolean fDelete = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			fDelete = service.feedbackDelete(sId);

			if (fDelete == true) {

				request.setAttribute("feedbackdelete", fDelete);
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


	public String internUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));
		String iCategory = request.getParameter("iCategory");
		String iDate =request.getParameter("iDate");
		String iMeeting = request.getParameter("iMeeting");
		String iSubmit = request.getParameter("iSubmit");
		String iAcceptace = request.getParameter("iAcceptace");
		String iDocument = request.getParameter("iDocument");
		int   iId = Integer.parseInt(request.getParameter("iId"));
		String iAttend = request.getParameter("iAttend");
		String applyFlag =request.getParameter("applyFlag");

		//出力値を格納するBean
		boolean intern = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			intern = service.internUpdate(sId, iCategory, iDate, iMeeting, iSubmit, iAcceptace, iDocument, iId, iAttend, applyFlag);

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

	public String internDelete(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));


		//出力値を格納するBean
		boolean iDelete = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			iDelete = service.internDelete(sId);

			if (iDelete == true) {

				request.setAttribute("feedbackdelete", iDelete);
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

	public String allUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		String sqlContent = request.getParameter("sqlContent");
		String iCategory = request.getParameter("iCategory");

		//出力値を格納するBean
		boolean allUpdate = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			allUpdate = service.allUpdate(sqlContent, iCategory);

			if (allUpdate == true) {

				request.setAttribute("allupdate", allUpdate);
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

	public String selectionFaceUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));
		String sfCategory = request.getParameter("sfCategory");
		String sfName = request.getParameter("sfName");
		int sfScore = Integer.parseInt(request.getParameter("sfScore"));
		int sfId = Integer.parseInt(request.getParameter("sfId"));

		//出力値を格納するBean
		boolean face = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			face = service.selectionFaceUpdate(sId, sfCategory, sfName, sfScore, sfId);

			if (face == true) {

				request.setAttribute("selectionface", face);
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

	public String selectionFaceDelete(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));

		//出力値を格納するBean
		boolean faceDelete = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			faceDelete = service.selectionFaceDelete(sId);

			if (faceDelete == true) {

				request.setAttribute("facedelete", faceDelete);
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


	public String selectionTextUpdate(HttpServletRequest request) {

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

			st = service.selectionTextUpdate(sId, stCategory, stName, stScore, stId);

			if (st == true) {

				request.setAttribute("selectiontext", st);
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



	public String selectionTextDelete(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));

		//出力値を格納するBean
		boolean textDelete = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			textDelete = service.selectionTextDelete(sId);

			if (textDelete == true) {

				request.setAttribute("textdelete", textDelete);
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
