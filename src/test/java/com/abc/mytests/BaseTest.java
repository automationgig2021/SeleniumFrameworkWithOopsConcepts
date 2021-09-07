package com.abc.mytests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.abc.runparameters.RunParams;
import com.abc.testpages.BasePage;
import com.abc.testpages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	public Page page;
	public SoftAssert softAssert;

	@BeforeSuite
	public void setUP() {
		System.out.println("============ BEFORE SUITE ===========");
		RunParams.setParams();
	}

	@BeforeMethod
	public void setUpTest() {
		softAssert = new SoftAssert();
//		RunParams.setParams();
		String browser = RunParams.isLocal() ? RunParams.getBrowser() : System.getProperty("browser");
		initializeWebDriver(browser);
		page = new BasePage(driver);
		driver.get(RunParams.getUrl());
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
	}

	public void initializeWebDriver(String browser) {
		switch(browser.toLowerCase()) {
		case "chrome" : 
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			break;

		case "firefox" : 
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			break;

		default:
			System.out.println("Please provide values as (Chrome/Firefox)...Current Browser:: " +browser);
			break;
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
