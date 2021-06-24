package org.example.demo.model1;


public class SpecialEdisionCD extends CD implements MyInterface{
	
	private String effect;
	

	public SpecialEdisionCD() {
		super();
	
	}
	public SpecialEdisionCD(Integer cdId, String cdName, String effect) {
		super(cdId,cdName);
		this.effect=effect;
		
	}	

	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getCdId()+super.getCdName()+effect;
	}

}
