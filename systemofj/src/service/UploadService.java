package service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;

import dao.EventDao;
import dao.InternDao;
import dao.SelectionEasyDao;
import dao.SelectionFaceDao;
import dao.SelectionTextDao;
import dao.StudentDao;



public class UploadService {
	public boolean insert(ArrayList<ArrayList<String>> list) throws ClassNotFoundException,SQLException {
		boolean result = false;

		//ドライバの登録を行う
		Class.forName("org.h2.Driver");

		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\db\\db", "sa", "sa");

		try {
			for(ArrayList<String> i : list) {
				//学生の基本情報を登録
				StudentDao sdao = new StudentDao(conn);
				sdao.studentInsert(i.get(0),i.get(1),i.get(2),i.get(3),i.get(4),i.get(5),i.get(6),i.get(7),i.get(8),i.get(9),i.get(10),i.get(11),i.get(12));

				ArrayList<String> eList = new ArrayList<String>();
				eList.add("合説");
				eList.add("模擬面接申し込み");
				eList.add("模擬面接予約");
				eList.add("模擬面接参加");
				eList.add("座談会1");
				eList.add("座談会2");

				//Eventの空枠作成
				EventDao edao = new EventDao(conn);
				for(String j : eList) {
					edao.eventInsert(j,"　");
				}

				//Eventの更新
				for(String j : eList) {
					if(eCategory.equals(j)) {
						edao.eventUpdate(eCategory, eDate);
					}
				}

				ArrayList<String> iList = new ArrayList<String>();
				iList.add("1day");
				iList.add("3days");
				iList.add("初級");
				iList.add("中級");
				iList.add("準備");
				iList.add("説明会");

				//Internの空枠作成
				InternDao idao = new InternDao(conn);
				for(String j : iList) {
					idao.internInsert(j,"　","　","　","　","　","　","　");
				}

				//Internの更新
				for(String j : iList) {
					if(iCategory.equals(j)) {
						idao.internUpdate(iCategory,iDate,iMeeting,iSubmit,iAcceptance,iDocument,iAttend,applyFlag);
					}
				}

				ArrayList<String> stList = new ArrayList<String>();
				stList.add("自己PR文");
				stList.add("履歴書");
				stList.add("書類選考");

				ArrayList<String> stnList = new ArrayList<String>();
				stnList.add("松野");
				stnList.add("藤原");
				stnList.add("板谷");
				stnList.add("菅澤");

				//SelectionTextの空枠作成
				SelectionTextDao stdao = new SelectionTextDao(conn);
				for(String j : stList) {
					for(String k : stnList) {
						stdao.selectiontextInsert(j,k,0);
					}
				}

				//SelectionTextの更新
				for(String j : stList) {
					if(stCategory.equals(j)) {
						for(String k : stnList) {
							if(stName.equals(k)) {
								stdao.selectiontextUpdate(stCategory,stName,stScore);
							}
						}
					}
				}

				String[] sfList = new String[2];
				sfList[0] = "一次";
				sfList[1] = "二次";

				String[] sfnList = new String[5];
				sfnList[0] = "松野";
				sfnList[1] = "板谷";
				sfnList[2] = "菅澤";
				sfnList[3] = "湯澤";
				sfnList[4] = "藤原";

				//SelectionFaceの空枠作成
				SelectionFaceDao sfdao = new SelectionFaceDao(conn);
				for(int j = 0; j < 2; j++) {
					if(j == 0) {
						for(int k = 0; k < 3; k++) {
							sfdao.selectionfaceInsert(sfList[j],sfnList[k],0);
						}
					} else {
						for(int k = 3; k < 5; k++) {
							sfdao.selectionfaceInsert(sfList[j],sfnList[k],0);
						}
					}
				}

				//SelectionFaceの更新
				for(int j = 0; j < 2; j++) {
					if(j == 0) {
						if(sfCategory.equals(sfList[j])) {
							for(int k = 0; k < 3; k++) {
								if(sfName.equals(sfnList[k])) {
									sfdao.selectionfaceUpdate(sfCategory,sfName,sfScore);
								}
							}
						}
					} else {
						if(sfCategory.equals(sfList[j])) {
							for(int k = 3; k < 5; k++) {
								if(sfName.equals(sfnList[k])) {
									sfdao.selectionfaceUpdate(sfCategory,sfName,sfScore);
								}
							}
						}
					}
				}

				//SelectionEasyの空枠作成
				SelectionEasyDao sedao = new SelectionEasyDao(conn);
				sedao.selectionEasyInsert("　",0,0,"　","　","　","　","　","　","　","　","　","　","　","　","　","　","　","　","　","　","　");

				//SelectionEasyの更新
				sedao.selectionEasyUpdate(seSelectionDate,seScore,seTextScore,seTextResult,seGetTextDate,seNo,seOk,seNoReason,seSendOk,seEarlyOk,seEarlyNo,seFirstResult,seSecondResult,seFirstNo,seFirstDate,seSecondNo,seSecondDate,seThirdDate,seThirdResult,seRemarks,seSituation,seDecide);
			}
			conn.commit();
		}

		catch(IOException e){
			e.printStackTrace();
		}
		catch(ServletException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			conn.rollback();
		}

		return result;
	}

	public boolean insert(String eCategory,String eDate) throws ClassNotFoundException,SQLException {
		boolean result2 = false;

		//ドライバの登録を行う
		Class.forName("org.h2.Driver");

		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\db\\db", "sa", "sa");

		try {
			EventDao edao = new EventDao(conn);
			edao.eventInsert(eCategory,eDate);

			InternDao idao = new InternDao(conn);
			idao.internInsert(iCategory,iDate,"","","","","",applyFlag);

			SelectionTextDao stdao = new SelectionTextDao(conn);
			stdao.selectiontextInsert("","",0);

			SelectionFaceDao sfdao = new SelectionFaceDao(conn);
			sfdao.selectionfaceInsert("","",0);

			SelectionEasyDao sedao = new SelectionEasyDao(conn);
			sedao.selectionEasyInsert("",0,0,"","","","","","","","","","","","","","","","","","","");

			conn.commit();
		}

		catch(IOException e){
			e.printStackTrace();
		}
		catch(ServletException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			conn.rollback();
		}

		return result2;
	}

}
