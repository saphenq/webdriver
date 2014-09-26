package com.moodys.atom.base;

import java.util.ResourceBundle;

import com.moodys.atom.utils.MyUtils;

public class Base {
	public static ResourceBundle bundle = null;
	public static String outputDir="";
	

	public void beforeSuite() {
		bundle = ConfigLoader.loadConfig();
		
		createReportDir();
	}
	
	private void createReportDir(){
		String date = MyUtils.getDate("yyyyMMdd_HHmmss");
		StringBuilder sb = new StringBuilder();
		sb.append(System.getProperty("user.dir"));
		sb.append(bundle.getString("testNgXslt_outputDir"));
		sb.append(System.getProperty("file.separator"));
		sb.append("Result_");
		sb.append(date);
		outputDir =  sb.toString();
	}
	
}
