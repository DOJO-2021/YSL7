package daoTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.StudentDao;
import model.SearchResult;

public class StudentDaoTest {



	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//studentInsert成功
//		try {
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		int newStudent = dao.studentInsert("梶井ももか", "カジイモモカ", "文系", "青山学院大学", "教育人間科学部", "心理学科", "神奈川県横浜市3-4-5", "m_m@pc.com", "m_m@ne.jp", "", "〇", "" ,"");
//
//		if(newStudent != 0) {
//			System.out.println("登録成功");

//		}
//
//		} catch (SQLException e){
//
//			System.out.println("登録失敗");
//
//		}

		//studentInsert成功
//		try {
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		int newStudent = dao.studentInsert(3, "カジイモモカ", "文系", "青山学院大学", "教育人間科学部", "心理学科", "神奈川県横浜市3-4-5", "m_m@pc.com", "m_m@ne.jp", "", "〇", "" ,"");
//
//		if(newStudent != 0) {
//			System.out.println("登録成功");

//		}
//
//		} catch (SQLException e){
//
//			System.out.println("登録失敗");
//
//		}





//		//update成功
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		// ないsId
//		int newStudent = dao.update(1,"城戸沙月", "キドサツキ", "文系", "駒沢大学", "グローバル学部", "グローバル学科", "東京都世田谷区3-5-1", "satsuki_kido@pc.com", "satsuki_kido@ne.jp", "", "〇", "" ,"");
//
//
//		if(newStudent != 0) {
//			System.out.println("更新成功");
//
//		} else {
//
//			System.out.println("登録失敗");
//		}





//		//update失敗
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		// ないsId
//		int newStudent = dao.update(100,"城戸沙月", "キドサツキ", "文系", "駒沢大学", "グローバル学部", "グローバル学科", "神奈川県横浜市3-5-1", "satsuki_kido@pc.com", "satsuki_kido@ne.jp", "", "〇", "" ,"");
//
//
//		if(newStudent != 0) {

//			System.out.println("更新成功");
//
//		} else {
//
//			System.out.println("登録失敗");
//		}



//		//delete成功
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		// ないsId
//		int newStudent = dao.delete(10);
//
//		if(newStudent != 0) {
//
//			System.out.println("削除成功");
//
//		} else {
//
//			System.out.println("削除失敗");
//		}


//		//delete失敗
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		// ないsId
//		int newStudent = dao.delete(100);
//
//		if(newStudent != 0) {
//
//			System.out.println("削除成功");
//
//		} else {
//
//			System.out.println("削除失敗");
//		}



//		//delete失敗
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//		// ないsId
//		int newStudent = dao.delete(100);
//
//		if(newStudent != 0) {
//
//			System.out.println("削除成功");
//
//		} else {
//
//			System.out.println("削除失敗");
//		}


//		//Studentselect成功
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//
//		 Student bean = dao.studentSelect(1);
//
//		 if(bean != null) {
//
//			 System.out.println("成功");
//			 System.out.println(bean.getsId());
//			 System.out.println(bean.getsName());
//			 System.out.println(bean.getsKana());
//			 System.out.println(bean.getsContexts());
//			 System.out.println(bean.getsUnivercity());
//			 System.out.println(bean.getsFaculty());
//			 System.out.println(bean.getsDepartment());
//			 System.out.println(bean.getsAddress());
//			 System.out.println(bean.getsPcMail());
//			 System.out.println(bean.getsMobileMail());
//			 System.out.println(bean.getsCareertasu());
//			 System.out.println(bean.getsMynavi());
//			 System.out.println(bean.getsRikunavi());
//			 System.out.println(bean.getsOther());
//
//		 } else {
//
//			 System.out.println("失敗");
//		 }




//			//Studentselect失敗
//			//ドライバの登録
//			Class.forName("org.h2.Driver");
//
//			//データベースに接続する
//			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//			//Daoを実体化
//			StudentDao dao = new StudentDao(conn);
//
//			//引数を渡し、取得値をbeanに渡す
//
//			 Student bean = dao.studentSelect(500);
//
//			 if(bean != null) {
//
//				 System.out.println("成功");
//				 System.out.println(bean.getsId());
//				 System.out.println(bean.getsName());
//				 System.out.println(bean.getsKana());
//				 System.out.println(bean.getsContexts());
//				 System.out.println(bean.getsUnivercity());
//				 System.out.println(bean.getsFaculty());
//				 System.out.println(bean.getsDepartment());
//				 System.out.println(bean.getsAddress());
//				 System.out.println(bean.getsPcMail());
//				 System.out.println(bean.getsMobileMail());
//				 System.out.println(bean.getsCareertasu());
//				 System.out.println(bean.getsMynavi());
//				 System.out.println(bean.getsRikunavi());
//				 System.out.println(bean.getsOther());
//
//			 } else {
//
//				 System.out.println("失敗");
//			 }







//
//		//searchInternList成功
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//
//		ArrayList<SearchResult> searchInternList = dao.searchInternList("1day", "2020-6-18");
//
//		 if(searchInternList.size() != 0) {
//
//			 System.out.println("成功");
//
//			 for(SearchResult bean : searchInternList) {
//			 System.out.println(bean.getsId());
//			 System.out.println(bean.getsName());
//			 System.out.println(bean.getsUnivercity());
//			 System.out.println(bean.getsFaculty());
//			 System.out.println(bean.getiCategory());
//			 System.out.println(bean.getiDate());
//
//			 }
//
//		 } else {
//
//			 System.out.println("失敗");
//		 }
//


//		//searchInternList失敗
//
//		//ドライバの登録
//		Class.forName("org.h2.Driver");
//
//		//データベースに接続する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//		//Daoを実体化
//		StudentDao dao = new StudentDao(conn);
//
//		//引数を渡し、取得値をbeanに渡す
//
//		ArrayList<SearchResult> searchInternList = dao.searchInternList("1day", "2050-6-18");
//
//		 if(searchInternList.size() != 0) {
//
//			 System.out.println("成功");
//
//			 for(SearchResult bean : searchInternList) {
//			 System.out.println(bean.getsId());
//			 System.out.println(bean.getsName());
//			 System.out.println(bean.getsUnivercity());
//			 System.out.println(bean.getsFaculty());
//			 System.out.println(bean.getiCategory());
//			 System.out.println(bean.getiDate());
//
//			 }
//
//		 } else {
//
//			 System.out.println("失敗");
//		 }
//


//			//searchEventList成功
//
//			//ドライバの登録
//			Class.forName("org.h2.Driver");
//
//			//データベースに接続する
//			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//			//Daoを実体化
//			StudentDao dao = new StudentDao(conn);
//
//			//引数を渡し、取得値をbeanに渡す
//
//			ArrayList<SearchResult> searchEventList = dao.searchEventList("合同説明会", "2020-10-12");
//
//			 if(searchEventList.size() != 0) {
//
//				 System.out.println("成功");
//
//				 for(SearchResult bean : searchEventList) {
//				 System.out.println(bean.getsId());
//				 System.out.println(bean.getsName());
//				 System.out.println(bean.getsUnivercity());
//				 System.out.println(bean.getsFaculty());
//				 System.out.println(bean.getiCategory());
//				 System.out.println(bean.getiDate());
//
//				 }
//
//			 } else {
//
//				 System.out.println("失敗");
//			 }
//


//			//searchEventList失敗
//
//			//ドライバの登録
//			Class.forName("org.h2.Driver");
//
//			//データベースに接続する
//			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//			//Daoを実体化
//			StudentDao dao = new StudentDao(conn);
//
//			//引数を渡し、取得値をbeanに渡す
//
//			ArrayList<SearchResult> searchEventList = dao.searchEventList("合同説明会", "2000-10-12");
//
//			 if(searchEventList.size() != 0) {
//
//				 System.out.println("成功");
//
//				 for(SearchResult bean : searchEventList) {
//				 System.out.println(bean.getsId());
//				 System.out.println(bean.getsName());
//				 System.out.println(bean.getsUnivercity());
//				 System.out.println(bean.getsFaculty());
//				 System.out.println(bean.getiCategory());
//				 System.out.println(bean.getiDate());
//
//				 }
//
//			 } else {
//
//				 System.out.println("失敗");
//			 }



//			//searchEntryList成功
//
//			//ドライバの登録
//			Class.forName("org.h2.Driver");
//
//			//データベースに接続する
//			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//			//Daoを実体化
//			StudentDao dao = new StudentDao(conn);
//
//			//引数を渡し、取得値をbeanに渡す
//
//			ArrayList<SearchResult> searchEntryList = dao.searchEntryList("内々定応諾");
//
//			 if(searchEntryList.size() != 0) {
//
//				 System.out.println("成功");
//
//				 for(SearchResult bean : searchEntryList) {
//				 System.out.println(bean.getsId());
//				 System.out.println(bean.getsName());
//				 System.out.println(bean.getsUnivercity());
//				 System.out.println(bean.getSeSituation());
//
//
//				 }
//
//			 } else {
//
//				 System.out.println("失敗");
//			 }


//			//searchEntryList失敗
//
//			//ドライバの登録
//			Class.forName("org.h2.Driver");
//
//			//データベースに接続する
//			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//			//Daoを実体化
//			StudentDao dao = new StudentDao(conn);
//
//			//引数を渡し、取得値をbeanに渡す
//
//			ArrayList<SearchResult> searchEntryList = dao.searchEntryList("内々定");
//
//			 if(searchEntryList.size() != 0) {
//
//				 System.out.println("成功");
//
//				 for(SearchResult bean : searchEntryList) {
//				 System.out.println(bean.getsId());
//				 System.out.println(bean.getsName());
//				 System.out.println(bean.getsUnivercity());
//				 System.out.println(bean.getSeSituation());
//
//
//				 }
//
//			 } else {
//
//				 System.out.println("失敗");
//			 }


			//searchName成功

			//ドライバの登録
			Class.forName("org.h2.Driver");

			//データベースに接続する
			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

			//Daoを実体化
			StudentDao dao = new StudentDao(conn);

			//引数を渡し、取得値をbeanに渡す

			ArrayList<SearchResult> searchName = dao.searchName("内々定");

			 if(searchName.size() != 0) {

				 System.out.println("成功");

				 for(SearchResult bean : searchName) {
				 System.out.println(bean.getsId());
				 System.out.println(bean.getsName());
				 System.out.println(bean.getsUnivercity());
				 System.out.println(bean.getSeSituation());


				 }

			 } else {

				 System.out.println("失敗");
			 }





	}



}
