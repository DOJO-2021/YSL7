package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.EventDao;
import dao.FeedbackDao;
import dao.InternDao;
import dao.SelectionEasyDao;
import dao.SelectionFaceDao;
import dao.SelectionTextDao;
import dao.StudentDao;
import dao.TemplateDao;
import model.SEvent;
import model.SFeedback;
import model.SIntern;
import model.SSelectionEasy;
import model.SSelectionFace;
import model.SSelectionText;
import model.SearchResult;
import model.Student;
import model.Template;

public class SelectService {

//検索一覧結果から詳細
	public Student studentSelect(int sId) throws ClassNotFoundException, SQLException {

		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
//		EventDao Edao = new EventDao(conn);
//		InternDao Idao = new InternDao(conn);
//		SelectionEasyDao SEdao = new SelectionEasyDao(conn);
//		SelectionFaceDao SFdao = new SelectionFaceDao(conn);
//		SelectionTextDao STdao = new SelectionTextDao(conn);
		StudentDao sDao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
//		ALL bean =Edao.student(sId,eCategory,eDate,eID);
//		ALL bean =Idao.student(sId,iCategory,iDate,iMeeting,iSubmit,iAcceptance,iDocument,iId,iAttend,applyflag);
//		ALL bean =SFdao.student(sId,sfCategory,sfName,sfScore,sfId);
//		ALL bean =STdao.student(sId,stCategory,stName,stScore,stId);
		Student bean =sDao.studentSelect(sId);

		//トランザクションを使用する場合はこんなかんじ
		//conn.commit();

		//もし、ArrayListなどがreturnされてきた場合、このような出力値検査が行われる
//		ArrayList<ALL> list = Idao.getAllList<>();
//		if(list.size()==0) {
//			list=null;
//		}
//		ArrayList<ALL> list = SEdao.getAllList<>();
//		if(list.size()==0) {
//			list=null;
//		}
//		ArrayList<ALL> list = SFdao.getAllList<>();
//		if(list.size()==0) {
//			list=null;
//		}
//		ArrayList<ALL> list = STdao.getAllList<>();
//		if(list.size()==0) {
//			list=null;
//		}

		return bean;

	}
	public ArrayList<SEvent> eventSelect(int sId) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

		//DAOを実体化
			EventDao eDao = new EventDao(conn);
		//引数を渡し、取得地をbeanに渡す
			ArrayList<SEvent> bean =eDao.eventSelect(sId);
			//トランザクションを使用する場合はこんなかんじ
			//conn.commit();
			//もし、ArrayListなどがreturnされてきた場合、このような出力値検査が行われる
//			ArrayList<SEvent> list = SEdao.getSEventList<>();
//			if(list.size()==0) {
//				list=null;
//			}

			return bean;
	}
	public ArrayList<SIntern> internDSelect(int sId) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		InternDao iDao = new InternDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<SIntern> bean =iDao.internDSelect(sId);
		//トランザクションを使用する場合はこんなかんじ
		//conn.commit();
		//もし、ArrayListなどがreturnされてきた場合、このような出力値検査が行われる
//		ArrayList<SIntern> list = Idao.getSInternList<>();
//		if(list.size()==0) {
//			list=null;
//		}
		return bean;
	}
	public SSelectionEasy selectionEasySelect(int sId) throws ClassNotFoundException, SQLException {

		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionEasyDao seDao = new SelectionEasyDao(conn);
		//引数を渡し、取得地をbeanに渡す
		SSelectionEasy bean =seDao.selectionEasySelect(sId);
		//トランザクションを使用する場合はこんなかんじ
		//conn.commit();
		return bean;

	}

	public ArrayList<SSelectionFace> selectionfaceSelect(int sId) throws ClassNotFoundException, SQLException {

		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionFaceDao sfDao = new SelectionFaceDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<SSelectionFace> bean =sfDao.selectionfaceSelect(sId);
		//トランザクションを使用する場合はこんなかんじ
		//conn.commit();
		//もし、ArrayListなどがreturnされてきた場合、このような出力値検査が行われる

//		ArrayList<SSelectionFace> list = SFdao.getSSelectionFaceList<>();
//		if(list.size()==0) {
//			list=null;
//		}

		return bean;
	}

	public ArrayList<SSelectionText> selectiontextSelect(int sId) throws ClassNotFoundException, SQLException {

		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		SelectionTextDao stDao = new SelectionTextDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<SSelectionText> bean =stDao.selectiontextSelect(sId);
		//トランザクションを使用する場合はこんなかんじ
		//conn.commit();
		//もし、ArrayListなどがreturnされてきた場合、このような出力値検査が行われる

//		ArrayList<SSelectionText> list = STdao.getSSelectionTextList<>();
//		if(list.size()==0) {
//			list=null;
//		}
		return bean;
	}

//検索→検索一覧結果に飛ぶ

	//インターン検索ボタン
	public ArrayList<SearchResult> searchInternList(String iCategory,String iDate) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao sDao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<SearchResult> bean =sDao.searchInternList(iCategory,iDate);

		return bean;
	}
	//イベント検索ボタン
	public ArrayList<SearchResult> searchEventList(String eCategory,String eDate) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao sDao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<SearchResult> bean =sDao.searchEventList(eCategory,eDate);

		return bean;
	}

	//選考検索ボタン
	public ArrayList<SearchResult> searchEntryList(String seSituation) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao sDao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<SearchResult> bean =sDao.searchEntryList(seSituation);

		return bean;
	}

	//個人名検索ボタン
	public ArrayList<SearchResult> searchName(String sName) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao sDao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<SearchResult> bean = sDao.searchName(sName);

		return bean;
	}

//テンプレートの検索
	public  Template tenplateSelect(int tId) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		TemplateDao tDao = new TemplateDao(conn);
		//引数を渡し、取得地をbeanに渡す
		Template  bean=tDao.templateSelect(tId);

		return bean;
	}

//テンプレートのカテゴリーごと
//インターン
	public  ArrayList<Template> templateInternTitleSelect() throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		TemplateDao tDao = new TemplateDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<Template>  bean=tDao.templateInternTitleSelect();

		return bean;
	}

//セミナー
	public  ArrayList<Template> templateSeminarTitleSelect() throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		TemplateDao tDao = new TemplateDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<Template>  bean=tDao.templateSeminarTitleSelect();

		return bean;
	}

//面談
	public  ArrayList<Template> templateFaceTitleSelect() throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		TemplateDao tDao = new TemplateDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<Template>  bean=tDao.templateFaceTitleSelect();

		return bean;
	}

//その他
	public  ArrayList<Template> templateOtherTitleSelect() throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		TemplateDao tDao = new TemplateDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<Template>  bean=tDao.templateOtherTitleSelect();

		return bean;
	}

//フィードバックの検索
	public ArrayList<SFeedback> feedbackSelect(int sId, String fCategory) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		FeedbackDao tDao = new FeedbackDao(conn);
		//引数を渡し、取得地をbeanに渡す
		ArrayList<SFeedback>  bean= tDao.feedbackSelect(sId,fCategory);

		return bean;
	}

}
