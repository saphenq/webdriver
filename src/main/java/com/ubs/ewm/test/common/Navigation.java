package com.ubs.ewm.test.common;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;

import com.ubs.ewm.test.base.WebDriverBase;
import com.ubs.ewm.test.entity.CsvRecordEntity;

public class Navigation extends WebDriverBase {
	private static final String CSV_PATH_LOGIN = "data/login/login.csv";
	private static CsvRecordEntity csvRecordEntity = null;

	public static void login() throws Exception {
//		csvRecordEntity = new CsvRecordEntity(CSV_PATH_LOGIN);
//		csvRecordEntity.setKey("input_userName");
//		WebElement webElement = WebDriverCommon.waitElementBycssSelector(wait, csvRecordEntity.getCssSelector());
//		webElement.sendKeys(bundle.getString("app_user"));
//
//		csvRecordEntity.setKey("button_signIn");
//		WebDriverCommon.waitElementBycssSelector(wait, csvRecordEntity.getCssSelector()).click();
//
//		if (!RobotCommons.isAuthorized)
//			RobotCommons.authorization();
		
		WebElement webElementLoginText = WebDriverCommon.waitElementById(wait, "LoginText");
		webElementLoginText.click();
		
		WebElement webElementMdcUserName = WebDriverCommon.waitElementById(wait, "MdcUserName");
		webElementMdcUserName.sendKeys(bundle.getString("app_user"));
		
		WebElement webElementMdcPassword = WebDriverCommon.waitElementById(wait, "MdcPassword");
		webElementMdcPassword.sendKeys(bundle.getString("app_pwd"));
		
		WebElement webElementLoginImageButton = WebDriverCommon.waitElementById(wait, "LoginImageButton");
		webElementLoginImageButton.click();
		
	}
	
	public static void go2(CsvRecordEntity csvRecordEntity, String key){
		csvRecordEntity.setKey(key);
		WebDriverCommon.waitElementBycssSelector(wait, csvRecordEntity.getCssSelector()).click();
	}
	
	public static void go2(CsvRecordEntity csvRecordEntity, String key, String text){
		csvRecordEntity.setKey(key);
		List<WebElement>  list = WebDriverCommon.waitElementsBycssSelector(wait, csvRecordEntity.getCssSelector());
		
		for(WebElement webElement : list){
			if(StringUtils.equals(webElement.getText(), text))
					webElement.click();
		}
	}

}
