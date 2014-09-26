package com.moodys.atom.cases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.moodys.atom.base.Case;
import com.moodys.atom.common.Assertion;
import com.moodys.atom.common.Navigation;
import com.moodys.atom.entity.CsvRecordEntity;

public class Overviews extends Case {
	private static final String CSV_PATH = "data/overview/overview.csv";
	private static CsvRecordEntity csvRecordEntity = null;

	static {
		csvRecordEntity = new CsvRecordEntity(CSV_PATH);
	}

	@BeforeClass
	public void init() throws Exception {
		Navigation.login();
	}

	/* Priority = -3 cases, for default UI testing*/
	
	@Test(priority = DEFAULT_PRIORITY)
	public void testMyAlertsText(){
		Assertion.doAssertById(csvRecordEntity, "MyAlertsText");
	}
	
	@Test(priority = DEFAULT_PRIORITY)
	public void testMyPortfoliosText(){
		Assertion.doAssertById(csvRecordEntity, "MyPortfoliosText");
	}
	
	@Test(priority = DEFAULT_PRIORITY)
	public void testMyEventsText(){
		Assertion.doAssertById(csvRecordEntity, "MyEventsText");
	}
	
	@Test(priority = DEFAULT_PRIORITY)
	public void testLogOutText(){
		Assertion.doAssertById(csvRecordEntity, "LogOutText");
	}
	
	@Test(priority = DEFAULT_PRIORITY, description="login -> My Portfolios")
	public void testheadertitleMyPortfolios(){
		gotoMyPortfolios();
		Assertion.doAssertByXpath(csvRecordEntity, "headertitleMyPortfolios");
	}
	
	
//	
	/* navigation start */

	public static void gotoMyPortfolios() {
		Navigation.go2ById(csvRecordEntity,"MyPortfoliosText");
	}
	
	
}
