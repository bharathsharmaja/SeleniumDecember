package wdMethods;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods {
	@Parameters({"browser","url","uName","pwd"})
	
	@BeforeMethod(groups="common")
	public void Login(String br,String url,String username,String password ) throws Throwable{
		startApp(br,url);
		type(locateElement("id","username"),username);
		type(locateElement("id", "password"),password);
		click(locateElement("class","decorativeSubmit"));
		click(locateElement("linktext","CRM/SFA"));
	}
	@AfterMethod(groups="common")
	public void close(){
		closeBrowser();
	}
}