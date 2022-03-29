package com.mavenproject.qa.mavenproject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Ebay_Sanity_Test_Case_1 extends AbstractBaseClass{
	
		@Test(groups = {"P2","P1"})
		public void empty_Search_test() throws InterruptedException {
			
			String expectedURL = "https://www.ebay.com/";
			
			
			
			String expectedTITLE = "Electronics, Cars, Fashion, Collectibles & More | eBay";
				
			Assert.assertTrue(app1().pages().h1().issearchEnabled(), "Verfiy Search Button is Ebabled");
			

			
			String newURL = app1().Flow1().getCurrentPageURL();
			

			
			String newTITLE = app1().Flow1().getCurrentPageTitle();
			
			System.out.println(newURL);
			
			System.out.println(newTITLE);
			
			Assert.assertEquals(newURL, expectedURL,"Verify URL of the New Page" );
			
			Assert.assertEquals(newTITLE, expectedTITLE,"Verify TITLE of the New Page" );
			
			
			
		}

		@Test(groups = {"P0"})
		public void empty_Search_test_softassert() throws InterruptedException {
			
			SoftAssert sa = new SoftAssert();
			
			String expectedURL1 = "https://www.ebay.com/sch/ebayadvsearch";
			
			String expectedTITLE1 = "Electronics, Cars, Fashion, Collectibles & More | eBay Test1";
				
			sa.assertTrue(app1().pages().h1().issearchEnabled(), "Verfiy Search Button is Ebabled");
			

			
			String newURL = app1().Flow1().getCurrentPageURL();
			String newTITLE = app1().Flow1().getCurrentPageTitle();
			
			System.out.println(newURL);
			
			System.out.println(newTITLE);
			
			sa.assertEquals(newURL, expectedURL1,"Verify URL of the New Page" );
			
			sa.assertEquals(newTITLE, expectedTITLE1,"Verify TITLE of the New Page" );
			
			
			
			sa.assertAll();
		}
		
		@Test(groups = {"P3","P1"})
		public void empty_Search_test2() throws InterruptedException {
			
			String expectedURL2 = "https://www.ebay.com/";
			
			String expectedTITLE2 = "Electronics, Cars, Fashion, Collectibles & More | eBay";
					
			Assert.assertTrue(app1().pages().h1().issearchEnabled(), "Verfiy Search Button is Ebabled");
			

			String newURL = app1().Flow1().getCurrentPageURL();
			String newTITLE = app1().Flow1().getCurrentPageTitle();
			
			System.out.println(newURL);
			
			System.out.println(newTITLE);
			
			Assert.assertEquals(newURL, expectedURL2,"Verify URL of the New Page" );
			
			Assert.assertEquals(newTITLE, expectedTITLE2,"Verify TITLE of the New Page" );
			
			
			
		}
		

}
