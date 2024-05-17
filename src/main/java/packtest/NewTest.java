package packtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(test.class)
public class NewTest {
	
	
	  WebDriver driver;//chromedriver
	  @BeforeClass
	  public void setup () {
		 driver=new ChromeDriver();
		  
	  }
	  
	  
	  @BeforeMethod
	  public void checkurl() {
	  
	  driver.get("https://www.amazon.in/");

	  }  
	 @Test(priority=1)
	  public void check_title() {
	     String expected_title="Online      Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" ; 
		String actual_title = driver.getTitle();
	  System.out.println(actual_title);
	      Assert.assertEquals(actual_title, expected_title);
	  } 
	  @Test(priority=2) 
	  public void langcheck() {
		  
		 //Actions act=new Actions(driver);
		  WebElement langbutton=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]/span/span[2]/span[2]"));
		  langbutton.click();
		  //  act.moveToElement(langbutton);
		  WebElement hindibutton=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/form/div[1]/div[1]/div[3]/div/label/i"));
	                  hindibutton.click();
	  
	      String exp_p=   "हम आपकी ब्राउज़िंग, खरीदारी और कम्युनिकेशन के लिए सबसे ज़रूरी जानकारी का अनुवाद करेंगे. हमारे अनुवाद आपकी सहूलियत के लिए प्रदान किए जाते हैं. हमारी उपयोग की शर्तों सहित "  ;       
	        WebElement check_p=driver.findElement(By.xpath("//*[@id=\"icp-language-translation-text\"]"));
	      String check=check_p.getCssValue(exp_p) ;
	                  
	  }
	  

	  
	  
	  @AfterClass
	  public void shutdown() {
		  driver.close();
	  }
	  
	  
	  
	  
	  
  }
  

