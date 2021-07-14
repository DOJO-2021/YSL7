package service;

import java.sql.Connection;
import java.sql.Date;
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


//import model.Template;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class UpdateDeleteService {
	public boolean TemplateUpdate(int tId, String tTitle, String tContent, String tCategory) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		TemplateDao dao = new TemplateDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.TemplateUpdate(tId, tTitle, tContent, tCategory);

		if(test == 1) {
			result = true;
		}

		return result;

	}
	public boolean StudentUpdate(int sId,String sName,String sKana,String sContexts,String sUnivercity, String sFaculty,String sDepatment, String sAddress, String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String Other, int allEditFlag ) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao dao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.StudentUpdate(sId,sName,sKana,sContexts,sUnivercity,sFaculty,sDepatment,sAddress,sPcmail,sMobilemail,sCareertasu,sMynavi,sRikunavi,Other, allEditFlag);

		if(test != 0) {
			result = true;
		}

		return result;

	}

	public boolean EventUpdate(int sId, String eCategory, Date eDate, int eId) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		EventDao dao = new EventDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.EventUpdate(sId, eCategory, eDate, eId);

		if(test  != 0) {
			result = true;
		}

		return result;

	}


	public boolean InternUpdate(int sId, String iCategory, Date iDate, String iMeeting, String iSubmit, String iAcceptance, String iDocument, int iId, String iAttend, Date applyFlag) throws ClassNotFoundException, SQLException {
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

	public boolean SelectionTextUpdate(int sId, String stCategory, String stName, int stScore, int stId) throws ClassNotFoundException, SQLException {
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
	public boolean FeedbackUpdate(int fId, int sId, String fCategory, String fName, String fContent) throws ClassNotFoundException, SQLException {
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

	public boolean SelectionEasyUpdate(int sId, Date seSelectionDate, int seScore, int seTextScore, String seTextResult, Date seGettextDate,Date seNo, Date seOk, String seNoreason, Date seSendOk, Date seEarlyOk, Date seEarlyNo, String seFirstResult, String seSecondResult, Date seFirstNo, Date seFirstDate, Date seSecondNo, Date seSecondDate, Date seThirdDate, String seThirdResult, String seRemarks, int seId, String seSituation) throws ClassNotFoundException, SQLException {
		boolean result = false;
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionEasyDao dao = new SelectionEasyDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.SelectionEasyUpdate(sId, seSelectionDate, seScore, seTextScore, seTextResult, seGettextDate, seNo, seOk,  seNoreason, seSendOk, seEarlyOk, seEarlyNo, seFirstResult, seSecondResult, seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate, seThirdResult, seRemarks, seId, seSituation);

		if(test != 0) {
			result = true;
		}

		return result;

	}

	public boolean SelectionFaceUpdate(int sId, String sfCategory, String sfName, int sfScore, int sfId) throws ClassNotFoundException, SQLException {
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

	public boolean StudentDelete(int sId) throws ClassNotFoundException, SQLException {
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

}
//トランザクションを使用する場合はこんなかんじ
//conn.commit();

//もし、ArrayListなどがreturnされてきた場合、このような出力値検査が行われる
//		ArrayList<UserBean> list = dao.getAllList<>();
//		if(list.size()==0) {
//			list=null;
//		}

