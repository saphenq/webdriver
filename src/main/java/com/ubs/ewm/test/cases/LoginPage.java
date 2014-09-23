package com.ubs.ewm.test.cases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ubs.ewm.test.base.Case;
import com.ubs.ewm.test.common.Assertion;
import com.ubs.ewm.test.common.RobotCommons;
import com.ubs.ewm.test.common.WebDriverCommon;
import com.ubs.ewm.test.entity.CsvRecordEntity;

public class LoginPage extends Case {
	private static final String CSV_PATH = "data/login/login.csv";
	private static CsvRecordEntity csvRecordEntity = null;

	static {
		csvRecordEntity = new CsvRecordEntity(CSV_PATH);
	}

	
	@BeforeClass
	public void init() throws Exception {
	}

	@Test(priority = -3)
	public void testLogin_input_userName() {
		Assertion.doAssertByAttribute(csvRecordEntity, "input_userName");
	}

	@Test(priority = -3)
	public void testLogin_img_background() {

		Assertion.doAssertByAttribute(csvRecordEntity, "img_background",true);
	}

	@Test(priority = 4)
	public void testLogin_ErrorMessageWhileNoUsernameOnClickSignIn() throws Exception {
		// click sign in button while no user name entering
		csvRecordEntity.setKey("button_signIn");
		WebDriverCommon.waitElementBycssSelector(wait, csvRecordEntity.getCssSelector()).click();

		// the first login, should do authorization
		RobotCommons.authorization();

		Assertion.doAssertByTextWithWaiting(csvRecordEntity, "span_text");
	}

}
