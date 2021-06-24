package org.example.demo.model;

public class InternationalCD extends CD {
	
	private String CDId;
	private String cdName;
	private String language;
	
	

	public InternationalCD() {
		super();
	}
	



	public InternationalCD(String cDId, String cdName, String language) {
		super();
		CDId = cDId;
		this.cdName = cdName;
		this.language = language;
	}
	




	public String getCDId() {
		return CDId;
	}




	public void setCDId(String cDId) {
		CDId = cDId;
	}




	public String getCdName() {
		return cdName;
	}




	public void setCdName(String cdName) {
		this.cdName = cdName;
	}




	public String getLanguage() {
		return language;
	}




	public void setLanguage(String language) {
		this.language = language;
	}




	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "CD ID" + CDId + " CD Name: " + cdName + " CD Language: " + language;
	}

}
