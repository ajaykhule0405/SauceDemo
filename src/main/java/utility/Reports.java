package utility;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports createReport()
	{
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("ExtentReports.html");
		ExtentReports extentReport = new ExtentReports();
		extentReport.attachReporter(sparkReporter);
		extentReport.setSystemInfo("Testing", "Retesting");
		extentReport.setSystemInfo("Created By", "Ajay");
		
		return extentReport;
	}

}
