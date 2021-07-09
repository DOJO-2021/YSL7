package model;

import java.sql.Date;

public class SSelectionEasy {
	private Date seSelectionDate;
	private int seScore;
	private int seTextScore;
	private String seTextResult;
	private Date seGetTextDate;
	private Date seNo;
	private Date seOk;
	private String seNoReason;
	private Date seSendOk;
	private Date seEarlyOk;
	private Date seEarlyNo;
	private String seFirstResult;
	private String seSecondResult;
	private Date seFirstNo;
	private Date seSecondNo;
	private Date seSecondDate;
	private Date seThirdDate;
	private String seThirdResult;
	private String seRemarks;
	private int seId;
	private String seConfirm;
	private String seSituation;

	//Studentフィールド--------------------------
		private int sId;	//学生ID
		private String sName;	//名前
		private String sKana;	//ふりがな
		private String sContexts;	//文理
		private String sUnivercity;	//学校名
		private String sFaculty;	//学部名
		private String sDepartment;	//学科名
		private String sAddress;	//住所
		private String sPcmail;	//メアドPC
		private String sMobileMail;	//メアドPC携帯
		private String sCareertasu;	//キャリタス
		private String sMynavi;	//マイナビ
		private String sRikunavi;	//リクナビ
		private String sOther;	//その他
		private String allEditFlag;	//一括編集フラグ



	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public Date getSeSelectionDate() {
		return seSelectionDate;
	}
	public void setSeSelectionDate(Date seSelectionDate) {
		this.seSelectionDate = seSelectionDate;
	}
	public int getSeScore() {
		return seScore;
	}
	public void setSeScore(int seScore) {
		this.seScore = seScore;
	}
	public int getSeTextScore() {
		return seTextScore;
	}
	public void setSeTextScore(int seTextScore) {
		this.seTextScore = seTextScore;
	}
	public String getSeTextResult() {
		return seTextResult;
	}
	public void setSeTextResult(String seTextResult) {
		this.seTextResult = seTextResult;
	}
	public Date getSeGetTextDate() {
		return seGetTextDate;
	}
	public void setSeGetTextDate(Date seGetTextDate) {
		this.seGetTextDate = seGetTextDate;
	}
	public Date getSeNo() {
		return seNo;
	}
	public void setSeNo(Date seNo) {
		this.seNo = seNo;
	}
	public Date getSeOk() {
		return seOk;
	}
	public void setSeOk(Date seOk) {
		this.seOk = seOk;
	}
	public String getSeNoReason() {
		return seNoReason;
	}
	public void setSeNoReason(String seNoReason) {
		this.seNoReason = seNoReason;
	}
	public Date getSeSendOk() {
		return seSendOk;
	}
	public void setSeSendOk(Date seSendOk) {
		this.seSendOk = seSendOk;
	}
	public Date getSeEarlyOk() {
		return seEarlyOk;
	}
	public void setSeEarlyOk(Date seEarlyOk) {
		this.seEarlyOk = seEarlyOk;
	}
	public Date getSeEarlyNo() {
		return seEarlyNo;
	}
	public void setSeEarlyNo(Date seEarlyNo) {
		this.seEarlyNo = seEarlyNo;
	}
	public String getSeFirstResult() {
		return seFirstResult;
	}
	public void setSeFirstResult(String seFirstResult) {
		this.seFirstResult = seFirstResult;
	}
	public String getSeSecondResult() {
		return seSecondResult;
	}
	public void setSeSecondResult(String seSecondResult) {
		this.seSecondResult = seSecondResult;
	}
	public Date getSeFirstNo() {
		return seFirstNo;
	}
	public void setSeFirstNo(Date seFirstNo) {
		this.seFirstNo = seFirstNo;
	}
	public Date getSeSecondNo() {
		return seSecondNo;
	}
	public void setSeSecondNo(Date seSecondNo) {
		this.seSecondNo = seSecondNo;
	}
	public Date getSeSecondDate() {
		return seSecondDate;
	}
	public void setSeSecondDate(Date seSecondDate) {
		this.seSecondDate = seSecondDate;
	}
	public Date getSeThirdDate() {
		return seThirdDate;
	}
	public void setSeThirdDate(Date seThirdDate) {
		this.seThirdDate = seThirdDate;
	}
	public String getSeThirdResult() {
		return seThirdResult;
	}
	public void setSeThirdResult(String seThirdResult) {
		this.seThirdResult = seThirdResult;
	}
	public String getSeRemarks() {
		return seRemarks;
	}
	public void setSeRemarks(String seRemarks) {
		this.seRemarks = seRemarks;
	}
	public int getSeId() {
		return seId;
	}
	public void setSeId(int seId) {
		this.seId = seId;
	}
	public String getSeConfirm() {
		return seConfirm;
	}
	public void setSeConfirm(String seConfirm) {
		this.seConfirm = seConfirm;
	}
	public String getSeSituation() {
		return seSituation;
	}
	public void setSeSituation(String seSituation) {
		this.seSituation = seSituation;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsKana() {
		return sKana;
	}
	public void setsKana(String sKana) {
		this.sKana = sKana;
	}
	public String getsContexts() {
		return sContexts;
	}
	public void setsContexts(String sContexts) {
		this.sContexts = sContexts;
	}
	public String getsUnivercity() {
		return sUnivercity;
	}
	public void setsUnivercity(String sUnivercity) {
		this.sUnivercity = sUnivercity;
	}
	public String getsFaculty() {
		return sFaculty;
	}
	public void setsFaculty(String sFaculty) {
		this.sFaculty = sFaculty;
	}
	public String getsDepartment() {
		return sDepartment;
	}
	public void setsDepartment(String sDepartment) {
		this.sDepartment = sDepartment;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getsPcmail() {
		return sPcmail;
	}
	public void setsPcmail(String sPcmail) {
		this.sPcmail = sPcmail;
	}
	public String getsMobileMail() {
		return sMobileMail;
	}
	public void setsMobileMail(String sMobileMail) {
		this.sMobileMail = sMobileMail;
	}
	public String getsCareertasu() {
		return sCareertasu;
	}
	public void setsCareertasu(String sCareertasu) {
		this.sCareertasu = sCareertasu;
	}
	public String getsMynavi() {
		return sMynavi;
	}
	public void setsMynavi(String sMynavi) {
		this.sMynavi = sMynavi;
	}
	public String getsRikunavi() {
		return sRikunavi;
	}
	public void setsRikunavi(String sRikunavi) {
		this.sRikunavi = sRikunavi;
	}
	public String getsOther() {
		return sOther;
	}
	public void setsOther(String sOther) {
		this.sOther = sOther;
	}
	public String getAllEditFlag() {
		return allEditFlag;
	}
	public void setAllEditFlag(String allEditFlag) {
		this.allEditFlag = allEditFlag;
	}
}
