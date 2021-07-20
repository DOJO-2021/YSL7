package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.StudentDao;
import model.SearchResult;

public class yagiDao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//select
		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
				"sa", "sa");
		//DAOを実体化
		StudentDao sDao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<SearchResult> bean =sDao.searchInternList("1dayインターン","2020-6-18");

		if (bean.size() != 0) {
		System.out.println("成功");
	}
	//
  else {
	System.out.println("失敗");

}


	}

}
