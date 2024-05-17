package paralleltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
  
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	
	public void frame(String browser) {
	///chromedriver ... firefox
		
	if(browser.equalsIgnoreCase("chrome")) {
		
	       driver=new ChromeDriver();
		
	
	}
		
	else {	
		   driver=new FirefoxDriver();
		
	}
	
	driver.get("https://www.linkedin.com/feed/");
	
	
	
	
	
	}	
	
	
  }
  

