package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseTest implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started :- "+ result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test successed :-"+result.getName() );
	}
	
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test fail :-"+result.getName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped :-"+result.getName());
	}
	

}
