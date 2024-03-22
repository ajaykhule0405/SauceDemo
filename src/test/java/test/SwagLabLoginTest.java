package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import pojo.LaunchBrowser;
import pom.SauceDemoLoginPage;
import utility.Reports;

public class SwagLabLoginTest {
	WebDriver driver;
    ExtentReports reports;
    ExtentTest test;
	
	@BeforeTest
	public void configure()
	{
		reports=Reports.createReport();
	}
	
	
	
	@BeforeMethod
	public void openBrowser()
	{
		driver =LaunchBrowser.chrome("https://www.saucedemo.com/v1/");
	}
	
	
	@Test
	public void loginWithValidCredentials()
	{
		test= reports.createTest("loginWithValidCredentials");
		SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(driver) ;
		sauceDemoLoginPage.enterUserName("standard_user");
		sauceDemoLoginPage.enterPassword("secret_sauce");
		sauceDemoLoginPage.logIn();
	
	}
	
	@Test
	public void loginWithInValidCredentials()
	{
		test= reports.createTest("loginWithInValidCredentials");
		SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(driver) ;
		sauceDemoLoginPage.enterUserName("problem_user");
		sauceDemoLoginPage.enterPassword("secret_sauce");
		sauceDemoLoginPage.logIn();
	}
	
	
	@Test
	public void loginWithLockedUser()
	{
		test= reports.createTest("loginWithLockedUser");
		SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(driver) ;
		sauceDemoLoginPage.enterUserName("locked_out_user");
		sauceDemoLoginPage.enterPassword("secret_sauce");
		sauceDemoLoginPage.logIn();
	}
	
	@Test
	public void loginWirthPerformanceGlitchUser()
	{
		test= reports.createTest("loginWirthPerformanceGlitchUser");
		SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(driver) ;
		sauceDemoLoginPage.enterUserName("performance_glitch_user");
		sauceDemoLoginPage.enterPassword("secret_sauce");
		sauceDemoLoginPage.logIn();
	}
	
	
	@AfterMethod
	public void closebrowser(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,result.getName() );
		}
		
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,result.getName());
		}
		
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,result.getName());
		}
	}
	
	
	@Test
	public void gitProject()
	{
		System.out.println("Git Project");
	}
	
	@AfterTest
	public void publishReport()
	{
		reports.flush();
	}
	

}
