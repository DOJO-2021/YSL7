package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.UserDao;

public class RegistService {

	public int studentInsert(String sName, String sKana, String sContent, String sUnivercity, String sFaculty, String sDepartment, String sAddress, String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String sOther, int alleditflag)  throws ClassNotFoundException, SQLException {
		int result = 0;

		//ドライバの登録
		Class.forName("org.h2.Driver");

		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/ShareNote", "sa", "sa");
		//Daoを実体化
		UserDao dao = new UserDao(conn);

		//引数を渡し、取得値をbeanに渡す
		User newStudent = dao.studentInsert(sName, sKana, sContent, sUnivercity, sFaculty, sDepartment, sAddress, sPcmail, sMobilemail, sCareertasu, sMynavi, sRikunavi, sOther, alleditflag);


		}


	return newStudent;
	}

}
