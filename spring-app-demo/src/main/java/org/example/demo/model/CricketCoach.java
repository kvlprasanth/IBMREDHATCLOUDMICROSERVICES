package org.example.demo.model;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	/*
	 * public FortuneService getFortuneService() { return fortuneService;
	 */
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice batting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
