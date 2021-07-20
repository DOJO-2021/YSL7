package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.EventDao;
import dao.FeedbackDao;
import dao.InternDao;
import dao.SelectionEasyDao;
import dao.SelectionFaceDao;
import dao.SelectionTextDao;
import dao.StudentDao;
import dao.TemplateDao;
import dao.UserDao;


public class RegistService {


	//ユーザー登録
	public boolean insert(String uId, String uName, String uFirst, String uPw)  throws ClassNotFoundException, SQLException {
		boolean result = false;

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		UserDao dao = new UserDao(conn);

		//引数を渡し、取得値をbeanに渡す
		int newUser = dao.insert(uId, uName, uFirst, uPw);

		if(newUser != 0) {
			result = true;
		}

		//RegistActionにresultを返す
		return result;
	}



	//学生データ（基本情報）の新規登録
	public boolean studentInsert(String sName, String sKana, String sContexts, String sUnivercity, String sFaculty, String sDepartment, String sAddress, String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String sOther, int alleditflag,
			String eDate1, String eDate2, String eDate3, String eDate4, String eDate5, String eDate6, String eCategory1, String eCategory2, String eCategory3, String eCategory4, String eCategory5, String eCategory6,
			String iDate1, String iDate2, String iDate3, String iDate4, String iDate5, String iMeeting1, String iMeeting2, String iMeeting3, String iMeeting4, String iMeeting5, String iSubmit1, String iSubmit2, String iSubmit3, String iSubmit4, String iSubmit5, String iAcceptance1, String iAcceptance2, String iAcceptance3, String iAcceptance4, String iAcceptance5, String iDocument1, String iDocument2, String iDocument3, String iDocument4, String iDocument5, String iCategory1, String iCategory2, String iCategory3, String iCategory4, String iCategory5, String iCategory6, String iAttend, String applyFlag, String iDate6,
			int sfScore1, int sfScore2, int sfScore3, int sfScore4, int sfScore5, String sfCategory1, String sfCategory2, String sfName1, String sfName2, String sfName3, int stScore1, int stScore2, int stScore3, int stScore4, int stScore5, int stScore6, int stScore7, int stScore8, int stScore9, int stScore10, int stScore11, int stScore12, String stCategory1, String stCategory2, String stCategory3, String stName1, String stName2, String stName3, String stName4,
			String seSelectionDate, int seScore, int seTextScore, String seTextresult, String seGetTextDate, String seNo, String seOk, String seNoReason, String seSendOk, String seEaryOk, String seEaryNo, String seFirstResult, String seSecondResult, String seFirstNo, String seFirstDate, String seSecondNo, String seSecondDate, String seThirdDate, String seThirdResult, String seRemarks, String seSituation, String seDecide )  throws ClassNotFoundException, SQLException {

		boolean re1 = false;
		boolean re2 = false;
		boolean re3 = false;
		boolean re4 = false;
		boolean re5 = false;
		boolean re6 = false;
		boolean re7 = false;
		boolean re8 = false;
		boolean re9 = false;
		boolean re10 = false;
		boolean re11 = false;
		boolean re12 = false;
		boolean re13 = false;
		boolean re14 = false;
		boolean re15 = false;
		boolean re16 = false;
		boolean re17 = false;
		boolean re18 = false;
		boolean re19 = false;
		boolean re20 = false;
		boolean re21 = false;
		boolean re22 = false;
		boolean re23 = false;
		boolean re24 = false;
		boolean re25 = false;
		boolean re26 = false;
		boolean re27 = false;
		boolean re28 = false;
		boolean re29 = false;
		boolean re30 = false;
		boolean re31 = false;

		boolean result = false;

		Connection conn = null;

		try {
			//ドライバの登録
			Class.forName("org.h2.Driver");

			//データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
			conn.setAutoCommit(false);


			//Daoを実体化
			StudentDao studentdao = new StudentDao(conn);
			SelectionEasyDao easydao = new SelectionEasyDao(conn);
			EventDao eventdao = new EventDao(conn);
			InternDao interndao = new InternDao(conn);
			SelectionFaceDao facedao = new SelectionFaceDao(conn);
			SelectionTextDao textdao = new SelectionTextDao(conn);


			int result1 = studentdao.studentInsert(sName,sKana,sContexts,sUnivercity,sFaculty,sDepartment,sAddress,sPcmail,sMobilemail,sCareertasu,sMynavi,sRikunavi,sOther);
			if(result1 == 1) {
				re1 = true;
			}
			//選考データ
			int result2 = easydao.selectionEasyInsert(seSelectionDate, seScore, seTextScore, seTextresult, seGetTextDate, seNo, seOk, seNoReason, seSendOk, seEaryOk, seEaryNo, seFirstResult, seSecondResult, seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate, seThirdResult, seRemarks, seSituation, seDecide);
			if(result2 == 1) {
				re2 = true;
			}
			//イベント情報登録
			int result3 = eventdao.eventInsert(eCategory1,  eDate1);
			if(result3 == 1) {
				re3 = true;
			}
			int result4 = eventdao.eventInsert(eCategory2,  eDate2);
			if(result4 == 1) {
				re4 = true;
			}
			int result5 = eventdao.eventInsert(eCategory3,  eDate3);
			if(result5 == 1) {
				re5 = true;
			}
			int result6 = eventdao.eventInsert(eCategory4,  eDate4);
			if(result6 == 1) {
				re6 = true;
			}
			int result7 = eventdao.eventInsert(eCategory5,  eDate5);
			if(result7 == 1) {
				re7 = true;
			}
			int result8 = eventdao.eventInsert(eCategory6,  eDate6);
			if(result8 == 1) {
				re8 = true;
			}
			//インターン参加情報登録
			int result9 = interndao.internInsert(iCategory1, iDate1, iMeeting1, iSubmit1, iAcceptance1, iDocument1, iAttend, applyFlag);
			if(result9 == 1) {
				re9 = true;
			}
			int result10 = interndao.internInsert(iCategory2, iDate2, iMeeting2, iSubmit2, iAcceptance2, iDocument2, iAttend, applyFlag);
			if(result10 == 1) {
				re10 = true;
			}
			int result11 = interndao.internInsert(iCategory3, iDate3, iMeeting3, iSubmit3, iAcceptance3, iDocument3, iAttend, applyFlag);
			if(result11 == 1) {
				re11 = true;
			}
			int result12 = interndao.internInsert(iCategory4, iDate4, iMeeting4, iSubmit4, iAcceptance4, iDocument4, iAttend, applyFlag);
			if(result12 == 1) {
				re12 = true;
			}
			int result13 = interndao.internInsert(iCategory5, iDate5, iMeeting5, iSubmit5, iAcceptance5, iDocument5, iAttend, applyFlag);
			if(result13 == 1) {
				re13 = true;
			}
			int result14 = interndao.internInsert(iCategory6, iDate6, null, null, null, null, iAttend, applyFlag);
			if(result14 == 1) {
				re14 = true;
			}
			//面接情報登録
			int result15 = facedao.selectionfaceInsert(sfCategory1, sfName1, sfScore1); //一次　藤原さん
			if(result15 == 1) {
				re15 = true;
			}
			int result16 = facedao.selectionfaceInsert(sfCategory1, sfName2, sfScore2);//一次　板谷さん
			if(result16 == 1) {
				re16 = true;
			}
			int result17 = facedao.selectionfaceInsert(sfCategory1, sfName3, sfScore3); //一次　菅澤さん
			if(result17 == 1) {
				re17 = true;
			}
			int result18 = facedao.selectionfaceInsert(sfCategory2, sfName1, sfScore4);//二次　藤原さん
			if(result18 == 1) {
				re18 = true;
			}
			int result19 = facedao.selectionfaceInsert(sfCategory2, sfName2, sfScore5); //二次　板谷さん
			if(result19 == 1) {
				re19 = true;
			}
			//書類選考情報登録
			int result20 = textdao.selectiontextInsert(stCategory2, stName1, stScore1); //履歴書　松野さん
			if(result20 == 1) {
				re20 = true;
			}
			int result21 = textdao.selectiontextInsert(stCategory2, stName2, stScore2); //履歴書　藤原さん
			if(result21 == 1) {
				re21 = true;
			}
			int result22 = textdao.selectiontextInsert(stCategory2, stName3, stScore3); //履歴書　板谷さん
			if(result22 == 1) {
				re22 = true;
			}
			int result23 = textdao.selectiontextInsert(stCategory2, stName4, stScore4); //履歴書　菅澤さん
			if(result23 == 1) {
				re23 = true;
			}
			int result24 = textdao.selectiontextInsert(stCategory1, stName1, stScore5);//自己PR文　松野さん
			if(result24 == 1) {
				re24 = true;
			}
			int result25 = textdao.selectiontextInsert(stCategory1, stName2, stScore6); //自己PR　藤原さん
			if(result25 == 1) {
				re25 = true;
			}
			int result26 = textdao.selectiontextInsert(stCategory1, stName3, stScore7); //自己PR　板谷さん
			if(result26 == 1) {
				re26 = true;
			}
			int result27 = textdao.selectiontextInsert(stCategory1, stName4, stScore8); //自己PR　菅澤さん
			if(result27 == 1) {
				re27 = true;
			}
			int result28 = textdao.selectiontextInsert(stCategory3, stName1, stScore9); //書類選考　松野さん
			if(result28 == 1) {
				re28 = true;
			}
			int result29 = textdao.selectiontextInsert(stCategory3, stName2, stScore10); //書類選考　藤原さん
			if(result29 == 1) {
				re29 = true;
			}
			int result30 = textdao.selectiontextInsert(stCategory3, stName3, stScore11); //書類選考　板谷さん
			if(result30 == 1) {
				re30 = true;
			}
			int result31 = textdao.selectiontextInsert(stCategory3, stName4, stScore12); //書類選考　菅澤さん
			if(result31 == 1) {
				re31 = true;
			}
			if(re1 && re2 && re3 && re4 && re5 && re6 && re7 && re8 && re9 && re10 && re11 && re12 && re13 && re14 && re15 && re16 && re17 && re18 && re19 && re20 && re21 && re22 && re23 && re24 && re25 && re26 && re27 && re28 && re29 && re30 && re31) {
				result = true;
			}

			conn.commit();
			result = true;
		}catch(SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		//RegistActionにresultを返す
		return result;
	}



	//	//選考データの新規登録
	//	public boolean selectionEasyInsert(String seSelectionDate, int seScore, int seTextScore, String seTextResult, String seGetTextDate,  String seNo, String seOk, String seNoReason, String seSendOk, String seEalryOk, String seEarlyNo, String seFirstResult, String seSecondResult, String seFirstNo, String seFirstDate, String seSecondNo, String seSecondDate, String seThirdDate, String seThirdResult, String seRemarks, String seSituation, String seDecide, )  throws ClassNotFoundException, SQLException {
	//		boolean result = false;
	//
	//		//ドライバの登録
	//		Class.forName("org.h2.Driver");
	//		//データベースに接続する
	//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
	//
	//		//Daoを実体化
	//		SelectionEasyDao dao = new SelectionEasyDao(conn);
	//
	//		//引数を渡し、取得値をbeanに渡す
	//		int selectionEasy = dao.selectionEasyInsert(seSelectionDate, seScore, seTextScore, seTextResult, seGetTextDate, seNo, seOk, seNoReason, seSendOk, seEalryOk, seEarlyNo, seFirstResult, seSecondResult, seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate, seThirdResult, seRemarks, seSituation, seDecide);
	//
	//		if(selectionEasy != 0) {
	//			result = true;
	//		}
	//
	//		//RegistActionにresultを返す
	//		return result;
	//	}



	//テンプレート登録
	public boolean templateInsert(String tTitle, String tCategory, String tContent) throws ClassNotFoundException, SQLException{
		boolean result = false;

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		TemplateDao dao = new TemplateDao(conn);

		//引数を渡し、取得値をbeanに渡す
		int newTemplate = dao.templateInsert(tTitle, tCategory, tContent);

		if(newTemplate != 0) {
			result = true;
		}

		//RegistActionにresultを返す
		return result;

	}



	//	//イベント参加情報登録
	//	public boolean eventInsert(String eCategory, String eDate) throws ClassNotFoundException, SQLException{
	//		boolean result = false;
	//
	//		//ドライバの登録
	//		Class.forName("org.h2.Driver");
	//		//データベースに接続する
	//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
	//
	//		//Daoを実体化
	//		EventDao dao = new EventDao(conn);
	//
	//		//引数を渡し、取得値をbeanに渡す
	//		int event = dao.eventInsert(eCategory, eDate);
	//
	//		if(event != 0) {
	//			result = true;
	//		}
	//
	//		//RegistActionにresultを返す
	//		return result;
	//
	//	}


	//フィードバック登録
	public boolean feedbackInsert(int sId, String fCategory, String fName, String fContent) throws ClassNotFoundException, SQLException{
		boolean result = false;

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		FeedbackDao dao = new FeedbackDao(conn);

		//引数を渡し、取得値をbeanに渡す
		int newFeedback = dao.feedbackInsert(sId, fCategory, fName, fContent);

		if(newFeedback != 0) {
			result = true;
		}

		//RegistActionにresultを返す
		return result;

	}



	//	//インターン参加情報登録
	//	public boolean internInsert(String iCategory, String iDate, String iMeeting, String iSubmit, String iAcceptance, String iDocument, String iAttend, String applyFlag) throws ClassNotFoundException, SQLException{
	//		boolean result = false;
	//
	//		//ドライバの登録
	//		Class.forName("org.h2.Driver");
	//		//データベースに接続する
	//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
	//
	//		//Daoを実体化
	//		InternDao dao = new InternDao(conn);
	//
	//		//引数を渡し、取得値をbeanに渡す
	//		int intern = dao.internInsert(iCategory, iDate, iMeeting, iSubmit, iAcceptance, iDocument, iAttend, applyFlag);
	//
	//		if(intern != 0) {
	//			result = true;
	//		}
	//
	//		//RegistActionにresultを返す
	//		return result;
	//	}



	//	//面接情報登録
	//	public boolean selectionfaceInsert(String sfCategory, String sfName, int sfScore) throws ClassNotFoundException, SQLException {
	//		boolean result = false;
	//
	//		//ドライバの登録
	//		Class.forName("org.h2.Driver");
	//		//データベースに接続する
	//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
	//
	//		//Daoを実体化
	//		SelectionFaceDao dao = new SelectionFaceDao(conn);
	//
	//		//引数を渡し、取得値をbeanに渡す
	//		int selectionFace = dao.selectionfaceInsert(sfCategory, sfName, sfScore);
	//
	//		if(selectionFace != 0) {
	//			result = true;
	//		}
	//
	//		//RegistActionにresultを返す
	//		return result;
	//
	//	}



	//	//書類選考情報登録
	//	public boolean selectiontextInsert(String stCategory, String stName, int stScore) throws ClassNotFoundException, SQLException{
	//		boolean result = false;
	//
	//		//ドライバの登録
	//		Class.forName("org.h2.Driver");
	//		//データベースに接続する
	//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
	//
	//		//Daoを実体化
	//		SelectionTextDao dao = new SelectionTextDao(conn);
	//
	//		//引数を渡し、取得値をbeanに渡す
	//		int selectionText = dao.selectiontextInsert(stCategory, stName, stScore);
	//
	//		if(selectionText != 0) {
	//			result = true;
	//		}
	//
	//		//RegistActionにresultを返す
	//		return result;
	//
	//	}



}
