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
