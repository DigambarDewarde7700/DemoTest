package com.mavenproject.lib;

import org.openqa.selenium.WebDriver;

public class Flowlib {
	
	
	private WebDriver driver;

	
	
	public Flowlib(WebDriver driver) {
		this.driver= driver;
	}


	public void navigatetourl(String url) {
		this.driver.get(url);
	}
	
	public String getCurrentPageURL() {
		return this.driver.getCurrentUrl();
	}
	
	public String getCurrentPageTitle() {
		return this.driver.getTitle();
	}

}
