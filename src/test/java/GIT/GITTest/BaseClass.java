package GIT.GITTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	public void init()
	{
		    String URL = "http://ae.akbartravels.com";
		    WebDriver driver;
		    
		    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get(URL);
		    
	        System.out.println("|=One line added=|");
	}

}
