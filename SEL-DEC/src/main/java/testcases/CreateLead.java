package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DataInputProvider;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	//@Test(invocationCount=2,invocationTimeOut=5000)
	//(invocationCount=2,threadPoolSize=2,timeOut=7000)
	//@Test(expectedExceptions=NoSuchElementException.class)
	@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName) throws Throwable {	
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), "bharathsharmaja@gmail.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9940380654");
		click(locateElement("name", "submitButton"));	
	}
	@DataProvider(name="fetchData")
	public String[][] getData() throws InvalidFormatException, IOException {
			DataInputProvider dp = new DataInputProvider();
			return dp.getData("login");
	}
	
	
	
	
	
	/*data[0][0]="TestLeaf";
		data[0][1]="gopi";
		data[0][2]="J";
		
		data[1][0]="TestLeaf";
		data[1][1]="Sarath";
		data[1][2]="M";*/
	
	
	
	
	
	
	
}
		
		
	
/*@DataProvider(name="fetchdata")
	public String[][] getData() {
		String[][] data=new String[2][3];
		data[0][0]="TestLeaf";
		data[0][1]="Bharath";
		data[0][2]="Sharma";
		data[1][0]="TestLeaf";
		data[1][1]="Amit";
		data[1][2]="Kumar";
		
		return data; */
		// TODO Auto-generated method stub
		
	



