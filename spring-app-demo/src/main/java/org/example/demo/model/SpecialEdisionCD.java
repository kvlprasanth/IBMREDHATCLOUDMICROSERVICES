package org.example.demo.model;

public class SpecialEdisionCD extends CD{
	
	private String CDId;
	private String cdName;
	private String specialEffect;
	
	

	public SpecialEdisionCD() {
		super();
	}
	



	public SpecialEdisionCD(String cDId, String cdName, String specialEffect) {
		super();
		CDId = cDId;
		this.cdName = cdName;
		this.specialEffect = specialEffect;
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




	public String getSpecialEffect() {
		return specialEffect;
	}




	public void setSpecialEffect(String specialEffect) {
		this.specialEffect = specialEffect;
	}




	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "CD ID" + CDId + " CD Name: " + cdName + " CD specialEffect: " + specialEffect;
	}
	
	

}
