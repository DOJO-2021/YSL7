package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.InternDao;

class InternDAOTest {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{

		//InternInsertテスト
		//
		//
		
			//ドライバの登録
			Class.forName("org.h2.Driver");
			//データベースに接続する
			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
					"sa", "sa");

			//Daoを実体化
			InternDao dao = new InternDao(conn);

			//引数を渡す - 成功パターン
			int newIntern = dao.internInsert("1dayインターン", "2020-05-26", "〇", "〇", "〇", "〇", "〇", "2020-06-06");

			//
			//
			if (newIntern != 0) {
				System.out.println("成功");
			}
			//
		  else {
			System.out.println("失敗");

		}
		//ここまで-------------------------------------------
	}
}