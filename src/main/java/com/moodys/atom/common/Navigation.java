package com.moodys.atom.common;

import org.openqa.selenium.WebElement;

import com.moodys.atom.base.WebDriverBase;
import com.moodys.atom.entity.CsvRecordEntity;

public class Navigation extends WebDriverBase {

	public static void login() throws Exception {
		
		getWebElementById("LoginText").click();
		
		getWebElementById("MdcUserName").sendKeys(bundle.getString("app_user"));
		
		getWebElementById("MdcPassword").sendKeys(bundle.getString("app_pwd"));
		
		getWebElementById("LoginImageButton").click();
		
	}
	
	public static WebElement getWebElementById(String id){
		return WebDriverCommon.waitElementById(wait, id);
	}
	
	public static void go2ById(CsvRecordEntity csvRecordEntity, String key){
		csvRecordEntity.setKey(key);
		WebDriverCommon.waitElementById(wait, csvRecordEntity.getId()).click();
	}

}
