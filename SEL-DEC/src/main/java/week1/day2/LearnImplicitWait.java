package week1.day2;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitWait {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Apply the implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		
		//load the URL
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		//Locate the username and Enter the userName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Locate the password and enter the password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Locate the Login button and click
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		
		
		
		
	}

}
