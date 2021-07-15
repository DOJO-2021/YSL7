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

	public boolean update(int uId) throws ClassNotFoundException, SQLException {
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

	public boolean delete(int uId) throws ClassNotFoundException, SQLException {
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
		int test =dao.StudentUpdate(sId,sName,sKana,sContexts,sUnivercity,sFaculty,sDepatment,sAddress,sPcmail,sMobilemail,sCareertasu,sMynavi,sRikunavi,Other);

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
		int test =dao.StudentDelete(sId);

		if(test == 1) {
			result = true;
		}

		return result;


	}

	public boolean flagUpdate( int sId, int alleditflag) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao dao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.StudentUpdate( sId, alleditflag);

		if(test  != 0) {
			result = true;
		}

		return result;

	}

	public boolean selectionEasyUpdate(int sId, String seSelectionDate, int seScore, int seTextScore, String seTextResult, String seGetTextDate,String seNo, String seOk, String seNoreason, String seSendOk,String seEarlyOk,String seEarlyNo, String seFirstResult, String seSecondResult, String seFirstNo,String seFirstDate, String seSecondNo, String seSecondDate, String seThirdDate, String seThirdResult, String seRemarks, String seSituatioin)  throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionEasyDao dao = new SelectionEasyDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.SelectionEasyUpdate(sId, seSelectionDate, seScore, seTextScore, seTextResult, seGetTextDate, seNo, seOk,  seNoreason, seSendOk, seEarlyOk, seEarlyNo, seFirstResult, seSecondResult, seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate, seThirdResult, seRemarks,  seSituation);

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
		int test =dao.delete(sId);

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
		int test =dao.TemplateUpdate(tId, tTitle, tContent);

		if(test == 1) {
			result = true;
		}

		return result;

	}



	public boolean eventUpdate( int eId, String eDate) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		EventDao dao = new EventDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.EventUpdate( eDate, eId);

		if(test  != 0) {
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
		int test =dao.FeedbackUpdate(fId, sId, fCategory, fName, fContent);

		if(test == 1) {
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
		int test =dao.feedbackDelete(sId);

		if(test == 1) {
			result = true;
		}

		return result;

	}


	public boolean internUpdate(int sId, String iCategory, String iDate, String iMeeting, String iSubmit, String iAcceptance, String iDocument, int iId, String iAttend, String applyFlag) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		InternDao dao = new InternDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.InternUpdate(sId, iCategory, iDate, iMeeting,iSubmit, iAcceptance, iDocument, iId, iAttend, applyFlag);

		if(test != 0) {
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

	public boolean allUpdate(String sqlContent, String iCategory ) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		InternDao dao = new InternDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.eventDelete(sqlContent, iCategory);

		if(test == 1) {
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
		SelectionFaceDao dao = newSelectioFaceDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.SelectionFaceUpdate(sId, sfCategory, sfName, sfScore, sfId);

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
		int test =dao.selectionFaceDelete(sId);

		if(test == 1) {
			result = true;
		}

		return result;

	}



	public boolean selectionTextUpdate(int sId, String stCategory, String stName, int stScore, int stId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionTextDao dao = newSelectionTextDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.SelectionTextUpdate(sId, stCategory, stName, stScore, stId);

		if(test != 0) {
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
		int test =dao.selectionTextDelete(sId);

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

