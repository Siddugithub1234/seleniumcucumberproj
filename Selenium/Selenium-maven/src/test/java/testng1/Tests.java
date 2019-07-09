package testng1;
import java.io.File;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Tests {
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest logger;
	WebDriver driver;
	@BeforeClass
	public void startExtentReports()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-ms");
		
		String filePath=System.getProperty("user.dir")+"/extent-reports/"+sdf.format(new Date())+".html";
		reporter=new ExtentHtmlReporter(new File(filePath));
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("username","aswani.kumar");
		reports.setSystemInfo("environment","test env");
		reports.setSystemInfo("hostname","localhost");
		reporter.config().setReportName("Selenium Test Cases");
		reporter.config().setDocumentTitle("The Title Name goes here..");
		reporter.config().setTheme(Theme.DARK);
		
	}
	@AfterClass
	public void endReport()
	{
		reports.flush();
	}
	@BeforeMethod
	public void beforeMethod(ITestResult result)
	{
		logger=reports.createTest("the name of the test is"+result.getMethod().getMethodName());
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.log(Status.PASS,"The test is passed");
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.log(Status.FAIL,"the test is failed");
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
			
			String destFile=System.getProperty("user.dir")+"/extent-reports/images/"+result.getMethod().getMethodName()+".png";
			FileUtils.copyFile(srcFile, new File(destFile));
			logger.addScreenCaptureFromPath(destFile);
			logger.log(Status.FAIL,result.getThrowable().getMessage());
			
		}
		else
		{
			logger.log(Status.SKIP,"the test is skipped");
		}
		
	}
	@Test
	public void passTest()
	{
		//logger=reports.createTest("the name of the test is pass test");
		Assert.assertTrue(true);
		//logger.log(Status.PASS,"the test is passed");
	}
	
	@Test
	public void failTest()
	{
		String chromepath = "C:/Tools and Technology/Selenium/Selenium 3/LatestDriver/chromedriver.exe";	
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("askmail@email.com");
		driver.findElement(By.id("Pass")).sendKeys("abc123");
		//logger=reports.createTest("the name of the test is fail test");
		//Assert.assertTrue(false);
		//logger.log(Status.FAIL,"the test is failed");
	}
	
	@Test
	public void skipTest()
	{
		//logger=reports.createTest("the name of the test is skip test");
		//logger.log(Status.SKIP,"the test is skipped");
		throw new SkipException("explicitly thrown");
		
	}
}
