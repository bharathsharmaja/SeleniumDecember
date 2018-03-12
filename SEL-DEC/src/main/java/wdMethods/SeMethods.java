package wdMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods {
	public static RemoteWebDriver driver = null;
	int i = 0;

	public void startApp(String browser, String url) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser " + browser + " has been Launched Successfully");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.err.println("Broswer " + browser + " probably named wrong in the calling class / Parent Class");
			throw new RuntimeException("LOL WO YEA , I UNDERSTOOD Throws new concept");

		}

	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {

			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;

			case "class":
				ele = driver.findElementByClassName(locValue);
				break;

			case "linktext":
				ele = driver.findElementByLinkText(locValue);
				break;

			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;

			case "TagName":
				ele = driver.findElementByTagName(locValue);
				break;

			case "name":
				ele = driver.findElementByName(locValue);
				break;

			}

		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.err.println("Something wrong by NullPointerException :)");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println(" I am Sorry , i am not able to find the  intended element by Locator");

		}

		return ele;
	}

	public void locateElement(String locValue) {
		try {
			driver.findElementsById(locValue);
			// TODO Auto-generated method stub
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Couldnt find the Element , check if the ID value entered is valid");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.err.println("Couldnt find the Element , check if the ID value entered is valid");

		}
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The Value have been entered Successfully " + data);
		} catch (NullPointerException e) {
			System.err.println("Object value has null so i cannot proceed");
		}
	}

	public void click(WebElement ele) throws Throwable {
		ele.click();
		System.out.println("Element is clicked Successfully");

	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub

		System.out.println(ele.getText());
		return null;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select element = new Select(ele);
		element.selectByVisibleText(value);
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {

		Select element = new Select(ele);
		element.selectByIndex(index);
		// TODO Auto-generated method stub

	}

	public boolean verifyTitle(String expectedTitle) {

		String str = driver.getTitle();

		if (str.equalsIgnoreCase(expectedTitle)) {
			return true;
		}

		else
			// TODO Auto-generated method stub
			return false;

	}

	public void verifyExactText(WebElement ele, String expectedText) {

		String str = ele.getText();
		if (str.equalsIgnoreCase(expectedText)) {
			System.out.println("Webelement text " + str + " matches expectedText");
		} else {
			System.out.println("Webelement text " + str + " not matches expectedText");
		}

		// TODO Auto-generated method stub

	}

	public void verifyPartialText(WebElement ele, String expectedText) {

		// TODO Auto-generated method stub

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		ele.isEnabled();
	}

	public void verifyDisplayed(WebElement ele) {
		ele.isDisplayed();
		// TODO Auto-generated method stub

	}
	
	public void switchToWindow(int index) {

		Set<String> windowsArray = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>();
		allWindows.addAll(windowsArray);
		String child = allWindows.get(index);
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		// TODO Auto-generated method stub

	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();

	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		System.out.println(driver.switchTo().alert().getText());

		return null;
	}

	public void takeSnap() throws Throwable {

		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshots/Snap" + timestamp() + ".jpeg");
		FileUtils.copyFile(src, des);
		// TODO Auto-generated method stub
	}

	public void closeBrowser() {
		driver.close();
		// TODO Auto-generated method stub

	}

	public void closeAllBrowsers() {
		driver.quit();
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(String locValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());

	}

}