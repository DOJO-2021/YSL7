package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
		String sql = "insert into Student values (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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

		int ans = pStmt.executeUpdate();


		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}

	// 更新
	public int update(int sId, String sName,String sKana,String sContexts, String sUnivercity, String sFaculty, String sDepartment, String sAddress,String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String sOther) throws SQLException {

		// SQL文を準備する

		String sql = "update Student set s_Name=?, s_Kana=?,s_Contexts=?,s_Univercity=?, s_Faculty=?, s_Department=?, s_Address=?, s_Pcmail=?, s_Mobilemail=?, s_Careertasu=?, s_Mynavi=?, s_Rikunavi=?, s_Other=? where s_Id=?";
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

		pStmt.setInt(14, sId);


		int ans = pStmt.executeUpdate();


		if (conn != null) {
			conn.close();
		}



		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}

	//重複していた場合のメソッド
	public int uploadUpdate(int sId, String apply) throws SQLException {



		String sql = "update student set " + apply + " = '〇' where s_id = ?;";

		PreparedStatement pStmt = conn.prepareStatement(sql);
		pStmt.setInt(1, sId);

		int ans = pStmt.executeUpdate();

		return ans;
	}

	//削除
	public int delete(int sId) throws SQLException {


		// SQL文を準備する

		String sql = "delete from Student where s_id=?";
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

	//詳細に表示
	public Student studentSelect(int sId) throws SQLException {

		//リターンするためのUserBeanを実体化
		Student bean =null;

		//SQL文を準備する
		String sql = "select * from Student where s_Id=?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);


		// SQL文を完成させる
		pStmt.setInt(1, sId); //1つ目の?(=NAME)に入力値をいれる


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
			bean.setsPcMail(rs.getString("s_Pcmail"));
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
	public ArrayList<SearchResult> searchInternList(String iCategory, String iDate) throws SQLException {

		ArrayList<SearchResult> searchInternList = new ArrayList<SearchResult>(); //User型の要素をしまうListを作る

		//SQL文を準備する		//i.iCategoryの部分怪しい
		String sql = "select  s.s_id, s.s_name, s.s_univercity, s.s_faculty, i.i_category, i.i_date FROM Student AS s LEFT JOIN Intern AS i ON s.s_id=i.s_id where i.i_category=? AND i.i_date LIKE ?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);


		// SQL文を完成させる
		pStmt.setString(1, iCategory); //1つ目の?(=NAME)に入力値をいれる
		pStmt.setString(2, iDate + "%");


		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		while (rs.next()) { // 1件でもあれば実行される
			SearchResult student = new SearchResult();
			student.setsId(rs.getInt("s_id"));
			student.setsName(rs.getString("s_Name"));
			student.setsUnivercity(rs.getString("s_Univercity"));
			student.setsFaculty(rs.getString("s_Faculty"));
			student.setiCategory(rs.getString("i_Category"));
			student.setiDate(rs.getString("i_Date"));

			searchInternList.add(student);
		}
		if(conn != null) {
			conn.close();
		}
		return searchInternList;
	}

	//一覧のイベント
	public ArrayList<SearchResult> searchEventList(String eCategory, String eDate) throws SQLException {

		ArrayList<SearchResult> searchEventList = new ArrayList<SearchResult>(); //User型の要素をしまうListを作る

		//SQL文を準備する
		String sql = "select s.s_id, s.s_name, s.s_univercity, s.s_faculty, e.e_category, e.e_date FROM Student AS s LEFT JOIN Event AS e ON s.s_id=e.s_id where e.e_category=? AND e.e_date LIKE ?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
		pStmt.setString(1, eCategory); //1つ目の?(=NAME)に入力値をいれる
		pStmt.setString(2, eDate + "%");


		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		while (rs.next()) { // 1件でもあれば実行される
			SearchResult student = new SearchResult();
			student.setsId(rs.getInt("s_id"));;
			student.setsName(rs.getString("s_Name"));
			student.setsUnivercity(rs.getString("s_Univercity"));
			student.setsFaculty(rs.getString("s_Faculty"));
			student.seteCategory(rs.getString("e_Category"));
			student.seteDate(rs.getString("e_Date"));

			searchEventList.add(student);

		}
		if(conn != null) {
			conn.close();
		}
		return searchEventList;
	}

	//一覧の選考進捗
	public ArrayList<SearchResult> searchEntryList(String seSituation) throws SQLException {

		ArrayList<SearchResult> searchEntryList = new ArrayList<SearchResult>(); //User型の要素をしまうListを作る

		//SQL文を準備する
		String sql = "select s.s_id, s.s_name, s.s_univercity, se.se_situation FROM Student AS s LEFT JOIN SelectionEasy AS se ON s.s_id=se.s_id where se.se_situation = ?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
		pStmt.setString(1, seSituation); //1つ目の?(=NAME)に入力値をいれる


		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		while (rs.next()) { // 1件でもあれば実行される
			SearchResult student = new SearchResult();
			student.setsId(rs.getInt("s_id"));
			student.setsName(rs.getString("s_Name"));
			student.setsUnivercity(rs.getString("s_Univercity"));
			student.setSeSituation(rs.getString("se_Situation"));

			searchEntryList.add(student);
		}
		if(conn != null) {
			conn.close();
		}
		return searchEntryList;
	}

	//一覧の個人名で検索
	public ArrayList<SearchResult> searchName(String sName) throws SQLException {

		ArrayList<SearchResult> searchName = new ArrayList<SearchResult>(); //User型の要素をしまうListを作る

		//SQL文を準備する
		String sql = "select s.s_id, s.s_name, s.s_univercity, s.s_faculty, s.s_department, se.se_situation FROM Student AS s LEFT JOIN SelectionEasy AS se ON s.s_id=se.s_id where s.s_name like ?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
		pStmt.setString(1, "%"+sName+"%"); //1つ目の?(=NAME)に入力値をいれる

		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		if (rs.next()) { // 1件でもあれば実行される
			SearchResult student = new SearchResult();
			student.setsId(rs.getInt("s_id"));
			student.setsName(rs.getString("s_name"));
			student.setsUnivercity(rs.getString("s_Univercity"));
			student.setsFaculty(rs.getString("s_Faculty"));
			student.setsDepartment(rs.getString("s_Department"));
			student.setSeSituation(rs.getString("se_Situation"));

			searchName.add(student);

		}
		if(conn != null) {
			conn.close();
		}
		return searchName;
	}

	// フラグ更新 一括編集フラグを0から1に更新
	public int flagUpdate(int sId) throws SQLException {

		// SQL文を準備する

		String sql = "update Intern set alleditflag=1 where s_Id=?";
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

	// フラグ削除 一括編集フラグを1から0に更新
	public int flagDelete() throws SQLException {

		// SQL文を準備する

		String sql = "update Intern set (alleditflag) values(0) where alleditflag=1";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		if (conn != null) {
			conn.close();
		}

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}


	//重複チェックのためのメソッド
	public Student check(String name, String address) throws SQLException {

		//リターンするためのUserBeanを実体化
		Student bean =null;

		String sql = "select * from Student where s_name like ? and s_address like ?;";

		PreparedStatement pStmt = conn.prepareStatement(sql);

		pStmt.setString(1, "%" + name + "%");
		pStmt.setString(2, "%" + address + "%");

		ResultSet rs = pStmt.executeQuery();

		if (rs.next()) {
			bean = new Student();

			bean.setsId(rs.getInt("s_Id"));
		}

		return bean;
	}


}
