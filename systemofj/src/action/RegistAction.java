package action;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.All;
import model.User;
import model.Student;
import model.SSelectionFace;
import model.SSelectionText;
import model.SEvent;
import model.SIntern;
import model.SSelectionEasy;
import service.RegistService;

public class RegistAction {

	//学生登録
	public String StudentRegist(HttpServletRequest request) {
			String page= "";

		//パラメータを取得

		int sId = Integer.parseInt(request.getParameter("s_id"));

			//学生基本情報
//Student.java--------------------------------------------------------
		String sName = request.getParameter("s_name");
		String sKana = request.getParameter("s_kana");
		String sContexts = request.getParameter("s_contexts");
		String sUnivercity = request.getParameter("s_university");
		String sFaculty = request.getParameter("s_faculty");
		String sDepartment = request.getParameter("s_department");
		String sAddress = request.getParameter("s_address");
		String sPcmail = request.getParameter("s_pcmail");
		String sMobilemail = request.getParameter("s_mobilemail");
		String sCareertasu = request.getParameter("s_careertasu");
		String sMynavi = request.getParameter("s_mynavi");
		String sRikunavi = request.getParameter("s_rikunavi");
		String sOther = request.getParameter("s_other");
//---------------------------------------------------------------------


			//イベント情報
//SEvent.java---------------------------------------------------------
		String eDate1 = request.getParameter("e_date1"); //合同説明会参加日
		String eDate2 = request.getParameter("e_date2"); //模擬面接申込日
		String eDate3 = request.getParameter("e_date3"); //模擬面接予約日
		String eDate4 = request.getParameter("e_date4"); //模擬面接参加日
		String eDate5 = request.getParameter("e_date5"); //座談会参加日
		String eDate6 = request.getParameter("e_date6"); //座談会参加日2
//---------------------------------------------------------------------

			//インターン情報
//SIntern.java--------------------------------------------------------
		String iDate1 = request.getParameter("i_date1"); //インターン1day
		String iDate2 = request.getParameter("i_date2"); //インターン3days
		String iDate3 = request.getParameter("i_date3"); //インターン初級
		String iDate4 = request.getParameter("i_date4"); //インターン中級
		String iDate5 = request.getParameter("i_date5"); //インターン準備
		String iMeeting1 = request.getParameter("i_meeting1"); //インターン1day懇談会出欠
		String iMeeting2 = request.getParameter("i_meeting2"); //インターン3days懇談会出欠
		String iMeeting3 = request.getParameter("i_meeting3"); //インターン初級懇談会出欠
		String iMeeting4 = request.getParameter("i_meeting4"); //インターン中級懇談会出欠
		String iMeeting5 = request.getParameter("i_meeting5"); //インターン準備懇談会出欠
		String iSubmit1 = request.getParameter("i_submit1"); //インターン1dayアンケート提出有無
		String iSubmit2 = request.getParameter("i_submit2"); //インターン3daysアンケート提出有無
		String iSubmit3 = request.getParameter("i_submit3"); //インターン初級アンケート提出有無
		String iSubmit4 = request.getParameter("i_submit4"); //インターン中級アンケート提出有無
		String iSubmit5 = request.getParameter("i_submit5"); //インターン準備アンケート提出有無
		String iAcceptance1 = request.getParameter("i_acceptance1"); //インターン1dayアンケート合否
		String iAcceptance2 = request.getParameter("i_acceptance2"); //インターン3daysアンケート合否
		String iAcceptance3 = request.getParameter("i_acceptance3"); //インターン初級アンケート合否
		String iAcceptance4 = request.getParameter("i_acceptance4"); //インターン中級アンケート合否
		String iAcceptance5 = request.getParameter("i_acceptance5"); //インターン準備アンケート合否
		String iDocument1 = request.getParameter("i_document1"); //インターン1day資料送付
		String iDocument2 = request.getParameter("i_document2"); //インターン3days資料送付
		String iDocument3 = request.getParameter("i_document3"); //インターン初級資料送付
		String iDocument4 = request.getParameter("i_document4"); //インターン中級資料送付
		String iDocument5 = request.getParameter("i_document5"); //インターン準備資料送付

		//説明会関連
		String iAttend = request.getParameter("i_attend"); //説明会出欠
		String applyFlag = request.getParameter("applyflag"); //説明会申込日
		String iDate6 = request.getParameter("i_date6"); //説明会参加日
//---------------------------------------------------------------------

			//選考

		//一次面接
//SSelectionFace.java-------------------------------------------------------
		int sfScore1 = Integer.parseInt(request.getParameter("sf_score_one1")); //一次面接点数　藤原さん
		int sfScore2 = Integer.parseInt(request.getParameter("sf_score_one2")); //一次面接点数　板谷さん
		int sfScore3 = Integer.parseInt(request.getParameter("sf_score_one3")); //一次面接点数　菅澤さん

		//二次面接
		int sfScore4 = Integer.parseInt(request.getParameter("sf_score_second1")); //二次面接点数　藤原さん
		int sfScore5 = Integer.parseInt(request.getParameter("sf_score_second2")); //二次面接点数　板谷さん
//---------------------------------------------------------------------------

		//履歴書評価
//SSelectionFace.java---------------------------------------------------------
		int stScore1 = Integer.parseInt(request.getParameter("st_score_resume1")); //履歴書評価　松野さん
		int stScore2 = Integer.parseInt(request.getParameter("st_score_resume2")); //履歴書評価　藤原さん
		int stScore3 = Integer.parseInt(request.getParameter("st_score_resume3")); //履歴書評価　板谷さん
		int stScore4 = Integer.parseInt(request.getParameter("st_score_resume4")); //履歴書評価　菅澤さん

		//自己PR文評価
		int stScore5 = Integer.parseInt(request.getParameter("st_score_pr1"));
		int stScore6 = Integer.parseInt(request.getParameter("st_score_pr2"));
		int stScore7 = Integer.parseInt(request.getParameter("st_score_pr3"));
		int stScore8 = Integer.parseInt(request.getParameter("st_score_pr4"));

		//書類選考評価
		int stScore9 = Integer.parseInt(request.getParameter("st_score_text1")); //書類選考評価　松野さん
		int stScore10 = Integer.parseInt(request.getParameter("st_score_text2")); // 書類選考評価　藤原さん
		int stScore11 = Integer.parseInt(request.getParameter("st_score_text3")); //書類選考評価　板谷さん
		int stScore12 = Integer.parseInt(request.getParameter("st_score_text4")); //書類選考評価　菅澤さん
//------------------------------------------------------------------------------

		//選考進捗
//SSelectionEasy.java-------------------------------------------------------
		String seSelectionDate = request.getParameter("se_selectiondate");
		int seScore = Integer.parseInt(request.getParameter("se_score"));
		int seTextScore = Integer.parseInt(request.getParameter("se_textscore"));
		String seTextresult = request.getParameter("se_textresult");
		String seGetTextDate = request.getParameter("se_gettextdate");
		String seNo = request.getParameter("se_no");
		String seOk = request.getParameter("se_ok");
		String sNoReson = request.getParameter("se_noreason");
		String seSendOk= request.getParameter("se_sendok");
		String seEaryOk = request.getParameter("se_earlyok");
		String seEaryNo = request.getParameter("se_earlyno");
		String seFirstResult = request.getParameter("se_firstresult");
		String seSecondResult = request.getParameter("se_secondresult");
		String seFirstNo = request.getParameter("se_firstno");
		String seFirstDate = request.getParameter("se_firstdate");
		String seSecondNo = request.getParameter("se_secondno");
		String seSecondDate = request.getParameter("se_seconddate");
		String seThirdDate = request.getParameter("se_thirddate");
		String seThirdResult = request.getParameter("se_thirdresult");
		String seRemarks = request.getParameter("se_remarks");
		String seSituation = request.getParameter("se_situation");
		String seDecide = request.getParameter("se_decide");
//----------------------------------------------------------------------------

		Student s = new Student(sId,sName,sKana,sContexts,sUnivercity,sFaculty,sDepartment,sAddress,sPcmail,sMobilemail,sCareertasu,sMynavi,sRikunavi,sOther);
		ArrayList<SEvent> list = new ArrayList<>();
		list.add(eDate1);
		list.add(eDate2);
		list.add(eDate3);
		list.add(eDate4);
		list.add(eDate5);



		//出力値を格納するBean
		All bean = null;


		try {

		}catch() //例外処理{

		}catch() //例外処理{

		}
		return page;
	}

	//テンプレ登録
	public String TemplateRegist(HttpServletRequest request) {
		String tTitle = request.getParameter("tr_title");
		String tCategory = request.getParameter("tr_category");
		String tContent = request.getParameter("tr_content");

		String page="/WEB-INF/jsp/result.jsp";

		boolean result = false;

		try {

			RegistService service = new RegistService();
			result = service.templateInsert(tTitle, tCategory, tContent);

			if(result) {
				request.setAttribute("errMsg", "登録が成功しました！");
			}else {
				request.setAttribute("errMsg", "登録が失敗しました");
			}

		}catch(SQLException e) {//例外処理
			request.setAttribute("errMsg","SQL文おかしい");
		}catch(ClassNotFoundException e) {//例外処理
			request.setAttribute("errMsg", "サーバーおかしい");
		}

	 return page;
	}

	//フィードバック登録
	public String FeedbackRegist(HttpServletRequest request) {

		try {

		}catch() //例外処理{

		}catch() //例外処理{

		}
		return ;

	}
}
