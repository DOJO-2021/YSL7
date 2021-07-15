package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TemplateDao {
	Connection conn = null;
	public TemplateDao(Connection conn) {
		this.conn = conn;
	}

	//登録
	public int templeteInsert (String tTitle, String tCategory, String tContent) throws SQLException {

		//SQL文を準備する
		String sql = "insert into Template values (?, ?, ?)";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//SQL文を完成させる
		pStmt.setString(1, tTitle);
		pStmt.setString(2, tCategory);
		pStmt.setString(3, tContent);

		if (conn != null) {
			conn.close();
		}

		return pStmt.executeUpdate();

	}

	//更新
	public int eventUpdate(int tId) throws SQLException {

		//SQL文を準備する
		String sql = "update Template set t_title=?, t_content=? where t_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//SQL文を完成させる
		pStmt.setString(1, tTitle);
		pStmt.setString(2, tContent);
		pStmt.setInt(3, tId);

	}
}
