package model;

import java.sql.Date;


public class SIntern {

	//student

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
	private String alleditflag;	//一括編集フラグ

	//Intern

	private String iCategory;	//インターン種類
	private Date iDate;			//日付
	private String iMeeting;	//懇親会参加したか
	private String iSubmit;		//アンケート提出
	private String iAcceptance;//アンケート合否
	private String iDocument;	//資料送付
	private int iId;			//主キー
	private String iAttend;		//出欠
	private Date applyflag;		//インターン申し込みフラグ
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
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
	public String getsMobilemail() {
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
	public String getAlleditflag() {
		return alleditflag;
	}
	public void setAlleditflag(String alleditflag) {
		this.alleditflag = alleditflag;
	}
	public String getiCategory() {
		return iCategory;
	}
	public void setiCategory(String iCategory) {
		this.iCategory = iCategory;
	}
	public Date getiDate() {
		return iDate;
	}
	public void setiDate(Date iDate) {
		this.iDate = iDate;
	}
	public String getiMeeting() {
		return iMeeting;
	}
	public void setiMeeting(String iMeeting) {
		this.iMeeting = iMeeting;
	}
	public String getiSubmit() {
		return iSubmit;
	}
	public void setiSubmit(String iSubmit) {
		this.iSubmit = iSubmit;
	}
	public String getiAcceptance() {
		return iAcceptance;
	}
	public void setiAcceptance(String iAcceptance) {
		this.iAcceptance = iAcceptance;
	}
	public String getiDocument() {
		return iDocument;
	}
	public void setiDocument(String iDocument) {
		this.iDocument = iDocument;
	}
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public String getiAttend() {
		return iAttend;
	}
	public void setiAttend(String iAttend) {
		this.iAttend = iAttend;
	}
	public Date getApplyflag() {
		return applyflag;
	}
	public void setApplyflag(Date applyflag) {
		this.applyflag = applyflag;
	}

//ゲッター・セッター


}




