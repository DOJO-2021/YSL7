package action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import service.UpdateDeleteService;

public class UpdateDeleteAction {


//	public String userUpdate(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idをリクエスト領域から取得
//		String uId = request.getParameter("uId");
//
//		//出力値を格納するBean
//		boolean update = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			update = service.userUpdate(uId);
//
//			if (update == true) {
//
//				request.setAttribute("update", update);
//				//（更新成功）
//				request.setAttribute("errMsg", "更新成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "更新失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			e.printStackTrace();
//			request.setAttribute("errMsg", "SQL文おかしい");
//
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//			e.printStackTrace();
//
//		}
//
//		return page;
//	}
//
//
//	public String userDelete(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idをリクエスト領域から取得
//		String uId = request.getParameter("uId");
//
//		//出力値を格納するBean
//		boolean delete = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			delete = service.userDelete(uId);
//
//			if (delete == true) {
//
//				request.setAttribute("update", delete);
//				//（削除成功）
//				request.setAttribute("errMsg", "削除成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "削除失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}
//

	public String studentUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//リクエスト領域から取得
		//studentUpdate
		int sId = Integer.parseInt(request.getParameter("sId"));
		String sName = request.getParameter("sName");
		String sKana = request.getParameter("sKana");
		String sContents = request.getParameter("sContents");
		String sUnivercity = request.getParameter("sUniversity");
		String sFaculy = request.getParameter("sFaculy");
		String sDepartment = request.getParameter("sDepartment");
		String sAddress = request.getParameter("sAddress");
		String sPcMail = request.getParameter("sPcMail");
		String sMobileMail = request.getParameter("sMobileMail");
		String sCareertasu = request.getParameter("sCareertasu");
		String sMynavi = request.getParameter("sMynavi");
		String sRikunavi = request.getParameter("sRikunavi");
		String sOther = request.getParameter("sOther");

		//selectionEasy
		String seSelectionDate = request.getParameter("seSelectionDate");
		System.out.println((request.getParameter("seScore")));
		int seScore = Integer.parseInt(request.getParameter("seScore"));
		int seTextScore = Integer.parseInt(request.getParameter("seTextScore"));
		String seTextResult = request.getParameter("seTextResult");
		String seGetTextDate = request.getParameter("seGetTextDate");
		String seNo = request.getParameter("seNo");
		String seOk = request.getParameter("seOk");
		String seNoreason = request.getParameter("seNoreason");
		String seSendOk = request.getParameter("seSendOk");
		String seEarlyOk = request.getParameter("seEarlyOk");
		String seEarlyNo = request.getParameter("seEarlyNo");
		String seFirstResult = request.getParameter("seFirstResult");
		String seSecondResult = request.getParameter("seSecondResult");
		String seFirstNo = request.getParameter("seFirstNo");
		String seFirstDate = request.getParameter("seFirstDate");
		String seSecondNo = request.getParameter("seSecondNo");
		String seSecondDate = request.getParameter("seSecondDate");
		String seThirdDate = request.getParameter("seThirdDate");
		String seThirdResult = request.getParameter("seThirdResult");
		String seRemarks = request.getParameter("seRemarks");
		String seSituation = request.getParameter("seSituation");
		String seDecide = request.getParameter("seSituation");
		System.out.println(seTextResult + "sasa");
		//selectionFace
		String sfCategory1 = "一次面接";
		String sfCategory2 = "二次面接";
		String sfName1 = "藤原";
		String sfName2 = "板谷";
		String sfName3 = "菅澤";
		int sfScore1_1 = Integer.parseInt(request.getParameter("sf_score_one1"));
		int sfScore1_2 = Integer.parseInt(request.getParameter("sf_score_one2"));
		int sfScore1_3 = Integer.parseInt(request.getParameter("sf_score_one3"));
		int sfScore2_1 = Integer.parseInt(request.getParameter("se_textresult1"));
		int sfScore2_2 = Integer.parseInt(request.getParameter("se_textresult2"));

//		int sfId1 = 0 ;
//
//		if(request.getParameter("sfId1") != null ) {
//			Integer.parseInt(request.getParameter("sfId1"));
//			}else {
//				sfId1 = 0;
//			}
//		int sfId2 = 0 ;
//
//		if(request.getParameter("sfId2") != null ) {
//			Integer.parseInt(request.getParameter("sfId2"));
//			}else {
//				sfId2 = 0;
//			}
//		int sfId3 = 0 ;
//
//		if(request.getParameter("sfId3") != null ) {
//			Integer.parseInt(request.getParameter("sfId3"));
//			}else {
//				sfId3 = 0;
//			}
//		int sfId4 = 0 ;
//
//		if(request.getParameter("sfId4") != null ) {
//			Integer.parseInt(request.getParameter("sfId4"));
//			}else {
//				sfId4 = 0;
//			}
//		int sfId5 = 0 ;
//
//		if(request.getParameter("sfId5") != null ) {
//			Integer.parseInt(request.getParameter("sfId5"));
//			}else {
//				sfId5 = 0;
//			}
//



