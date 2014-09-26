package com.moodys.atom.common;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.moodys.atom.base.WebDriverBase;
import com.moodys.atom.entity.CsvRecordEntity;

public class Assertion extends WebDriverBase {

	public static void doAssertByTextWithWaiting(CsvRecordEntity csvRecordEntity, final String key) {
		csvRecordEntity.setKey(key);

		webElement = WebDriverCommon.waitElementBycssSelector(wait, csvRecordEntity.getCssSelector());
		// wait for text present, or it will be ""
		WebDriverCommon.waitTextPresent(wait, webElement, csvRecordEntity.getExpect());

		String data = webElement.getText();
		String dataExpect = csvRecordEntity.getExpect();
		Assert.assertEquals(data, dataExpect);
	}

	public static void doAssertByText4Elements(CsvRecordEntity csvRecordEntity, final String key) {
		csvRecordEntity.setKey(key);
		
		List<WebElement> webElements = WebDriverCommon.waitElementsBycssSelector(wait, csvRecordEntity.getCssSelector());
		
		String dataExpect = csvRecordEntity.getExpect();
		
		StringBuilder sb = new StringBuilder();
		for(WebElement webElement:webElements){
			sb.append(webElement.getText());
			sb.append(",");
		}
		
		webElement = webElements.get(0);
		Assert.assertEquals(sb.toString(), dataExpect+",");
	}

	public static void doAssertByAttribute(CsvRecordEntity csvRecordEntity, final String key, final boolean useContain) {
		csvRecordEntity.setKey(key);

		webElement = WebDriverCommon.waitElementBycssSelector(wait, csvRecordEntity.getCssSelector());
		String data = webElement.getAttribute(csvRecordEntity.getAttribute());
		String dataExpect = csvRecordEntity.getExpect();

		if (useContain)
			Assert.assertTrue(data.contains(dataExpect));
		else {
			Assert.assertEquals(data, dataExpect);
		}
	}

	public static void doAssertByAttribute(CsvRecordEntity csvRecordEntity, final String key) {
		doAssertByAttribute(csvRecordEntity, key, false);
	}
	
	public static void doAssertById(CsvRecordEntity csvRecordEntity, final String key) {
		csvRecordEntity.setKey(key);

		webElement = WebDriverCommon.waitElementById(wait, csvRecordEntity.getId());
		String data = webElement.getText();
		String dataExpect = csvRecordEntity.getExpect();

			Assert.assertEquals(data, dataExpect);
	}

	public static void doAssertByCssValue(CsvRecordEntity csvRecordEntity, final String key, final boolean useContain) {
		csvRecordEntity.setKey(key);

		webElement = WebDriverCommon.waitElementBycssSelector(wait, csvRecordEntity.getCssSelector());

		String data = webElement.getCssValue(csvRecordEntity.getAttribute());
		String dataExpect = csvRecordEntity.getExpect();

		if (useContain)
			Assert.assertTrue(data.contains(dataExpect));
		else {
			Assert.assertEquals(data, dataExpect);
		}
	}

	public static void doAssertByCssValue(CsvRecordEntity csvRecordEntity, final String key) {

		doAssertByCssValue(csvRecordEntity, key, false);
	}
	
	public static void doAssertElementPresent(CsvRecordEntity csvRecordEntity, final String key){
		csvRecordEntity.setKey(key);

		boolean isElementPresent = WebDriverCommon.isElementPresent(wait, csvRecordEntity.getCssSelector());
		Assert.assertTrue(isElementPresent);
	}
	
	public static void doAssertElementsPresent(CsvRecordEntity csvRecordEntity, final String key, final int amount){
		csvRecordEntity.setKey(key);

		boolean isElementPresent = WebDriverCommon.isElementsPresent(wait, csvRecordEntity.getCssSelector(),amount);
		Assert.assertTrue(isElementPresent);
	}

	public static void doAssertByXpath(CsvRecordEntity csvRecordEntity, String key) {
		csvRecordEntity.setKey(key);

		webElement = WebDriverCommon.waitElementByXpath(wait, csvRecordEntity.getXpath());
		String data = webElement.getText();
		String dataExpect = csvRecordEntity.getExpect();

			Assert.assertEquals(data, dataExpect);
		
	}
}
