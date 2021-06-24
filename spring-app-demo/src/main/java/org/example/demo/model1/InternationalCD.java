package org.example.demo.model1;

public class InternationalCD extends CD implements MyInterface{
	
	private String language;
	
	
	public InternationalCD() {
		super();
	}
	
	
	public InternationalCD(Integer cdId, String cdName, String language) {
		super(cdId, cdName);
		this.language=language;
		
	}


	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getCdId()+super.getCdName()+language;
	}

}
