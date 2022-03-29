package com.mavenproject.qa.mavenproject;

import static org.testng.Assert.fail;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test(dependsOnMethods = {"test2","test3"}, alwaysRun = true )
	public void test1() {
		System.out.println("Test-1 Executed:");
		System.out.println("----------------------------------------");
	}
	@Test
	public void test2() {
		System.out.println("Test-2 Executed:");
		System.out.println("----------------------------------------");
		fail("Test-2 Fails");
	}
	@Test
	public void test3() {
		System.out.println("Test-3 Executed:");
		System.out.println("----------------------------------------");
		fail("Test-3 Fails");	
	}
	@Test
	public void test4() {
		System.out.println("Test-4 Executed:");
		System.out.println("----------------------------------------");
	}
	@Test @Ignore
	void test5() {
		System.out.println("Test-5 Executed:");
		System.out.println("----------------------------------------");
	}




}
