package model;

public class User {

	private String uId;
	private String uName;
	private String uFirst;
	private String uPw;
	private int aFlag;
	private int yFlag;


	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuFirst() {
		return uFirst;
	}
	public void setuFirst(String uFirst) {
		this.uFirst = uFirst;
	}
	public String getuPw() {
		return uPw;
	}
	public void setuPw(String uPw) {
		this.uPw = uPw;
	}
	public int getaFlag() {
		return aFlag;
	}
	public void setaFlag(int aFlag) {
		this.aFlag = aFlag;
	}
	public int getyFlag() {
		return yFlag;
	}
	public void setyFlag(int yFlag) {
		this.yFlag = yFlag;
	}

}
