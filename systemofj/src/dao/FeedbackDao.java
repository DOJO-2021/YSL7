package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.SFeedback;


public class FeedbackDao {
	Connection conn = null;

	public FeedbackDao(Connection conn) {
		this.conn = conn;
	}

	// 登録
	public int feedbackInsert(int sID, String fCategory, String fName, String fContent) throws SQLException {

		// SQL文を準備する

		String sql = "insert into Feedback values (null, ?, ?, ?, ?)";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setInt(1, sID); //1つ目の?(=NAME)に入力値をいれる

		pStmt.setString(2, fCategory);

		pStmt.setString(3, fName);

		pStmt.setString(4, fContent);

		if (conn != null) {
			conn.close();
		}

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}


	// 更新
	public int update(int fID, String fName, String fContent) throws SQLException {


		// SQL文を準備する

		String sql = "update Feedback set f_name = ? f_content = ? where f_id = ?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setString(1, fName); //1つ目の?(=NAME)に入力値をいれる
		pStmt.setString(2, fContent);
		pStmt.setInt(3, fID);



		if (conn != null) {
			conn.close();
		}


		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK


	}


	// 削除
	public int delete(int sId) throws SQLException {


		// SQL文を準備する

		String sql = "delete from Feedback where s_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setInt(1, sId); //1つ目の?(=NAME)に入力値をいれる



		if (conn != null) {
			conn.close();
		}


		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK


	}


	// 検索（フィードバックカテゴリーの初期値1day（詳細ページのフィードバックボタンを押したとき））

	public List<SFeedback> fFeedbackSelect(int sId) throws SQLException {

		List<SFeedback> fFeedbackList = new ArrayList<SFeedback>(); //SFeedback型の要素をしまうListを作る

		// SELECT文を準備する		ユーザーが入れてくる情報を?にしておく
		// 絞り込み検索用SQL
		String sql = "select * from Feedback where s_id = ? and f_category = '1day'";
		PreparedStatement pStmt = conn.prepareStatement(sql); // PreparedStatementが無害化して↓

		//?（プレースホルダ―）の部分に値を設定
		pStmt.setInt(1, sId);


		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();


		// 次のデータ、次のデータ・・順に
		while (rs.next()) {
			SFeedback sFeedback = new SFeedback(); // JavaBeansをインスタンス化してデータを入れる箱として利用
			sFeedback.setfId(rs.getInt("f_id"));
			sFeedback.setsId(rs.getInt("s_id"));
			sFeedback.setfCategory(rs.getString("f_category"));
			sFeedback.setfName(rs.getString("f_name"));
			sFeedback.setfContent(rs.getString("f_content"));

			fFeedbackList.add(sFeedback); // ArrayListに入れなおす（みんな知ってるから）
		}

		if (conn != null) {
			conn.close();
		}

		return fFeedbackList;

	}


	// 検索（カテゴリー選択→検索ボタン）

	public List<SFeedback> feedbackSelect(int sId, String fCategory) throws SQLException {

		List<SFeedback> fFeedbackList = new ArrayList<SFeedback>(); //SFeedback型の要素をしまうListを作る

		// SELECT文を準備する		ユーザーが入れてくる情報を?にしておく
		// 絞り込み検索用SQL
		String sql = "select * from Feedback where s_id = ? and f_category = ?";
		PreparedStatement pStmt = conn.prepareStatement(sql); // PreparedStatementが無害化して↓

		//?（プレースホルダ―）の部分に値を設定
		pStmt.setInt(1, sId);
		pStmt.setString(2, fCategory);


		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();


		// 次のデータ、次のデータ・・順に
		while (rs.next()) {
			SFeedback sFeedback = new SFeedback(); // JavaBeansをインスタンス化してデータを入れる箱として利用
			sFeedback.setfId(rs.getInt("f_id"));
			sFeedback.setsId(rs.getInt("s_id"));
			sFeedback.setfCategory(rs.getString("f_category"));
			sFeedback.setfName(rs.getString("f_name"));
			sFeedback.setfContent(rs.getString("f_content"));

			fFeedbackList.add(sFeedback); // ArrayListに入れなおす（みんな知ってるから）
		}

		if (conn != null) {
			conn.close();
		}

		return fFeedbackList;

	}






}
