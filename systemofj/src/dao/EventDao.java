package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.SEvent;


public class EventDao {
	Connection conn = null;

	public EventDao(Connection conn) {
		this.conn = conn;
	}

	public SEvent eventSelect(int sId) throws SQLException {

		//リターンするためのSEventBeanを実体化
		SEvent event = null;

		//SQL文を準備する
		String sql = "select * from event where s_id=?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//?（プレースホルダー）の部分に値を設定
		pStmt.setInt(1, sId);

		//SQLを実行し、結果を取得する
		ResultSet rs = pStmt.executeQuery();

		//スチューデントIDと一致するユーザーがいたかどうかチェックする
		//次のデータ、次のデータ・・・順に
		if (rs.next()) {
			event = new SEvent();
			event.setsId(rs.getInt("s_id"));
		}

		if(conn != null) {
			conn.close();
		}

		return event;

	}

	//登録
	public int eventInsert(int sId, String eCategory, String eDate) throws SQLException {

		//SQL文を準備する
		String sql = "insert into Event (e_id, s_id, e_category, e_date)"
				+ " values (0, ?, ?, ?)";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//SQL文を完成させる
		pStmt.setInt(1, sId);
		pStmt.setString(2, eCategory);
		pStmt.setString(3, eDate);

		if (conn != null) {
			conn.close();
		}

		return pStmt.executeUpdate();

	}

	//更新
	public int eventUpdate(int eId, String eDate) throws SQLException {

		//SQL文を準備する
		String sql = "update Event set e_date=? where e_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//SQL文を完成させる
		pStmt.setInt(1, eId);
		pStmt.setString(2, eDate);

		if(conn != null) {
			conn.close();
		}

		return pStmt.executeUpdate();
	}

	//削除
	public int delete(int sId) throws SQLException {

		//SQL文を準備する
		String sql = "delete from Event where s_id = ?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//SQL文を完成させる
		pStmt.setInt(1, sId);

		if(conn != null) {
			conn.close();
		}

		return pStmt.executeUpdate();
	}

}

