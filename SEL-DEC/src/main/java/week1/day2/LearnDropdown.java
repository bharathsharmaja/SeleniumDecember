package week1.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ClassName objName = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//load the URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//driver.findElementById("userRegistrationForm:securityQ").sendKeys("What was the name of your first school?");
		 WebElement securityQ = driver.findElementById("userRegistrationForm:securityQ");
		Select dd = new Select(securityQ);
		/*dd.selectByValue("3");
		Thread.sleep(3000);
		dd.selectByVisibleText("What is your fathers middle name?");*/
		List<WebElement> allOptions = dd.getOptions();
		int count  = allOptions.size();
		System.out.println(count);
		//dd.selectByIndex(count-1);
		for(WebElement eachOption :allOptions){
			System.out.println(eachOption.getText());
		}
		Select dd1 = new Select(driver.findElementById("userRegistrationForm:prelan"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
