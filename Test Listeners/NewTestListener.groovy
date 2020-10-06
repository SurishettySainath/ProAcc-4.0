import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import common.CommonReport

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.LogStatus;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.relevantcodes.extentreports.LogStatus;
//import common.CommonReport;
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.Capabilities

class NewTestListener {
	ExtentHtmlReporter htmlReporter1;
	static ExtentReports extent = CommonReport.extent1;
		String browserName = ""
	
//.extent=new ExtentReports();
	//RemoteWebDriver driver = DriverFactory.getWebDriver()
	//Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
	//String browserName = cap.getBrowserName().toLowerCase();
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {

		//ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/myReport.html");
	//	ExtentHtmlReporter htmlReporter = CommonReport.htmlReporter;  '\\ExtentReports\\'+TestReport+'.html', true)
		
		
		println testSuiteContext.getTestSuiteId()
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_hhmmss_a");
		String TestReport ="Test Report" + dateFormat.format(date).toString()
		println"***************************"+ TestReport
		String a=34;
		htmlReporter1=new ExtentHtmlReporter (System.getProperty("user.dir") +'/ExtentReports/Report.html');
		
		
		
	//	htmlReporter1 = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Test@ExtentReport/myReport.html");
		
		htmlReporter1.config().setDocumentTitle("Extent Report"); // Tile of report
		htmlReporter1.config().setReportName("Functional Testing"); // Name of the report
		htmlReporter1.config().setTheme(Theme.DARK);
		htmlReporter1.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss a");
		//extent = new ExtentReports()
		
		extent.attachReporter(htmlReporter1);
		println "@@@@"
		// Passing General information
		//browserName = new LeedOnlineKeywords().getBrowserName()
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "sainath");
		extent.setSystemInfo("Browser","chrome");
		
		println "The browserName is ########### " + browserName
	
		
	}
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		
		extent.flush();
	}
}