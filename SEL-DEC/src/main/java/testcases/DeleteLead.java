package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DeleteLead extends ProjectMethods {
	@Test(groups = { "sanity", "common"},dependsOnGroups = "smoke")
	public void deleteLead() throws Throwable{
		System.out.println("DeleteLead");
		//Login();
		click(locateElement("linktext","Leads"));
		click(locateElement("linktext","Find Leads"));
		click(locateElement("xpath", "//span[text() ='Phone']"));
		Thread.sleep(3000);
		type(locateElement("xpath", "//input[@name ='phoneNumber']"),"9940380654");
		
		click(locateElement("xpath","//button[text() = 'Find Leads']"));
		Thread.sleep(5000);
		String temp=getText(locateElement("xpath","(//a[@class='linktext'])[4]"));
		click(locateElement("xpath","(//a[@class='linktext'])[4]"));
		click(locateElement("linktext","Delete"));
		Thread.sleep(3000);
		click(locateElement("linktext","Find Leads"));
		Thread.sleep(3000);
		type(locateElement("xpath","//input[@name='id']"),temp);
		click(locateElement("xpath","//button[text() = 'Find Leads']"));
		Thread.sleep(5000);
		verifyExactText(locateElement("xpath","//div[text() = 'No records to display']"), "No records to display");
		closeBrowser();
		
	}	
	
}