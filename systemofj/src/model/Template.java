package model;

public class Template {

	//フィールド
	private int tId;
	private String tTitle;
	private String tContent;
	private String tCategory;


	//setter・getter
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettTitle() {
		return tTitle;
	}
	public void settTitle(String tTitle) {
		this.tTitle = tTitle;
	}
	public String gettContent() {
		return tContent;
	}
	public void settContent(String tContent) {
		this.tContent = tContent;
	}
	public String gettCategory() {
		return tCategory;
	}
	public void settCategory(String tCategory) {
		this.tCategory = tCategory;
	}

}
