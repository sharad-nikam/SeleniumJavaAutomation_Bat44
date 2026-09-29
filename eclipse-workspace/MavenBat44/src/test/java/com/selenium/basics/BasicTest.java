package com.selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;


public class BasicTest {
	WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" I am in before method");
	}
	
	@Test(groups = {"regression","sanity"})
	public void verifyTitle() {
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");

		String actTitle = driver.getTitle();
		System.out.println("Actual Title :" + actTitle);

		Assert.assertEquals(actTitle, "Google");
		
		System.out.println(" My Title Test passed");

	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println(" I am in After method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println(" I am in Before Class2 ");

	}

	@AfterClass
	public void afterClass() {
		System.out.println(" I am in After Class2 ");

	}
}
