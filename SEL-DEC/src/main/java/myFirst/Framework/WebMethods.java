package myFirst.Framework;

import org.testng.annotations.Test;

public class WebMethods extends MyFrameWork {
	
	
		@Test
		public void triggerBroswer() {
			
			
			shootBrowser("chrome", "https://www.facebook.com");
			
			login("//input[@id ='email']", "//input[@id ='pass']", "bharathmanunited@gmail.com", "zlatan#10", "//input[@value ='Log In']");
			
		}


		
	}


