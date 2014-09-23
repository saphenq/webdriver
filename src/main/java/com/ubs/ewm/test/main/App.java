package com.ubs.ewm.test.main;

import java.util.Arrays;

import org.testng.TestNG;

import com.ubs.ewm.test.base.Base;
import com.ubs.ewm.test.report.XsltReport;

public class App extends Base{

	public static void main(String[] args) {
		TestNG ng = new TestNG();
		ng.setTestSuites(Arrays.asList("./testng.xml"));
		ng.run();

		generateReport();
	}

	private static void generateReport() {
		XsltReport.transformXslt(bundle.getString("testng_results_xml_path"),
				bundle.getString("testngXslt_path"));
	}
}
