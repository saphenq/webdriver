package com.ubs.ewm.test.base;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotBase extends WebDriverBase {
	private BufferedImage img = null;
	private BufferedImage dest = null;
	protected int screensNum = 0;
	private String className;
	private String methodName;

	public void captureScreen() {
		System.out.println("[Capture] Start");

		String pic = createScreenShotDir().getAbsolutePath();

		File file = captureWholeScreen();

		// if element exist, capture the partial screen
		if (webElement != null) {
			int width = webElement.getSize().getWidth();
			int height = webElement.getSize().getHeight();
			Rectangle rect = new Rectangle(width, height);
			Point p = webElement.getLocation();

			imgIORead(file);

			dest = img.getSubimage(p.getX(), p.getY(), rect.width, rect.height);

			imgIOWrite(file, dest);

			copyImgFile(file, pic);
		} else
			// if no element, capture the whole screen
			copyImgFile(file, pic);
		System.out.println("[Capture] Stop");
	}

	private File createScreenShotDir() {
		File screenShotDir = new File(outputDir + "/screenShot/" + className);
		if (screenShotDir != null && !screenShotDir.exists())
			screenShotDir.mkdirs();
		return screenShotDir;
	}

	protected static File captureWholeScreen() {

		// WebDriver augmented = new Augmenter().augment(driver);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		return screenshotFile;
	}

	private void copyImgFile(File file, String pic) {
		try {
			FileUtils.copyFile(file, new File(pic + "/" + methodName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void imgIORead(File file) {
		try {
			img = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void imgIOWrite(File file, BufferedImage dest) {
		try {
			ImageIO.write(dest, "png", file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setClassName(String clz) {
		this.className = clz;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

}