		int sfId1 = Integer.parseInt(request.getParameter("sfId1"));
		int sfId2 = Integer.parseInt(request.getParameter("sfId2"));
		int sfId3 = Integer.parseInt(request.getParameter("sfId3"));
		int sfId4 = Integer.parseInt(request.getParameter("sfId4"));
		int sfId5 = Integer.parseInt(request.getParameter("sfId5"));

		System.out.println(sfId1);

		//selectionText
		String stCategory1 ="履歴書評価";
		String stCategory2 ="自己PR文評価";
		String stCategory3 ="書類選考評価";
		String stName1 = "松野";
		String stName2 = "藤原";
		String stName3 = "板谷";
		String stName4 = "菅澤";
		int stScore1 = Integer.parseInt(request.getParameter("st_score_resume1"));
		int stScore2 = Integer.parseInt(request.getParameter("st_score_resume2"));
		int stScore3 = Integer.parseInt(request.getParameter("st_score_resume3"));
		int stScore4 = Integer.parseInt(request.getParameter("st_score_resume4"));
		int stScore5 = Integer.parseInt(request.getParameter("st_score_pr1"));
		int stScore6 = Integer.parseInt(request.getParameter("st_score_pr2"));
		int stScore7 = Integer.parseInt(request.getParameter("st_score_pr3"));
		int stScore8 = Integer.parseInt(request.getParameter("st_score_pr4"));
		int stScore9 = Integer.parseInt(request.getParameter("st_score_text1"));
		int stScore10 = Integer.parseInt(request.getParameter("st_score_text2"));
		int stScore11 = Integer.parseInt(request.getParameter("st_score_text3"));
		int stScore12 = Integer.parseInt(request.getParameter("st_score_text4"));


//		int stId1 = 0 ;
//
//		if(request.getParameter("stId1") != null ) {
//			Integer.parseInt(request.getParameter("stId1"));
//					}else {
//						stId1 = 0;
//					}
//
//		int stId2 = 0 ;
//
//		if(request.getParameter("stId2") != null ) {
//			Integer.parseInt(request.getParameter("stId1"));
//			}else {
//				stId2 = 0;
//			}
//
//		int stId3 = 0 ;
//
//		if(request.getParameter("stId3") != null ) {
//			Integer.parseInt(request.getParameter("stId3"));
//			}else {
//				stId3 = 0;
//			}
//		int stId4 = 0 ;
//
//		if(request.getParameter("stId4") != null ) {
//			Integer.parseInt(request.getParameter("stId4"));
//			}else {
//				stId4 = 0;
//			}
//		int stId5 = 0 ;
//
//		if(request.getParameter("stId5") != null ) {
//			Integer.parseInt(request.getParameter("stId5"));
//			}else {
//				stId5 = 0;
//			}
//		int stId6 = 0 ;
//
//		if(request.getParameter("stId6") != null ) {
//			Integer.parseInt(request.getParameter("stId6"));
//			}else {
//				stId6 = 0;
//			}
//		int stId7 = 0 ;
//
//		if(request.getParameter("stId7") != null ) {
//			Integer.parseInt(request.getParameter("stId7"));
//			}else {
//				stId7= 0;
//			}
//		int stId8 = 0 ;
//
//		if(request.getParameter("stId8") != null ) {
//			Integer.parseInt(request.getParameter("stId8"));
//			}else {
//				stId8 = 0;
//			}
//		int stId9 = 0 ;
//
//		if(request.getParameter("stId9") != null ) {
//			Integer.parseInt(request.getParameter("stId9"));
//			}else {
//				stId9 = 0;
//			}
//		int stId10 = 0 ;
//
//		if(request.getParameter("stId10") != null ) {
//			Integer.parseInt(request.getParameter("stId10"));
//			}else {
//				stId10 = 0;
//			}
//		int stId11 = 0 ;
//
//		if(request.getParameter("stId11") != null ) {
//			Integer.parseInt(request.getParameter("stId11"));
//			}else {
//				stId11 = 0;
//			}
//		int stId12 = 0 ;
//
//		if(request.getParameter("stId12") != null ) {
//			Integer.parseInt(request.getParameter("stId12"));
//			}else {
//				stId12 = 0;
//			}


		int stId1 = Integer.parseInt(request.getParameter("stId1"));
		int stId2 = Integer.parseInt(request.getParameter("stId2"));
		int stId3 = Integer.parseInt(request.getParameter("stId3"));
		int stId4 = Integer.parseInt(request.getParameter("stId4"));
		int stId5 = Integer.parseInt(request.getParameter("stId5"));
		int stId6 = Integer.parseInt(request.getParameter("stId6"));
		int stId7 = Integer.parseInt(request.getParameter("stId7"));
		int stId8 = Integer.parseInt(request.getParameter("stId8"));
		int stId9 = Integer.parseInt(request.getParameter("stId9"));
		int stId10 = Integer.parseInt(request.getParameter("stId10"));
		int stId11 = Integer.parseInt(request.getParameter("stId11"));
		int stId12 = Integer.parseInt(request.getParameter("stId12"));




		//internupdate
		String iCategory1 ="1day";
		String iCategory2 ="3days";
		String iCategory3 = "初級";
		String iCategory4 = "中級";
		String iCategory5 = "準備";
		String iCategory6 = "説明会";



