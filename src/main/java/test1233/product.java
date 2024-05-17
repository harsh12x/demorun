package test1233;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(mylister.class)
public class product extends NewTest {
 
	@Test(priority=3)
	public void select_product() {
		
		//product search
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));//search box 
		      search.sendKeys("boat headphones");//product enter
		     WebElement s_icon=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		         s_icon.click();//search icon
		          
		        WebElement product=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a"));//product find
		        product.click();
		   
		        //window
		        Set<String> windhan=driver.getWindowHandles();//parent as child   2
				Iterator<String>it=windhan.iterator();//for()if
				String mainwindow=it.next();
				String childwindow=it.next();
				driver.switchTo().window(childwindow);//switch to child window
			  //add to cart
				WebElement addtocart=driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div/div/form/div/div/div/div/div[4]/div/div[37]/div[1]/span/span/span/input"));
				addtocart.click();
				
				System.out.println("added to cart");
	
	
	}
	
	
	
	
	
	
	
	
	

}
