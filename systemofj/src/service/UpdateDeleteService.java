package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.EventDao;
import dao.FeedbackDao;
import dao.InternDao;
import dao.SelectionEasyDao;
import dao.SelectionFaceDao;
import dao.SelectionTextDao;
import dao.StudentDao;
import dao.TemplateDao;
//import dao.UserDao;


public class UpdateDeleteService {
	Connection conn = null;

//	public boolean userUpdate(String uId) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		try {
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		UserDao dao = new UserDao(conn);
//
//		conn.setAutoCommit(false);
//
//		//引数を渡し、取得地をbeanに渡す
//		int test =dao.update(uId);
//
//		if(test == 1) {
//			conn.commit();
//			result = true;
//		}
//		else {
//			conn.rollback();
//		}
//
//		return result;
//
//
//		}catch(ClassNotFoundException e) {
//
//			return result;
//
//		}catch(SQLException e) {
//			e.printStackTrace();
//			try {
//				conn.rollback();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//
//			}
//			return result;
//
//		}finally {
//		 if(conn != null) {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//
//				e.printStackTrace();
//			}
//		}
//	}
//	}
//
//	public boolean userDelete(String uId) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		UserDao dao = new UserDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test =dao.delete(uId);
//
//		if(test == 1) {
//			result = true;
//		}
//
//		return result;
//
//	}

