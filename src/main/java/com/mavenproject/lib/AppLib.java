package com.mavenproject.lib;

import org.openqa.selenium.WebDriver;

public class AppLib {
	
	private WebDriver driver;
	
	private PageLib page;
	
	private Flowlib flow;
	
	
	
	
	public AppLib (WebDriver driver) {
		this.driver = driver;
		
		page = new PageLib(this.driver);
		
		flow = new Flowlib(this.driver);
		
	}
	
	public PageLib pages() {
		return page;
	}
	
	

	public Flowlib Flow1() {
		// TODO Auto-generated method stub
		return flow;
	}
	
	

}
