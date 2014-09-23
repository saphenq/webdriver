package com.ubs.ewm.test.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;

public class LoadCsvData {
	private static String prefix = "";

	public static Map<String, CSVRecord> execute(String csvPath) {
		Map<String, CSVRecord> elements = new HashMap<String, CSVRecord>();
		Reader in = null;
		try {
			in = new FileReader(csvPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterable<CSVRecord> records = null;
		try {
			records = CSVFormat.EXCEL.withHeader().withSkipHeaderRecord(true).parse(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (CSVRecord record : records) {
			if (StringUtils.isBlank(prefix))
				prefix = StringUtils.trim(record.get("prefix"));

			StringBuilder sb = new StringBuilder();
			sb.append(prefix);
			sb.append("_");
			sb.append(record.get("key"));

			elements.put(sb.toString(), record);
		}
		return elements;
	}

	public static String getPrefix() {
		return prefix;
	}
}