	public boolean studentUpdate(int sId,String sName,String sKana,String sContexts,String sUnivercity, String sFaculty,String sDepatment, String sAddress, String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String Other,
			String seSelectionDate, int seScore, int seTextScore, String seTextResult,
			String seGetTextDate,String seNo, String seOk, String seNoreason, String seSendOk,
			String seEarlyOk,String seEarlyNo, String seFirstResult, String seSecondResult,
			String seFirstNo,String seFirstDate, String seSecondNo, String seSecondDate,
			String seThirdDate, String seThirdResult, String seRemarks, String seSituation, String seDecide,
			String sfCategory1, String sfCategory2, String sfName1, String sfName2, String sfName3, int sfScore1_1, int sfScore1_2, int sfScore1_3, int sfScore2_1, int sfScore2_2, int sfId1, int sfId2, int sfId3, int sfId4, int sfId5,
			String stCategory1, String stCategory2, String stCategory3,
			String stName1, String stName2, String stName3, String stName4, int stScore1, int stScore2, int stScore3, int stScore4, int stScore5, int stScore6, int stScore7, int stScore8, int stScore9,int stScore10, int stScore11, int stScore12, int stId1, int stId2, int stId3, int stId4, int stId5, int stId6, int stId7, int stId8, int stId9, int stId10, int stId11,int stId12,
			String iCategory1, String iCategory2, String iCategory3, String iCategory4, String iCategory5, String iCategory6, String iDate1, String iDate2, String iDate3, String iDate4, String iDate5, String iDate6, String iMeeting1, String iMeeting2,
			String iMeeting3, String iMeeting4, String iMeeting5, String iSubmit1, String iSubmit2, String iSubmit3, String iSubmit4, String iSubmit5,
			String iAcceptace1, String iAcceptace2, String iAcceptace3, String iAcceptace4, String iAcceptace5,
			String iDocument1, String iDocument2, String iDocument3, String iDocument4, String iDocument5,  String iAttend, String applyFlag, int iId1, int iId2, int iId3, int iId4, int iId5, int iId6,
			int eId1, int eId2, int eId3, int eId4, int eId5, int eId6, String eDate1, String eDate2, String eDate3, String eDate4, String eDate5, String eDate6
			) throws ClassNotFoundException, SQLException {

			//resultを設定
			boolean result1 = false;
			boolean result2 = false;
			boolean result3 = false;
			boolean result4 = false;
			boolean result5 = false;
			boolean result6 = false;
			boolean result7 = false;
			boolean result8 = false;
			boolean result9 = false;
			boolean result10 = false;
			boolean result11 = false;
			boolean result12 = false;
			boolean result13 = false;
			boolean result14 = false;
			boolean result15 = false;
			boolean result16 = false;
			boolean result17 = false;
			boolean result18 = false;
			boolean result19 = false;
			boolean result20 = false;
			boolean result21 = false;
			boolean result22 = false;
			boolean result23 = false;
			boolean result24 = false;
			boolean result25 = false;
			boolean result26 = false;
			boolean result27 = false;
			boolean result28 = false;
			boolean result29 = false;
			boolean result30 = false;
			boolean result31 = false;

			boolean allresult = false;

			System.out.println(sfId1+"aaaaa");

		try {
			//ドライバの登録を行う
			Class.forName("org.h2.Driver");

			//データベースへの接続情報を設定する
			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");

//			Connection conn2 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//			Connection conn3 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn4 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn5 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn6 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn7 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//			Connection conn8 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn9 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn10 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn11 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn12 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn13 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn14 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn15 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn16 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn17 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn18 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn19 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//			Connection conn20 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn21 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn22 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn23 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn24 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//
//			Connection conn25 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn26 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn27 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn28 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn29 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//			Connection conn30 = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");


			//DAOを実体化
			StudentDao dao1 = new StudentDao(conn);

			SelectionEasyDao dao2 = new SelectionEasyDao(conn);

			SelectionFaceDao dao3 = new SelectionFaceDao(conn);
			SelectionFaceDao dao4 = new SelectionFaceDao(conn);
			SelectionFaceDao dao5 = new SelectionFaceDao(conn);
			SelectionFaceDao dao6 = new SelectionFaceDao(conn);
			SelectionFaceDao dao7 = new SelectionFaceDao(conn);

			SelectionTextDao dao8 = new SelectionTextDao(conn);
			SelectionTextDao dao9 = new SelectionTextDao(conn);
			SelectionTextDao dao10 = new SelectionTextDao(conn);
			SelectionTextDao dao11 = new SelectionTextDao(conn);
			SelectionTextDao dao12 = new SelectionTextDao(conn);
			SelectionTextDao dao13 = new SelectionTextDao(conn);
			SelectionTextDao dao14 = new SelectionTextDao(conn);
			SelectionTextDao dao15 = new SelectionTextDao(conn);
			SelectionTextDao dao16 = new SelectionTextDao(conn);
			SelectionTextDao dao17 = new SelectionTextDao(conn);
			SelectionTextDao dao18 = new SelectionTextDao(conn);
			SelectionTextDao dao19 = new SelectionTextDao(conn);

			InternDao dao20 = new InternDao(conn);
			InternDao dao21 = new InternDao(conn);
			InternDao dao22 = new InternDao(conn);
			InternDao dao23 = new InternDao(conn);
			InternDao dao24 = new InternDao(conn);

			EventDao dao25 = new EventDao(conn);
			EventDao dao26 = new EventDao(conn);
			EventDao dao27 = new EventDao(conn);
			EventDao dao28 = new EventDao(conn);
			EventDao dao29 = new EventDao(conn);
			EventDao dao30 = new EventDao(conn);
			InternDao dao31 = new InternDao(conn);

			conn.setAutoCommit(false);



			//引数を渡し、取得地をbeanに渡す
			int test1 =dao1.update(sId,sName,sKana,sContexts,sUnivercity,sFaculty,sDepatment,sAddress,sPcmail,sMobilemail,sCareertasu,sMynavi,sRikunavi,Other);
			if(test1 != 0) {
			result1 = true;
			}
			int test2 =dao2.selectionEasyUpdate(sId, seSelectionDate, seScore, seTextScore, seTextResult, seGetTextDate,seNo, seOk,  seNoreason, seSendOk, seEarlyOk, seEarlyNo, seFirstResult,
												 seSecondResult, seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate,seThirdResult, seRemarks,  seSituation, seDecide);
			if(test2 != 0) {
			result2 = true;
			}

			int test3 =dao3.selectionfaceUpdate( sfCategory1, sfName1, sfScore1_1,  sfId1);
			if(test3 != 0) {
			result3 = true;
			}

			int test4=dao4.selectionfaceUpdate( sfCategory1, sfName2, sfScore1_2,  sfId2);
			if(test4 != 0) {
			result4 = true;
			}

			int test5 =dao5.selectionfaceUpdate( sfCategory1, sfName3, sfScore1_3,  sfId3);
			if(test5 != 0) {
			result5 = true;
			}

			int test6 =dao6.selectionfaceUpdate( sfCategory2, sfName1, sfScore2_1,  sfId4);
			if(test6 != 0) {
			result6 = true;
			}

			int test7 =dao7.selectionfaceUpdate( sfCategory2, sfName2, sfScore2_2,  sfId5);
			if(test7 != 0) {
			result7 = true;
			}

			int test8 =dao8.selectiontextUpdate(sId, stCategory1, stName1, stScore1, stId1);
			if(test8 != 0) {
			result8 = true;
			}

			int test9 =dao9.selectiontextUpdate(sId, stCategory1, stName2, stScore2, stId2);
			if(test9 != 0) {
			result9 = true;
			}

			int test10 =dao10.selectiontextUpdate(sId, stCategory1, stName3, stScore3, stId3);
			if(test10 != 0) {
			result10 = true;
			}

			int test11 =dao11.selectiontextUpdate(sId, stCategory1, stName4, stScore4, stId4);
			if(test11 != 0) {
			result11 = true;
			}

			int test12 =dao12.selectiontextUpdate(sId, stCategory2, stName1, stScore1, stId5);
			if(test12 != 0) {
			result12 = true;
			}

			int test13 =dao13.selectiontextUpdate(sId, stCategory2, stName2, stScore2, stId6);
			if(test13 != 0) {
			result13 = true;
			}

			int test14 =dao14.selectiontextUpdate(sId, stCategory2, stName3, stScore3, stId7);
			if(test14 != 0) {
			result14 = true;
			}

			int test15 =dao15.selectiontextUpdate(sId, stCategory2, stName4, stScore4, stId8);
			if(test15 != 0) {
			result15 = true;
			}

			int test16 =dao16.selectiontextUpdate(sId, stCategory3, stName1, stScore1, stId9);
			if(test16 != 0) {
			result16 = true;
			}

			int test17 =dao17.selectiontextUpdate(sId, stCategory3, stName2, stScore2, stId10);
			if(test17 != 0) {
			result17 = true;
			}

			int test18 =dao18.selectiontextUpdate(sId, stCategory3, stName3, stScore3, stId11);
			if(test18 != 0) {
			result18 = true;
			}

			int test19 =dao19.selectiontextUpdate(sId, stCategory3, stName4, stScore4, stId12);
			if(test19 != 0) {
			result19 = true;
			}

			int test20 =dao20.internUpdate(iId1,iCategory1,  iDate1,  iMeeting1,  iSubmit1, iAcceptace1,  iDocument1,  iAttend);
			if(test20 != 0) {
				result20 = true;
				}

			int test21 =dao21.internUpdate(iId2,iCategory2,  iDate2,  iMeeting2,  iSubmit2, iAcceptace2,  iDocument2,  iAttend);
			if(test21 != 0) {
				result21 = true;
				}

			int test22 =dao22.internUpdate(iId3,iCategory3,  iDate3,  iMeeting3,  iSubmit3, iAcceptace3,  iDocument3,  iAttend);
			if(test22 != 0) {
				result22 = true;
				}

			int test23 =dao23.internUpdate(iId4,iCategory4,  iDate4,  iMeeting4,  iSubmit4, iAcceptace4,  iDocument4,  iAttend);
			if(test23 != 0) {
				result23 = true;
				}

			int test24 =dao24.internUpdate(iId5,iCategory5,  iDate5,  iMeeting5,  iSubmit5, iAcceptace5,  iDocument5,  iAttend);
			if(test24 != 0) {
				result24 = true;
				}
			int test25 =dao25.eventUpdate(eId1, eDate1);
			if(test25 != 0) {
				result25 = true;
				}

			int test26 =dao26.eventUpdate(eId2,eDate2);
			if(test26 != 0) {
				result26 = true;
				}

			int test27 =dao27.eventUpdate(eId3,eDate3);
			if(test27 != 0) {
				result27 = true;
				}

			int test28 =dao28.eventUpdate(eId4,eDate4);
			if(test28 != 0) {
				result28 = true;
				}

			int test29 =dao29.eventUpdate(eId5,eDate5);
			if(test29 != 0) {
				result29 = true;
				}

			int test30 =dao30.eventUpdate(eId6,eDate6);
			if(test30 != 0) {
				result30 = true;
				}

			int test31 =dao31.ISUpdate(iId6, iCategory6, iDate6 , iAttend, applyFlag);
			if(test31 != 0) {
				result31 = true;
				}





			if(result1 && result2 && result3 && result4 && result5 && result6 && result7 && result8 && result9 && result10 && result11 && result12 && result13 && result14 && result15 && result16 && result17 && result18 && result19 && result20 && result21 && result22 && result23 && result24 && result25 && result26 && result27 && result28 && result29 && result30 && result31) {
				conn.commit();
				allresult = true ;
			}
			else {
				conn.rollback();
			}

			return allresult;

		}catch(ClassNotFoundException e) {
			return allresult;
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			return allresult;

		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}


//	public boolean studentUpdate(int sId,String sName,String sKana,String sContexts,String sUnivercity, String sFaculty,String sDepatment, String sAddress, String sPcmail, String sMobilemail, String sCareertasu, String sMynavi, String sRikunavi, String Other ) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		StudentDao dao = new StudentDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test =dao.update(sId,sName,sKana,sContexts,sUnivercity,sFaculty,sDepatment,sAddress,sPcmail,sMobilemail,sCareertasu,sMynavi,sRikunavi,Other);
//
//		if(test != 0) {
//			result = true;
//		}
//
//		return result;
//
//	}

	public boolean studentDelete(int sId) throws ClassNotFoundException, SQLException {
		boolean result1 = false;
		boolean result2 = false;
		boolean result3 = false;
		boolean result4 = false;
		boolean result5 = false;
		boolean result6 = false;
		boolean allresult = false;
	try {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao dao1 = new StudentDao(conn);
		SelectionEasyDao dao2 = new SelectionEasyDao(conn);
		EventDao dao3 = new EventDao(conn);
		InternDao dao4 = new InternDao(conn);
		SelectionFaceDao dao5 = new SelectionFaceDao(conn);
		SelectionTextDao dao6 = new SelectionTextDao(conn);
		FeedbackDao dao7 = new FeedbackDao(conn);
		conn.setAutoCommit(false);
		//引数を渡し、取得地をbeanに渡す
		int test1 =dao1.delete(sId);
		if(test1 != 0) {
			result1 = true;
		}
		int test2 =dao2.selectionEasyDelete(sId);
		if(test2 != 0) {
			result2 = true;
		}
		int test3 =dao3.eventDelete(sId);
		if(test3 != 0) {
			result3 = true;
		}
		int test4 =dao4.internDelete(sId);
		if(test4 != 0) {
			result4 = true;
		}
		int test5 =dao5.selectionfaceDelete(sId);
		if(test5 != 0) {
			result5 = true;
		}
		int test6 =dao6.selectiontextDelete(sId);
		if(test6 != 0) {
			result6 = true;
		}
		if(result1 && result2 && result3 && result4  && result5  && result6) {
			conn.commit();
			allresult  = true;
		}else {
			throw new SQLException();
		}
		return allresult;
	}catch(ClassNotFoundException e) {
		return allresult;
	}catch(SQLException e){
		e.printStackTrace();
		try {
			conn.rollback();
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		return allresult;
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}


	public boolean flagUpdate( int sId) throws ClassNotFoundException, SQLException {
		boolean result = false;
	try {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
		//DAOを実体化
		StudentDao dao = new StudentDao(conn);
		conn.setAutoCommit(false);
		//引数を渡し、取得地をbeanに渡す
		int test =dao.flagUpdate(sId);

		if(test != 0) {
			conn.commit();
			result = true;

		}else {
			conn.rollback();
		}

		return result;

	}catch(ClassNotFoundException e) {
		return result;
	}catch(SQLException e) {
		e.printStackTrace();
		try {
			conn.rollback();

		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		return result;
	}finally {
		if(conn!= null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	}

	public boolean flagDelete() throws ClassNotFoundException, SQLException {
		boolean result = false;
		try {
			//ドライバの登録を行う
			Class.forName("org.h2.Driver");
			//データベースへの接続情報を設定する
			Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
					"sa", "sa");
			//DAOを実体化
			StudentDao dao = new StudentDao(conn);
			conn.setAutoCommit(false);
			//引数を渡し、取得地をbeanに渡す
			int test = dao.flagDelete();

			if (test != 0) {
				conn.commit();
				result = true;
			} else {
				conn.rollback();
			}

			return result;

		} catch (ClassNotFoundException e) {
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return result;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

//	public boolean selectionEasyUpdate(int sId, String seSelectionDate, int seScore, int seTextScore, String seTextResult,
//											String seGetTextDate,String seNo, String seOk, String seNoreason, String seSendOk,
//											String seEarlyOk,String seEarlyNo, String seFirstResult, String seSecondResult,
//											String seFirstNo,String seFirstDate, String seSecondNo, String seSecondDate,
//											String seThirdDate, String seThirdResult, String seRemarks, String seSituation, String seDecide)  throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		SelectionEasyDao dao = new SelectionEasyDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test =dao.selectionEasyUpdate(sId, seSelectionDate, seScore, seTextScore, seTextResult, seGetTextDate,
//										   seNo, seOk,  seNoreason, seSendOk, seEarlyOk, seEarlyNo, seFirstResult,
//										   seSecondResult, seFirstNo, seFirstDate, seSecondNo, seSecondDate, seThirdDate,
//										   seThirdResult, seRemarks,  seSituation, seDecide);
//
//		if(test != 0) {
//			result = true;
//		}
//
//		return result;
//
//	}

//	public boolean selectionEasyDelete(int sId) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		SelectionEasyDao dao = new SelectionEasyDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test =dao.selectionEasyDelete(sId);
//
//		if(test == 1) {
//			result = true;
//		}
//
//		return result;
//
//	}

public boolean templateUpdate(int tId, String tTitle, String tContent) throws ClassNotFoundException, SQLException {
	boolean result = false;
	try {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
				"sa", "sa");
		//DAOを実体化
		TemplateDao dao = new TemplateDao(conn);
		conn.setAutoCommit(false);

		int test = dao.templateUpdate(tId, tTitle, tContent);

		if (test != 0) {
			conn.commit();
			result = true;
		} else {
			conn.rollback();
		}

		return result;

	} catch (ClassNotFoundException e) {
		return result;
	} catch (SQLException e) {
		e.printStackTrace();
		try {
			conn.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return result;
	} finally {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

//	public boolean eventUpdate( int eId, String eDate1, String eDate2, String eDate3, String eDate4, String eDate5, String eDate6 ) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		EventDao dao = new EventDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test1 =dao.eventUpdate(eId,eDate1);
//		int test2 =dao.eventUpdate(eId,eDate2);
//		int test3 =dao.eventUpdate(eId,eDate3);
//		int test4 =dao.eventUpdate(eId,eDate4);
//		int test5 =dao.eventUpdate(eId,eDate5);
//		int test6 =dao.eventUpdate(eId,eDate6);
//
//
//
//		if(test1 == 1 && test2 ==1 && test3 == 1 && test4 == 1 && test5 == 1 && test6==1 ) {
//			result = true;
//		}
//
//		return result;
//
//	}



//	public boolean eventDelete(int sId ) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		EventDao dao = new EventDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test =dao.eventDelete(sId);
//
//		if(test == 1) {
//			result = true;
//		}
//
//		return result;
//
//	}

public boolean feedbackUpdate(int fId, String fName, String fContent) throws ClassNotFoundException, SQLException {
	boolean result = false;
	try {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
				"sa", "sa");
		//DAOを実体化
		FeedbackDao dao = new FeedbackDao(conn);
		//引数を渡し、取得地をbeanに渡す
		int test = dao.update(fId, fName, fContent);

		if (test != 0) {
			result = true;
		}
		return result;
	} catch (ClassNotFoundException e) {
		return result;
	} catch (SQLException e) {
		e.printStackTrace();
		return result;
	} finally {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
//	public boolean feedbackDelete(int sId) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		FeedbackDao dao = new FeedbackDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test =dao.delete(sId);
//
//		if(test == 1) {
//			result = true;
//		}
//
//		return result;
//
//	}


//	public boolean internUpdate( String iCategory1, String iCategory2, String iCategory3, String iCategory4, String iCategory5, String iDate1, String iDate2, String iDate3, String iDate4, String iDate5, String iMeeting1, String iMeeting2,
//									String iMeeting3, String iMeeting4, String iMeeting5, String iSubmit1, String iSubmit2, String iSubmit3, String iSubmit4, String iSubmit5,
//									String iAcceptace1, String iAcceptace2, String iAcceptace3, String iAcceptace4, String iAcceptace5,
//									String iDocument1, String iDocument2, String iDocument3, String iDocument4, String iDocument5,  String iAttend, int iId) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		InternDao dao = new InternDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test1 =dao.internUpdate(iId, iDate1,  iMeeting1,  iSubmit1, iAcceptace1,  iDocument1, iAttend, iCategory1);
//		int test2 =dao.internUpdate(iId, iDate2,  iMeeting2,  iSubmit2, iAcceptace2,  iDocument2,  iCategory2, iAttend);
//		int test3 =dao.internUpdate(iId, iDate3,  iMeeting3,  iSubmit3, iAcceptace3,  iDocument3,  iCategory3, iAttend);
//		int test4 =dao.internUpdate(iId, iDate4,  iMeeting4,  iSubmit4, iAcceptace4,  iDocument4,  iCategory4, iAttend);
//		int test5 =dao.internUpdate(iId, iDate5,  iMeeting5,  iSubmit5, iAcceptace5,  iDocument5,  iCategory5, iAttend);
//
//
//
//		if(test1 == 1 && test2 == 1 && test3 == 1 && test4 == 1 && test5 == 1) {
//			result = true;
//		}
//
//		return result;
//
//	}

//	public boolean internDelete(int sId) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		InternDao dao = new InternDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test =dao.internDelete(sId);
//
//		if(test == 1) {
//			result = true;
//		}
//
//		return result;
//
//	}

public boolean allUpdate(String sqlContents1, String sqlContents2, String sqlContents3, String sqlContents4,
		String sqlContents5) throws ClassNotFoundException, SQLException {
	boolean result = false;
	try {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");
		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj",
				"sa", "sa");
		//DAOを実体化
		InternDao dao = new InternDao(conn);
		conn.setAutoCommit(false);
		int test1 = 0;
		int test2 = 0;
		int test3 = 0;
		int test4 = 0;
		int test5 = 0;
		int totaltest = 0;
		System.out.println(sqlContents1);
		System.out.println(sqlContents2);
		System.out.println(sqlContents3);
		System.out.println(sqlContents4);
		System.out.println(sqlContents5);
		//引数を渡し、取得地をbeanに渡す
		if (sqlContents1!=null) {
			test1 = dao.allUpdate(sqlContents1);
			totaltest++;
		}
		if (sqlContents2!=null) {
			test2 = dao.allUpdate(sqlContents2);
			totaltest++;
		}
		if (sqlContents3!=null) {
			test3 = dao.allUpdate(sqlContents3);
			totaltest++;
		}
		if (sqlContents4!=null) {
			test4 = dao.allUpdate(sqlContents4);
			totaltest++;
		}
		if (sqlContents5!=null) {
			test5 = dao.allUpdate(sqlContents5);
			totaltest++;
		}
		if (test1+test2+test3+test4+test5 >= totaltest) {
			conn.commit();
			result = true;
		} else {
			conn.rollback();
		}
		return result;
	} catch (ClassNotFoundException e) {
		return result;
	} catch (SQLException e) {
		e.printStackTrace();
		try {
			conn.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return result;
	} finally {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	}

//	public boolean selectionFaceUpdate( String sfCategory1, String sfCategory2, String sfName1, String sfName2, String sfName3, int sfScore1_1, int sfScore1_2, int sfScore1_3, int sfScore2_1, int sfScore2_2, int sfId) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		SelectionFaceDao dao = new SelectionFaceDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test1 =dao.selectionfaceUpdate( sfCategory1, sfName1, sfScore1_1,  sfId);
//		int test2=dao.selectionfaceUpdate( sfCategory1, sfName2, sfScore1_2,  sfId);
//		int test3 =dao.selectionfaceUpdate( sfCategory1, sfName3, sfScore1_3,  sfId);
//		int test4 =dao.selectionfaceUpdate( sfCategory2, sfName1, sfScore2_1,  sfId);
//		int test5 =dao.selectionfaceUpdate( sfCategory2, sfName2, sfScore2_2,  sfId);
//
//
//		if(test1 == 1 && test2 == 1 && test3 == 1 && test4 == 1 && test5 == 1 ) {
//			result = true;
//		}
//
//		return result;
//
//	}

//	public boolean selectionFaceDelete(int sId) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		SelectionFaceDao dao = new SelectionFaceDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test =dao.selectionfaceDelete(sId);
//
//		if(test == 1) {
//			result = true;
//		}
//
//		return result;
//
//	}



//	public boolean selectionTextUpdate(int sId,String stCategory1, String stCategory2, String stCategory3,
//			String stName1, String stName2, String stName3, String stName4, int stScore1, int stScore2, int stScore3, int stScore4, int stScore5, int stScore6, int stScore7, int stScore8, int stScore9,int stScore10, int stScore11, int stScore12, int stId) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		SelectionTextDao dao = new SelectionTextDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test1 =dao.selectiontextUpdate(sId, stCategory1, stName1, stScore1, stId);
//		int test2 =dao.selectiontextUpdate(sId, stCategory1, stName2, stScore2, stId);
//		int test3 =dao.selectiontextUpdate(sId, stCategory1, stName3, stScore3, stId);
//		int test4 =dao.selectiontextUpdate(sId, stCategory1, stName4, stScore4, stId);
//
//		int test5 =dao.selectiontextUpdate(sId, stCategory2, stName1, stScore1, stId);
//		int test6 =dao.selectiontextUpdate(sId, stCategory2, stName2, stScore2, stId);
//		int test7 =dao.selectiontextUpdate(sId, stCategory2, stName3, stScore3, stId);
//		int test8 =dao.selectiontextUpdate(sId, stCategory2, stName4, stScore4, stId);
//
//		int test9 =dao.selectiontextUpdate(sId, stCategory3, stName1, stScore1, stId);
//		int test10 =dao.selectiontextUpdate(sId, stCategory3, stName2, stScore2, stId);
//		int test11 =dao.selectiontextUpdate(sId, stCategory3, stName3, stScore3, stId);
//		int test12 =dao.selectiontextUpdate(sId, stCategory3, stName4, stScore4, stId);
//
//		if(test1 == 1 && test2 == 1 && test3 == 1 && test4 == 1 && test5 == 1 && test6 == 1 && test7 == 1 && test8 == 1 && test9 == 1 && test10 == 1 && test11 == 1 && test12 == 1 ) {
//			result = true;
//		}
//
//		return result;
//
//	}


//	public boolean selectionTextDelete(int sId) throws ClassNotFoundException, SQLException {
//		boolean result = false;
//		//ドライバの登録を行う
//		Class.forName("org.h2.Driver");
//		//データベースへの接続情報を設定する
//		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
//		//DAOを実体化
//		SelectionTextDao dao = new SelectionTextDao(conn);
//		//引数を渡し、取得地をbeanに渡す
//		int test =dao.selectiontextDelete(sId);
//
//		if(test == 1) {
//			result = true;
//		}
//
//		return result;
//
//	}

//トランザクションを使用する場合はこんなかんじ
//conn.commit();

//もし、ArrayListなどがreturnされてきた場合、このような出力値検査が行われる
//		ArrayList<UserBean> list = dao.getAllList<>();
//		if(list.size()==0) {
//			list=null;
//		}

public boolean privateFlagDelete( int sId) throws ClassNotFoundException, SQLException {
    boolean result = false;
try {
    //ドライバの登録を行う
    Class.forName("org.h2.Driver");
    //データベースへの接続情報を設定する
    Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj","sa","sa");
    //DAOを実体化
    StudentDao dao = new StudentDao(conn);
    conn.setAutoCommit(false);
    //引数を渡し、取得地をbeanに渡す
    int test =dao.privateFlagDelete(sId);
    if(test != 0) {
        conn.commit();
        result = true;
    }else {
        conn.rollback();
    }
    return result;
}catch(ClassNotFoundException e) {
    return result;
}catch(SQLException e) {
    e.printStackTrace();
    try {
        conn.rollback();
    }catch(SQLException e1) {
        e1.printStackTrace();
    }
    return result;
}finally {
    if(conn!= null) {
        try {
            conn.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
}
}

