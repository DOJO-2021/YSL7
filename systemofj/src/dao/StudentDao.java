package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.SearchResult;
import model.Student;

public class StudentDao {
	Connection conn = null;

	public StudentDao(Connection conn) {
		this.conn = conn;
	}

	// 登録
	public int studentInsert(String sName,String sKana,String sContexts, String sUnivercity, String sFaculty, String sDepartment, String sAddress,String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String sOther)  throws SQLException {

		// SQL文を準備する
		String sql = "insert into Student values (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)";
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

	//詳細に表示
	public Student studentSelect(int sId) throws SQLException {

		//リターンするためのUserBeanを実体化
		Student bean =null;

		//SQL文を準備する
		String sql = "select * from Student where s_Id=?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		//Beanにもらってきたデータを入れ替える
		if(rs.next()) {
			//ここでbeanを実体化（これがなければbeanはnullのまま)
			bean = new Student();

			//beanに値をひとつずつセットする
			bean.setsId(rs.getInt("s_Id"));
			bean.setsName(rs.getString("s_Name"));
			bean.setsKana(rs.getString("s_Kana"));
			bean.setsContexts(rs.getString("s_Contexts"));
			bean.setsUnivercity(rs.getString("s_Univercity"));
			bean.setsFaculty(rs.getString("s_Faculty"));
			bean.setsDepartment(rs.getString("s_Department"));
			bean.setsAddress(rs.getString("s_Address"));
			bean.setsPcMail(rs.getString("s_PcMail"));
			bean.setsMobileMail(rs.getString("s_MobileMail"));
			bean.setsCareertasu(rs.getString("s_Careertasu"));
			bean.setsMynavi(rs.getString("s_Mynavi"));
			bean.setsRikunavi(rs.getString("s_Rikunavi"));
			bean.setsOther(rs.getString("s_Other"));

		}
		if(conn != null) {
			conn.close();
		}
		return bean;
	}

	//一覧のインターン
	public List<SearchResult> searchInternList(int iCategory, String iDate) throws SQLException {

		List<SearchResult> searchInternList = new ArrayList<SearchResult>(); //User型の要素をしまうListを作る

		//SQL文を準備する
		String sql = "select s.sName=?, s.sUnivercity=?, s.sFaculty=?, i.iCategory=?, i.iDate=? FROM Student AS s LEFT JOIN Intern AS i ON s.sId=i.sId where s.sId=?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		if (rs.next()) { // 1件でもあれば実行される
			SearchResult student = new SearchResult();
			student.setsName(rs.getString("s_Name"));
			student.setsUnivercity(rs.getString("s_Univercity"));
			student.setsFaculty(rs.getString("s_Faculty"));
			student.setiCategory(rs.getString("i_Category"));
			student.setiDate(rs.getString("i_Date"));

		}
		if(conn != null) {
			conn.close();
		}
		return searchInternList;
	}

	//一覧のイベント
	public List<SearchResult> searchEventList(int eCategory, String eDate) throws SQLException {

		List<SearchResult> searchEventList = new ArrayList<SearchResult>(); //User型の要素をしまうListを作る

		//SQL文を準備する
		String sql = "select s.sName=?, s.sUnivercity=?, s.sFaculty=?, e.eCategory=?, e.eDate=? FROM Student AS s LEFT JOIN Event AS e ON s.sId=e.sId where s.sId=?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		if (rs.next()) { // 1件でもあれば実行される
			SearchResult student = new SearchResult();
			student.setsName(rs.getString("s_Name"));
			student.setsUnivercity(rs.getString("s_Univercity"));
			student.setsFaculty(rs.getString("s_Faculty"));
			student.setiCategory(rs.getString("i_Category"));
			student.setiDate(rs.getString("i_Date"));

		}
		if(conn != null) {
			conn.close();
		}
		return searchEventList;
	}

	//一覧の選考進捗
	public List<SearchResult> searchEntryList(String seSituation) throws SQLException {

		List<SearchResult> searchEntryList = new ArrayList<SearchResult>(); //User型の要素をしまうListを作る

		//SQL文を準備する
		String sql = "select s.sName=?, s.sUnivercity=?, se.seSituation=? FROM Student AS s LEFT JOIN SelectionEasy AS se ON s.sId=se.sId where s.sId=?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		if (rs.next()) { // 1件でもあれば実行される
			SearchResult student = new SearchResult();
			student.setsName(rs.getString("s_Name"));
			student.setsUnivercity(rs.getString("s_Univercity"));
			student.setSeSituation(rs.getString("se_Situation"));

		}
		if(conn != null) {
			conn.close();
		}
		return searchEntryList;
	}

	// フラグ更新
	public int flagUpdate(int sId) throws SQLException {

		// SQL文を準備する

		String sql = "update Student set (alleditflag) values(1) where s_Id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setInt(1, ); //1つ目の?(=NAME)に入力値をいれる


		if (conn != null) {
			conn.close();
		}

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}

}
