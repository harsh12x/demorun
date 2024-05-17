package newstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(listclass.class)

public class trail {
 FirefoxDriver driver;
	
@BeforeClass
  public void f() {
	  
	driver=new FirefoxDriver();  

  }
 // @Parameters("url")
  @Test(dataProvider="test123")
  public void urlmethod(String username,String password) {
  
  driver.get("https://www.facebook.com/");

	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.name("login")).click();

  
  
  }
  
  
  
  @DataProvider(name="test123")
  public Object[][] cointainer() {
  
        Object [][] data=new Object[2][2];//declaration of array
	  
	      data[0][0]="rishi" ;
	      data[0][1]="rishi123" ;
	  
	      data[1][0]="raghu" ;
	      data[1][1]="raghu123" ;
  
        return data;
  
  }
  
  
  
  
}
