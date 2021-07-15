package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Template;

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
	public int eventUpdate(int tId, String tTitle, String tContent) throws SQLException {

		//SQL文を準備する
		String sql = "update Template set t_title=?, t_content=? where t_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//SQL文を完成させる
		pStmt.setString(1, tTitle);
		pStmt.setString(2, tContent);
		pStmt.setInt(3, tId);

		if(conn != null) {
			conn.close();
		}

		return pStmt.executeUpdate();

	}

	//SELECT
	public Template templateSelect(int tId) throws SQLException {

		//リターンするためのTemplateBeanを実体化
		Template template = null;

		//SQL文を準備する
		String sql = "select * from template where t_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//SQL文を完成させる
		pStmt.setInt(1, tId);

		//SQLを実行し、結果を取得する
		ResultSet rs = pStmt.executeQuery();

		//テンプレートIDと一致するテンプレートがあるかチェックする
		if (rs.next()) {
			template = new Template();
			template.settId(rs.getInt("t_id"));
		}

		if (conn != null) {
			conn.close();
		}

		return template;

	}

	//インターンSELECT
	public Template


}
