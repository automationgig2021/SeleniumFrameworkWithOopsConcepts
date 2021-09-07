package com.abc.mytests;

import org.testng.annotations.Test;

import com.abc.testpages.HomePage;
import com.abc.testpages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest( ) {
		String loginPageTitle = page.getInstance(LoginPage.class).getPageTitle();
		System.out.println("Page Title for Login Page is: " + loginPageTitle);
		softAssert.assertEquals(loginPageTitle,loginPageTitle);
		softAssert.assertAll();
	}
	
	@Test(priority=2, enabled=false)
	public void verifyLoginPageHeaderTest( ) {
		String loginPageHeader = page.getInstance(LoginPage.class).getPageHeader();
		System.out.println("Page Header for Login Page is: " + loginPageHeader);
		softAssert.assertEquals(loginPageHeader,loginPageHeader);
		softAssert.assertAll();
	}
	
	@Test(priority=3, enabled=false)
	public void verifyLoginTest( ) {
		HomePage homePage = page.getInstance(LoginPage.class).doLogin("dipakrane2@gmail.com", "Kirti@1992");
		String homePageHeader = homePage.getHomePageHeader();
		System.out.println("Home Page Header is: " + homePageHeader);
		softAssert.assertEquals(homePageHeader,homePageHeader);
		softAssert.assertAll();
	}

}
