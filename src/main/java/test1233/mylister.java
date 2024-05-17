package test1233;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class mylister  implements ITestListener 
{
	
	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("hii your test started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("your test case sucessfully execute");
		
	}
    
	@Override
	public void onTestFailure(ITestResult result) {
		  
	       File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       try {
			Files.copy(f, new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\screenshot\\new.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//png,jpeg
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
	
	
	
	
	
	
	
	
	

