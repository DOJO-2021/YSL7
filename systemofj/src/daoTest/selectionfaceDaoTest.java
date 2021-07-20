package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.SelectionFaceDao;

public class selectionfaceDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
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

//セレクト
		//DAOを実体化
//		SelectionFaceDao sfDao = new SelectionFaceDao(conn);

		//引数を渡し、取得地をbeanに渡す
//		ArrayList<SSelectionFace> bean =sfDao.selectionfaceSelect(1);
		//引数を渡し、取得地をbeanに渡す
		int test1 =dao.selectionfaceUpdate( "一次面接", "菅澤", 1,1);
		int test2=dao.selectionfaceUpdate(  "一次面接", "板谷", 2,2);
		int test3 =dao.selectionfaceUpdate( "一次面接", "藤原", 3, 3 );
		int test4 =dao.selectionfaceUpdate(  "二次面接", "菅澤", 1, 4);
		int test5 =dao.selectionfaceUpdate(  "二次面接", "板谷", 2,  5);

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
		if(test1 != 0) {
				System.out.println("成功");
			} else {
				System.out.println("失敗");
			}
		if(test2 != 0) {
			System.out.println("成功");
		} else {
			System.out.println("失敗");
		}
		if(test3 != 0) {
			System.out.println("成功");
		} else {
			System.out.println("失敗");
		}
		if(test4 != 0) {
			System.out.println("成功");
		} else {
			System.out.println("失敗");
		}
		if(test5 != 0) {
			System.out.println("成功");
		} else {
			System.out.println("失敗");
		}

	}
}
