package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.SelectionFaceDao;

public class selectionfaceDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		try {
		//面接insert
		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
				"sa", "sa");
//インサート
		//Daoを実体化
//		SelectionFaceDao dao = new SelectionFaceDao(conn);
		//引数を渡し、成功パターン
//		int selectionFace = dao.selectionfaceInsert("一次面接"," 菅澤",1);
//アップデート
		//DAOを実体化
		SelectionFaceDao dao = new SelectionFaceDao(conn);
//デリート
		//DAOを実体化
//		SelectionFaceDao dao = new SelectionFaceDao(conn);
		//引数を渡し、取得地をbeanに渡す
//		int test =dao.selectionfaceDelete(1);

//セレクト
		//DAOを実体化
//		SelectionFaceDao sfDao = new SelectionFaceDao(conn);
		//引数を渡し、取得地をbeanに渡す
//		ArrayList<SSelectionFace> bean =sfDao.selectionfaceSelect(1);

		//引数を渡し、取得地をbeanに渡す
		int test1 =dao.selectionfaceUpdate( "一次面接", "菅澤", 1,5);
		//データベースに接続する
		Connection conn1= DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
				"sa", "sa");

		SelectionFaceDao dao1 = new SelectionFaceDao(conn1);
		int test2=dao1.selectionfaceUpdate(  "一次面接", "板谷", 2,5);
		//データベースに接続する
		Connection conn2 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
				"sa", "sa");
		SelectionFaceDao dao2 = new SelectionFaceDao(conn2);
		int test3 =dao2.selectionfaceUpdate( "一次面接", "藤原", 3, 5 );
		//データベースに接続する
		Connection conn3 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
				"sa", "sa");
		SelectionFaceDao dao3 = new SelectionFaceDao(conn3);
		int test4 =dao3.selectionfaceUpdate(  "二次面接", "菅澤", 1, 5);
		//データベースに接続する
		Connection conn4 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
				"sa", "sa");

		SelectionFaceDao dao4 = new SelectionFaceDao(conn4);

		int test5 =dao4.selectionfaceUpdate(  "二次面接", "板谷", 2,  5);

//select
//		if (bean.size() != 0) {
//			System.out.println("成功");
//			} else {
//			System.out.println("失敗");
//		}
//insert
//		if(selectionFace != 0) {
//			System.out.println("成功");
//		} else {
//			System.out.println("失敗");
//		}
//	}
//update
//		System.out.println(test1+":1");
//		System.out.println(test2+"2");
//		System.out.println(test3+"3");
//		System.out.println(test4+"4");
//		System.out.println(test5+"5");

		if(test1 != 0 && test2 != 0 && test3 != 0 && test4 != 0 && test5 != 0 ) {
			System.out.println("成功");
		} else {
			System.out.println("失敗");
		}



		//delete
//		if(test != 0) {
//				System.out.println("成功");
//			} else {
//				System.out.println("失敗");
//			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
