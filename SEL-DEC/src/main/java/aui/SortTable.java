package aui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortTable {

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
		driver.findElementById("chkSelectDateOnly").click();
		List<WebElement> tableTrainNames = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[2]");
		List<String> trainNames = new ArrayList<>();
		for (WebElement trainElements : tableTrainNames) {
			trainNames.add(trainElements.getText());
			
		}		
		System.out.println(trainNames);
		// sorted Train Names
		Collections.sort(trainNames);		
		// click Train Name link
		driver.findElementByLinkText("Train Name").click();
		
		// Get all train names again		
		List<WebElement> tableTrainNamesSorted = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[2]");
		List<String> sortedTrainNames = new ArrayList<>();
		for (WebElement trainElements : tableTrainNamesSorted) {
			sortedTrainNames.add(trainElements.getText());
		}
		// Compare both
		if(trainNames.equals(sortedTrainNames)){
			System.out.println("Matches");
		}else{
			System.out.println("Not matches");
		}
		
		
		
		
		
		
		
	}

}