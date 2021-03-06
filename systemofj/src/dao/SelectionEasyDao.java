package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.SSelectionEasy;

public class SelectionEasyDao {
	Connection conn = null;

	public SelectionEasyDao(Connection conn) {
		this.conn = conn;
	}

	public SSelectionEasy selectionEasySelect(int sId) throws SQLException {

		//リターンするためのSSelectionEasyBeanを実体化
		SSelectionEasy bean = null;

		//SQL文を準備する
		String sql = "select * from SelectionEasy where s_id=?";

		//準備したSQLを発行できる状態にする（全てまとめる）
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//?（プレースホルダ―）の部分に値を設定
		pStmt.setInt(1, sId);

		//SQLを実行し、結果を取得する
		ResultSet rs = pStmt.executeQuery();

		//Beanにもらってきたデータを入れ替える
		if (rs.next()) {
			//ここでbeanを実体化（これがなければbeanはnullのまま)
			bean = new SSelectionEasy();
			//beanに値をひとつずつセットする
			bean.setSeId(rs.getInt("se_id"));
			bean.setsId(rs.getInt("s_id"));
			bean.setSeSelectionDate(rs.getString("se_selectiondate"));
			bean.setSeScore(rs.getInt("se_score"));
			bean.setSeTextScore(rs.getInt("se_textscore"));
			bean.setSeTextResult(rs.getString("se_textresult"));
			bean.setSeGetTextDate(rs.getString("se_gettextdate"));
			bean.setSeNo(rs.getString("se_no"));
			bean.setSeOk(rs.getString("se_ok"));
			bean.setSeNoReason(rs.getString("se_noreason"));
			bean.setSeSendOk(rs.getString("se_sendok"));
			bean.setSeEarlyOk(rs.getString("se_earlyok"));
			bean.setSeEarlyNo(rs.getString("se_earlyno"));
			bean.setSeFirstResult(rs.getString("se_firstresult"));
			bean.setSeSecondResult(rs.getString("se_secondresult"));
			bean.setSeFirstNo(rs.getString("se_firstno"));
			bean.setseFirstDate(rs.getString("se_firstdate"));
			bean.setSeSecondNo(rs.getString("se_secondno"));
			bean.setSeSecondDate(rs.getString("se_seconddate"));
			bean.setSeThirdDate(rs.getString("se_thirddate"));
			bean.setSeThirdResult(rs.getString("se_thirdresult"));
			bean.setSeRemarks(rs.getString("se_remarks"));
			bean.setSeSituation(rs.getString("se_situation"));
			bean.setSeDecide(rs.getString("se_decide"));

		}

		return bean;

	}

	// 登録
	public int selectionEasyInsert(
			String seSelectionDate,
			int seScore,
			int seTextScore,
			String seTextResult,
			String seGetTextDate,
			String seNo,
			String seOk,
			String seNoReason,
			String seSendOk,
			String seEarlyOk,
			String seEarlyNo,
			String seFirstResult,
			String seSecondResult,
			String seFirstNo,
			String seFirstDate,
			String seSecondNo,
			String seSecondDate,
			String seThirdDate,
			String seThirdResult,
			String seRemarks,
			String seSituation,
			String seDecide) throws SQLException {

		// SQL文を準備する
		String sql = "insert into SelectionEasy values (null, (SELECT s_id FROM Student ORDER BY s_id DESC LIMIT 1), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

			//1つ目の?に入力値をいれる
		pStmt.setString(1, seSelectionDate);
		pStmt.setInt(2, seScore);
		pStmt.setInt(3, seTextScore);
		pStmt.setString(4, seTextResult);
		pStmt.setString(5, seSelectionDate);
		pStmt.setString(6, seNo);
		pStmt.setString(7, seOk);
		pStmt.setString(8, seNoReason);
		pStmt.setString(9, seSendOk);
		pStmt.setString(10, seEarlyOk);
		pStmt.setString(11, seEarlyNo);
		pStmt.setString(12, seFirstResult);
		pStmt.setString(13, seSecondResult);
		pStmt.setString(14, seFirstNo);
		pStmt.setString(15, seFirstDate);
		pStmt.setString(16, seSecondNo);
		pStmt.setString(17, seSecondDate);
		pStmt.setString(18, seThirdDate);
		pStmt.setString(19, seThirdResult);
		pStmt.setString(20, seRemarks);
		pStmt.setString(21, seSituation);
		pStmt.setString(22, seDecide);


		int ans = pStmt.executeUpdate();

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}

	// 更新
	public int selectionEasyUpdate(
			int sId,
			String seSelectionDate,
			int seScore,
			int seTextScore,
			String seTextResult,
			String seGetTextDate,
			String seNo,
			String seOk,
			String seNoReason,
			String seSendOk,
			String seEarlyOk,
			String seEarlyNo,
			String seFirstResult,
			String seSecondResult,
			String seFirstNo,
			String seFirstDate,
			String seSecondNo,
			String seSecondDate,
			String seThirdDate,
			String seThirdResult,
			String seRemarks,
			String seSituation,
			String seDecide) throws SQLException {

		// SQL文を準備する

		String sql = "update SelectionEasy set "
				+ "se_selectiondate=?,"
				+ "se_score=?,"
				+ "se_textscore=?,"
				+ "se_textresult=?,"
				+ "se_gettextdate=?,"
				+ "se_no=?,"
				+ "se_ok=?,"
				+ "se_noreason=?,"
				+ "se_sendok=?,"
				+ "se_earlyok=?,"
				+ "se_earlyno=?,"
				+ "se_firstresult=?,"
				+ "se_secondresult=?,"
				+ "se_firstno=?,"
				+ "se_firstdate=?,"
				+ "se_secondno=?,"
				+ "se_seconddate=?,"
				+ "se_thirddate=?,"
				+ "se_thirdresult=?,"
				+ "se_remarks=?,"
				+ "se_situation=?,"
				+ "se_decide=?"
				+ "where s_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setString(1, seSelectionDate);
		pStmt.setInt(2, seScore);
		pStmt.setInt(3, seTextScore);
		pStmt.setString(4, seTextResult);
		pStmt.setString(5, seGetTextDate);
		pStmt.setString(6, seNo);
		pStmt.setString(7, seOk);
		pStmt.setString(8, seNoReason);
		pStmt.setString(9, seSendOk);
		pStmt.setString(10, seEarlyOk);
		pStmt.setString(11, seEarlyNo);
		pStmt.setString(12, seFirstResult);
		pStmt.setString(13, seSecondResult);
		pStmt.setString(14, seFirstNo);
		pStmt.setString(15, seFirstDate);
		pStmt.setString(16, seSecondNo);
		pStmt.setString(17, seSecondDate);
		pStmt.setString(18, seThirdDate);
		pStmt.setString(19, seThirdResult);
		pStmt.setString(20, seRemarks);
		pStmt.setString(21, seSituation);
		pStmt.setString(22, seDecide);
		pStmt.setInt(23, sId);


		int ans = pStmt.executeUpdate();

//		if (conn != null) {
//			conn.close();
//		}

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}

	// 削除
	public int selectionEasyDelete(int sId) throws SQLException {

		// SQL文を準備する

		String sql = "delete from SelectionEasy where s_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setInt(1, sId); //1つ目の?(=NAME)に入力値をいれる

		int ans = pStmt.executeUpdate();

//		if (conn != null) {
//			conn.close();
//		}

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return ans; //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK
	}
}
