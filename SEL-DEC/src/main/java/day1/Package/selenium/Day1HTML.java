package day1.Package.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day1HTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leaftaps.com/opentaps/control/main");
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();;
	//*driver.findElementByClassName("decorativeSubmit").click();;
	driver.findElementByLinkText("CRM/SFA").click();
	//* To create a lead
	//*driver.findElementByLinkText("Create Lead").click();
	//*driver.findElementByXPath("//input[contains(@id,'companyName')]").sendKeys("Cognizant");
	//*driver.findElementByXPath("//input[contains(@id,'firstName')]").sendKeys("Bharath");
	//*driver.findElementByXPath("//input[contains(@id,'lastName')]").sendKeys("Sharma");
	//*driver.findElementByClassName("smallSubmit").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("//span[text() = 'Phone']").click();
	driver.findElementByXPath("//input[@name= 'phoneNumber']").sendKeys("9");
	driver.findElementByXPath("//button[text() = 'Find Leads']").click();
	
	
	

	}

}
