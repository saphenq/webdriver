package com.moodys.atom.exception;

import org.openqa.selenium.TimeoutException;

public class CustomizedTimeoutException extends TimeoutException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomizedTimeoutException(String message) {
		super(message);
		addInfo("Issue",message);
	}
	
	
}
