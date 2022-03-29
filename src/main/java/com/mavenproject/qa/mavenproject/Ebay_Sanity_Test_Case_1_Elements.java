package com.mavenproject.qa.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Sanity_Test_Case_1_Elements {
	
	WebDriver driver;
	
	@FindBy(id="gh-btn") public WebElement homesearch;
	
	public Ebay_Sanity_Test_Case_1_Elements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
