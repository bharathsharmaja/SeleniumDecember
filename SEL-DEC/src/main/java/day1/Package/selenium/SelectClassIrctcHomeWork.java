package day1.Package.selenium;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassIrctcHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		WebElement we = driver.findElementByXPath("//select[@id = 'userRegistrationForm:countries']");
		Select country = new Select(we);
		List<WebElement> alloptions =country.getOptions();
		int count = 0 ;
		
		for(WebElement element : alloptions)
		{
			String text = element.getText();
			if(text.startsWith("A")) {
				
			count++;
			
			if(count==3){
			country.selectByVisibleText(text);
			break;
			}
			
			}
		}
		

	}

}
