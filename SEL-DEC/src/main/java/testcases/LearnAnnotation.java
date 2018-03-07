package testcases;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotation {
	
	@BeforeSuite
	
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	
	public void beforeTest(){
		System.out.println("BeoreTest");
		
	}
	
	@BeforeClass
	
	public void beforeClass(){
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void Login2(){
		
		System.out.println("Test2");
		
		
	}
	@Test(dependsOnMethods="Login2")
	public void Login1()
	{
		System.out.println("Login1");
	}
	
	@AfterMethod
	public void AfterMethod(){
		System.out.println("Aftermethod");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
	
	
	
	
	
}