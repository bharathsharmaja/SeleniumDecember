package day1.Package.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentIRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("keralamach");
		driver.findElementById("userRegistrationForm:checkavail").click();
		driver.findElementById("userRegistrationForm:password").sendKeys("bkn183");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("bkn183");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What is your all time favorite sports team?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("MUFC");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Sagar");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Elias");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Jacky");
		driver.findElementByXPath("//input[@value = 'M']").click();
		driver.findElementByXPath("//input[@value = 'U']").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("18");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("SEP");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1991");
		driver.findElementByXPath("//select[@id ='userRegistrationForm:occupation']/option[@value='3']").click();
		driver.findElementById("userRegistrationForm:uidno").sendKeys("499118665246");
		driver.findElementByXPath("//*[@id='userRegistrationForm:idno']").sendKeys("BSAPB6939A");
		driver.findElementByXPath("//option[text() ='India']").click();
		driver.findElementById("userRegistrationForm:email").sendKeys("bharathsharmaja@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9940380654");
		driver.findElementByXPath("//select[@id ='userRegistrationForm:nationalityId']/option[text() ='India']").click();
		driver.findElementById("userRegistrationForm:address").sendKeys("D10-303 Cosmocity");
		driver.findElementById("userRegistrationForm:street").sendKeys("AbdulKalam Street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Pudupakkam");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("603103");
		driver.findElementById("userRegistrationForm:statesName").click();
		//*driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.findElementById("userRegistrationForm:cityName").click();
		driver.findElementByXPath("//option[@value = 'Kanchipuram']").click();
		driver.findElementById("userRegistrationForm:landline").sendKeys("9946491654");
		driver.findElementByXPath("//input[@name = 'userRegistrationForm:resAndOff']").click();
		driver.findElementByXPath("//input[@name = 'userRegistrationForm:newsletter']").click();
		driver.findElementByXPath("//input[@name = 'userRegistrationForm:commercialpromo']").click();
		driver.findElementByXPath("//input[@name = 'userRegistrationForm:irctcsbicard']").click();
		

	}

}
