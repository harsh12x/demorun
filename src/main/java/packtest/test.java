package packtest;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import com.google.common.io.Files;

public class test implements ITestListener,ISuiteListener,IInvokedMethodListener,IReporter {
	
	private WebDriver driver;
	
	public void setup() {
		driver=new ChromeDriver();
		
	}
	
	

	@Override
	public void onTestStart(ITestResult result) {//<test>
	
		System.out.println("your test has sucefully started"+result.getName());
		  
	}

	@Override
	public void onTestSuccess(ITestResult result) {//pass
		
		System.out.println("The test has sucessfully  executed"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {//fail
	
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {//re

		System.out.println("test has been skipped"+result.getName());
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("test has been failed"+result.getName());
	}



	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onStart(ISuite suite) {
		System.out.println("your suite has began");
		
	}



	@Override
	public void onFinish(ISuite suite) {
		
		System.out.println("ur suite has finished");
		
	}



	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		for(ISuite suite:suites) {
			
			String suitename=suite.getName();
			
			for(String testname:suite.getResults().keySet() ) {
				
				
				System.out.println(suite.getResults().get(testname).getTestContext().getPassedTests().size());
				System.out.println(suite.getResults().get(testname).getTestContext().getFailedTests().size());
				System.out.println(suite.getResults().get(testname).getTestContext().getSkippedTests().size());
			}
			
		}
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	  
	  
	
	
	
	
  

