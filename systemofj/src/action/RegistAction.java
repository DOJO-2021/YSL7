package action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import service.RegistService;

public class RegistAction {

	//学生登録
	public String StudentRegist(HttpServletRequest request) {
			String page= "/WEB-INF/jsp/result.jsp";

try {
		//パラメータを取得
			//学生基本情報
//Student.java--------------------------------------------------------
		String sName = request.getParameter("s_name");
		String sKana = request.getParameter("s_kana");
		String sContexts = request.getParameter("s_contexts");
		String sUnivercity = request.getParameter("s_university");
		String sFaculty = request.getParameter("s_faculty");
		String sDepartment = request.getParameter("s_department");
		String sAddress = request.getParameter("s_address");
		String sPcmail = request.getParameter("s_pcmail");
		String sMobilemail = request.getParameter("s_mobilemail");
		String sCareertasu = request.getParameter("s_careertasu");
		String sMynavi = request.getParameter("s_mynavi");
		String sRikunavi = request.getParameter("s_rikunavi");
		String sOther = request.getParameter("s_other");
		int alleditflag = 0;
//---------------------------------------------------------------------


			//イベント情報
//SEvent.java---------------------------------------------------------
		String eDate1 = request.getParameter("e_date1"); //合同説明会参加日
		String eDate2 = request.getParameter("e_date2"); //模擬面接申込日
		String eDate3 = request.getParameter("e_date3"); //模擬面接予約日
		String eDate4 = request.getParameter("e_date4"); //模擬面接参加日
		String eDate5 = request.getParameter("e_date5"); //座談会参加日
		String eDate6 = request.getParameter("e_date6"); //座談会参加日2
		String eCategory1 = "合説";
		String eCategory2 = "模擬面接申し込み";
		String eCategory3 = "模擬面接予約";
		String eCategory4 = "模擬面接参加";
		String eCategory5 = "座談会1";
		String eCategory6 = "座談会2";
//---------------------------------------------------------------------

			//インターン情報
//SIntern.java--------------------------------------------------------
		String iDate1 = request.getParameter("i_date1"); //インターン1day
		String iDate2 = request.getParameter("i_date2"); //インターン3days
		String iDate3 = request.getParameter("i_date3"); //インターン初級
		String iDate4 = request.getParameter("i_date4"); //インターン中級
		String iDate5 = request.getParameter("i_date5"); //インターン準備
		String iMeeting1 = request.getParameter("i_meeting1"); //インターン1day懇談会出欠
		String iMeeting2 = request.getParameter("i_meeting2"); //インターン3days懇談会出欠
		String iMeeting3 = request.getParameter("i_meeting3"); //インターン初級懇談会出欠
		String iMeeting4 = request.getParameter("i_meeting4"); //インターン中級懇談会出欠
		String iMeeting5 = request.getParameter("i_meeting5"); //インターン準備懇談会出欠
		String iSubmit1 = request.getParameter("i_submit1"); //インターン1dayアンケート提出有無
		String iSubmit2 = request.getParameter("i_submit2"); //インターン3daysアンケート提出有無
		String iSubmit3 = request.getParameter("i_submit3"); //インターン初級アンケート提出有無
		String iSubmit4 = request.getParameter("i_submit4"); //インターン中級アンケート提出有無
		String iSubmit5 = request.getParameter("i_submit5"); //インターン準備アンケート提出有無
		String iAcceptance1 = request.getParameter("i_acceptance1"); //インターン1dayアンケート合否
		String iAcceptance2 = request.getParameter("i_acceptance2"); //インターン3daysアンケート合否
		String iAcceptance3 = request.getParameter("i_acceptance3"); //インターン初級アンケート合否
		String iAcceptance4 = request.getParameter("i_acceptance4"); //インターン中級アンケート合否
		String iAcceptance5 = request.getParameter("i_acceptance5"); //インターン準備アンケート合否
		String iDocument1 = request.getParameter("i_document1"); //インターン1day資料送付
		String iDocument2 = request.getParameter("i_document2"); //インターン3days資料送付
		String iDocument3 = request.getParameter("i_document3"); //インターン初級資料送付
		String iDocument4 = request.getParameter("i_document4"); //インターン中級資料送付
		String iDocument5 = request.getParameter("i_document5"); //インターン準備資料送付
		String iCategory1 = "1day";
		String iCategory2 = "3days";
		String iCategory3 = "初級";
		String iCategory4 = "中級";
		String iCategory5 = "準備";
		String iCategory6 = "説明会";

		//説明会関連
		String iAttend = request.getParameter("i_attend"); //説明会出欠
		String applyFlag = request.getParameter("applyflag"); //説明会申込日
		String iDate6 = request.getParameter("i_date6"); //説明会参加日
//---------------------------------------------------------------------

			//選考

		//一次面接
//SSelectionFace.java-------------------------------------------------------
		int sfScore1 = Integer.parseInt(request.getParameter("sf_score_one1")); //一次面接点数　藤原さん
		int sfScore2 = Integer.parseInt(request.getParameter("sf_score_one2")); //一次面接点数　板谷さん
		int sfScore3 = Integer.parseInt(request.getParameter("sf_score_one3")); //一次面接点数　菅澤さん

		//二次面接
		int sfScore4 = Integer.parseInt(request.getParameter("sf_score_second1")); //二次面接点数　藤原さん
		int sfScore5 = Integer.parseInt(request.getParameter("sf_score_second2")); //二次面接点数　板谷さん
		String sfCategory1 = "一次";
		String sfCategory2 = "二次";
		String sfName1 = "藤原";
		String sfName2 = "板谷";
		String sfName3 = "菅澤";
//---------------------------------------------------------------------------

		//履歴書評価
//SSelectionFace.java---------------------------------------------------------
		int stScore1 = Integer.parseInt(request.getParameter("st_score_resume1")); //履歴書評価　松野さん
		int stScore2 = Integer.parseInt(request.getParameter("st_score_resume2")); //履歴書評価　藤原さん
		int stScore3 = Integer.parseInt(request.getParameter("st_score_resume3")); //履歴書評価　板谷さん
		int stScore4 = Integer.parseInt(request.getParameter("st_score_resume4")); //履歴書評価　菅澤さん

		//自己PR文評価
		int stScore5 = Integer.parseInt(request.getParameter("st_score_pr1"));
		int stScore6 = Integer.parseInt(request.getParameter("st_score_pr2"));
		int stScore7 = Integer.parseInt(request.getParameter("st_score_pr3"));
		int stScore8 = Integer.parseInt(request.getParameter("st_score_pr4"));

		//書類選考評価
		int stScore9 = Integer.parseInt(request.getParameter("st_score_text1")); //書類選考評価　松野さん
		int stScore10 = Integer.parseInt(request.getParameter("st_score_text2")); // 書類選考評価　藤原さん
		int stScore11 = Integer.parseInt(request.getParameter("st_score_text3")); //書類選考評価　板谷さん
		int stScore12 = Integer.parseInt(request.getParameter("st_score_text4")); //書類選考評価　菅澤さん

		String stCategory1 = "自己PR文";
		String stCategory2 = "履歴書";
		String stCategory3 = "書類選考";

		String stName1 = "松野";
		String stName2 = "藤原";
		String stName3 = "板谷";
		String stName4 = "菅澤";
//------------------------------------------------------------------------------

		//選考進捗
//SSelectionEasy.java-------------------------------------------------------
		String seSelectionDate = request.getParameter("se_selectiondate");
		int seScore = Integer.parseInt(request.getParameter("se_score"));
		int seTextScore = Integer.parseInt(request.getParameter("se_textscore"));
		String seTextresult = request.getParameter("se_textresult");
		String seGetTextDate = request.getParameter("se_gettextdate");
		String seNo = request.getParameter("se_no");
		String seOk = request.getParameter("se_ok");
		String seNoReason = request.getParameter("se_noreason");
		String seSendOk= request.getParameter("se_sendok");
		String seEaryOk = request.getParameter("se_earlyok");
		String seEaryNo = request.getParameter("se_earlyno");
		String seFirstResult = request.getParameter("se_firstresult");
		String seSecondResult = request.getParameter("se_secondresult");
		String seFirstNo = request.getParameter("se_firstno");
		String seFirstDate = request.getParameter("se_firstdate");
		String seSecondNo = request.getParameter("se_secondno");
		String seSecondDate = request.getParameter("se_seconddate");
		String seThirdDate = request.getParameter("se_thirddate");
		String seThirdResult = request.getParameter("se_thirdresult");
		String seRemarks = request.getParameter("se_remarks");
		String seSituation = request.getParameter("se_situation");
		String seDecide = request.getParameter("se_decide");
//----------------------------------------------------------------------------

//		Student s = new Student(sId,sName,sKana,sContexts,sUnivercity,sFaculty,sDepartment,sAddress,sPcmail,sMobilemail,sCareertasu,sMynavi,sRikunavi,sOther);
//		ArrayList<SEvent> list = new ArrayList<>();
//		list.add(eDate1);
//		list.add(eDate2);
//		list.add(eDate3);
//		list.add(eDate4);
//		list.add(eDate5);
//		list.add(eDate6);

		//学生基本情報
		RegistService regist = new RegistService();
		 boolean result = regist.studentInsert(sName, sKana, sContexts, sUnivercity, sFaculty, sDepartment, sAddress, sPcmail, sMobilemail, sCareertasu, sMynavi, sRikunavi, sOther, alleditflag,
				 			eDate1, eDate2, eDate3, eDate4, eDate5, eDate6, eCategory1, eCategory2, eCategory3, eCategory4, eCategory5, eCategory6,
				 			iDate1, iDate2, iDate3, iDate4, iDate5, iMeeting1, iMeeting2, iMeeting3, iMeeting4, iMeeting5, iSubmit1, iSubmit2, iSubmit3, iSubmit4, iSubmit5, iAcceptance1, iAcceptance2, iAcceptance3, iAcceptance4, iAcceptance5, iDocument1, iDocument2, iDocument3, iDocument4, iDocument5, iCategory1, iCategory2, iCategory3, iCategory4, iCategory5, iCategory6, iAttend, applyFlag, iDate6,
				 			sfScore1, sfScore2, sfScore3, sfScore4, sfScore5, sfCategory1, sfCategory2, sfName1, sfName2, sfName3,
				 			stScore1, stScore2, stScore3, stScore4, stScore5, stScore6, stScore7, stScore8, stScore9, stScore10, stScore11, stScore12, stCategory1, stCategory2, stCategory3, stName1, stName2, stName3, stName4,
				 			seSelectionDate, seScore, seTextScore, seTextresult, seGetTextDate, seNo, seOk, seNoReason, seSendOk, seEaryOk, seEaryNo, seFirstResult, seSecondResult, seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate, seThirdResult, seRemarks, seSituation, seDecide);
//		//選考データ
//		boolean result2 = regist.selectionEasyInsert(seSelectionDate, seScore, seTextScore, seTextresult, seGetTextDate, seNo, seOk, seNoReason, seSendOk, seEaryOk, seEaryNo, seFirstResult, seSecondResult, seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate, seThirdResult, seRemarks, seSituation, seDecide);
//
//		//イベント情報登録
//		boolean result3 = regist.eventInsert(eCategory1,  eDate1);
//		boolean result4 = regist.eventInsert(eCategory2,  eDate2);
//		boolean result5 = regist.eventInsert(eCategory3,  eDate3);
//		boolean result6 = regist.eventInsert(eCategory4,  eDate4);
//		boolean result7 = regist.eventInsert(eCategory5,  eDate5);
//		boolean result8 = regist.eventInsert(eCategory6,  eDate6);
//
//		//インターン参加情報登録
//		boolean result9 = regist.internInsert(iCategory1, iDate1, iMeeting1, iSubmit1, iAcceptance1, iDocument1, iAttend, applyFlag);
//		boolean result10 = regist.internInsert(iCategory2, iDate2, iMeeting2, iSubmit2, iAcceptance2, iDocument2, iAttend, applyFlag);
//		boolean result11 = regist.internInsert(iCategory3, iDate3, iMeeting3, iSubmit3, iAcceptance3, iDocument3, iAttend, applyFlag);
//		boolean result12 = regist.internInsert(iCategory4, iDate4, iMeeting4, iSubmit4, iAcceptance4, iDocument4, iAttend, applyFlag);
//		boolean result13 = regist.internInsert(iCategory5, iDate5, iMeeting5, iSubmit5, iAcceptance5, iDocument5, iAttend, applyFlag);
//		boolean result14 = regist.internInsert(iCategory6, iDate6, null, null, null, null, iAttend, applyFlag);
//
//		//面接情報登録
//		boolean result15 = regist.selectionfaceInsert(sfCategory1, sfName1, sfScore1); //一次　藤原さん
//		boolean result16 = regist.selectionfaceInsert(sfCategory1, sfName2, sfScore2);//一次　板谷さん
//		boolean result17 = regist.selectionfaceInsert(sfCategory1, sfName3, sfScore3); //一次　菅澤さん
//		boolean result18 = regist.selectionfaceInsert(sfCategory2, sfName1, sfScore4);//二次　藤原さん
//		boolean result19 = regist.selectionfaceInsert(sfCategory2, sfName2, sfScore5); //二次　板谷さん
//
//		//書類選考情報登録
//		boolean result20 = regist.selectiontextInsert(stCategory2, stName1, stScore1); //履歴書　松野さん
//		boolean result21 = regist.selectiontextInsert(stCategory2, stName2, stScore2); //履歴書　藤原さん
//		boolean result22 = regist.selectiontextInsert(stCategory2, stName3, stScore3); //履歴書　板谷さん
//		boolean result23 = regist.selectiontextInsert(stCategory2, stName4, stScore4); //履歴書　菅澤さん
//
//		boolean result24 = regist.selectiontextInsert(stCategory1, stName1, stScore5);//自己PR文　松野さん
//		boolean result25= regist.selectiontextInsert(stCategory1, stName2, stScore6); //自己PR　藤原さん
//		boolean result26 = regist.selectiontextInsert(stCategory1, stName3, stScore7); //自己PR　板谷さん
//		boolean result27 = regist.selectiontextInsert(stCategory1, stName4, stScore8); //自己PR　菅澤さん
//
//		boolean result28 = regist.selectiontextInsert(stCategory3, stName1, stScore9); //書類選考　松野さん
//		boolean result29 = regist.selectiontextInsert(stCategory3, stName2, stScore10); //書類選考　藤原さん
//		boolean result30 = regist.selectiontextInsert(stCategory3, stName3, stScore11); //書類選考　板谷さん
//		boolean result31 = regist.selectiontextInsert(stCategory3, stName4, stScore12); //書類選考　菅澤さん



		if(result) {
			request.setAttribute("errMsg", "登録が完了しました");
		}else {
			request.setAttribute("errMsg", "登録に失敗しました");
		}



	}catch(SQLException e) {
		request.setAttribute("errMsg","SQL文おかしい");
	}catch(ClassNotFoundException e) {
		request.setAttribute("errMsg", "サーバーおかしい");

		}
		return page;
	}


