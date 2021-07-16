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
	public boolean studentInsert(String sName, String sKana, String sContent, String sUnivercity, String sFaculty, String sDepartment, String sAddress, String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String sOther, int alleditflag)  throws ClassNotFoundException, SQLException {
		boolean result = false;

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		StudentDao dao = new StudentDao(conn);

		//引数を渡し、取得値をbeanに渡す
		int newStudent = dao.studentInsert(sName, sKana, sContent, sUnivercity, sFaculty, sDepartment, sAddress, sPcmail, sMobilemail, sCareertasu, sMynavi, sRikunavi, sOther);

		if(newStudent != 0) {
			result = true;
		}

		//RegistActionにresultを返す
		return result;
	}



	//選考データの新規登録
	public boolean selectionEasyInsert(String seSelectionDate, int seScore, int seTextScore, String seTextResult, String seGetTextDate,  String seNo, String seOk, String seNoReason, String seSendOk, String seEalryOk, String seEarlyNo, String seFirstResult, String seSecondResult, String seFirstNo, String seFirstDate, String seSecondNo, String seSecondDate, String seThirdDate, String seThirdResult, String seRemarks, String seSituation, String seDecide)  throws ClassNotFoundException, SQLException {
		boolean result = false;

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		SelectionEasyDao dao = new SelectionEasyDao(conn);

		//引数を渡し、取得値をbeanに渡す
		int selectionEasy = dao.selectionEasyInsert(seSelectionDate, seScore, seTextScore, seTextResult, seGetTextDate, seNo, seOk, seNoReason, seSendOk, seEalryOk, seEarlyNo, seFirstResult, seSecondResult, seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate, seThirdResult, seRemarks, seSituation, seDecide);

		if(selectionEasy != 0) {
			result = true;
		}

		//RegistActionにresultを返す
		return result;
	}



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
		int newTemplate = dao.templeteInsert(tTitle, tCategory, tContent);

		if(newTemplate != 0) {
			result = true;
		}

		//RegistActionにresultを返す
		return result;

	}



	//イベント参加情報登録
	public boolean eventInsert(String eCategory, String eDate) throws ClassNotFoundException, SQLException{
		boolean result = false;

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		EventDao dao = new EventDao(conn);

		//引数を渡し、取得値をbeanに渡す
		int event = dao.eventInsert(eCategory, eDate);

		if(event != 0) {
			result = true;
		}

		//RegistActionにresultを返す
		return result;

	}


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



	//インターン参加情報登録
	public boolean internInsert(String iCategory, String iDate, String iMeeting, String iSubmit, String iAcceptance, String iDocument, String iAttend, String applyFlag) throws ClassNotFoundException, SQLException{
		boolean result = false;

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		InternDao dao = new InternDao(conn);

		//引数を渡し、取得値をbeanに渡す
		int intern = dao.internInsert(iCategory, iDate, iMeeting, iSubmit, iAcceptance, iDocument, iAttend, applyFlag);

		if(intern != 0) {
			result = true;
		}

		//RegistActionにresultを返す
		return result;
	}



	//面接情報登録
	public boolean selectionfaceInsert(String sfCategory, String sfName, int sfScore) throws ClassNotFoundException, SQLException {
		boolean result = false;

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		SelectionFaceDao dao = new SelectionFaceDao(conn);

		//引数を渡し、取得値をbeanに渡す
		int selectionFace = dao.selectionfaceInsert(sfCategory, sfName, sfScore);

		if(selectionFace != 0) {
			result = true;
		}

		//RegistActionにresultを返す
		return result;

	}



	//書類選考情報登録
	public boolean selectiontextInsert(String stCategory, String stName, int stScore) throws ClassNotFoundException, SQLException{
		boolean result = false;

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		SelectionTextDao dao = new SelectionTextDao(conn);

		//引数を渡し、取得値をbeanに渡す
		int selectionText = dao.selectiontextInsert(stCategory, stName, stScore);

		if(selectionText != 0) {
			result = true;
		}

		//RegistActionにresultを返す
		return result;

	}



}