		String iDate1 =request.getParameter("iDate1");
		String iDate2 =request.getParameter("iDate2");
		String iDate3 =request.getParameter("iDate3");
		String iDate4 =request.getParameter("iDate4");
		String iDate5 =request.getParameter("iDate5");
		String iDate6 =request.getParameter("iDate6");


		String iMeeting1 = request.getParameter("iMeeting1");
		String iMeeting2 = request.getParameter("iMeeting2");
		String iMeeting3 = request.getParameter("iMeeting3");
		String iMeeting4 = request.getParameter("iMeeting4");
		String iMeeting5 = request.getParameter("iMeeting5");

		String iSubmit1 = request.getParameter("iSubmit1");
		String iSubmit2 = request.getParameter("iSubmit2");
		String iSubmit3 = request.getParameter("iSubmit3");
		String iSubmit4 = request.getParameter("iSubmit4");
		String iSubmit5 = request.getParameter("iSubmit5");

		String iAcceptace1 = request.getParameter("iAcceptance1");
		String iAcceptace2 = request.getParameter("iAcceptance2");
		String iAcceptace3 = request.getParameter("iAcceptance3");
		String iAcceptace4 = request.getParameter("iAcceptance4");
		String iAcceptace5 = request.getParameter("iAcceptance5");

		String iDocument1 = request.getParameter("iDocument1");
		String iDocument2 = request.getParameter("iDocument2");
		String iDocument3 = request.getParameter("iDocument3");
		String iDocument4 = request.getParameter("iDocument4");
		String iDocument5 = request.getParameter("iDocument5");

		String iAttend = request.getParameter("iAttend");
		String applyFlag =request.getParameter("applyflag");


		System.out.println(applyFlag + "ee");
		System.out.println(iDate6 + "ii");


//		int iId1 = 0;
//
//		if (request.getParameter("iId1") != null) {
//			Integer.parseInt(request.getParameter("iId1"));
//		} else {
//			iId1 = 0;
//		}
//
//		int iId2 = 0;
//
//		if (request.getParameter("iId2") != null) {
//			Integer.parseInt(request.getParameter("iId2"));
//		} else {
//			iId2 = 0;
//		}
//		int iId3 = 0;
//
//		if (request.getParameter("iId3") != null) {
//			Integer.parseInt(request.getParameter("iId3"));
//		} else {
//			iId3 = 0;
//		}
//
//		int iId4 = 0;
//
//		if (request.getParameter("iId4") != null) {
//			Integer.parseInt(request.getParameter("iId4"));
//		} else {
//			iId4 = 0;
//		}
//		int iId5 = 0;
//
//		if (request.getParameter("iId5") != null) {
//			Integer.parseInt(request.getParameter("iId5"));
//		} else {
//			iId5 = 0;
//		}
//
//		//eventupdate
//		int eId1 = 0 ;
//
//		if(request.getParameter("eId1") != null ) {
//			Integer.parseInt(request.getParameter("eId1"));
//			}else {
//				eId1 = 0;
//			}
//		int eId2 = 0 ;
//
//		if(request.getParameter("eId2") != null ) {
//			Integer.parseInt(request.getParameter("eId2"));
//			}else {
//				eId2 = 0;
//			}
//		int eId3 = 0 ;
//
//		if(request.getParameter("eId3") != null ) {
//			Integer.parseInt(request.getParameter("eId3"));
//			}else {
//				eId3 = 0;
//			}
//		int eId4 = 0 ;
//
//		if(request.getParameter("eId4") != null ) {
//			Integer.parseInt(request.getParameter("eId4"));
//			}else {
//				eId4 = 0;
//			}
//		int eId5 = 0 ;
//
//		if(request.getParameter("eId5") != null ) {
//			Integer.parseInt(request.getParameter("eId5"));
//			}else {
//				eId5 = 0;
//			}
//		int eId6 = 0 ;
//
//		if(request.getParameter("eId6") != null ) {
//			Integer.parseInt(request.getParameter("eId6"));
//			}else {
//				eId6 = 0;
//			}


		int iId1 = Integer.parseInt(request.getParameter("iId1"));
		int iId2 = Integer.parseInt(request.getParameter("iId2"));
		int iId3 = Integer.parseInt(request.getParameter("iId3"));
		int iId4 = Integer.parseInt(request.getParameter("iId4"));
		int iId5 = Integer.parseInt(request.getParameter("iId5"));
		int iId6 = Integer.parseInt(request.getParameter("iId6"));


		int eId1 = Integer.parseInt(request.getParameter("eId1"));
		int eId2 = Integer.parseInt(request.getParameter("eId2"));
		int eId3 = Integer.parseInt(request.getParameter("eId3"));
		int eId4 = Integer.parseInt(request.getParameter("eId4"));
		int eId5 = Integer.parseInt(request.getParameter("eId5"));
		int eId6 = Integer.parseInt(request.getParameter("eId6"));

