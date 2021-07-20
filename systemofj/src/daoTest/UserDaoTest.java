package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import dao.UserDao;
import model.User;

public class UserDaoTest {

	public UserDaoTest() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");

		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");

		UserDao userdao = new UserDao(conn);
		System.out.println("ログインテスト正----------------------");
		//ログインテスト（正しい値）
		User user =userdao.login("101","0101");
		if(user != null) {
			System.out.println("一応成功");
			if(user.getuName().equals("湯澤")){
				System.out.println("ほんとに成功");
			}else {
				System.out.println("失敗");
			}
		}
		System.out.println();

		//ログインテスト（誤った値）
		System.out.println("ログインテスト誤----------------------");
		conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
		userdao = new UserDao(conn);
		user = userdao.login("123","222");
		if(user==null) {
			System.out.println("成功");
		}else {
			System.out.println("失敗");
		}

		System.out.println();
		//全件検索テスト
		System.out.println("全件検索テスト----------------------");
		conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
		userdao = new UserDao(conn);
		List<User> userList =userdao.userList();
		if(userList.size() != 0) {
			System.out.println("一応成功！！");
			for(User user1: userList) {
				System.out.println(user1.getuId());
				System.out.println(user1.getuName());
				System.out.println(user1.getuFirst());
				System.out.println(user1.getuPw());
				System.out.println(user1.getaFlag());
				System.out.println(user1.getyFlag());
				System.out.println();
			}
		}else {
			System.out.println("失敗");
		}
		//登録テスト
			System.out.println("登録テスト----------------------");
			conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
			userdao = new UserDao(conn);
			try {
				int u= userdao.insert("333", "齊藤", "優海", "999");
					System.out.println("成功");
			}catch(SQLException e){
					System.out.println("失敗");
					e.printStackTrace();
			}

		//更新テスト
		System.out.println("更新テスト----------------------");
		conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
		userdao = new UserDao(conn);
			  int up= userdao.update("9435");
			  if(up>0) {
				  System.out.println("成功");
			  }else {
				  System.out.println("失敗");
			  }

		//削除テスト
		System.out.println("削除テスト----------------------");
		conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
		userdao = new UserDao(conn);
			  int de= userdao.delete("333");
			  if(de > 0) {
				  System.out.println("成功");
			  }else {
				System.out.println("失敗");
			  }
	}

}
