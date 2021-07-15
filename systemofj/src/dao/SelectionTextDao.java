package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.SSelectionText;

public class SelectionTextDao {
		Connection conn=null;

		public SelectionTextDao(Connection conn) {
			this.conn=conn;
		}
		public SSelectionText selectiontextSelect(int sId) throws SQLException {

			//リターンするためのUserBeanを実体化
			SSelectionText bean =null;

			//SQL文を準備する
			String sql = "select * from SelectionText where sId=?";

			//準備したSQLを発行できる状態にする（全てまとめる）
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//?（プレースホルダ―）の部分に値を設定
			pStmt.setInt(1, sId);

			//SQLを実行し、結果を取得する
			ResultSet rs = pStmt.executeQuery();

			//Beanにもらってきたデータを入れ替える
			if(rs.next()) {
				//ここでbeanを実体化（これがなければbeanはnullのまま)
				bean = new SSelectionText();

				//beanに値をひとつずつセットする
				bean.setsId(rs.getInt("s_id"));
				bean.setStCategory(rs.getString("st_category"));
				bean.setStName(rs.getString("st_name"));
				bean.setStScore(rs.getInt("st_score"));
				bean.setStId(rs.getInt("st_id"));
			}
			if(conn != null) {
				conn.close();
			}
			return bean;
		}
		public int selectiontextInsert(int sId, String stCategory, String stName, int stScore,int stId) throws SQLException {

			// SQL文を準備する
			String sql = "insert into SelectionText values (null,?,?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//beanに値をひとつずつセットする
			pStmt.setInt(1,sId);
			pStmt.setString(2,stCategory);
			pStmt.setString(3,stName);
			pStmt.setInt(4,stScore);

			if (conn != null) {
				conn.close();
			}
			// SQL文を実行する
			// ここは変えなくていい
			// 件数を返す
			return pStmt.executeUpdate();
		}

		public int selectiontextUpdate(int sId,String stCategory,String stName, int stScore,int stId) throws SQLException {

			// SQL文を準備する
			String sql = "update SelectionFace set s_id=?,st_category=? ,st_name=? ,st_score=? ,st_id =? where st_id =?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setInt(1, sId); //1つ目の?(=NAME)に入力値をいれる
			pStmt.setString(2,stCategory);
			pStmt.setString(3,stName);
			pStmt.setInt(4,stScore);

			if (conn != null) {
				conn.close();
			}
			// SQL文を実行する
			// ここは変えなくていい
			// 件数を返す
			return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK
		}
		public int selectiontextDelete(int sId) throws SQLException {

			// SQL文を準備する

			String sql = "delete from SelectionText where s_id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			pStmt.setInt(1, sId); //1つ目の?(=NAME)に入力値をいれる
			if (conn != null) {
				conn.close();
			}
			// SQL文を実行する
			// ここは変えなくていい
			// 件数を返す
			return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK
		}

}