		String eDate1 = request.getParameter("e_date1");
		String eDate2 = request.getParameter("e_date2");
		String eDate3 = request.getParameter("e_date3");
		String eDate4 = request.getParameter("e_date4");
		String eDate5 = request.getParameter("e_date5");
		String eDate6 = request.getParameter("e_date6");



		boolean student = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();


			student = service.studentUpdate(sId,sName, sKana, sContents, sUnivercity, sFaculy, sDepartment, sAddress, sPcMail, sMobileMail, sCareertasu, sMynavi, sRikunavi, sOther,
											seSelectionDate, seScore, seTextScore, seTextResult, seGetTextDate,
											seNo, seOk, seNoreason, seSendOk, seEarlyOk, seEarlyNo, seFirstResult,
											seSecondResult,seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate,
											seThirdResult, seRemarks, seSituation, seDecide,
											sfCategory1, sfCategory2, sfName1,sfName2, sfName3,  sfScore1_1, sfScore1_2, sfScore1_3 ,sfScore2_1, sfScore2_2,  sfId1, sfId2, sfId3, sfId4, sfId5,
											stCategory1, stCategory2, stCategory3, stName1, stName2, stName3, stName4,
											stScore1, stScore2, stScore3, stScore4, stScore5, stScore6, stScore7, stScore8, stScore9, stScore10, stScore11, stScore12, stId1, stId2, stId3, stId4, stId5, stId6, stId7, stId8, stId9, stId10, stId11, stId12,
											iCategory1, iCategory2, iCategory3, iCategory4, iCategory5, iCategory6, iDate1, iDate2, iDate3, iDate4, iDate5, iDate6, iMeeting1, iMeeting2,
											iMeeting3, iMeeting4, iMeeting5, iSubmit1, iSubmit2, iSubmit3, iSubmit4, iSubmit5,
											iAcceptace1, iAcceptace2, iAcceptace3, iAcceptace4, iAcceptace5,
											iDocument1, iDocument2, iDocument3, iDocument4, iDocument5, iAttend, applyFlag, iId1, iId2, iId3, iId4, iId5, iId6,
											eId1, eId2, eId3, eId4, eId5, eId6, eDate1, eDate2, eDate3, eDate4, eDate5, eDate6);

			if (student == true) {

				request.setAttribute("studentUpdate", student);
				//（更新成功）
				request.setAttribute("errMsg", "編集成功");
			}
			else {
				//値が入っていないので、エラーメッセージをセット
				request.setAttribute("errMsg", "編集失敗");

			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;

	}

//	public String studentUpdate(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//リクエスト領域から取得
//		int sId = Integer.parseInt(request.getParameter("sId"));
//		String sName = request.getParameter("sName");
//		String sKana = request.getParameter("sKana");
//		String sContents = request.getParameter("sContents");
//		String sUnivercity = request.getParameter("sUnivercity");
//		String sFaculy = request.getParameter("sFaculy");
//		String sDepartment = request.getParameter("sDepartment");
//		String sAddress = request.getParameter("sAddress");
//		String sPcMail = request.getParameter("sPcMail");
//		String sMobileMail = request.getParameter("sMobileMail");
//		String sCareertasu = request.getParameter("sCareertasu");
//		String sMynavi = request.getParameter("sMynavi");
//		String sRikunavi = request.getParameter("sRikunavi");
//		String sOther = request.getParameter("sOther");
//
//		//出力値を格納するBean
//		boolean student = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			student = service.studentUpdate(sId,sName, sKana, sContents, sUnivercity, sFaculy, sDepartment, sAddress, sPcMail, sMobileMail, sCareertasu, sMynavi, sRikunavi, sOther );
//
//			if (student == true) {
//
//				request.setAttribute("studentUpdate", student);
//				//（更新成功）
//				request.setAttribute("errMsg", "編集成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "編集失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}

