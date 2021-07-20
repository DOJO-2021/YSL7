package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.FeedbackDao;
import model.SFeedback;

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
//			//失敗パターン（文字数オーバー）
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



//updateメソッド----------------------------------------------

//		//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		FeedbackDao dao = new FeedbackDao(conn);
//		//引数を渡す - 成功パターン
//		int FeedbackUpdate = dao.update(3, "ぴよ", "書き換えます");

//		//失敗パターン（存在しないID）
//		//int FeedbackUpdate = dao.update(50, "ぴよ", "書き換えます");
//
//
//		if(FeedbackUpdate != 0) {
//			System.out.println("成功");
//		}else {
//			System.out.println("失敗");
//		}

//ここまで---------------------------------------------



//deleteメソッド-----------------------------------------------

//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		FeedbackDao dao = new FeedbackDao(conn);
//
//		//引数を渡す - 成功パターン
//		int FeedbackDelete = dao.delete(3);
//
//		//失敗パターン（存在しないID）
//		//int FeedbackDelete = dao.delete(40);
//
//
//		if(FeedbackDelete != 0) {
//			System.out.println("成功");
//		}else {
//			System.out.println("失敗");
//		}

//ここまで----------------------------------------------



//fFeedbackSelectメソッド---------------------------------------

//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		FeedbackDao dao = new FeedbackDao(conn);
//
//		//引数を渡す - 成功パターン
//		ArrayList<SFeedback> fFeedbackSelect = dao.fFeedbackSelect(2);
//
//		//失敗パターン（存在しないID）
////		ArrayList<SFeedback> fFeedbackSelect = dao.fFeedbackSelect(3);
//
//		if (fFeedbackSelect.size() != 0) {
//			System.out.println("成功");
//			for(SFeedback b : fFeedbackSelect) {
//				System.out.println(b.getfId());
//				System.out.println(b.getsId());
//				System.out.println(b.getfCategory());
//				System.out.println(b.getfName());
//				System.out.println(b.getfContent());
//			}
//		}else {
//			System.out.println("失敗");
//		}

//ここまで-------------------------------------------------------


//feedbackSelectメソッドのテスト---------------------------------

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		FeedbackDao dao = new FeedbackDao(conn);

		//引数を渡す - 成功パターン
		ArrayList<SFeedback> feedbackSelect = dao.feedbackSelect(2,"1dayインターン");

		//失敗パターン（存在しないID）
		//ArrayList<SFeedback> feedbackSelect = dao.feedbackSelect(30,"1dayインターン");

		if(feedbackSelect.size() != 0) {
			System.out.println("成功");
			for(SFeedback b : feedbackSelect) {
				System.out.println(b.getfId());
				System.out.println(b.getsId());
				System.out.println(b.getfCategory());
				System.out.println(b.getfName());
				System.out.println(b.getfContent());
			}
		}else {
			System.out.println("失敗");
		}

//ここまで--------------------------------------------------------


	}
}

