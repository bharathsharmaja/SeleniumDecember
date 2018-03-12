package practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMouseHover extends mainMethods {

	public static void main(String[] args) throws IOException, InterruptedException {
		mainMethods main = new mainMethods();

		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(3000);
		
		main.takeScreenshot(driver);
		driver.close();
	

	}

}