	public String studentDelete(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idをリクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));

		//出力値を格納するBean
		boolean SDelete = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			SDelete = service.studentDelete(sId);

			if (SDelete == true) {

				request.setAttribute("studentDelete", SDelete);
				//（削除成功）
				request.setAttribute("errMsg", "削除成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "削除失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}

	public String flagUpdate(HttpServletRequest request) {
		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/searchResult.jsp";

		//リクエスト領域から取得
		int sId = Integer.parseInt(request.getParameter("sId"));
		System.out.println(sId);
		//出力値を格納するBean
		boolean flag = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			flag= service.flagUpdate(sId);

//			if (flag == true) {
//
//				return page;
//				//（更新成功）
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "失敗");
//			}
//
			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}


	public String flagDelete(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/searchResult.jsp";

		//リクエスト領域から取得
System.out.println("mine");
		//出力値を格納するBean
		boolean flag = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			flag = service.flagDelete();

//			if (flag == true) {
//
//				request.setAttribute("errMsg", "更新成功");
//
//				//（更新成功）
//
//			}
//			else {
//				//更新がされていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "失敗");
//			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}

//	public String selectionEasyUpdate(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//リクエスト領域から取得
//		int sId = Integer.parseInt(request.getParameter("sId"));
//
//		String seSelectionDate =request.getParameter("seSelectionDate");
//
//		int seScore = Integer.parseInt(request.getParameter("seScore"));
//
//		int seTextScore = Integer.parseInt(request.getParameter("seTextScore"));
//
//		String seTextResult = request.getParameter("seTextResult");
//
//		String seGetTextDate =request.getParameter("seGetTextDate");
//
//		String seNo =request.getParameter("seNo");
//
//		String seOk =request.getParameter("seOk");
//
//		String seNoreason = request.getParameter("seNoreason");
//
//		String seSendOk =request.getParameter("seSendOk");
//
//		String seEarlyOk =request.getParameter("seEarlyOk");
//
//		String seEarlyNo =request.getParameter("seEarlyNo");
//
//		String seFirstResult = request.getParameter("seFirstResult");
//		String seSecondResult = request.getParameter("seSecondResult");
//
//		String seFirstNo =request.getParameter("seFirstNo");
//
//		String seFirstDate =request.getParameter("seFirstDate");
//
//		String seSecondNo =request.getParameter("seSecondNo");
//
//		String seSecondDate =request.getParameter("seSecondDate");
//
//		String seThirdDate =request.getParameter("seThirdDate");
//
//
//		String seThirdResult = request.getParameter("seThirdResult");
//
//		String seRemarks =request.getParameter("seRemarks");
//
//		String seSituation = request.getParameter("seSituation");
//
//		 String seDecide = request.getParameter("seSituation");
//
//
//		//出力値を格納するBean
//		boolean SelectionEasy = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			SelectionEasy = service.selectionEasyUpdate(sId, seSelectionDate, seScore, seTextScore, seTextResult, seGetTextDate,
//														seNo, seOk, seNoreason, seSendOk, seEarlyOk, seEarlyNo, seFirstResult,
//														seSecondResult,seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate,
//														seThirdResult, seRemarks, seSituation, seDecide);
//
//			if (SelectionEasy == true) {
//
//				request.setAttribute("selectionEasyUpdate", SelectionEasy);
//				//（更新成功）
//				request.setAttribute("errMsg", "編集成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "編集失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}



//	public String selectionEasyDelete(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idをリクエスト領域から取得
//		int sId = Integer.parseInt(request.getParameter("sId"));
//
//
//		//出力値を格納するBean
//		boolean EasyDelete = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			EasyDelete = service.selectionEasyDelete(sId);
//
//			if (EasyDelete == true) {
//
//				request.setAttribute("selectioneasydelete", EasyDelete);
//				//（成功）
//				request.setAttribute("errMsg", "削除成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "削除失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}


	public String templateUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//リクエスト領域から取得
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

				request.setAttribute("templateUpdate", temp);
				//（成功）
				request.setAttribute("errMsg", "編集成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "編集失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}



//	public String eventUpdate(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idとpwをリクエスト領域から取得
//		int eId = Integer.parseInt(request.getParameter("eId"));
//		String eDate1 = request.getParameter("e_date1");
//		String eDate2 = request.getParameter("e_date2");
//		String eDate3 = request.getParameter("e_date3");
//		String eDate4 = request.getParameter("e_date4");
//		String eDate5 = request.getParameter("e_date5");
//		String eDate6 = request.getParameter("e_date6");
//
//
//
//
////		String eDatetest =request.getParameter("eDate");
////		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
////		String str = sdf.format(eDatetest);
////		Date  eDate  = Date.valueOf(str);
////		//String eDate =request.getParameter("eDate");
////		int eId = Integer.parseInt(request.getParameter("eId"));
//
//
//		//出力値を格納するBean
//		boolean event = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			event = service.eventUpdate( eId, eDate1, eDate2, eDate3, eDate4, eDate5, eDate6 );
//
//			if (event == true) {
//
//				request.setAttribute("eventUpdate", event);
//				//（成功）
//				request.setAttribute("errMsg", "編集成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "編集失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}

//	public String eventDelete(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idをリクエスト領域から取得
//		int sId = Integer.parseInt(request.getParameter("sId"));
//
////		String eDatetest =request.getParameter("eDate");
////		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
////		String str = sdf.format(eDatetest);
////		Date  eDate  = Date.valueOf(str);
////		//String eDate =request.getParameter("eDate");
////		int eId = Integer.parseInt(request.getParameter("eId"));
//
//
//		//出力値を格納するBean
//		boolean eDelete = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			eDelete = service.eventDelete( sId);
//
//			if (eDelete == true) {
//
//				request.setAttribute("eventdelete", eDelete);
//				//（成功）
//				request.setAttribute("errMsg", "削除成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "削除失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}

	public String feedbackUpdate(HttpServletRequest request) {

		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";

		//idとpwをリクエスト領域から取得
		System.out.println(request.getParameter("fId"));
		int fId = Integer.parseInt(request.getParameter("fId"));
		String fName = request.getParameter("fName");
		String fContent = request.getParameter("f_content");


		//出力値を格納するBean
		boolean fb = false;

		try {

			//入力されていたらサービスへ処理を委譲
			UpdateDeleteService service = new UpdateDeleteService();

			fb = service.feedbackUpdate(fId, fName, fContent);

			if (fb == true) {

				request.setAttribute("feedbackUpdate", fb);
				//（成功）
				request.setAttribute("errMsg", "編集成功");

			}
			else {
				//値が入っていないので、エラーメッセージをセットしログイン画面へ
				request.setAttribute("errMsg", "編集失敗");
			}

			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;
	}

//	public String feedbackDelete(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idとpwをリクエスト領域から取得
//		int sId = Integer.parseInt(request.getParameter("sId"));
//
//
//		//出力値を格納するBean
//		boolean fDelete = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			fDelete = service.feedbackDelete(sId);
//
//			if (fDelete == true) {
//
//				request.setAttribute("feedbackdelete", fDelete);
//				//（成功）
//				request.setAttribute("errMsg", "削除成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "削除失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}


//	public String internUpdate(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idとpwをリクエスト領域から取得
//
//		String iCategory1 ="1day";
//		String iCategory2 ="3days";
//		String iCategory3 = "初級";
//		String iCategory4 = "中級";
//		String iCategory5 = "準備";
//
//
//		String iDate1 =request.getParameter("iDate1");
//		String iDate2 =request.getParameter("iDate2");
//		String iDate3 =request.getParameter("iDate3");
//		String iDate4 =request.getParameter("iDate4");
//		String iDate5 =request.getParameter("iDate5");
//
//		String iMeeting1 = request.getParameter("iMeeting1");
//		String iMeeting2 = request.getParameter("iMeeting2");
//		String iMeeting3 = request.getParameter("iMeeting3");
//		String iMeeting4 = request.getParameter("iMeeting4");
//		String iMeeting5 = request.getParameter("iMeeting5");
//
//		String iSubmit1 = request.getParameter("iSubmit1");
//		String iSubmit2 = request.getParameter("iSubmit2");
//		String iSubmit3 = request.getParameter("iSubmit3");
//		String iSubmit4 = request.getParameter("iSubmit4");
//		String iSubmit5 = request.getParameter("iSubmit5");
//
//		String iAcceptace1 = request.getParameter("iAcceptace1");
//		String iAcceptace2 = request.getParameter("iAcceptace2");
//		String iAcceptace3 = request.getParameter("iAcceptace3");
//		String iAcceptace4 = request.getParameter("iAcceptace4");
//		String iAcceptace5 = request.getParameter("iAcceptace5");
//
//		String iDocument1 = request.getParameter("iDocument1");
//		String iDocument2 = request.getParameter("iDocument2");
//		String iDocument3 = request.getParameter("iDocument3");
//		String iDocument4 = request.getParameter("iDocument4");
//		String iDocument5 = request.getParameter("iDocument5");
//
//		String iAttend = request.getParameter("iAttend");
//
//
//		int   iId = Integer.parseInt(request.getParameter("iId"));
////		String iAttend = request.getParameter("iAttend");
//
//		//出力値を格納するBean
//		//String seFirstResult = request.getParameter("sf_score_one4");
//
//		boolean intern = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			intern = service.internUpdate( iCategory1, iCategory2, iCategory3, iCategory4, iCategory5, iDate1, iDate2, iDate3, iDate4, iDate5, iMeeting1, iMeeting2,
//											iMeeting3, iMeeting4, iMeeting5, iSubmit1, iSubmit2, iSubmit3, iSubmit4, iSubmit5,
//											iAcceptace1, iAcceptace2, iAcceptace3, iAcceptace4, iAcceptace5,
//											iDocument1, iDocument2, iDocument3, iDocument4, iDocument5, iAttend,iId);
//
//			if (intern == true) {
//
//				request.setAttribute("internUpdate", intern);
//				//（成功）
//				request.setAttribute("errMsg", "編集成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "編集失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}

//	public String internDelete(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idとpwをリクエスト領域から取得
//		int sId = Integer.parseInt(request.getParameter("sId"));
//
//
//		//出力値を格納するBean
//		boolean iDelete = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			iDelete = service.internDelete(sId);
//
//			if (iDelete == true) {
//
//				request.setAttribute("feedbackdelete", iDelete);
//				//（成功）
//				request.setAttribute("errMsg", "削除成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "削除失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}

//	public String allUpdate(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
////		フラグが１の人の情報を書き換えたい所
////		update set table どこを変更するのかをSQLに
////		if文　request.getparameter
//
//
//
//		//idとpwをリクエスト領域から取得
//
//		String sqlContents = request.getParameter("sqlContentns");
//		String categorys = request.getParameter("categorys");
//
////
////		int sId = Integer.parseInt(request.getParameter("sId"));
////		String iCategory = request.getParameter("iCategory");
//
//
////		int iId = Integer.parseInt(request.getParameter("iId"));
//
//
//
//
//		//出力値を格納するBean
//		boolean allUpdate = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			allUpdate = service.allUpdate(sqlContents, categorys);
//			if (allUpdate == true) {
//
//				request.setAttribute("allupdate", allUpdate);
//				//（成功）
//				request.setAttribute("errMsg", "編集成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "編集失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}



	public String allUpdate(HttpServletRequest request) {
		//戻り値に設定するページを初期設定しておく
		String page = "/WEB-INF/jsp/result.jsp";
		String iDate1 = request.getParameter("iDate1");
		String iDate2 = request.getParameter("iDate2");
		String iDate3 = request.getParameter("iDate3");
		String iDate4 = request.getParameter("iDate4");
		String iDate5 = request.getParameter("iDate5");
		String iMeeting1 = request.getParameter("iMeeting1");
		String iMeeting2 = request.getParameter("iMeeting2");
		String iMeeting3 = request.getParameter("iMeeting3");
		String iMeeting4 = request.getParameter("iMeeting4");
		String iMeeting5 = request.getParameter("iMeeting5");
		String iAcceptance1 = request.getParameter("iAcceptance1");
		String iAcceptance2 = request.getParameter("iAcceptance2");
		String iAcceptance3 = request.getParameter("iAcceptance3");
		String iAcceptance4 = request.getParameter("iAcceptance4");
		String iAcceptance5 = request.getParameter("iAcceptance5");
		String iSubmit1 = request.getParameter("iSubmit1");
		String iSubmit2 = request.getParameter("iSubmit2");
		String iSubmit3 = request.getParameter("iSubmit3");
		String iSubmit4 = request.getParameter("iSubmit4");
		String iSubmit5 = request.getParameter("iSubmit5");
		String iDocument1 = request.getParameter("iDocument1");
		String iDocument2 = request.getParameter("iDocument2");
		String iDocument3 = request.getParameter("iDocument3");
		String iDocument4 = request.getParameter("iDocument4");
		String iDocument5 = request.getParameter("iDocument5");
		String intern[][] = {{iDate1,iMeeting1,iAcceptance1,iSubmit1,iDocument1},
				 {iDate2,iMeeting2,iAcceptance2,iSubmit2,iDocument2},
				 {iDate3,iMeeting3,iAcceptance3,iSubmit3,iDocument3},
				 {iDate4,iMeeting4,iAcceptance4,iSubmit4,iDocument4},
				 {iDate5,iMeeting5,iAcceptance5,iSubmit5,iDocument5}};
				String category[] = {"1day","3days","初級","中級","準備"};
				String sql[] = {"i_date=","i_meeting=","i_acceptance=","i_submit=","i_document="};
				String sqlContent[] = {"","","","",""};
				String set []= {"update intern set ","update intern set ","update intern set ","update intern set ","update intern set "};
				String where [] = {" where "," where "," where "," where "," where "};
				for(int i = 0; i < intern.length; i++){
					for(int j = 0; j < intern[i].length; j++) {
						if(intern[i][j] != "" && intern[i][j] != null){
							if(set[i] != "update intern set "){
								set[i] += ",";
							}
							set[i] += sql[j] + "'" + intern[i][j] + "'";
						}
					}
				if(set[i] != "update intern set ") {
					where[i] += "i_category = '" + category[i] + "' and alleditflag = 1";
				}
				sqlContent[i] = set[i] + where[i] + ";";
				}
		boolean allUpdate = false;
		UpdateDeleteService service = new UpdateDeleteService();
		for(int i = 0;i < 5;i++) {
			if(sqlContent[i] .equals("update intern set  where ;")) {
				sqlContent[i] = null;
				System.out.println(sqlContent[i]);
			}else {
				System.out.println(sqlContent[i]);
			}
		}
		try {
			//入力されていたらサービスへ処理を委譲
			allUpdate = service.allUpdate(sqlContent[0], sqlContent[1], sqlContent[2], sqlContent[3], sqlContent[4]);
			if (allUpdate == true) {
				request.setAttribute("allUpdate", allUpdate);
				//（更新成功）
				request.setAttribute("errMsg", "編集成功");
			}
			else {
				request.setAttribute("errMsg", "編集失敗");
			}
			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("errMsg", "SQL文おかしい");
		} catch (ClassNotFoundException e) {
			request.setAttribute("errMsg", "サーバーおかしい");
		}
		return page;
	}



//	public String selectionFaceUpdate(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idとpwをリクエスト領域から取得
////		int sId = Integer.parseInt(request.getParameter("sId"));
//		String sfCategory1 = "一次面接";
//		String sfCategory2 = "二次面接";
//
//		String sfName1 = "藤原";
//		String sfName2 = "板谷";
//		String sfName3 = "菅澤";
//
//
//
//		int sfScore1_1 = Integer.parseInt(request.getParameter("sf_score_one1"));
//		int sfScore1_2 = Integer.parseInt(request.getParameter("sf_score_one2"));
//		int sfScore1_3 = Integer.parseInt(request.getParameter("sf_score_one3"));
//
//		int sfScore2_1 = Integer.parseInt(request.getParameter("se_textresult1"));
//		int sfScore2_2 = Integer.parseInt(request.getParameter("se_textresult2"));
//
//
//
//		int sfId = Integer.parseInt(request.getParameter("sfId"));
//
//		//出力値を格納するBean
//		boolean face = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			face = service.selectionFaceUpdate(sfCategory1, sfCategory2, sfName1,sfName2, sfName3,  sfScore1_1, sfScore1_2, sfScore1_3 ,sfScore2_1, sfScore2_2,  sfId);
//
//			if (face == true) {
//
//				request.setAttribute("selectionfaceUpdate", face);
//				//（更新成功）
//				request.setAttribute("errMsg", "編集成功");
//
//			}
//			else {
//
//
//				request.setAttribute("errMsg", "編集失敗");
//
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}

//	public String selectionFaceDelete(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idとpwをリクエスト領域から取得
//		int sId = Integer.parseInt(request.getParameter("sId"));
//
//		//出力値を格納するBean
//		boolean faceDelete = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			faceDelete = service.selectionFaceDelete(sId);
//
//			if (faceDelete == true) {
//
//				request.setAttribute("facedelete", faceDelete);
//				//（成功）
//				request.setAttribute("errMsg", "削除成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "削除失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}


//	public String selectionTextUpdate(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idとpwをリクエスト領域から取得
//		int sId = Integer.parseInt(request.getParameter("sId"));
//
//		String stCategory1 ="履歴書評価";
//		String stCategory2 ="自己PR文評価";
//		String stCategory3 ="書類選考評価";
//
//
//		String stName1 = "松野";
//		String stName2 = "藤原";
//		String stName3 = "板谷";
//		String stName4 = "菅澤";
//
//
//
//		int stScore1 = Integer.parseInt(request.getParameter("st_score_resume1"));
//		int stScore2 = Integer.parseInt(request.getParameter("st_score_resume2"));
//		int stScore3 = Integer.parseInt(request.getParameter("st_score_resume3"));
//		int stScore4 = Integer.parseInt(request.getParameter("st_score_resume4"));
//
//		int stScore5 = Integer.parseInt(request.getParameter("st_score_pr1"));
//		int stScore6 = Integer.parseInt(request.getParameter("st_score_pr2"));
//		int stScore7 = Integer.parseInt(request.getParameter("st_score_pr3"));
//		int stScore8 = Integer.parseInt(request.getParameter("st_score_pr4"));
//
//		int stScore9 = Integer.parseInt(request.getParameter("st_score_text1"));
//		int stScore10 = Integer.parseInt(request.getParameter("st_score_text2"));
//		int stScore11 = Integer.parseInt(request.getParameter("st_score_text3"));
//		int stScore12 = Integer.parseInt(request.getParameter("st_score_text4"));
//
//		int stId = Integer.parseInt(request.getParameter("stId"));
//
//		//出力値を格納するBean
//		boolean st = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			st = service.selectionTextUpdate(sId, stCategory1, stCategory2, stCategory3,
//												stName1, stName2, stName3, stName4, stScore1, stScore2, stScore3, stScore4, stScore5, stScore6, stScore7, stScore8, stScore9, stScore10, stScore11, stScore12, stId);
//
//			if (st == true) {
//
//				request.setAttribute("selectiontext", st);
//				//（成功）
//				request.setAttribute("errMsg", "編集成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "編集失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}



//	public String selectionTextDelete(HttpServletRequest request) {
//
//		//戻り値に設定するページを初期設定しておく
//		String page = "/WEB-INF/jsp/result.jsp";
//
//		//idとpwをリクエスト領域から取得
//		int sId = Integer.parseInt(request.getParameter("sId"));
//
//		//出力値を格納するBean
//		boolean textDelete = false;
//
//		try {
//
//			//入力されていたらサービスへ処理を委譲
//			UpdateDeleteService service = new UpdateDeleteService();
//
//			textDelete = service.selectionTextDelete(sId);
//
//			if (textDelete == true) {
//
//				request.setAttribute("textdelete", textDelete);
//				//（成功）
//				request.setAttribute("errMsg", "削除成功");
//
//			}
//			else {
//				//値が入っていないので、エラーメッセージをセットしログイン画面へ
//				request.setAttribute("errMsg", "削除失敗");
//			}
//
//			//サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
//		} catch (SQLException e) {
//			request.setAttribute("errMsg", "SQL文おかしい");
//		} catch (ClassNotFoundException e) {
//			request.setAttribute("errMsg", "サーバーおかしい");
//		}
//
//		return page;
//	}


    public String privateFlagDelete(HttpServletRequest request) {
        //戻り値に設定するページを初期設定しておく
        String page = "/WEB-INF/jsp/searchResult.jsp";
        //リクエスト領域から取得
        int sId = Integer.parseInt(request.getParameter("sId"));
        System.out.println(sId);
        //出力値を格納するBean
        boolean flag = false;
        try {
            //入力されていたらサービスへ処理を委譲
            UpdateDeleteService service = new UpdateDeleteService();
            flag= service.privateFlagDelete(sId);
//          if (flag == true) {
//
//              return page;
//              //（更新成功）
//
//          }
//          else {
//              //値が入っていないので、エラーメッセージをセットしログイン画面へ
//              request.setAttribute("errMsg", "失敗");
//          }
//
            //サーバー系エラー↓遷移先が違えばreturnの先を変えてあげる
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errMsg", "SQL文おかしい");
        } catch (ClassNotFoundException e) {
            request.setAttribute("errMsg", "サーバーおかしい");
        }
        return page;
    }



}
