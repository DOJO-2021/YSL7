package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.SSelectionFace;


public class SelectionFaceDao {
	Connection conn=null;

	public SelectionFaceDao(Connection conn) {
		this.conn=conn;
	}

	public ArrayList<SSelectionFace> selectionfaceSelect(int sId) throws SQLException {

		ArrayList<SSelectionFace> sfsList = new ArrayList<SSelectionFace>(); //SFeedback型の要素をしまうListを作る

		//リターンするためのUserBeanを実体化
		SSelectionFace bean =null;

		//SQL文を準備する
		String sql = "select * from SelectionFace where s_id=?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//?（プレースホルダ―）の部分に値を設定
		pStmt.setInt(1, sId);

		//SQLを実行し、結果を取得する
		ResultSet rs = pStmt.executeQuery();

		//Beanにもらってきたデータを入れ替える
		if(rs.next()) {
			//ここでbeanを実体化（これがなければbeanはnullのまま)
			bean = new SSelectionFace();

			//beanに値をひとつずつセットする
			bean.setsId(rs.getInt("s_id"));
			bean.setSfCategory(rs.getString("sf_category"));
			bean.setSfName(rs.getString("sf_name"));
			bean.setSfScore(rs.getInt("sf_score"));
			bean.setSfId(rs.getInt("sf_id"));

			sfsList.add(bean);
		}
		if(conn != null) {
			conn.close();
		}
		return sfsList;
	}
	public int selectionfaceInsert(String sfCategory, String sfName, int sfScore) throws SQLException {

		// SQL文を準備する

		String sql =  "insert into SelectionFace (s_id, sf_category, sf_name, sf_score)"
				+ " values ((SELECT s_id FROM Student ORDER BY s_id DESC LIMIT 1), ?, ?, ?)";;
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//beanに値をひとつずつセットする
		pStmt.setString(1,sfCategory);
		pStmt.setString(2,sfName);
		pStmt.setInt(3,sfScore);

		if (conn != null) {
			conn.close();
		}

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate();
	}
	// 更新
	public int selectionfaceUpdate(String sfCategory,String sfName, int sfScore,int sfId) throws SQLException {


		// SQL文を準備する

		String sql = "update SelectionFace set sf_category=? ,sf_name=? ,sf_score=? where sf_id =?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setString(1,sfCategory);
		pStmt.setString(2,sfName);
		pStmt.setInt(3,sfScore);
		pStmt.setInt(4,sfId);



		if (conn != null) {
			conn.close();
		}


		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK
	}
	// 削除
	public int selectionfaceDelete(int sId) throws SQLException {


		// SQL文を準備する

		String sql = "delete from SelectionFace where s_id=?";
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




}
