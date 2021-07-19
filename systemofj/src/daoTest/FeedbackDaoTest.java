package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.FeedbackDao;

public class FeedbackDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		//throws ClassNotFoundException, SQLException


//feedbackInsertメソッドのテスト---------------------


//		try {
//			//ドライバの登録
//			Class.forName("org.h2.Driver");
//			//データベースに接続する
//			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//			//Daoを実体化
//			FeedbackDao dao = new FeedbackDao(conn);
//
//			//引数を渡す - 成功パターン
//			int newFeedback = dao.feedbackInsert(3, "あいうえお", "たなか", "テストですよ");
//
//			//引数を渡す - 失敗パターン
//			//int newFeedback = dao.feedbackInsert(3, "あいうえお", "あいうえおかきくけこさしすせそたちつてとな", "テストですよ");
//
//
//			if(newFeedback != 0) {
//				System.out.println("成功");
//			}
//
//		}
//		catch(SQLException e) {
//			System.out.println("失敗");
//		}
//		catch(ClassNotFoundException e) {
//			System.out.println("失敗");
//		}
//ここまで--------------------------------------------




//update----------------------------------------------

		//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		FeedbackDao dao = new FeedbackDao(conn);
//		//引数を渡す - 成功パターン
//		int FeedbackUpdate = dao.update(3, "ぴよ", "書き換えます");
//		//失敗パターン
//		//int FeedbackUpdate = dao.update(50, "ぴよ", "書き換えます");
//
//
//		if(FeedbackUpdate != 0) {
//			System.out.println("成功");
//		}else {
//			System.out.println("失敗");
//		}

//ここまで---------------------------------------------



//delete-----------------------------------------------

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		FeedbackDao dao = new FeedbackDao(conn);

		//引数を渡す - 成功パターン
		int FeedbackDelete = dao.delete(3);


		if(FeedbackDelete != 0) {
			System.out.println("成功");
		}else {
			System.out.println("失敗");
		}

	}


}

