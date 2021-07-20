package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.EventDao;
import dao.InternDao;
import dao.SelectionEasyDao;
import dao.SelectionFaceDao;
import dao.SelectionTextDao;
import dao.StudentDao;
import model.SEvent;
import model.SIntern;
import model.SSelectionFace;
import model.SSelectionText;
import model.Student;



public class UploadService {
	public boolean insert(ArrayList<ArrayList<String>> list,ArrayList<SEvent> eventList ,ArrayList<SIntern> internList ,ArrayList<SSelectionText> textList ,ArrayList<SSelectionFace> faceList, String event, String category, String date) {
		boolean result = false;

		Connection conn = null;

		try {
			//ドライバの登録を行う
			Class.forName("org.h2.Driver");

			//データベースへの接続情報を設定する
			conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\db\\db", "sa", "sa");


			StudentDao sdao = new StudentDao(conn);
			EventDao edao = new EventDao(conn);
			InternDao idao = new InternDao(conn);
			SelectionTextDao stdao = new SelectionTextDao(conn);
			SelectionFaceDao sfdao = new SelectionFaceDao(conn);
			SelectionEasyDao sedao = new SelectionEasyDao(conn);

			for(ArrayList<String> i : list) {
				//学生の基本情報を登録

				//重複のチェック
				//select s_id name address from student where name = ? address = ?;
				Student s = sdao.check();
				if (s != null) {//重複していた場合
					if (event.equals("entry")) {//エントリーの場合・・・何もしない

					}else if (event.equals("intern")) {//インターンの場合・・・そのインターンのdateのみupdate

						idao.uploadUpdate(s.getsId(), category, date);

					} else if (event.equals("infosession")) {//会社説明会の場合・・・会社説明会のみ

						idal.uploadUpdate(s.getsId(), "説明会", date);

					} else if (event.equals("infosession2")) {//合同説明会の場合・・・合同説明会のみ

						edao.uploadUpdate(s.getsId(), "合説", date);

					}
				} else {

					sdao.studentInsert(i.get(0),i.get(1),i.get(2),i.get(3),i.get(4),i.get(5),i.get(6),i.get(7),i.get(8),i.get(9),i.get(10),i.get(11),i.get(12));

					for (SEvent e : eventList) {
						edao.eventInsert(e.geteCategory(), e.geteDate());
					}

					for (SIntern si : internList) {
						idao.internInsert(si.getiCategory(), si.getiDate(), si.getiMeeting(), si.getiSubmit(), si.getiAcceptance(), si.getiDocument(), si.getiAttend(), si.getApplyflag());
					}

					for (SSelectionText st : textList) {
						stdao.selectiontextInsert(st.getStCategory(), st.getStName(), st.getStScore());
					}

					for (SSelectionFace sf : faceList) {
						sfdao.selectionfaceInsert(sf.getSfCategory(), sf.getSfName(), sf.getSfScore());
					}

					sedao.selectionEasyInsert("　", 0, 0, "　", "　", "　", "　", "　", "　", "　", "　", "　", "　", "　", "　", "　", "　", "　", "　", "　", "　", "　");
				}
//				//Eventの更新
//				for(String j : eList) {
//					if(eCategory.equals(j)) {
//						edao.eventUpdate(eCategory, eDate);
//					}
//				}
//

//
//				//Internの更新
//				for(String j : iList) {
//					if(iCategory.equals(j)) {
//						idao.internUpdate(iCategory,iDate,iMeeting,iSubmit,iAcceptance,iDocument,iAttend,applyFlag);
//					}
//				}
//

//
//				//SelectionTextの更新
//				for(String j : stList) {
//					if(stCategory.equals(j)) {
//						for(String k : stnList) {
//							if(stName.equals(k)) {
//								stdao.selectiontextUpdate(stCategory,stName,stScore);
//							}
//						}
//					}
//				}
//

//				//SelectionFaceの更新
//				for(int j = 0; j < 2; j++) {
//					if(j == 0) {
//						if(sfCategory.equals(sfList[j])) {
//							for(int k = 0; k < 3; k++) {
//								if(sfName.equals(sfnList[k])) {
//									sfdao.selectionfaceUpdate(sfCategory,sfName,sfScore);
//								}
//							}
//						}
//					} else {
//						if(sfCategory.equals(sfList[j])) {
//							for(int k = 3; k < 5; k++) {
//								if(sfName.equals(sfnList[k])) {
//									sfdao.selectionfaceUpdate(sfCategory,sfName,sfScore);
//								}
//							}
//						}
//					}
//				}
//
//				//SelectionEasyの更新
//				sedao.selectionEasyUpdate(seSelectionDate,seScore,seTextScore,seTextResult,seGetTextDate,seNo,seOk,seNoReason,seSendOk,seEarlyOk,seEarlyNo,seFirstResult,seSecondResult,seFirstNo,seFirstDate,seSecondNo,seSecondDate,seThirdDate,seThirdResult,seRemarks,seSituation,seDecide);
			}
			conn.commit();
			result = true;
		}

//		catch(IOException e){
//			e.printStackTrace();
//		}
//		catch(ServletException e) {
//			e.printStackTrace();
//		}
		catch(SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			if(conn != null) {
				try {
					conn.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}

		//結果を返す
		return result;
	}

}
