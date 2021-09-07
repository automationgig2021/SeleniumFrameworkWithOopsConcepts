package com.abc.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.abc.runparameters.RunParams;

public class TestListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("================ Test Listener onTestStart :: "+result.getName()+" :: method ===========");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("================ Test Listener onTestSuccess :: "+result.getName()+" :: method ===========");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("================ Test Listener onTestFailure :: "+result.getName()+" :: method ===========");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("================ Test Listener onTestSkipped :: "+result.getName()+" :: method ===========");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("================ Test Listener onStart :: "+context.getName()+" :: method ===========");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("================ Test Listener onFinish :: "+ context.getName()+" :: method ===========");
	}

}
