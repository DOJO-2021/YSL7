package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDao {
	Connection conn = null;

	public UserDao(Connection conn) {
		this.conn = conn;
	}

	public User login(String uId, String uPw) throws SQLException {

		//リターンするためのUserBeanを実体化
		User user = null;

		//SQL文を準備する
		String sql = "select * from user where u_id=? and u_pw=?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//?（プレースホルダ―）の部分に値を設定
		pStmt.setString(1, uId);
		pStmt.setString(2, uPw);

		//SQLを実行し、結果を取得する
		ResultSet rs = pStmt.executeQuery();

		// ユーザーIDとパスワードが一致するユーザーがいたかどうかをチェックする
		// 次のデータ、次のデータ・・順に
		if (rs.next()) { // 1件でもあれば実行される
			user = new User();
			user.setuId(rs.getString("u_id"));
			user.setuName(rs.getString("u_name"));
			user.setuFirst(rs.getString("u_first"));
			user.setuPw(rs.getString("u_pw"));
			user.setaFlag(rs.getInt("a_flag"));
			user.setyFlag(rs.getInt("y_flag"));
		}

		if (conn != null) {
			conn.close();
		}

		return user;

	}

	public List<User> userList() throws SQLException {

		List<User> userList = new ArrayList<User>(); //User型の要素をしまうListを作る

		// SELECT文を準備する		ユーザーが入れてくる情報を?にしておく
		// 絞り込み検索用SQL
		String sql = "select * from User where y_flag = 0";
		PreparedStatement pStmt = conn.prepareStatement(sql); // PreparedStatementが無害化して↓

		// SELECT文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		// 次のデータ、次のデータ・・順に
		while (rs.next()) {
			User user = new User(); // JavaBeansをインスタンス化してデータを入れる箱として利用
			user.setuId(rs.getString("u_id"));
			user.setuName(rs.getString("u_name"));
			user.setuFirst(rs.getString("u_first"));
			user.setuPw(rs.getString("u_pw"));
			user.setaFlag(rs.getInt("a_flag"));
			user.setyFlag(rs.getInt("y_flag"));

			userList.add(user); // ArrayListに入れなおす（みんな知ってるから）
		}

		if (conn != null) {
			conn.close();
		}

		return userList;

	}

	// 登録
	public int insert(String uId, String uName, String uFirst, String uPw) throws SQLException {

		// SQL文を準備する

		String sql = "insert into User values (?, ?, ?, ?, 0, 0)";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setString(1, uId); //1つ目の?(=NAME)に入力値をいれる

		pStmt.setString(2, uName);

		pStmt.setString(3, uFirst);

		pStmt.setString(4, uPw);

		int ans = pStmt.executeUpdate();


		if (conn != null) {
			conn.close();
		}

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}

	// 更新
	public int update(String uId) throws SQLException {


		// SQL文を準備する

		String sql = "update User set a_flag = 1 where u_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setString(1, uId); //1つ目の?(=NAME)に入力値をいれる

		int ans = pStmt.executeUpdate();

		if (conn != null) {
			conn.close();
		}


		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK


	}




	// 削除
	public int delete(String uId) throws SQLException {


		// SQL文を準備する

		String sql = "delete from User where u_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setString(1, uId); //1つ目の?(=NAME)に入力値をいれる

		int ans = pStmt.executeUpdate();

		if (conn != null) {
			conn.close();
		}


		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK


	}


}