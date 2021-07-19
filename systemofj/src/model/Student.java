package model;

public class Student {

	private int sId;
	public Student(int sId, String sName, String sKana, String sContexts, String sUnivercity, String sFaculty,
			String sDepartment, String sAddress, String sPcMail, String sMobileMail, String sCareertasu, String sMynavi,
			String sRikunavi, String sOther) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sKana = sKana;
		this.sContexts = sContexts;
		this.sUnivercity = sUnivercity;
		this.sFaculty = sFaculty;
		this.sDepartment = sDepartment;
		this.sAddress = sAddress;
		this.sPcMail = sPcMail;
		this.sMobileMail = sMobileMail;
		this.sCareertasu = sCareertasu;
		this.sMynavi = sMynavi;
		this.sRikunavi = sRikunavi;
		this.sOther = sOther;
	}
	private String sName;
	private String sKana;
	private String sContexts;
	private String sUnivercity;
	private String sFaculty;
	private String sDepartment;
	private String sAddress;
	private String sPcMail;
	private String sMobileMail;
	private String sCareertasu;
	private String sMynavi;
	private String sRikunavi;
	private String sOther;
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
	public String getsPcMail() {
		return sPcMail;
	}
	public void setsPcMail(String sPcMail) {
		this.sPcMail = sPcMail;
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
}

