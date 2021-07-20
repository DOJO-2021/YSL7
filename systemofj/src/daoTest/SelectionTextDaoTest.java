package daoTest;

import java.sql.SQLException;

public class SelectionTextDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//throws ClassNotFoundException, SQLException


//selectiontextSelectメソッドのテスト--------------------------

//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		SelectionTextDao dao = new SelectionTextDao(conn);
//
//		//引数を渡す - 成功パターン
//		ArrayList<SSelectionText> stSelect = dao.selectiontextSelect(3);
//
//		//失敗パターン（存在しないID）
//		//ArrayList<SSelectionText> stSelect = dao.selectiontextSelect(505);
//
//		if(stSelect.size() != 0) {
//			System.out.println("成功");
//			for(SSelectionText s : stSelect) {
//				System.out.println(s.getsId());
//				System.out.println(s.getStCategory());
//				System.out.println(s.getStName());
//				System.out.println(s.getStScore());
//				System.out.println(s.getStId());
//			}
//		}else {
//			System.out.println("失敗");
//		}

//ここまで------------------------------------------------------


//selectiontextInsertメソッドのテスト

//		try {
//			//ドライバの登録
//			Class.forName("org.h2.Driver");
//			//データベースに接続する
//			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//			//Daoを実体化
//			SelectionTextDao dao = new SelectionTextDao(conn);
//
//			//引数を渡す
//			int stInsert = dao.selectiontextInsert("履歴書", "よしだ", 1);
//
//			if(stInsert != 0) {
//				System.out.println("成功");
//			}
//		}
//		catch(SQLException e) {
//			System.out.println("失敗");
//		}
//		catch(ClassNotFoundException e) {
//			System.out.println("失敗");
//		}

//ここまで-------------------------------------------------------


//selectiontextUpdateメソッドのテスト----------------------------

//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		SelectionTextDao dao = new SelectionTextDao(conn);
//
//		//引数を渡す - 成功パターン
//		int stUpdate = dao.selectiontextUpdate(9, "履歴書", "よしだ", 3, 25);
//
//		//失敗パターン（存在しないID）
//		//int stUpdate = dao.selectiontextUpdate(9, "履歴書", "よしだ", 3, 30);
//
//		if(stUpdate != 0) {
//			System.out.println("成功");
//		}else {
//			System.out.println("失敗");
//		}

//ここまで-------------------------------------------------------


//selectiontextUpdateメソッドのテスト改--------------------------

//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//
//		//データベースに接続する①
//		Connection conn1 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa", "sa");
//		//DAOを実体化
//		SelectionTextDao dao1 = new SelectionTextDao(conn1);
//		//引数を渡す - 成功パターン
//		int test1 = dao1.selectiontextUpdate(1, "履歴書", "松野", 3, 5);
//
//		//データベースに接続する②
//		Connection conn2 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa", "sa");
//		//DAOを実体化
//		SelectionTextDao dao2 = new SelectionTextDao(conn2);
//		//引数を渡す - 成功パターン
//		int test2 = dao2.selectiontextUpdate(1, "履歴書", "藤原", 2, 6);
//
//		//データベースに接続する③
//		Connection conn3 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa", "sa");
//		//DAOを実体化
//		SelectionTextDao dao3 = new SelectionTextDao(conn3);
//		//引数を渡す - 成功パターン
//		int test3 = dao3.selectiontextUpdate(1, "履歴書", "板谷", 2, 7);
//
//		//データベースに接続する④
//		Connection conn4 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa", "sa");
//		//DAOを実体化
//		SelectionTextDao dao4 = new SelectionTextDao(conn4);
//		//引数を渡す - 成功パターン
//		int test4 = dao4.selectiontextUpdate(1, "履歴書", "菅澤", 3, 8);
//
//
//		//処理成功チェック
//		if(test1 != 0 && test2 != 0 && test3 != 0 && test4 != 0) {
//			System.out.println("成功");
//		} else {
//			System.out.println("失敗");
//		}

//ここまで-------------------------------------------------------


//selectiontextDeleteメソッドのテスト----------------------------

//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		SelectionTextDao dao = new SelectionTextDao(conn);
//
//		//引数を渡す - 成功パターン
//		//int stDelete = dao.selectiontextDelete(9);
//
//		//失敗パターン（存在しないID）
//		int stDelete = dao.selectiontextDelete(90);
//
//		if(stDelete != 0) {
//			System.out.println("成功");
//		}else {
//			System.out.println("失敗");
//		}

//ここまで--------------------------------------------------------

	}

}
