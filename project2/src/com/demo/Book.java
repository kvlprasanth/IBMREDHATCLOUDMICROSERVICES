package com.demo;

public class Book {
	
	private String authorame;
	private double costprice;
	private double saleprice;
	private String title;
	private int pages;
	
	public Book() {
		super();
	}

	public Book(String authorame, double costprice, double saleprice, String title, int pages) {
		super();
		this.authorame = authorame;
		this.costprice = costprice;
		this.saleprice = saleprice;
		this.title = title;
		this.pages = pages;
	}

	public String getAuthorame() {
		return authorame;
	}

	public void setAuthorame(String authorame) {
		this.authorame = authorame;
	}

	public double getCostprice() {
		return costprice;
	}

	public void setCostprice(double costprice) {
		this.costprice = costprice;
	}

	public double getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public double netProfit()
	{
		return Math.round(this.saleprice - this.costprice);
	}
	public double getTax()
	{
		return netProfit()*0.05;
		
	}
	
	
	

}
