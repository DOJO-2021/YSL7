package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import dao.EventDao;
import dao.InternDao;
import dao.SelectionEasyDao;
import dao.SelectionFaceDao;
import dao.SelectionTextDao;
import dao.StudentDao;



public class UploadService {
	public boolean studentInsert(String sName,String sKana,String sContexts, String sUnivercity, String sFaculty, String sDepartment, String sAddress,String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String sOther ,
			String eCategory,Date eDate,String iCategory,Date iDate,String iMeeting,String iSubmit,String iAcceptance,String iDocument,String iAttend,Date applyFlag,
			String stCateogry,String stName,int stScore,String sfCategory,String sfName,int sfScore,Date seSelectionDate,int seScore,int seTextScore,String seTextResult,Date GetTextDate,Date seNo,Date seOk,String seNoReason,Date seSendOk,Date seEarlyOk,
			Date seEarlyNo,String seFirstResult,String seSecondResult,Date seFirstNo,Date seFirstDate,Date seSecondNo,Date seSecondDate,Date seThirdDate,String seThirdResult,String seRemarks,String seSituation,String seDecide) throws ClassNotFoundException,SQLException {
		boolean result = false;

		//ドライバの登録を行う
		Class.forName("org.h2.Driver");

		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\db\\db", "sa", "sa");
		//StudentDaoを実体化
		StudentDao sdao = new StudentDao(conn);
		//引数を渡し、取得値をs_resultに渡す
		int s_result =sdao.studentInsert(sName,sKana,sContexts,sUnivercity,sFaculty,sDepartment,sAddress,sPcmail,sMobilemail,sCareertasu,sMynavi,sRikunavi,sOther);

		//EventDaoを実体化
		EventDao edao = new EventDao(conn);
		//引数を渡し、取得値をe_resultに渡す
		int e_result = edao.eventInsert(eCategory,eDate);

		//InternDaoを実体化
		InternDao idao = new InternDao(conn);
		//引数を渡し、取得値をi_resultに渡す
		int i_result = idao.internInsert(iCategory,iDate,iMeeting,iSubmit,iAcceptance,iDocument,iAttend,applyFlag);

		//SelectionTextDaoを実体化
		SelectionTextDao stdao = new SelectionTextDao(conn);
		//引数を渡し、取得値をst_resultに渡す
		int st_result = stdao.selectiontextInsert(stCategory,stName,stScore);

		//SelectionFaceDaoを実体化
		SelectionFaceDao sfdao = new SelectionFaceDao(conn);
		//引数を渡し、取得値をsf_resultに渡す
		int sf_result = sfdao.selectionfaceInsert(sfCategory,sfName,sfScore);

		//SelectionEasyDaoを実体化
		SelectionEasyDao sedao = new SelectionEasyDao(conn);
		//引数を渡し、取得値をse_resultに渡す
		int se_result = sedao.selectioneasyInsert(seSelectionDate,seScore,seTextScore,seTextResult,GetTextDate,seNo,seOk,seNoReason,seSendOk,seEarlyOk,seEarlyNo,seFirstResult,seSecondResult,seFirstNo,seFirstDate,seSecondNo,seSecondDate,seThirdDate,seThirdResult,seRemarks,seSituation,seDecide);

		if(s_result == 1 && e_result == 1 && i_result == 1 && st_result == 1 && sf_result == 1 && se_result == 1) {
			result =true;
		}

		return result;
	}

}
