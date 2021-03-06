package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.UserDao;
import model.User;

public class LoginService {
	public User login(String uId, String uPw) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");

		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/YSL7/data/systemofj", "sa", "sa");

		//DAOを実体化
		UserDao dao = new UserDao(conn);
		//引数を渡し、取得地をbeanに渡す
		User user  = dao.login(uId, uPw);



		return user;



	}
}
