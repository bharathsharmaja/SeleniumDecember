package day1.Package.selenium;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class WindowHandling {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			//Maximize the browser
			driver.manage().window().maximize();
			//apply implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//load the URL
			driver.get("http://legacy.crystalcruises.com/");
			System.out.println("Parent window url is :"+driver.getCurrentUrl());
			System.out.println("Parent window Title is :"+ driver.getTitle());
			driver.findElementByLinkText("GUEST CHECK-IN").click();
			Set<String> allWindows=driver.getWindowHandles();
			List<String> windowList=new ArrayList<String>();
			windowList.addAll(allWindows);
			String parentWindow= driver.getWindowHandle();
			String childWindow=windowList.get(1);
			driver.switchTo().window(childWindow);
			System.out.println("Child window url is :"+driver.getCurrentUrl());
			System.out.println("Child window Title is :"+driver.getTitle());
			driver.close(); //closing the child window		
			driver.switchTo().window(parentWindow);
			System.out.println("Parent window url is :"+driver.getCurrentUrl());
			System.out.println("Parent window Title is :"+ driver.getTitle());
			driver.quit();
		}

	}