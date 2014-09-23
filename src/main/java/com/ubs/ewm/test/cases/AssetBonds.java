package com.ubs.ewm.test.cases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ubs.ewm.test.base.Case;
import com.ubs.ewm.test.common.Navigation;

public class AssetBonds extends Case{

	@BeforeClass
	public void init() throws Exception {
		// TODO Auto-generated method stub
		Navigation.login();
		Overviews.gotoAssets();
	}
	
	@Test
	public void test(){}

}
