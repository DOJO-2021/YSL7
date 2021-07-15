package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Student;

public class StudentDao {
	Connection conn = null;

	public StudentDao(Connection conn) {
		this.conn = conn;
	}

	// 登録
	public int studentInsert(String sName,String sKana,String sContexts, String sUnivercity, String sFaculty, String sDepartment, String sAddress,String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String sOther)  throws SQLException {

		// SQL文を準備する
		String sql = "insert into Student values (0, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
		pStmt.setString(1, sName); //1つ目の?(=NAME)に入力値をいれる

		pStmt.setString(2, sKana);

		pStmt.setString(3, sContexts);

		pStmt.setString(4, sUnivercity);

		pStmt.setString(5, sFaculty);

		pStmt.setString(6, sDepartment);

		pStmt.setString(7, sAddress);

		pStmt.setString(8, sPcmail);

		pStmt.setString(9, sMobilemail);

		pStmt.setString(10, sCareertasu);

		pStmt.setString(11, sMynavi);

		pStmt.setString(12, sRikunavi);

		pStmt.setString(13, sOther);

		if (conn != null) {
			conn.close();
		}

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}

	// 更新
	public int update(int sId, String sName,String sKana,String sContexts, String sUnivercity, String sFaculty, String sDepartment, String sAddress,String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String sOther) throws SQLException {

		// SQL文を準備する

		String sql = "update Student set s_Name=?, s_Kana=?,s_Contexts=?,s_Univercity=?, s_Faculty=?, s_Department=?, s_Address=?, s_Pcmail=?, s_Mobilemail=?, s_Careertasu=?, s_Mynavi=?, s_Rikunavi=?, String s_Other where s_Id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setString(1, sName); //1つ目の?(=NAME)に入力値をいれる

		pStmt.setString(2, sKana);

		pStmt.setString(3, sContexts);

		pStmt.setString(4, sUnivercity);

		pStmt.setString(5, sFaculty);

		pStmt.setString(6, sDepartment);

		pStmt.setString(7, sAddress);

		pStmt.setString(8, sPcmail);

		pStmt.setString(9, sMobilemail);

		pStmt.setString(10, sCareertasu);

		pStmt.setString(11, sMynavi);

		pStmt.setString(12, sRikunavi);

		pStmt.setString(13, sOther);

		if (conn != null) {
			conn.close();
		}

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}

	//削除
	public int delete(int sId) throws SQLException {


		// SQL文を準備する

		String sql = "delete from Student where s_id=?";
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

	public Student studentSelect(int sId) throws SQLException {

		//リターンするためのUserBeanを実体化
		Student bean =null;

		//SQL文を準備する
		String sql = "select * from Student where sId=?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		//Beanにもらってきたデータを入れ替える
		if(rs.next()) {
			//ここでbeanを実体化（これがなければbeanはnullのまま)
			bean = new Student();

			//beanに値をひとつずつセットする
			bean.setsId(rs.getInt("sId"));
			bean.setsName(rs.getString("sName"));
			bean.setsKana(rs.getString("sKana"));
			bean.setsContexts(rs.getString("sContexts"));
			bean.setsFaculty(rs.getString("sFaculty"));
			bean.setsDepartment(rs.getString("sDepartment"));
			bean.setsAddress(rs.getString("sAddress"));
			bean.setsPcMail(rs.getString("sPcMail"));
			bean.setsMobileMail(rs.getString("sMobileMail"));
			bean.setsCareertasu(rs.getString("sCareertasu"));
			bean.setsMynavi(rs.getString("sMynavi"));
			bean.setsRikunavi(rs.getString("sRikunavi"));
			bean.setsOther(rs.getString("sOther"));

		}
		if(conn != null) {
			conn.close();
		}
		return bean;
	}
}
