package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.SelectionEasyDao;
import model.SSelectionEasy;

public class SelectionEasyTest {

	public class SelectionDaoTest {

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");

		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");

		SelectionEasyDao selectionEasyDao = new SelectionEasyDao(conn);
		System.out.println("selectテスト--------------------");
		//selectテスト
		SSelectionEasy selectionEasy = selectionEasyDao.selectionEasySelect(1);
		if(selectionEasy != null) {
			System.out.println("一応成功");
			if(selectionEasy.getSeScore() == (60)) {
				System.out.println("本当に成功");
			}else {
				System.out.println("失敗");
			}
		}
		System.out.println();

		/*		//登録テスト
				System.out.println("登録テスト----------------------");
				conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
				selectionEasyDao = new SelectionEasyDao(conn);
				conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
				StudentDao studentDao = new StudentDao(conn);
				try {
					int s = studentDao.studentInsert("齊藤優海", "サイトウユミ", null, null, null, null, "東京", null, null, null, null, null, null);
					int e = selectionEasyDao.selectionEasyInsert(null, 6, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
					System.out.println("成功");
				}catch(SQLException e){
					System.out.println("失敗");
					e.printStackTrace();
				}
				System.out.println();
		*/
		//更新テスト
		System.out.println("更新テスト----------------------");
		conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
		selectionEasyDao = new SelectionEasyDao(conn);
		try {
			int v = selectionEasyDao.selectionEasyUpdate(3, null, 6, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			System.out.println("成功");
		}catch(SQLException e){
			System.out.println("失敗");
			e.printStackTrace();
		}
		System.out.println();

		//削除テスト
		System.out.println("削除テスト----------------------");
		conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
		selectionEasyDao = new SelectionEasyDao(conn);
		try {
			int t = selectionEasyDao.selectionEasyDelete(9);
			System.out.println("成功");
		}catch(SQLException e){
			System.out.println("失敗");
			e.printStackTrace();
		}
		System.out.println();


	}



}
