package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.StudentDao;
import model.Student;

public class SelectService {
	public Student studentSelect(int sId) throws ClassNotFoundException, SQLException {

		//ドライバの登録を行う
		Class.forName("com.mysql.jdbc.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj ","sa","sa");
		//DAOを実体化
//		EventDao Edao = new EventDao(conn);
//		InternDao Idao = new InternDao(conn);
//		SelectionEasyDao SEdao = new SelectionEasyDao(conn);
//		SelectionFaceDao SFdao = new SelectionFaceDao(conn);
//		SelectionTextDao STdao = new SelectionTextDao(conn);
		StudentDao Sdao = new StudentDao(conn);
		//引数を渡し、取得地をbeanに渡す
//		ALL bean =Edao.student(sId,eCategory,eDate,eID);
//		ALL bean =Idao.student(sId,iCategory,iDate,iMeeting,iSubmit,iAcceptance,iDocument,iId,iAttend,applyflag);
//		ALL bean =SEdao.student(sId,seSelectionDate,seScore,seTextScore,seTextResult,seGetTextDate,seNo,seOk,seNoReason,seSendOk,seEarlyOk,seEarlyNo,seFirstResult,seSecondResult,seFirstNo,seSecondNo,seSecondDate,seThirdDate,seThirdResult,seRemarks,seId,seConfirm,seSituation);
//		ALL bean =SFdao.student(sId,sfCategory,sfName,sfScore,sfId);
//		ALL bean =STdao.student(sId,stCategory,stName,stScore,stId);
		Student bean =Sdao.studentSelect(sId,sName,sKana,sContexts,sUnivercity,sFaculty,sDepartment,sAddress,sPcmail,sMobileMail,sCareertasu,sMynavi,sRikunavi,sOther,allEditFlag);

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


}
