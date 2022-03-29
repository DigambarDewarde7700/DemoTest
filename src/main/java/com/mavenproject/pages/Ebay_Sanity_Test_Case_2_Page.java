package com.mavenproject.pages;

import org.openqa.selenium.WebDriver;

import com.mavenproject.qa.mavenproject.Ebay_Sanity_Test_Case_2_Elements;



public class Ebay_Sanity_Test_Case_2_Page {
	
	WebDriver driver;
	
	Ebay_Sanity_Test_Case_2_Elements searchelementsinsanity;
	
	public Ebay_Sanity_Test_Case_2_Page(WebDriver driver) {
		this.driver=driver;

		searchelementsinsanity = new Ebay_Sanity_Test_Case_2_Elements(driver);
		
	}
	
	/**
	 * isEnabled Button
	 */
	
	public boolean isSearchEnabled() {
		
		return searchelementsinsanity.ebaysanityhome1.isEnabled();	
		
	}

}
