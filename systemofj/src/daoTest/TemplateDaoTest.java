package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.TemplateDao;
import model.Template;

public class TemplateDaoTest {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {

/*		//templateInsert--------------------
		try {
			//ドライバの登録
			Class.forName("org.h2.Driver");
			//データベースに接続
			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

			//Daoの実体化
			TemplateDao dao = new TemplateDao(conn);

			//引数を渡してメソッドを使う(成功)
			dao.templateInsert("テスト","テストコンテンツ","その他");

			//引数を渡してメソッドを使う(失敗)
			dao.templateInsert("テスト","テストコンテンツ","２０文字以上２０文字以上２０文字以上２０文字以上");

			System.out.println("成功");
		}
		catch(SQLException e) {
			System.out.println("失敗");
		}
		catch(ClassNotFoundException e) {
			System.out.println("失敗");
		}
		----------------------------------------*/

		//templateUpdate--------------------
/*		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoの実体化
		TemplateDao dao = new TemplateDao(conn);

		//引数を渡してメソッドを使う(成功)
		int ans = dao.templateUpdate(7,"テスト2","コンテンツ2");

		//引数を渡してメソッドを使う(失敗)
		int ans = dao.templateUpdate(100, "テスト2","コンテンツ2");

		if(ans > 0) {
			System.out.println("成功");
		} else {
			System.out.println("失敗");
		}
		----------------------------------------*/

/*		//templateSelect--------------------
		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoの実体化
		TemplateDao dao = new TemplateDao(conn);

		//引数を渡してメソッドを使う(成功)
		Template t = new Template();
		t = dao.templateSelect(1);

		//引数を渡してメソッドを使う(失敗)
		Template t = new Template();
		t = dao.templateSelect(10);

		if(t != null) {
			System.out.println(t.gettTitle());
			System.out.println(t.gettContent());
			System.out.println(t.gettCategory());
		} else {
			System.out.println("失敗");
		}
		------------------------------------------*/

/*		//templateInternTitleSelect--------------------
		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoの実体化
		TemplateDao dao = new TemplateDao(conn);

		//メソッドを使う
		ArrayList<Template> templateInternList = new ArrayList<Template>();
		templateInternList = dao.templateInternTitleSelect();

		if(templateInternList.size() != 0) {
			for(Template i : templateInternList) {
				System.out.println(i.gettTitle());
			}
		} else {
			System.out.println("失敗");
		}
		-----------------------------------------*/

/*		//templateSeminarTitleSelect--------------------
		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoの実体化
		TemplateDao dao = new TemplateDao(conn);

		//メソッドを使う
		ArrayList<Template> templateSeminarList = new ArrayList<Template>();
		templateSeminarList = dao.templateSeminarTitleSelect();

		if(templateSeminarList.size() != 0) {
			for(Template i : templateSeminarList) {
				System.out.println(i.gettTitle());
			}
		} else {
			System.out.println("失敗");
		}
		--------------------------------------------*/

/*		//templateFaceTitleSelect--------------------
		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoの実体化
		TemplateDao dao = new TemplateDao(conn);

		//メソッドを使う
		ArrayList<Template> templateFaceList = new ArrayList<Template>();
		templateFaceList = dao.templateFaceTitleSelect();

		if(templateFaceList.size() != 0) {
			for(Template i : templateFaceList) {
				System.out.println(i.gettTitle());
			}
		} else {
			System.out.println("失敗");
		}
		-------------------------------------------*/

		//templateOtherTitleSelect--------------------
		//ドライバの登録
		Class.forName("org.h2.Driver");
		//データベースに接続
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//Daoの実体化
		TemplateDao dao = new TemplateDao(conn);

		//メソッドを使う
		ArrayList<Template> templateOtherList = new ArrayList<Template>();
		templateOtherList = dao.templateOtherTitleSelect();

		if(templateOtherList.size() != 0) {
			for(Template i : templateOtherList) {
				System.out.println(i.gettTitle());
			}
		} else {
			System.out.println("失敗");
		}

	}
}