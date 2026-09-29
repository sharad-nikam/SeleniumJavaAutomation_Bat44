package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println(" I am in selenium now");

		// ## Driver Exe setting in path
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\nikam\\OneDrive\\Desktop\\chromedriver.exe"); WebDriver driver =
		 * new ChromeDriver();
		 */
		// Selenium Manager

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/downloads/");

		String expTitle = "Downloads | Selenium1";

		String actTitle = driver.getTitle();

		System.out.println(actTitle);

		if (expTitle.equals(actTitle)) {
			System.out.println(" Test Passed - Title is correct");

		} else {
			System.out.println(" Test failed- Expected and actual title mismatched:" + actTitle);
		}

		// ## Timeout - Sync methods - Implicit, Explicit, Fluent Waits

		Thread.sleep(Duration.ofSeconds(5));
		driver.navigate().to("https://sites.google.com/chromium.org/driver/downloads");
		// driver.close();
		Thread.sleep(Duration.ofSeconds(5));

		driver.navigate().back();
		Thread.sleep(Duration.ofSeconds(5));
		driver.navigate().forward();
		Thread.sleep(Duration.ofSeconds(5));
		driver.navigate().refresh();

		Thread.sleep(Duration.ofSeconds(5));
		driver.navigate().back();

		/*
		 * // Webdriver Code WebDriverManager.chromedriver().setup(); WebDriver d = new
		 * ChromeDriver();
		 * 
		 * d.get("https://www.selenium.dev/");
		 */

		System.out.println(driver.getTitle());

		 driver.quit();

	}

}
