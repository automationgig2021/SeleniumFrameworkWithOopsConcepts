package com.abc.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.abc.runparameters.RunParams;

public class SuiteListener implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("====================Test Suite Linstener :: " + suite.getName() +" ::Started ========================");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("====================Test Suite Linstener :: " + suite.getName() +" :: Finished========================");
	}



}
