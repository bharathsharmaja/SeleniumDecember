
package myFirst.Framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public interface BharathFrameWork {

	/**
	 * @author Bharath Sharma
	 * 
	 * This method will open the browser & launch the URL
	 */
public String shootBrowser( String browser ,String url); 


/**
 * This method will enter the username and password then will login
 * 
 * @param username
 * @param password
 * @return
 */

public void login (String username ,String password);




}
