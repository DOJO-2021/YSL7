package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.InternDao;


class InternDAOTest {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{


//		//selectのテスト 成功
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
//				"sa", "sa");
//		//DAOを実体化
//		InternDao dao = new InternDao (conn);
//		//引数を渡し、取得地をbeanに渡す
//		ArrayList<SIntern> bean = dao.internDSelect(1);
//
//		if (bean.size() != 0) {
//			System.out.println("成功");
//		}
//		//
//		else {
//			System.out.println("失敗");
//
//		}

		//ここまで-------------------------------------------

//		//selectのテスト 失敗
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
//				"sa", "sa");
//		//DAOを実体化
//		InternDao dao = new InternDao (conn);
//		//引数を渡し、取得地をbeanに渡す
//		ArrayList<SIntern> bean = dao.internDSelect(10);
//
//		if (bean.size() != 0) {
//			System.out.println("成功");
//		}
//		//
//		else {
//			System.out.println("失敗");
//
//		}
		//ここまで-------------------------------------------


		//InternInsertテスト
		//
		//

//			//ドライバの登録
//			Class.forName("org.h2.Driver");
//			//データベースに接続する
//			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
//					"sa", "sa");
//
//			//Daoを実体化
//			InternDao dao = new InternDao(conn);
//
//			//引数を渡す - 成功パターン
//			int newIntern = dao.internInsert("1dayインターン", "2020-05-26", "〇", "〇", "〇", "〇", "〇", "2020-06-06");
//
//			//
//			//
//			if (newIntern != 0) {
//				System.out.println("成功");
//			}
//			//
//		  else {
//			System.out.println("失敗");
//
//		}
		//ここまで-------------------------------------------


//		//InternUpdateテスト 成功！
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
//				"sa", "sa");
//
//		//Daoを実体化
//		InternDao dao = new InternDao(conn);
//
//		//引数を渡す - 成功パターン
//		int InternUpdate = dao.internUpdate(2, "1dayインターン", "2020-03-26", "〇", "〇", "〇", "〇", "〇");
//
//
//
//		if (InternUpdate != 0) {
//			System.out.println("成功");
//		}
//
//	  else {
//		System.out.println("失敗");
//
//	}
//	//ここまで-------------------------------------------

//		//InternUpdateテスト 失敗！
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
//				"sa", "sa");
//
//		//Daoを実体化
//		InternDao dao = new InternDao(conn);
//
//		//引数を渡す - 成功パターン
//		int InternUpdate = dao.internUpdate(100, "1dayインターン", "2020-03-26", "〇", "〇", "〇", "〇", "〇");
//
//
//
//		if (InternUpdate != 0) {
//			System.out.println("成功");
//		}
//
//	  else {
//		System.out.println("失敗");
//
//	}
//	//ここまで-------------------------------------------

//		//delete成功
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		InternDao dao = new InternDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		// ないsId
//		int newIntern = dao.internDelete(1);
//
//		if(newIntern != 0) {
//
//			System.out.println("削除成功");
//
//		} else {
//
//			System.out.println("削除失敗");
//		}

		//ここまで-------------------------------------------


//		//delete失敗
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		InternDao dao = new InternDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		// ないsId
//		int newIntern = dao.internDelete(100);
//
//		if(newIntern != 0) {
//
//			System.out.println("削除成功");
//
//		} else {
//
//			System.out.println("削除失敗");
//		}

		//ここまで-------------------------------------------


		//allUpdateテスト 成功！

		//H2でALLEDITFLAGが1の人を追加  update Intern set alleditflag = 1 where i_id = 6
		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
				"sa", "sa");

		//Daoを実体化
		InternDao dao = new InternDao(conn);

		//引数を渡す - 成功パターン
		int newIntern = dao.allUpdate(" set i_date='2020-05-03', i_attend='' where i_category ='中級' AND alleditflag = 1","中級");



		if (newIntern != 0) {
		System.out.println("成功");
		}

	  else {
		System.out.println("失敗");

	}
	//ここまで-------------------------------------------


//		//allUpdateテスト 失敗！
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
//				"sa", "sa");
//
//		//Daoを実体化
//		InternDao dao = new InternDao(conn);
//
//		//引数を渡す - 成功パターン
//		int newIntern = dao.allUpdate(" set i_date='2020-09-07' where alleditflag = 1","1day");
//
//
//
//		if (newIntern != 0) {
//			System.out.println("成功");
//		}
//
//	  else {
//		System.out.println("失敗");
//
//	}
//	//ここまで-------------------------------------------


//		//uploadUpdateテスト 成功！

//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
//				"sa", "sa");
//
//		//Daoを実体化
//		InternDao dao = new InternDao(conn);
//
//		//引数を渡す - 成功パターン
//		int newIntern = dao.uploadUpdate(1, "2020-6-20", "1day");
//
//
//
//		if (newIntern != 0) {
//			System.out.println("成功");
//		}
//
//	  else {
//		System.out.println("失敗");
//
//	}
//	//ここまで-------------------------------------------


//		//uploadUpdateテスト 失敗！

//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
//				"sa", "sa");
//
//		//Daoを実体化
//		InternDao dao = new InternDao(conn);
//
//		//引数を渡す - 成功パターン
//		int newIntern = dao.uploadUpdate(8, "2020-6-20", "1day");
//
//
//
//		if (newIntern != 0) {
//			System.out.println("成功");
//		}
//
//	  else {
//		System.out.println("失敗");
//
//	}
//	//ここまで-------------------------------------------


	}
}