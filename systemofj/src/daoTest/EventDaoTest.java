package daoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.EventDao;
import dao.StudentDao;
import model.SEvent;

public class EventDaoTest {

	public EventDaoTest() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//ドライバの登録を行う
		Class.forName("org.h2.Driver");

		//データベースへの接続情報を設定する
		Connection conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");

		//選択したIDの人のデータ持ってこれるかテスト
		EventDao eventdao = new EventDao(conn);
		System.out.println("選択したIDの人のデータ持ってこれるかテスト----------------------");
		ArrayList<SEvent> sEventList = eventdao.eventSelect(1);
		if(sEventList != null) {
			System.out.println("一応成功");
			for(SEvent all : sEventList){
				System.out.println(all.geteId());
				System.out.println(all.getsId());
				System.out.println(all.geteCategory());
				System.out.println(all.geteDate());
			}
		}else {
			System.out.println("失敗");
		}

		//登録テスト
		System.out.println("登録テスト----------------------");
		conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
		eventdao = new EventDao(conn);
		conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
		StudentDao studentdao = new StudentDao(conn);
		try {
			int s = studentdao.studentInsert("辻彩乃","ツジアヤノ","文系","産業能率大学","経営学部","現代ビジネス学科","神奈川県","ayano@ee","ayano@ee","","","","");
			int t = eventdao.eventInsert("座談会１","2020-10-18");
			System.out.println("成功");
		}catch(SQLException e){
			System.out.println("失敗");
			e.printStackTrace();
		}

		//更新テスト
		System.out.println("更新テスト----------------------");
		conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
		eventdao = new EventDao(conn);
			int up = eventdao.eventUpdate(9,"2020-10-20");
			if(up>0) {
				System.out.println("成功！");
			}else{
				System.out.println("失敗！");
		}

		//削除テスト
			System.out.println("削除テスト----------------------");
			conn = DriverManager.getConnection("jdbc:h2:file:C:\\pleiades\\workspace\\YSL7\\data\\systemofj", "sa", "sa");
			eventdao = new EventDao(conn);
			int de = eventdao.eventDelete(9);
			if(up>0) {
				System.out.println("成功！");
			}else{
				System.out.println("失敗！");
		}
	}
}
