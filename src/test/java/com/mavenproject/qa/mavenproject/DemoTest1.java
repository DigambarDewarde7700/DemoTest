package com.mavenproject.qa.mavenproject;

import org.testng.annotations.Test;

public class DemoTest1 {
	
	@Test
	public void test1() {
		System.out.println("Test-1 Executed:");
		System.out.println("----------------------------------------");
	}
	@Test
	public void test2() {
		System.out.println("Test-2 Executed:");
		System.out.println("----------------------------------------");
		
	}
	@Test
	public void test3() {
		System.out.println("Test-3 Executed:");
		System.out.println("----------------------------------------");
		
	}
	
	@Test
	public void test4() {
		System.out.println("Test-4 Executed:");
		System.out.println("----------------------------------------");
	}
	
	@Test (dataProvider = "dataProvider1" , dataProviderClass = DataProviderTest.class)
	public void test5(String p1, String p2, String p3) {
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("----------------------------------------");
	}

}
