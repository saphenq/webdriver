package com.moodys.atom.base;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public abstract class WebDriverBase extends Base {
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	public static WebElement webElement = null;

	@BeforeSuite
	public void beforeSuite() {
		super.beforeSuite();

		initDriver();

	}
	
	private void initDriver() {
		System.setProperty("webdriver.chrome.driver", bundle.getString("chrome_driver_path"));
		driver = new ChromeDriver();
		initWaitTimeout();
	}

	private void initWaitTimeout() {
		// set wait element present timeout using config.properties
		String waitTimeout = bundle.getString("waite_tiomeout");
		int waitTimeoutInteger = 0;
		if (bundle != null && StringUtils.isNotBlank(waitTimeout))
			waitTimeoutInteger = Integer.parseInt(waitTimeout);
		wait = new WebDriverWait(driver, waitTimeoutInteger);
	}

}
