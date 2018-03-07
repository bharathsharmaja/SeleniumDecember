package day1.Package.selenium;

		import java.util.ArrayList;
		import java.util.List;
		import java.util.Set;

		import org.openqa.selenium.chrome.ChromeDriver;

		public class IrctcWindowHandle {

			public static void main(String[] args) {
			
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
				driver.findElementByLinkText("Contact Us").click();
				Set<String> allWindows=driver.getWindowHandles();
				List<String> windowsArray=new ArrayList<String>();
				windowsArray.addAll(allWindows);
				String child = windowsArray.get(1); 
				String parent = windowsArray.get(0); 
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.switchTo().window(parent);
				driver.quit();
				}

		

	}


