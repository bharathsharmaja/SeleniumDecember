package testcases;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class EditLead extends ProjectMethods {
		
@Test(groups = { "smoke", "common"}, dataProvider ="editdata")
	
public void editLead( String first ,String comp) throws Throwable {
	System.out.println("EditLead");
	//Login();
	click(locateElement("linktext", "Leads"));
	click(locateElement("linktext", "Find Leads"));
	Thread.sleep(3000);
	type(locateElement("xpath", "(//input[@name ='firstName'])[3]"),first);
	click(locateElement("linktext", "Find Leads"));
	Thread.sleep(3000);
	click(locateElement("xpath", "(//a[@class='linktext'])[4]"));
	System.out.println( verifyTitle("View Lead | opentaps CRM"));
	click(locateElement("xpath", "(//a[@class='subMenuButton'])[3]"));
	Thread.sleep(2000);
	locateElement("id","updateLeadForm_companyName").clear();
	type(locateElement("id","updateLeadForm_companyName"),comp);
	click(locateElement("class", "smallSubmit"));
	Thread.sleep(2000);
	verifyPartialText(locateElement("id", "viewLead_companyName_sp"), comp);
	//close();
	

	}
	
@DataProvider(name="editdata")
public String[][] getData() {
	String[][] data=new String[0][1];
	data[0][0]="bha";
	data[0][1]="Microsoft";

	return data;
	// TODO Auto-generated method stub
	
	
}

}


