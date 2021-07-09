package model;

public class SFeedback {

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

	//Feedbackフィールド------------------------------
	private int fId;	//フィードバックID
	//int sId; ←Studentの外部キー（コメント）
	private String fCategory;	//どのフィードバックか
	private String fName;	//人事の名前
	private String fContent;	//フィードバック内容


	//以下セッターゲッター-------------------------------

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
	public String getallEditFlag() {
		return allEditFlag;
	}
	public void setallEditFlag(String allEditFlag) {
		this.allEditFlag = allEditFlag;
	}
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getfCategory() {
		return fCategory;
	}
	public void setfCategory(String fCategory) {
		this.fCategory = fCategory;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfContent() {
		return fContent;
	}
	public void setfContent(String fContent) {
		this.fContent = fContent;
	}


}
