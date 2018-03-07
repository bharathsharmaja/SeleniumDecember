package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class DuplicateLeads extends ProjectMethods {
	
	@Test(enabled = false)	
	public void DuplicateLead() throws Throwable{
		
		click(locateElement("linktext","Leads"));	
		click(locateElement("linktext","Find Leads"));
		click(locateElement("xpath","//span[text()='Email']"));
		Thread.sleep(3000);
		type(locateElement("name", "emailAddress"),"janakiraman1008@gmail.com");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		getText(locateElement("linktext","Diksha Int.Diksha InterDiksha Inter"));
		click(locateElement("linktext","Diksha Int."));
		click(locateElement("class","subMenuButton"));
		verifyTitle("Duplicate Lead");
		click(locateElement("linktext","Create Lead"));	
		//*closeBrowser();
		
	}

}