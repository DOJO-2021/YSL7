package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class yagiDao {

	public static void main(String[] args) {
		//select
		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
				"sa", "sa");


	}

}
