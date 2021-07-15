package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	public int templateUpdate(int tId, String tTitle, String tContent) throws SQLException {

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
	public ArrayList<Template> templateInternTitleSelect() throws SQLException {

		ArrayList<Template> templateInternList = new ArrayList<Template>();

		//SQL文を準備する
		String sql = "select * from template where t_category='インターン'";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//SQLを実行し、結果を取得する
		ResultSet rs = pStmt.executeQuery();

		while (rs.next()) {
			Template templateIntern = new Template();
			templateIntern.settId(rs.getInt("t_id"));
			templateIntern.settTitle(rs.getString("t_title"));
			templateIntern.settContent(rs.getString("t_content"));
			templateIntern.settCategory(rs.getString("t_category"));

			templateInternList.add(templateIntern);

		}

		if(conn != null) {
			conn.close();
		}

		return templateInternList;

	}

	//セミナーSELECT
	public ArrayList<Template> templateSeminarTitleSelect() throws SQLException {

		ArrayList<Template> templateSeminarList = new ArrayList<Template>();

		//SQL文を準備する
		String sql = "select * from template where t_category='説明会'";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//SQLを実行し、結果を取得する
		ResultSet rs = pStmt.executeQuery();

		while (rs.next()) {
			Template templateSeminar = new Template();
			templateSeminar.settId(rs.getInt("t_id"));
			templateSeminar.settTitle(rs.getString("t_title"));
			templateSeminar.settContent(rs.getString("t_content"));
			templateSeminar.settCategory(rs.getString("t_category"));

			templateSeminarList.add(templateSeminar);

		}

		if(conn != null) {
			conn.close();
		}

		return templateSeminarList;

	}

	//面接SELECT
	public ArrayList<Template> templateFaceTitleSelect() throws SQLException {

		ArrayList<Template> templateFaceList = new ArrayList<Template>();

		//SQL文を準備する
		String sql = "select * from template where t_category='説明会'";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//SQLを実行し、結果を取得する
		ResultSet rs = pStmt.executeQuery();

		while (rs.next()) {
			Template templateFace = new Template();
			templateFace.settId(rs.getInt("t_id"));
			templateFace.settTitle(rs.getString("t_title"));
			templateFace.settContent(rs.getString("t_content"));
			templateFace.settCategory(rs.getString("t_category"));

			templateFaceList.add(templateFace);

		}

		if(conn != null) {
			conn.close();
		}

		return templateFaceList;

	}

	//その他SELECT
	public ArrayList<Template> templateOtherTitleSelect() throws SQLException {

		ArrayList<Template> templateOtherList = new ArrayList<Template>();

		//SQL文を準備する
		String sql = "select * from template where t_category='その他'";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//SQLを実行し、結果を取得する
		ResultSet rs = pStmt.executeQuery();

		while (rs.next()) {
			Template templateOther = new Template();
			templateOther.settId(rs.getInt("t_id"));
			templateOther.settTitle(rs.getString("t_title"));
			templateOther.settContent(rs.getString("t_content"));
			templateOther.settCategory(rs.getString("t_category"));

			templateOtherList.add(templateOther);

		}

		if(conn != null) {
			conn.close();
		}

		return templateOtherList;

	}




}
