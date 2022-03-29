package com.mavenproject.qa.mavenproject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ebay_Sanity_Test_Case_2 extends AbstractBaseClass{
	
	
	@Test(groups = {"P0"})
		public void empty_Search_test() throws InterruptedException {
			
			String expectedURL = "https://www.ebay.com/";
			
			String expectedTITLE = "Electronics, Cars, Fashion, Collectibles & More | eBay";
			
			
			Assert.assertTrue(app1().pages().h2().isSearchEnabled(), "Verfiy Search Button is Ebabled");
			

			String newURL = app1().Flow1().getCurrentPageURL();
			String newTITLE = app1().Flow1().getCurrentPageTitle();
			
			System.out.println(newURL);
			
			System.out.println(newTITLE);
			
			Assert.assertEquals(newURL, expectedURL,"Verify URL of the New Page" );
			
			Assert.assertEquals(newTITLE, expectedTITLE,"Verify TITLE of the New Page" );
			
			
			
		}

		@Test(groups = {"P3","P1"})
		public void empty_Search_test_softassert() throws InterruptedException {
			
			SoftAssert sa = new SoftAssert();
			
			String expectedURL1 = "https://www.ebay.com/";
			
			String expectedTITLE1 = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
			sa.assertTrue(app1().pages().h2().isSearchEnabled(), "Verfiy Search Button is Ebabled");
			

			String newURL = app1().Flow1().getCurrentPageURL();
			String newTITLE = app1().Flow1().getCurrentPageTitle();
			
			System.out.println(newURL);
			
			System.out.println(newTITLE);
			
			sa.assertEquals(newURL, expectedURL1,"Verify URL of the New Page" );
			
			sa.assertEquals(newTITLE, expectedTITLE1,"Verify TITLE of the New Page" );
			
			
			
		}
		

}
