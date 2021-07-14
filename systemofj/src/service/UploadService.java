package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UploadService {
	public /*メソッド名　引数*/ throws ClassNotFoundException,SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");

		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\db\\db", "sa", "sa");
		//DAOを実体化

	}
}
