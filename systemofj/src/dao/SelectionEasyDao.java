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
			bean.setsId(rs.getInt("s_id"));
			bean.setSeSelectionDate(rs.getString("se_selectiondate"));
			bean.setSeScore(rs.getInt("se_score"));
			bean.setSeTextScore(rs.getInt("se_textscore"));
			bean.setSeTextResult(rs.getString("se_textresult"));
			bean.setSeGetTextDate(rs.getString("se_gettextdate"));
			bean.setSeNo(rs.getString("se_no"));
			bean.setSeOk(rs.getString("se_ok"));
			bean.setSeNoReason(rs.getString("se_noreason"));
			bean.setSeSendOk(rs.getString("se_okreason"));
			bean.setSeEarlyOk(rs.getString("se_earlyok"));
			bean.setSeFirstResult(rs.getString("se_firstresult"));
			bean.setSeSecondResult(rs.getString("se_secondresult"));
			bean.setSeFirstNo(rs.getString("se_firstno"));
			bean.setseFirstDate(rs.getString("se_firstdate"));
			bean.setSeSecondNo(rs.getString("se_secondno"));
			bean.setSeSecondDate(rs.getString("se_seconddate"));
			bean.setSeThirdDate(rs.getString("se_thirddate"));
			bean.setSeThirdResult(rs.getString("se_thirdresult"));
			bean.setSeRemarks(rs.getString("se_remarks"));
			bean.setSeId(rs.getInt("se_id"));
			bean.setSeConfirm(rs.getString("se_confirm"));
			bean.setSeSituation(rs.getString("se_situation"));

		}
		if (conn != null) {
			conn.close();
		}

		return bean;

	}

	// 登録
	public int insert(
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
			String seEaryOk,
			String seEaryNo,
			String seFirstResult,
			String seSecondResult,
			String seFirstNo,
			String seFirstDate,
			String seSecondNo,
			String seSecondDate,
			String seThirdDate,
			String seThirdResult,
			String seRemarks,
			String seSituation) throws SQLException {

		// SQL文を準備する
		String sql = "insert into SelectionEasy values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setInt(1, sId); //1つ目の?(=NAME)に入力値をいれる
		pStmt.setString(2, seSelectionDate);
		pStmt.setInt(3, seScore);
		pStmt.setInt(4, seTextScore);
		pStmt.setString(5, seTextResult);
		pStmt.setString(6, seSelectionDate);
		pStmt.setString(7, seNo);
		pStmt.setString(8, seOk);
		pStmt.setString(9, seNoReason);
		pStmt.setString(10, seSendOk);
		pStmt.setString(11, seEaryOk);
		pStmt.setString(12, seEaryNo);
		pStmt.setString(13, seFirstResult);
		pStmt.setString(14, seSecondResult);
		pStmt.setString(15, seFirstNo);
		pStmt.setString(16, seFirstDate);
		pStmt.setString(17, seSecondNo);
		pStmt.setString(18, seSecondDate);
		pStmt.setString(19, seThirdDate);
		pStmt.setString(20, seThirdResult);
		pStmt.setString(21, seRemarks);
		pStmt.setString(22, seSituation);

		if (conn != null) {
			conn.close();
		}
		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

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
			String seEaryOk,
			String seEaryNo,
			String seFirstResult,
			String seSecondResult,
			String seFirstNo,
			String seFirstDate,
			String seSecondNo,
			String seSecondDate,
			String seThirdDate,
			String seThirdResult,
			String seRemarks,
			String seSituation) throws SQLException {

		// SQL文を準備する

		String sql = "update SelectionEasy set"
				+ "s_id=?,"
				+ "se_selectiondate=?,"
				+ "se_score=?,"
				+ "se_textscore=?,"
				+ "se_textresult=?,"
				+ "se_gettextdate=?,"
				+ "se_no=?,se_ok=?,"
				+ "se_noreason=?,"
				+ "se_sendok=?,"
				+ "se_earyok=?,"
				+ "se_earyno=?,"
				+ "se_firstresult=?,"
				+ "se_secondresult=?,"
				+ "se_firstno=?,"
				+ "se_firstdate=?,"
				+ "se_secondno=?,"
				+ "se_seconddate=?,"
				+ "se_seconddate=?,"
				+ "se_thirddate=?,"
				+ "se_thirdresult=?,"
				+ "se_thirdresult=?,"
				+ "se_remarks=?,"
				+ "se_situation=?"
				+ "where s_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる

		pStmt.setInt(1, sId); //1つ目の?(=NAME)に入力値をいれる
		pStmt.setString(2, seSelectionDate);
		pStmt.setInt(3, seScore);
		pStmt.setInt(4, seTextScore);
		pStmt.setString(5, seTextResult);
		pStmt.setString(6, seSelectionDate);
		pStmt.setString(7, seNo);
		pStmt.setString(8, seOk);
		pStmt.setString(9, seNoReason);
		pStmt.setString(10, seSendOk);
		pStmt.setString(11, seEaryOk);
		pStmt.setString(12, seEaryNo);
		pStmt.setString(13, seFirstResult);
		pStmt.setString(14, seSecondResult);
		pStmt.setString(15, seFirstNo);
		pStmt.setString(16, seFirstDate);
		pStmt.setString(17, seSecondNo);
		pStmt.setString(18, seSecondDate);
		pStmt.setString(19, seThirdDate);
		pStmt.setString(20, seThirdResult);
		pStmt.setString(21, seRemarks);
		pStmt.setString(22, seSituation);

		if (conn != null) {
			conn.close();
		}

		// SQL文を実行する
		// ここは変えなくていい
		// 件数を返す
		return pStmt.executeUpdate(); //executeUpdate()処理されたレコード件数が返る 1件登録だから1がでればOK

	}

	// 削除
	public int selectionEasyDelete(int sId) throws SQLException {

		// SQL文を準備する

		String sql = "delete from SelectionEasy where s_id=?";
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
