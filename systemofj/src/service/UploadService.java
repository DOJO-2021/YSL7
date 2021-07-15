package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.StudentDao;

public class UploadService {
	public boolean studentInsert(String sName,String sKana,String sContexts, String sUnivercity, String sFaculty, String sDepartment, String sAddress,String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String sOther) throws ClassNotFoundException,SQLException {
		boolean result = false;

		//ドライバの登録を行う
		Class.forName("org.h2.Driver");

		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\db\\db", "sa", "sa");
		//DAOを実体化
		StudentDao dao = new StudentDao(conn);
		//引数を渡し、取得値をi_resultに渡す
		int i_result =dao.studentInsert(sName,sKana,sContexts,sUnivercity,sFaculty,sDepartment,sAddress,sPcmail,sMobilemail,sCareertasu,sMynavi,sRikunavi,sOther);
		//取得地のチェック
		if(i_result == 1) {
			result = true;
		}

		return result;
	}

	public boolean variousInsert() {

	}
}
