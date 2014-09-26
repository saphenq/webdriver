package com.moodys.atom.entity;

import java.util.Map;

import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;

import com.moodys.atom.common.LoadCsvData;

public class CsvRecordEntity {

	private Map<String, CSVRecord> elements;
	private String key;
	private String expect;

	public CsvRecordEntity(String csvPath){
		elements = LoadCsvData.execute(csvPath);
	}

	public void setKey(String key) {
		this.key = getPrefix() + "_" + key;
	}

	public String getPrefix() {
		return LoadCsvData.getPrefix();
	}

	public String getTag() {
		return StringUtils.trim(elements.get(key).get("tag"));
	}
	
	public String getId() {
		return StringUtils.trim(elements.get(key).get("id"));
	}

	public String getClazz() {
		return StringUtils.trim(elements.get(key).get("class"));
	}
	
	public String getTag_1() {
		return StringUtils.trim(elements.get(key).get("tag_1"));
	}

	public String getClazz_1() {
		return StringUtils.trim(elements.get(key).get("class_1"));
	}

	public String getAttribute() {
		return StringUtils.trim(elements.get(key).get("attribute"));
	}

	public String getExpect() {
		String expectFromCsv = StringUtils.trim(elements.get(key).get("expect"));
		return StringUtils.equalsIgnoreCase(expectFromCsv, "NA") ? expect : expectFromCsv;
	}

	public String getCssSelector() {
		String cssSelector = getClazz();
		if (!StringUtils.isBlank(getTag()))
			cssSelector = getTag() + "." + cssSelector.replaceAll(" ", ".");
		if(!StringUtils.isBlank(getTag_1()) && !StringUtils.isBlank(getClazz_1())){
			cssSelector = cssSelector+" "+getTag_1()+"."+getClazz_1().replaceAll(" ", ".");
		}
		return cssSelector;
	}
	
	public void setExpect(String expect){
		this.expect = expect;
	}

	public String getXpath() {
		
		return StringUtils.trim(elements.get(key).get("xpath"));
	}

}
