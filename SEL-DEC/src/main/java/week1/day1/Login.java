package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ClassName objName = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//load the URL
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		//Locate the username and Enter the userName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Locate the password and enter the password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Locate the Login button and click
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Locate the logout button and click
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByXPath("//*[@id='ext-gen256']");
		
		
		
		
		
	}

}
