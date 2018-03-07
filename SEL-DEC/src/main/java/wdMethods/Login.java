package wdMethods;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods{
	@Test
	public void login() throws Throwable {
		
		// Test case IS Merge Lead
		startApp("chrome","http://leaftaps");
		type(locateElement("id","username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		takeSnap();
		click(locateElement("class","decorativeSubmit"));
		takeSnap();
		click(locateElement("linktext","CRM/SFA"));
		Thread.sleep(10000);
		click(locateElement("linktext","Leads"));	
		takeSnap();
		click(locateElement("linktext","Merge Leads"));
		takeSnap();
		click(locateElement("xpath","(//a//img)[4]"));
		switchToWindow(1);
		type(locateElement("xpath","//input"),"10046");
		takeSnap();
		click(locateElement("xpath","//button[text() = 'Find Leads']"));
		takeSnap();
		Thread.sleep(3000);
		click(locateElement("xpath","//a[@class = 'linktext']"));
	    switchToWindow(0);
	    click(locateElement("xpath","(//table//a)[11]"));
	    switchToWindow(1);
	    type(locateElement("xpath","//input"),"10048");
	    click(locateElement("TagName","Button"));
	    takeSnap();
	    Thread.sleep(3000);
	    click(locateElement("xpath","//a[@class = 'linktext']"));
	    switchToWindow(0);
	    click(locateElement("linktext","Merge"));
	    getAlertText();
	    acceptAlert();
	    getText(locateElement("id","viewLead_firstName_sp"));
	    click(locateElement("linktext", "Find Leads"));
	    takeSnap();
	    driver.close();
	}

}