package daoTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.StudentDao;

public class StudentDaoTest {



	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//studentInsert
		try {
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		int newStudent = dao.studentInsert("梶井ももか", "カジイモモカ", "文系", "青山学院大学", "教育人間科学部", "心理学科", "神奈川県横浜市3-4-5", "m_m@pc.com", "m_m@ne.jp", "", "〇", "" ,"");
//
//		if(newStudent != 0) {
//			System.out.println("登録成功");

//		}
//
//		} catch (SQLException e){
//
//			System.out.println("登録失敗");
//
//		}




//		//update成功
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		// ないsId
//		int newStudent = dao.update(1,"城戸沙月", "キドサツキ", "文系", "駒沢大学", "グローバル学部", "グローバル学科", "東京都世田谷区3-5-1", "satsuki_kido@pc.com", "satsuki_kido@ne.jp", "", "〇", "" ,"");
//
//
//		if(newStudent != 0) {
//			System.out.println("更新成功");
//
//		} else {
//
//			System.out.println("登録失敗");
//		}





//		//update失敗
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		// ないsId
//		int newStudent = dao.update(100,"城戸沙月", "キドサツキ", "文系", "駒沢大学", "グローバル学部", "グローバル学科", "神奈川県横浜市3-5-1", "satsuki_kido@pc.com", "satsuki_kido@ne.jp", "", "〇", "" ,"");
//
//
//		if(newStudent != 0) {

//			System.out.println("更新成功");
//
//		} else {
//
//			System.out.println("登録失敗");
//		}



		//delete成功

		//ドライバの登録
		Class.forName("org.h2.Driver");

		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		StudentDao dao = new StudentDao(conn);

		//引数を渡し、取得値をbeanに渡す
		// ないsId
		int newStudent = dao.delete(10);

		if(newStudent != 0) {

			System.out.println("削除成功");

		} else {

			System.out.println("削除失敗");
		}









	}
	}


}
