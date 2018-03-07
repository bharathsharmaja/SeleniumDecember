package day1.Package.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkSat16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//img[contains(@src,'/images/fieldlookup.gif')]").click();
		Set<String> getwindows = driver.getWindowHandles();
		List<String> allwindows = new ArrayList<String>();
		allwindows.addAll(getwindows);
		String child = allwindows.get(1);
		String parent =allwindows.get(0);
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		driver.findElementByName("id").sendKeys("10793");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByLinkText("10793").click();
		driver.switchTo().window(parent);
		
		
		

	}

}
