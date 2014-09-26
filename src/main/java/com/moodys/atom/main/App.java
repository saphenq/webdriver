package com.moodys.atom.main;

import java.util.Arrays;

import org.testng.TestNG;

import com.moodys.atom.base.Base;
import com.moodys.atom.report.XsltReport;

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
