package com.ubs.ewm.test.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public abstract class Case extends ScreenShotBase {
	public static final int DEFAULT_PRIORITY = -3;
	public static final int PRIORITY_0 = 0;
	public static final int PRIORITY_3 = 3;
	
	@BeforeClass
	public void mainPage() {

		driver.get(bundle.getString("app_url"));
		driver.manage().window().maximize();
		
	}

	public abstract void init() throws Exception;

	@AfterSuite
	public void afterClass() {
		driver.quit();
	}
}
