 package aui;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class learnWebTableXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://erail.in");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		System.out.println(table.findElements(By.tagName("tr")).size());
		String text = table.findElements(By.tagName("tr")).get(5)
				.findElements(By.tagName("td")).get(1).getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
	}

}
