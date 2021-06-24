package org.example.demo.model;

public class ShuttleCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	public ShuttleCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice cut shots";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
