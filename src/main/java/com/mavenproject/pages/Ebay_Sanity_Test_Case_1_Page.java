package com.mavenproject.pages;

import org.openqa.selenium.WebDriver;

import com.mavenproject.qa.mavenproject.Ebay_Sanity_Test_Case_1_Elements;



public class Ebay_Sanity_Test_Case_1_Page {
	
	WebDriver driver;
	Ebay_Sanity_Test_Case_1_Elements ebayhomepageelements;
	
	public Ebay_Sanity_Test_Case_1_Page(WebDriver driver) {
		this.driver=driver;

		ebayhomepageelements = new Ebay_Sanity_Test_Case_1_Elements(driver);
		
	}
	
	/**
	 * isEnabled Button
	 */
	
	public boolean issearchEnabled() {		
		return ebayhomepageelements.homesearch.isEnabled();	
	}

}
