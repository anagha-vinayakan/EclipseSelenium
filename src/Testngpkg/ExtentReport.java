
package Testngpkg;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	WebDriver driver;
	String baseurl="http://www.facebook.com";
	ExtentSparkReporter reporter;
ExtentTest test;
ExtentReports extent;
@BeforeTest
public void beftest()
{
	reporter=new ExtentSparkReporter("./REPORTS/myownreport.html");
	reporter.config().setDocumentTitle("Automationreport");
	reporter.config().setReportName("functional test");
	reporter.config().setTheme(Theme.STANDARD);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname","localhost");
	extent.setSystemInfo("os","windows11");
	extent.setSystemInfo("testername","anagha");
	extent.setSystemInfo("Browsername","chrome");
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void test()
{
	driver.get(baseurl);
}
@Test
public void fbtitleverification()
{
test=extent.createTest("Fbtitleverification");
String exp="facebook";
String act=driver.getTitle();
Assert.assertEquals(exp,act);
}
@AfterTest
public void teardown()
{
	extent.flush();
}
@AfterMethod
public void browserclose(ITestResult result) throws Exception
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL,"test case failed"+result.getName());
		test.log(Status.FAIL,"test case failed"+result.getThrowable());
		String screenshotpath=screenshotMethod(driver,result.getName());
		test.addScreenCaptureFromPath(screenshotpath);
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP, "test case skipped is"+result.getName());
		
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, "test case skipped is"+result.getName());
		
	}
}
public String screenshotMethod(WebDriver driver,  String screenshotname) throws Exception {
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String destination="./Screenshot/"+screenshotname+".jpeg";
	FileHandler.copy(src, new File(destination));
	return destination;
}
}
