package com.rdiaz.training.jenkins;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleSeleniumTest {

	WebDriver driver;

	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "bin/chromedriver_linux64/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setBinary("/usr/bin/google-chrome-stable");
        chromeOptions.addArguments(Arrays.asList(
                "--headless",
                "--disable-dev-shm-usage",
                "--window-size=1920,1040",
                "--no-sandbox",
                "--disable-gpu",
                "--allow-running-insecure-content"
        ));
		driver = new ChromeDriver(chromeOptions);
	}

	@Test
	public void validateGoogleId() throws Exception {
		System.out.println("Opening Browser");
		driver.get("https://www.google.com");
		this.bypassCaptcha();

		System.out.println("Clicking Gmail Link");
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();

		this.bypassCaptcha();
		System.out.println("Entering username");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("rolandoworks@gmail.com");

		this.bypassCaptcha();
		System.out.println("Clicking Next button");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();

		this.bypassCaptcha();
		boolean textFound = driver.getPageSource().contains("This browser or app may not be secure");
		AssertJUnit.assertTrue(textFound);
	}

	private void bypassCaptcha() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
