package myFirst.Framework;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFrameWork implements BharathFrameWork {

	public WebDriver driver = null ;
	public WebElement ele ;
	public String shootBrowser(String browser, String url) {
		if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return null;
	}

	public void login(String usernamexpath, String passwordxpath , String username,String Password,String Buttonxpath) {
		
		ChromeDriver logindriver = new ChromeDriver();
		logindriver.findElementByXPath(usernamexpath).sendKeys(username);;
		logindriver.findElementByXPath(passwordxpath).sendKeys(Password);;
		logindriver.findElementByXPath(Buttonxpath).click();
		

		
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		
	}
	
	}
	
	

		
	
	
	

