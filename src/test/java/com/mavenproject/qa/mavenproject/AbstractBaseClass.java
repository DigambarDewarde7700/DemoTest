package com.mavenproject.qa.mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.mavenproject.lib.AppLib;

public class AbstractBaseClass {
	
	 WebDriver driver;
	 private AppLib app;
	
	
	@Parameters({"browser","driverexe"})
	@BeforeMethod(alwaysRun=true)
	
	public void setup(@Optional("Chrome") String browser, @Optional("D:\\Eclipse\\ChromeDrivers\\chromedriver.exe") String exe) throws InterruptedException {
		
		if(browser.equals("Chrome")) {		
			System.setProperty("webdriver.chrome.driver", exe);
			driver = new ChromeDriver();
		}else if (browser.equals("Firfox"))
		{
			System.setProperty("webdriver.gecho.driver", exe);
			driver = new ChromeDriver();	
		}
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
//"D:\\Eclipse\\GechoDrivers\\gechodriver.exe"		
//		app1().Flow1().navigatetourl("https://www.ebay.com/");
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		

		
		app = new AppLib(driver);
		
	}
	
	@AfterMethod(alwaysRun=true)
	
	public void systemclose() {
		driver.close();
	}
	
	
	public AppLib app1() {
		return app;
	}

}
