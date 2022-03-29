package com.mavenproject.lib;

import org.openqa.selenium.WebDriver;

import com.mavenproject.pages.Ebay_Sanity_Test_Case_1_Page;
import com.mavenproject.pages.Ebay_Sanity_Test_Case_2_Page;

public class PageLib {
	
	private WebDriver driver;
	private Ebay_Sanity_Test_Case_1_Page ebayhomepageelements; 
	private Ebay_Sanity_Test_Case_2_Page searchelementsinsanity;
	
	public PageLib(WebDriver driver) {
		
		this.driver = driver;
		ebayhomepageelements = new Ebay_Sanity_Test_Case_1_Page(this.driver);
		searchelementsinsanity = new Ebay_Sanity_Test_Case_2_Page(this.driver);
		
	}
	
	public Ebay_Sanity_Test_Case_1_Page h1(){
		return ebayhomepageelements;
	}
	
	public Ebay_Sanity_Test_Case_2_Page h2(){
		return searchelementsinsanity;
	}

}
