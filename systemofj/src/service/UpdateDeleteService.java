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


public class UpdateDeleteService {

	public boolean userUpdate(String uId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		UserDao dao = new UserDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.update(uId);

		if(test == 1) {
			result = true;
		}

		return result;

	}

	public boolean userDelete(String uId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		UserDao dao = new UserDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.delete(uId);

		if(test == 1) {
			result = true;
		}

		return result;

	}

	public boolean studentUpdate(int sId,String sName,String sKana,String sContexts,String sUnivercity, String sFaculty,String sDepatment, String sAddress, String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String Other ) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao dao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.update(sId,sName,sKana,sContexts,sUnivercity,sFaculty,sDepatment,sAddress,sPcmail,sMobilemail,sCareertasu,sMynavi,sRikunavi,Other);

		if(test != 0) {
			result = true;
		}

		return result;

	}

	public boolean studentDelete(int sId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao dao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.delete(sId);

		if(test == 1) {
			result = true;
		}

		return result;


	}

	public boolean flagUpdate( int sId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao dao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.flagUpdate(sId);

		if(test != 0) {
			result = true;
		}

		return result;

	}

	public boolean flagDelete() throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao dao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.flagDelete();

		if(test  != 0) {
			result = true;
		}

		return result;

	}


	public boolean selectionEasyUpdate(int sId, String seSelectionDate, int seScore, int seTextScore, String seTextResult,
											String seGetTextDate,String seNo, String seOk, String seNoreason, String seSendOk,
											String seEarlyOk,String seEarlyNo, String seFirstResult, String seSecondResult,
											String seFirstNo,String seFirstDate, String seSecondNo, String seSecondDate,
											String seThirdDate, String seThirdResult, String seRemarks, String seSituation, String seDecide)  throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionEasyDao dao = new SelectionEasyDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.selectionEasyUpdate(sId, seSelectionDate, seScore, seTextScore, seTextResult, seGetTextDate,
										   seNo, seOk,  seNoreason, seSendOk, seEarlyOk, seEarlyNo, seFirstResult,
										   seSecondResult, seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate,
										   seThirdResult, seRemarks,  seSituation, seDecide);

		if(test != 0) {
			result = true;
		}

		return result;

	}

	public boolean selectionEasyDelete(int sId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionEasyDao dao = new SelectionEasyDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.selectionEasyDelete(sId);

		if(test == 1) {
			result = true;
		}

		return result;

	}

	public boolean templateUpdate(int tId, String tTitle, String tContent) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		TemplateDao dao = new TemplateDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.templateUpdate(tId, tTitle, tContent);

		if(test != 0) {
			result = true;
		}

		return result;

	}



	public boolean eventUpdate( int eId, String eDate1, String eDate2, String eDate3, String eDate4, String eDate5, String eDate6 ) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		EventDao dao = new EventDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test1 =dao.eventUpdate(eId,eDate1);
		int test2 =dao.eventUpdate(eId,eDate2);
		int test3 =dao.eventUpdate(eId,eDate3);
		int test4 =dao.eventUpdate(eId,eDate4);
		int test5 =dao.eventUpdate(eId,eDate5);
		int test6 =dao.eventUpdate(eId,eDate6);



		if(test1 == 1 && test2 ==1 && test3 == 1 && test4 == 1 && test5 == 1 && test6==1 ) {
			result = true;
		}

		return result;

	}



	public boolean eventDelete(int sId ) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		EventDao dao = new EventDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.eventDelete(sId);

		if(test == 1) {
			result = true;
		}

		return result;

	}

	public boolean feedbackUpdate(int fId,  String fName, String fContent) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		FeedbackDao dao = new FeedbackDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.update(fId, fName, fContent);

		if(test != 0) {
			result = true;
		}

		return result;

	}

	public boolean feedbackDelete(int sId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		FeedbackDao dao = new FeedbackDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.delete(sId);

		if(test == 1) {
			result = true;
		}

		return result;

	}


	public boolean internUpdate(int sId, String iCategory1, String iCategory2, String iCategory3, String iCategory4, String iCategory5, String iDate1, String iDate2, String iDate3, String iDate4, String iDate5, String iMeeting1, String iMeeting2,
									String iMeeting3, String iMeeting4, String iMeeting5, String iSubmit1, String iSubmit2, String iSubmit3, String iSubmit4, String iSubmit5,
									String iAcceptace1, String iAcceptace2, String iAcceptace3, String iAcceptace4, String iAcceptace5,
									String iDocument1, String iDocument2, String iDocument3, String iDocument4, String iDocument5, int iId, String iAttend) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		InternDao dao = new InternDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test1 =dao.internUpdate(sId, iCategory1, iDate1,  iMeeting1,  iSubmit1, iAcceptace1,  iDocument1,  iId, iAttend);
		int test2 =dao.internUpdate(sId, iCategory2, iDate2,  iMeeting2,  iSubmit2, iAcceptace2,  iDocument2,  iId, iAttend);
		int test3 =dao.internUpdate(sId, iCategory3, iDate3,  iMeeting3,  iSubmit3, iAcceptace3,  iDocument3,  iId, iAttend);
		int test4 =dao.internUpdate(sId, iCategory4, iDate4,  iMeeting4,  iSubmit4, iAcceptace4,  iDocument4,  iId, iAttend);
		int test5 =dao.internUpdate(sId, iCategory5, iDate5,  iMeeting5,  iSubmit5, iAcceptace5,  iDocument5,  iId, iAttend);



		if(test1 == 1 && test2 == 1 && test3 == 1 && test4 == 1 && test5 == 1) {
			result = true;
		}

		return result;

	}

	public boolean internDelete(int sId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		InternDao dao = new InternDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.internDelete(sId);

		if(test == 1) {
			result = true;
		}

		return result;

	}

	public boolean allUpdate(int sId, String iCategory, String iDate1, String iDate2, String iDate3, String iDate4, String iDate5,
								String iMeeting1, String iMeeting2, String iMeeting3, String iMeeting4, String iMeeting5, String iSubmit,
								String iAcceptance1, String iAcceptance2, String iAcceptance3, String iAcceptance4, String iAcceptance5,
								String iDocument1, String iDocument2, String iDocument3, String iDocument4, String iDocument5,
								int iId, String iAttend1, String iAttend2, String iAttend3, String iAttend4, String iAttend5) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		InternDao dao = new InternDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.allUpdate(sId, iCategory, iDate1,iDate2,iDate3,iDate4,iDate5,
									iMeeting1, iMeeting2, iMeeting3, iMeeting4, iMeeting5,
									iSubmit, iAcceptance1, iAcceptance2, iAcceptance3, iAcceptance4, iAcceptance5,
									iDocument1, iDocument2, iDocument3, iDocument4, iDocument5,
									iId, iAttend1, iAttend2, iAttend3, iAttend4, iAttend5);

		if(test != 0) {
			result = true;
		}

		return result;

	}

	public boolean selectionFaceUpdate(int sId, String sfCategory, String sfName, int sfScore, int sfId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionFaceDao dao = new SelectionFaceDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.selectionfaceUpdate(sId, sfCategory, sfName, sfScore, sfId);

		if(test != 0) {
			result = true;
		}

		return result;

	}

	public boolean selectionFaceDelete(int sId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionFaceDao dao = new SelectionFaceDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.selectionfaceDelete(sId);

		if(test == 1) {
			result = true;
		}

		return result;

	}



	public boolean selectionTextUpdate(int sId,String stCategory1, String stCategory2, String stCategory3,
			String stName1, String stName2, String stName3, String stName4, int stScore1, int stScore2, int stScore3, int stScore4, int stScore5, int stScore6, int stScore7, int stScore8, int stScore9,int stScore10, int stScore11, int stScore12, int stId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionTextDao dao = new SelectionTextDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test1 =dao.selectiontextUpdate(sId, stCategory1, stName1, stScore1, stId);
		int test2 =dao.selectiontextUpdate(sId, stCategory1, stName2, stScore2, stId);
		int test3 =dao.selectiontextUpdate(sId, stCategory1, stName3, stScore3, stId);
		int test4 =dao.selectiontextUpdate(sId, stCategory1, stName4, stScore4, stId);

		int test5 =dao.selectiontextUpdate(sId, stCategory2, stName1, stScore1, stId);
		int test6 =dao.selectiontextUpdate(sId, stCategory2, stName2, stScore2, stId);
		int test7 =dao.selectiontextUpdate(sId, stCategory2, stName3, stScore3, stId);
		int test8 =dao.selectiontextUpdate(sId, stCategory2, stName4, stScore4, stId);

		int test9 =dao.selectiontextUpdate(sId, stCategory3, stName1, stScore1, stId);
		int test10 =dao.selectiontextUpdate(sId, stCategory3, stName2, stScore2, stId);
		int test11 =dao.selectiontextUpdate(sId, stCategory3, stName3, stScore3, stId);
		int test12 =dao.selectiontextUpdate(sId, stCategory3, stName4, stScore4, stId);

		if(test1 == 1 && test2 == 1 && test3 == 1 && test4 == 1 && test5 == 1 && test6 == 1 && test7 == 1 && test8 == 1 && test9 == 1 && test10 == 1 && test11 == 1 && test12 == 1 ) {
			result = true;
		}

		return result;

	}


	public boolean selectionTextDelete(int sId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionTextDao dao = new SelectionTextDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.selectiontextDelete(sId);

		if(test == 1) {
			result = true;
		}

		return result;

	}
}
//トランザクションを使用する場合はこんなかんじ
//conn.commit();

//もし、ArrayListなどがreturnされてきた場合、このような出力値検査が行われる
//		ArrayList<UserBean> list = dao.getAllList<>();
//		if(list.size()==0) {
//			list=null;
//		}

