package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.SIntern;

public class InternDao {
	Connection conn = null;

	public InternDao(Connection conn) {
		this.conn = conn;
	}
	public  ArrayList<SIntern> internDSelect(int sId) throws SQLException {

		ArrayList<SIntern> isList = new ArrayList<SIntern>(); //SFeedback型の要素をしまうListを作る

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

			isList.add(bean);
		}
		if(conn != null) {
			conn.close();
		}
		return isList;
	}

	public int internInsert(String iCategory, String iDate,String iMeeting,String iSubmit,String iAcceptance,String iDocument,String iAttend,String applyflag) throws SQLException {

		// SQL文を準備する

		String sql =  "insert into Intern (s_id,i_category, i_date, i_meeting,i_submit,i_acceptance,i_document,i_attend, applyflag)"
				+ " values ((SELECT s_id FROM Student ORDER BY s_id DESC LIMIT 1), ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//beanに値をひとつずつセットする
		pStmt.setString(1,iCategory);
		pStmt.setString(2,iDate);
		pStmt.setString(3,iMeeting);
		pStmt.setString(4,iSubmit);
		pStmt.setString(5,iAcceptance);
		pStmt.setString(6,iDocument);
		pStmt.setString(7,iAttend);
		pStmt.setString(8,applyflag);

		int ans = pStmt.executeUpdate();


		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans;
	}
	public int internUpdate(int iId,String iCategory, String iDate,String iMeeting,String iSubmit,String iAcceptance,String iDocument,String iAttend) throws SQLException {

		// SQL文を準備する

		String sql = "update Intern set i_category=? ,i_date=? ,i_meeting=? ,i_submit=?,i_acceptance=?,i_document=?,i_attend=? where i_id =?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
		//beanに値をひとつずつセットする
		pStmt.setString(1,iCategory);
		pStmt.setString(2,iDate);
		pStmt.setString(3,iMeeting);
		pStmt.setString(4,iSubmit);
		pStmt.setString(5,iAcceptance);
		pStmt.setString(6,iDocument);
		pStmt.setString(7,iAttend);
		pStmt.setInt(8,iId);

		int ans = pStmt.executeUpdate();

		if (conn != null) {
			conn.close();
		}


		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK
	}

	public int internDelete(int sId) throws SQLException {


		// SQL文を準備する

		String sql = "delete from Intern where s_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setInt(1, sId); //1つ目の?(=NAME)に入力値をいれる

		int ans = pStmt.executeUpdate();

		if (conn != null) {
			conn.close();
		}

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}
	//一括編集の内容変更
	public int allUpdate(String sqlContents, String categorys) throws SQLException {

		// SQL文を準備する

		String sql = "update Intern" + sqlContents;
		PreparedStatement pStmt = conn.prepareStatement(sql);

		int ans = pStmt.executeUpdate();

		// SQL文を完成させる
		if (conn != null) {
			conn.close();
		}


		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK
	}

	//重複しているところをアップデート
	public int uploadUpdate(int sId, String iDate, String iCategory) throws SQLException {

		String sql = "update Intern set i_date = ? where s_id = ? and i_category = ?;";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		pStmt.setString(1,iDate);
		pStmt.setInt(2,sId);
		pStmt.setString(3,iCategory);


		int ans = pStmt.executeUpdate();

		return ans;
	}

}
