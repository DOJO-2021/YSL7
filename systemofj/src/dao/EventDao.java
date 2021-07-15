package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.SEvent;


public class EventDao {
	Connection conn = null;

	public EventDao(Connection conn) {
		this.conn = conn;
	}

	public ArrayList<SEvent> eventSelect(int sId) throws SQLException {

		ArrayList<SEvent>sEventList = new ArrayList<SEvent>();


		//SQL文を準備する
		String sql = "select * from event where s_id=? order by e_date desc";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//?（プレースホルダー）の部分に値を設定
		pStmt.setInt(1, sId);

		//SQLを実行し、結果を取得する
		ResultSet rs = pStmt.executeQuery();

		//スチューデントIDと一致するユーザーがいたかどうかチェックする
		//次のデータ、次のデータ・・・順に
		while (rs.next()) {
			SEvent sEvent = new SEvent();
			sEvent.seteId(rs.getInt("e_id"));
			sEvent.seteCategory(rs.getString("e_category"));
			sEvent.seteDate(rs.getString("e_date"));
			sEvent.setsId(rs.getInt("s_id"));

			sEventList.add(sEvent);
		}

		if(conn != null) {
			conn.close();
		}

		return sEventList;

	}

	//登録
	public int eventInsert(int sId, String eCategory, String eDate) throws SQLException {

		//SQL文を準備する
		String sql = "insert into Event (s_id, e_category, e_date)"
				+ " values (?, ?, ?)";
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
	public int eventDelete(int sId) throws SQLException {

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

