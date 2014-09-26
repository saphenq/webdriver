package com.moodys.atom.common;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.moodys.atom.base.Base;

public class RobotCommons extends Base{
	public static boolean isAuthorized=false;
	
	public static void authorization() throws Exception{
		Robot robot = new Robot();
		
		// add wait time 
		Thread.sleep(500);
		type(robot, bundle.getString("tomcat_username"));
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		// add wait time 
		Thread.sleep(500);
		type(robot, bundle.getString("tomcat_password"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		isAuthorized = true;
	}

	private static void type(Robot robot, String characters) {
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection stringSelection = new StringSelection(characters);
		clipboard.setContents(stringSelection, null);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
}
