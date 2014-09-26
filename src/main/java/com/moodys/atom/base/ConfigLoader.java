package com.moodys.atom.base;

import java.util.ResourceBundle;

public class ConfigLoader {
	private static final String CONFIG_PROP="config";
	
	public static ResourceBundle loadConfig(){
	        ResourceBundle bundle = ResourceBundle.getBundle((CONFIG_PROP));
		return bundle;
	}
	
}
