package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.interactions.Action;
 
import org.openqa.selenium.interactions.Actions;
 
public class DragAndDrop {
 
public static void main(String[] args) throws InterruptedException {
 
System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64bit.exe");
	
WebDriver driver = new FirefoxDriver();


 
String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
 
driver.get(URL);
 
// It is always advisable to Maximize the window before performing DragNDrop action
 
driver.manage().window().maximize();
 
driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
WebElement From = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div/div/div[1]/div/div[1]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[4]/span"));
 
WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
 
Actions builder = new Actions(driver);
 
Action dragAndDrop = builder.clickAndHold(From)
 
.moveToElement(To)
.release(To)
 
.build();
 
dragAndDrop.perform();
 
}
 
}