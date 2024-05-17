package parralelrun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
WebDriver driver;



@Parameters("browser")
@Test
public void running(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {//not
	driver=new ChromeDriver();
	}
	else {
		driver=new FirefoxDriver();
	}
	
	driver.get("https://www.linkedin.com/feed/");
	
	
	
	
} 
}
