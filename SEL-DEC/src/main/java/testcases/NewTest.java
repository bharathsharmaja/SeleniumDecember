package testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://erail.in/trains-between-stations/chennai-central-MAS/ksr-bengaluru-SBC?view=d");
		
		driver.findElementById("chkSelectDateOnly").click();
		
		List<WebElement> tabletrainnames = driver.findElementsByXPath("//table[@class ='DataTable TrainList']//tr/td[2]");
		List<String> trainNames = new ArrayList<>();
		for (WebElement trainElements : tabletrainnames) {
			trainNames.add(trainElements.getText());
		
		}		
		
	}
}