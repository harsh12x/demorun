package newstart;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listclass   implements  ITestListener  {
// @Test===testcase
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("testcase started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("testcase sucessfull");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//screenshot
		
		System.out.println("test failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
		
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
