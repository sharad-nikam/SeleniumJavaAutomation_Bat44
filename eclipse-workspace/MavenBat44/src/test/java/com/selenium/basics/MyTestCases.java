package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

@Listeners(MyListener.class)
public class MyTestCases {
	//WebDriver driver = new FirefoxDriver();
	WebDriver driver = new ChromeDriver();
	@Test(priority = 3)
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}

	@Test(priority = 2) // Failed Test
	public void OpenBrowser() {

		driver.get("https://www.google.com");
		String expectedTitle = "Google";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
	}

	private int i = 1;

	@Test(successPercentage = 60, invocationCount = 5, priority = 1) // Failing Within Success
	public void AccountTest() {
		 i++;
		  System.out.println("Test Failed But Within Success Percentage Test Method, invocation count: " + i);
		  if (i == 1 || i == 2) {
		   System.out.println("AccountTest Failed");
		   Assert.assertEquals(i, 6);
		  }
	}

	@Test(priority = 4) // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}

	@Test(priority = 5)
	public void test11() {
		Assert.assertTrue(false);
	}
;
	@Test(priority = 6)
	public void test12() {
		Assert.assertTrue(false);
	}

	@Test(priority = 7,dependsOnMethods = { "test11" })
	public void test13() {
		Assert.assertTrue(true);
	}
}