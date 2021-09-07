package com.abc.testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Dipak
 *
 */
public class LoginPage extends BasePage{
	
	//Page Locators
	private By emailId= By.id("username");
	private By password= By.id("password");
	private By loginButton= By.id("loginBtn");
	private By header= By.id("//i18n-string[@data-key ='login.signupLink.text']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//create Getters

	public WebElement getEmailId() {
		return getElement(emailId);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getLoginButton() {
		return getElement(loginButton);
	}

	public WebElement getHeader() {
		return getElement(header);
	}
	
	public String getLoginPageTitle( ) {
		return getPageTitle();
	}
	
	public String getPageHeader( ) {
		return getLoginPageTitle();
	}
	
	public HomePage doLogin(String userName, String password) {
		getEmailId().sendKeys(userName);
		getPassword().sendKeys(password);
		getLoginButton().click();
		return getInstance(HomePage.class);
		
	}
	

}
