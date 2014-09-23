package com.ubs.ewm.test.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ubs.ewm.test.exception.CustomizedTimeoutException;

public class WebDriverCommon{
	
	public static WebElement waitElementById(WebDriverWait wait, final String id){
		WebElement webElement = wait.until(new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver d) {
				return d.findElement(By.id(id));
			}
		});
		return webElement;
		}

	public static WebElement waitElementBycssSelector(WebDriverWait wait, final String cssSelector){
	WebElement webElement = wait.until(new ExpectedCondition<WebElement>() {
		public WebElement apply(WebDriver d) {
			return d.findElement(By.cssSelector(cssSelector));
		}
	});
	return webElement;
	}
	
	public static List<WebElement> waitElementsBycssSelector(WebDriverWait wait, final String cssSelector){
		List<WebElement> webElements = wait.until(new ExpectedCondition<List<WebElement>>() {
			public List<WebElement> apply(WebDriver d) {
				return d.findElements(By.cssSelector(cssSelector));
			}
		});
		return webElements;
	}
	
	public static void waitTextPresent(WebDriverWait wait, WebElement webElement, final String text){
		try {
			wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));
		} catch (CustomizedTimeoutException e) {
			throw new CustomizedTimeoutException("Time out when waiting "+text+" present");
		}
		
	}
	
	public static boolean isElementPresent(WebDriverWait wait, final String cssSelector){
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssSelector)));
			return true;
		} catch (CustomizedTimeoutException e) {
			return false;
		}
		
	}
	
	public static boolean isElementsPresent(WebDriverWait wait, final String cssSelector, final int amount){
		try {
			List<WebElement>  list =wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(cssSelector)));
			
			return list.size()==amount?true:false;
		} catch (CustomizedTimeoutException e) {
			return false;
		}
		
	}
}
