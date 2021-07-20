package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.SelectionTextDao;
import model.SSelectionText;

public class SelectionTextDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//throws ClassNotFoundException, SQLException




//selectiontextSelectメソッドのテスト--------------------------

		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoを実体化
		SelectionTextDao dao = new SelectionTextDao(conn);

		//引数を渡す - 成功パターン
		//ArrayList<SSelectionText> stSelect = dao.selectiontextSelect(3);

		//失敗パターン（存在しないID）
		ArrayList<SSelectionText> stsList = dao.selectiontextSelect(505);

		if(stsList.size() != 0) {
			System.out.println("成功");
			for(SSelectionText s : stsList) {
				System.out.println(s.getsId());
				System.out.println(s.getStCategory());
				System.out.println(s.getStName());
				System.out.println(s.getStScore());
				System.out.println(s.getStId());
			}
		}else {
			System.out.println("失敗");
		}

//ここまで------------------------------------------------------







	}

}
