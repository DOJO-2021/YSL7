package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class TemplateDao {
	Connection conn = null;
	public TemplateDao(Connection conn) {
		this.conn = conn;
	}

	//登録
	public int templeteInsert (String tTitle, String tCategory, String tContent) throws SQLException {

		//SQL文を準備する
		String sql = "insert into Template (t_id, t_title, t_content, t_category)";

	}
}
