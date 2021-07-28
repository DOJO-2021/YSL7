package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.SSelectionText;

public class SelectionTextDao {
		Connection conn=null;

		public SelectionTextDao(Connection conn) {
			this.conn=conn;
		}


		public ArrayList<SSelectionText> selectiontextSelect(int sId) throws SQLException {

			ArrayList<SSelectionText> stsList = new ArrayList<SSelectionText>(); //SFeedback型の要素をしまうListを作る

			//リターンするためのUserBeanを実体化
			SSelectionText bean =null;

			//SQL文を準備する
			String sql = "select * from SelectionText where s_id=?";

			//準備したSQLを発行できる状態にする（全てまとめる）
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//?（プレースホルダ―）の部分に値を設定
			pStmt.setInt(1, sId);

			//SQLを実行し、結果を取得する
			ResultSet rs = pStmt.executeQuery();

			//Beanにもらってきたデータを入れ替える
			while(rs.next()) {
				//ここでbeanを実体化（これがなければbeanはnullのまま)
				bean = new SSelectionText();

				//beanに値をひとつずつセットする
				bean.setsId(rs.getInt("s_id"));
				bean.setStCategory(rs.getString("st_category"));
				bean.setStName(rs.getString("st_name"));
				bean.setStScore(rs.getInt("st_score"));
				bean.setStId(rs.getInt("st_id"));

				stsList.add(bean);
			}
//			if(conn != null) {
//				conn.close();
//			}
			return stsList;
		}



		public int selectiontextInsert(String stCategory, String stName, int stScore) throws SQLException {

			// SQL文を準備する
			String sql =  "insert into SelectionText (s_id, st_category,st_name, st_score)"
					+ " values ((SELECT s_id FROM Student ORDER BY s_id DESC LIMIT 1), ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//beanに値をひとつずつセットする
			pStmt.setString(1,stCategory);
			pStmt.setString(2,stName);
			pStmt.setInt(3,stScore);

			int ans = pStmt.executeUpdate();

			// SQL文を実行する
			// ここは変えなくていい
			// 件数を返す
			return ans;

		}



		public int selectiontextUpdate(int sId,String stCategory,String stName, int stScore,int stId) throws SQLException {

			// SQL文を準備する
			String sql = "update SelectionText set st_category=? ,st_name=? ,st_score=? where st_id =?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setString(1,stCategory);
			pStmt.setString(2,stName);
			pStmt.setInt(3,stScore);
			pStmt.setInt(4,stId);



			int ans = pStmt.executeUpdate();

//			if (conn != null) {
//				conn.close();
//			}


			// SQL文を実行する
			// ここは変えなくていい
			// 件数を返す
			return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

		}



		public int selectiontextDelete(int sId) throws SQLException {

			// SQL文を準備する

			String sql = "delete from SelectionText where s_id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			pStmt.setInt(1, sId); //1つ目の?(=NAME)に入力値をいれる


			int ans = pStmt.executeUpdate();


//			if (conn != null) {
//				conn.close();
//			}


			// SQL文を実行する
			// ここは変えなくていい
			// 件数を返す

			return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK
		}

}

