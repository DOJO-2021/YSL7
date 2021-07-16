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
				StudentDao sdao = new StudentDao(conn);
				sdao.studentInsert(i.get(0),i.get(1),i.get(2),i.get(3),i.get(4),i.get(5),i.get(6),i.get(7),i.get(8),i.get(9),i.get(10),i.get(11),i.get(12));
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
