package com.ubs.ewm.test.listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.ubs.ewm.test.base.ScreenShotBase;

public class CustomListener extends TestListenerAdapter {

	@Override
	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		ScreenShotBase screenShotBase = new ScreenShotBase();
		screenShotBase.setClassName(tr.getTestClass().getRealClass().getSimpleName());
		screenShotBase.setMethodName(tr.getMethod().getMethodName());
		screenShotBase.captureScreen();
	}

}
