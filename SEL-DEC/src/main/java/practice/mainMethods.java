package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class mainMethods {
	public void takeScreenshot(WebDriver webDriver) {
	    try {
	    long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
	   FileUtils.copyFile(((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE), new File ("./bsj/myscreenshots" + number +".jpeg"));
	    System.out.println("Screenshot Taken!!!!");
	    } catch (IOException e) {
	        e.printStackTrace();
	    } 
	}

	}
