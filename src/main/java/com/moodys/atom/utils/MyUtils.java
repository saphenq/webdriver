package com.moodys.atom.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtils {
	
	public static String getDate(String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date());
	}
}