	//テンプレ登録
	public String TemplateRegist(HttpServletRequest request) {
		String tTitle = request.getParameter("tr_title");
		String tCategory = request.getParameter("tr_category");
		String tContent = request.getParameter("tr_content");

		String page="/WEB-INF/jsp/result.jsp";

		boolean result = false;

		try {

			RegistService service = new RegistService();
			result = service.templateInsert(tTitle, tCategory, tContent);

			if(result) {
				request.setAttribute("errMsg", "登録が成功しました！");
			}else {
				request.setAttribute("errMsg", "登録が失敗しました");
			}

		}catch(SQLException e) {//例外処理
			request.setAttribute("errMsg","SQL文おかしい");
		}catch(ClassNotFoundException e) {//例外処理
			request.setAttribute("errMsg", "サーバーおかしい");
		}

	 return page;
	}

	//フィードバック登録
	public String FeedbackRegist(HttpServletRequest request) {
		int sId = Integer.parseInt(request.getParameter("s_id"));
		String fCategory = request.getParameter("f_category");
		String fName = request.getParameter("f_name");
		String fContent = request.getParameter("f_content");

		String page = "/WEB-INF/jsp/result.jsp";

		boolean result = false;

		try {

			RegistService service = new RegistService();
			result = service.feedbackInsert(sId, fCategory, fName, fContent);


			if(result){
				request.setAttribute("errMsg", "フィードバックの登録が完了しました");
			} else {
				request.setAttribute("errMsg", "フィードバックの登録に失敗しました");
			}


		}catch(SQLException e) {//例外処理
			request.setAttribute("errMsg","フィードバックの登録に失敗しました");
		}catch(ClassNotFoundException e) {//例外処理
			request.setAttribute("errMsg", "サーバーおかしい");
		}

		return page;

	}
}
