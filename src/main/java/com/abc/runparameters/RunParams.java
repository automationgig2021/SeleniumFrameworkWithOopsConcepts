package com.abc.runparameters;

import org.testng.Reporter;

public class RunParams {
	private static String browser;
	private static String userName;
	private static String password;
	private static String url;
	private static boolean isLocal;

	public static String getBrowser() {
		return browser;
	}

	public static void setBrowser(String browser) {
		RunParams.browser = browser;
	}

	public static String getUserName() {
		return userName;
	}

	public static void setUserName(String userName) {
		RunParams.userName = userName;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		RunParams.password = password;
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		RunParams.url = url;
	}
	
	public static boolean isLocal() {
		return isLocal;
	}

	public static void setLocal(boolean isLocal) {
		RunParams.isLocal = isLocal;
	}

	public static void setParams() {
		setBrowser(getParameterValue("browser"));
		setUserName(getParameterValue("userName"));
		setPassword(getParameterValue("password"));
		setUrl(getParameterValue("url"));
		setLocal(Boolean.parseBoolean(getParameterValue("isLocal")));
	}
	
	public static  String getParameterValue(String key) {
		return Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter(key);
	}

}
