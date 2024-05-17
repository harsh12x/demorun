package newtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
	
	driver= new ChromeDriver();
	
	}
	
	@BeforeMethod
	public void url() {
		
		 driver.get("https://www.facebook.com/login/");
		
	}
	
	
  @Test(dataProvider="logindata")
  public void f(String username, String password) {
	  
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	
		
  }
  
  
  @DataProvider(name="logindata")
  public  Object[][]  data() {
  
     Object [][] datapro= new Object[2][2];//declared an 2d array
	  // intialization
     datapro [0][0]="harshada";//username
     datapro [0][1]="hars1@123";//pass
     
  
     datapro [1][0]="Jganggn";//username
     datapro [1][1]="J@1234";//pass
     
     return datapro;
  }
  
  
}
