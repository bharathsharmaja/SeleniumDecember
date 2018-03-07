package day1.Package.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//load the URL
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");
		List<WebElement> allQuote = driver.findElementsByLinkText("Get-a-Quote");
		//allQuote.get(1).click();
		System.out.println(allQuote.size());
		
	}

}