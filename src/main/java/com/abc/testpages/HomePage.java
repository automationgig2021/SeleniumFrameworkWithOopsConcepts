package com.abc.testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
	private By pageHeader = By.xpath("//h1[text()='User Guide']");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// getters
	
	public WebElement getPageHeader() {
		return getElement(pageHeader);
	}
	
	public String getHomePageTitle() {
		return getPageTitle();
	}
	
	public String getHomePageHeader() {
		 return getPageHeader(pageHeader);
	}
	
	
	

}
