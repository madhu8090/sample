package com.UBQGenericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author Praneeth
 *
 */
public class SampleListner implements ITestListener {

	public void onTestStart(ITestResult result) {
		APKConfiguration.logger.info("Test Case Started " + result.getInstanceName());

	}

	public void onTestSuccess(ITestResult result) {
		APKConfiguration.logger.info("Test Case Success " + result.getInstanceName());
	}

	public void onTestFailure(ITestResult result) {

		WebDriverCommonLib.Capture(result, "FailedTCScreenshots");
		APKConfiguration.logger.info("Test Case Failed " + result.getInstanceName());
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
