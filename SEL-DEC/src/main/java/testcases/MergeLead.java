package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class MergeLead extends ProjectMethods{
	@Test(groups = { "sanity", "common"},dependsOnGroups = "smoke")
	public void mergeLead() throws Throwable {

	System.out.println("MergeLead");
		//Login();
		click(locateElement("linktext","Leads"));	
		click(locateElement("linktext","Merge Leads"));
		click(locateElement("xpath","(//a//img)[4]"));
		switchToWindow(1);
		type(locateElement("xpath","//input"),"104");
		click(locateElement("TagName","Button"));
		click(locateElement("xpath","//a[@class = 'linktext']"));
	    switchToWindow(0);
	    click(locateElement("xpath","(//table//a)[11]"));
	    switchToWindow(1);
	    type(locateElement("xpath","//input"),"10");
	    click(locateElement("TagName","Button"));
	    Thread.sleep(2000);
	    click(locateElement("xpath","//a[@class = 'linktext']"));
	    switchToWindow(0);
	    click(locateElement("linktext","Merge"));
	    getAlertText();
	    acceptAlert();
	    getText(locateElement("id","viewLead_firstName_sp"));
	    //close();
	}

}
