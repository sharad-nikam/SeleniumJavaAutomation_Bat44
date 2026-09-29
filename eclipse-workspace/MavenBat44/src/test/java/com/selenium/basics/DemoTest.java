package com.selenium.basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoTest {
	
	@Test(enabled = true, groups = {"abc"})
	public void af1() {
		System.out.println(" I am in Test af1() Method");
		
		Assert.assertTrue(true);
		

	}
	
	@Test(dependsOnMethods = {"s"},groups= {"abc1","abc"})
	public void af() {
		System.out.println(" I am in Test af() Method");

	}
	@Test(priority = 1234,dependsOnGroups = "abc")
	public void S() {
		System.out.println(" I am in Test S() Method");

	}

	@Test(priority = -40)
	public void s() {
		System.out.println(" I am in Test s() Method");
		Assert.assertTrue(false);

	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" I am in Before Method - will be execcuted before each Test method");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(" I am in After Method - will be execcuted after each Test method");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println(" I am in Before Class - will be executed Before each Class ");

	}

	@AfterClass
	public void afterClass() {
		System.out.println(" I am in After Class - will be execcuted After each Class ");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println(" I am in Before Test - will be execcuted Before any Test Journeys execution");

	}

	@AfterTest
	public void afterTest() {
		System.out.println(" I am in After Test - will be execcuted after All Test Journeys execution");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" I am in before suite - will be execcuted before suite execution");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(" I am in after suite - will be execcuted after suite execution");
	}

}
