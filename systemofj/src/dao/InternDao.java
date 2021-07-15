package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.SIntern;

public class InternDao {
	Connection conn = null;

	public InternDao(Connection conn) {
		this.conn = conn;
	}
	public SIntern internDSelect(int sId) throws SQLException {

		//リターンするためのSSelectionEasyBeanを実体化
		SIntern bean = null;

		//SQL文を準備する
		String sql = "select * from Intern where s_id=?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//?（プレースホルダ―）の部分に値を設定
		pStmt.setInt(1, sId);

		//SQLを実行し、結果を取得する
		ResultSet rs = pStmt.executeQuery();
		//Beanにもらってきたデータを入れ替える
		if(rs.next()) {
			//ここでbeanを実体化（これがなければbeanはnullのまま)
			bean = new SIntern();

			//beanに値をひとつずつセットする
			bean.setsId(rs.getInt("s_id"));
			bean.setiCategory(rs.getString("i_category"));
			bean.setiDate(rs.getString("i_date"));
			bean.setiMeeting(rs.getString("i_meeting"));
			bean.setiSubmit(rs.getString("i_submit"));
			bean.setiAcceptance(rs.getString("i_acceptance"));
			bean.setiDocument(rs.getString("i_document"));
			bean.setiId(rs.getInt("i_id"));
			bean.setiAttend(rs.getString("i_attend"));
		}
		if(conn != null) {
			conn.close();
		}
		return bean;
	}

	public int internInsert(int sId, String iCategory, String iDate,String iMeeting,String iSubmit,String iAcceptance,String iDocument,int iId,String iAttend) throws SQLException {

		// SQL文を準備する

		String sql = "insert into Intern values (?,?,?,?,?,?,?,null,?)";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//beanに値をひとつずつセットする
		pStmt.setInt(1,sId);
		pStmt.setString(2,iCategory);
		pStmt.setString(3,iDate);
		pStmt.setString(4,iMeeting);
		pStmt.setString(5,iSubmit);
		pStmt.setString(6,iAcceptance);
		pStmt.setString(7,iDocument);
		pStmt.setInt(8,iId);
		pStmt.setString(9,iAttend);


		if (conn != null) {
			conn.close();
		}
		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate();
	}
	public int internUpdate(int sId, String iCategory, String iDate,String iMeeting,String iSubmit,String iAcceptance,String iDocument,int iId,String iAttend) throws SQLException {

		// SQL文を準備する

		String sql = "update Intern set s_id=?,i_category=? ,i_date=? ,i_meeting=? ,i_submit=?,i_acceptance=?,i_document=?,i_id=?,i_attend=? where i_id =?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
		//beanに値をひとつずつセットする
		pStmt.setInt(1,sId);
		pStmt.setString(2,iCategory);
		pStmt.setString(3,iDate);
		pStmt.setString(4,iMeeting);
		pStmt.setString(5,iSubmit);
		pStmt.setString(6,iAcceptance);
		pStmt.setString(7,iDocument);
		pStmt.setInt(8,iId);
		pStmt.setString(9,iAttend);


		if (conn != null) {
			conn.close();
		}


		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK
	}

	public int internDelete(int sId) throws SQLException {


		// SQL文を準備する

		String sql = "delete from Intern where s_id=?";
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

	public int allUpdate(int sId, String iCategory, String iDate,String iMeeting,String iSubmit,String iAcceptance,String iDocument,int iId,String iAttend) throws SQLException {

		// SQL文を準備する

		String sql = "update Intern set s_id=?,i_category=? ,i_date=? ,i_meeting=? ,i_submit=?,i_acceptance=?,i_document=?,i_id=?,i_attend=? where alleditflag =1";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
		//beanに値をひとつずつセットする
		pStmt.setInt(1,sId);
		pStmt.setString(2,iCategory);
		pStmt.setString(3,iDate);
		pStmt.setString(4,iMeeting);
		pStmt.setString(5,iSubmit);
		pStmt.setString(6,iAcceptance);
		pStmt.setString(7,iDocument);
		pStmt.setInt(8,iId);
		pStmt.setString(9,iAttend);


		if (conn != null) {
			conn.close();
		}


		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK
	}


}
