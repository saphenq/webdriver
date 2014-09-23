package com.ubs.ewm.test.cases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ubs.ewm.test.base.Case;
import com.ubs.ewm.test.common.Assertion;
import com.ubs.ewm.test.common.Navigation;
import com.ubs.ewm.test.common.WebDriverCommon;
import com.ubs.ewm.test.entity.CsvRecordEntity;
import com.ubs.ewm.test.utils.MyUtils;

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
	public void testOverview_ewmSecondHeaderTitle() throws InterruptedException {
		webElement = WebDriverCommon.waitElementById(wait, "MyAlertsText");
		Assert.assertEquals(webElement.getText(), "aa");
	}
//
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_portfolioListSelect() {
//		Assertion.doAssertByAttribute(csvRecordEntity, "portfolioListSelect", true);
//	}
//
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_ewmMainHeaderLeftTitle() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "ewmMainHeaderLeftTitle");
//	}
//
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_ewmMainIcon() {
//		Assertion.doAssertByCssValue(csvRecordEntity, "ewmMainIcon", true);
//	}
//
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_ewmMainHeaderDateStamp() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "ewmMainHeaderDateStamp");
//	}
//
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_ewmMainHeaderCurrentDate() {
//		String expect = MyUtils.getDate("dd MMM yyyy");
//		csvRecordEntity.setExpect(expect);
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "ewmMainHeaderCurrentDate");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_ewmSecondHeaderButtonUnselectedPerformance() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "ewmSecondHeaderButtonUnselectedPerformance");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_ewmSecondHeaderButtonUnselectedList() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "ewmSecondHeaderButtonUnselectedList");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_ewmSecondHeaderButtonSelected() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "ewmSecondHeaderButtonSelected");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_ewmSecondHeaderPerformancePeriod() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "ewmSecondHeaderPerformancePeriod");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_portfolioTitle() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "portfolioTitle");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_portfolioGrossAUM() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "portfolioGrossAUM");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_portfolioYTD() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "portfolioYTD");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_accordionGroupHeadingText() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "accordionGroupHeadingText");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_sidebarAssetsMessage() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "sidebarAssetsMessage");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_sidebarAssetsColumnLabel_sidebarAssetsVolumeColumn() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "sidebarAssetsColumnLabel_sidebarAssetsVolumeColumn");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_sidebarAssetsColumnLabel_sidebarAssetsTypeColumn() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "sidebarAssetsColumnLabel_sidebarAssetsTypeColumn");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_sidebarAssetsColumnLabel_sidebarAssetsYTDColumn() {
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "sidebarAssetsColumnLabel_sidebarAssetsYTDColumn");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_accordionGroupHeading_accordionGroupHeadingClosed_Analysis_Spotlight() {
//		Assertion.doAssertByText4Elements(csvRecordEntity, "accordionGroupHeading_accordionGroupHeadingClosed_Analysis_Spotlight");
//	}
//	
//	@Test(priority = DEFAULT_PRIORITY)
//	public void testOverview_ewmFooterMenuIcon() {
//		Assertion.doAssertByAttribute(csvRecordEntity, "ewmFooterMenuIcon",true);
//	}
	
	/*
	 * Priority = 0 cases, for tab testing
	 */
	
	/* Winners */
	 
//	@Test(priority = PRIORITY_0)
//	public void testOverview_accordionGroupHeading_accordionGroupHeadingClosed_Winners() throws InterruptedException {
//		tapWinners();
//		Assertion.doAssertByText4Elements(csvRecordEntity, "accordionGroupHeading_accordionGroupHeadingClosed_Winners");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = PRIORITY_0)
//	public void testOverview_winners_discription() {
//		tapWinners();
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "winners_discription");
//	}
//	
//	@Test(priority = PRIORITY_0)
//	public void testOverview_winners_value() {
//		tapWinners();
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "winners_value");
//	}
//	
//	@Test(priority = PRIORITY_0)
//	public void testOverview_winners_chg() {
//		tapWinners();
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "winners_chg");
//	}
//	
//	/* Losers */
//	
//	@Test(priority = PRIORITY_0)
//	public void testOverview_accordionGroupHeading_accordionGroupHeadingClosed_Losers() throws InterruptedException {
//		tapLosers();
//		Assertion.doAssertByText4Elements(csvRecordEntity, "accordionGroupHeading_accordionGroupHeadingClosed_Losers");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = PRIORITY_0)
//	public void testOverview_Losers_discription() {
//		tapLosers();
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "Losers_discription");
//	}
//	
//	@Test(priority = PRIORITY_0)
//	public void testOverview_Losers_value() {
//		tapLosers();
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "Losers_value");
//	}
//	
//	@Test(priority = PRIORITY_0)
//	public void testOverview_Losers_chg() {
//		tapLosers();
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "Losers_chg");
//	}
//	
//	/* Top Positions */
//	
//	@Test(priority = PRIORITY_0)
//	public void testOverview_accordionGroupHeading_accordionGroupHeadingClosed_Top_Positions() throws InterruptedException {
//		tapTopPositions();
//		Assertion.doAssertByText4Elements(csvRecordEntity, "accordionGroupHeading_accordionGroupHeadingClosed_Top_Positions");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = PRIORITY_0)
//	public void testOverview_Top_Positions_discription() {
//		tapTopPositions();
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "Top_Positions_discription");
//	}
//	
//	@Test(priority = PRIORITY_0)
//	public void testOverview_Top_Positions_value() {
//		tapTopPositions();
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "Top_Positions_value");
//	}
//	
//	@Test(priority = PRIORITY_0)
//	public void testOverview_Top_Positions_chg() {
//		tapTopPositions();
//		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "Top_Positions_chg");
//	}
//	
//	/*
//	 * Priority = 3 cases, for navigation testing
//	 */
//
//	@Test(priority = PRIORITY_3)
//	public void testOverview_Navigation_Asset() throws InterruptedException {
//		gotoAssets();
//		Assertion.doAssertElementPresent(csvRecordEntity,"ewmMainIcon_overview");
//		Assertion.doAssertElementPresent(csvRecordEntity,"ewmMainIcon_assets_selected");
//		Thread.sleep(1000);
//	}
//
//	/* Tab start */
//	
//	public static void tapWinners() {
//		Navigation.go2(csvRecordEntity,"accordionGroupHeading_accordionGroupHeadingClosed_Winners", "Winners");
//	}
//	public static void tapLosers() {
//		Navigation.go2(csvRecordEntity,"accordionGroupHeading_accordionGroupHeadingClosed_Losers", "Losers");
//	}
//	public static void tapTopPositions() {
//		Navigation.go2(csvRecordEntity,"accordionGroupHeading_accordionGroupHeadingClosed_Top_Positions", "Top Positions");
//	}
//	
	/* navigation start */

	public static void gotoAssets() {
		Navigation.go2(csvRecordEntity,"ewmMainIcon_assets");
	}
	
	public static void gotoCurrency() {
		Navigation.go2(csvRecordEntity,"ewmMainIcon_currency");
	}
	
	public static void gotoRegional() {
		Navigation.go2(csvRecordEntity,"ewmMainIcon_regional");
	}

}
