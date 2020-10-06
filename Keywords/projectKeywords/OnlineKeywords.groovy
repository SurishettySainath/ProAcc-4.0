package projectKeywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

//import java.util.concurrent.atomic.Striped64.Cell

//import javax.swing.DefaultRowSorter.Row

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.webui.keyword.builtin.TakeScreenshotKeyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.apache.poi.ss.usermodel.DataFormatter
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

//import common.entities
import groovy.io.FileType

import org.apache.poi.hssf.usermodel.HSSFSheet
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.hssf.util.CellReference
//import org.apache.poi.ss.usermodel

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Row



import org.apache.http.entity.StringEntity
import org.openqa.selenium.remote.HttpCommandExecutor
import org.openqa.selenium.remote.SessionId

import org.apache.http.client.HttpClient
import org.apache.http.client.methods.CloseableHttpResponse
import org.apache.http.client.methods.HttpPost

import org.apache.http.io.SessionInputBuffer
import org.apache.http.entity.ContentType
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.Capabilities

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.json.Json


import org.apache.http.client.utils.URIBuilder
import org.apache.http.impl.client.CloseableHttpClient
import org.apache.http.impl.client.HttpClients

import java.lang.reflect.Field


import java.io.File;
import java.io.IOException;
import java.text.DateFormat
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.DateFormatUtils
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor
//import com.aventstack.extentreports.LogStatus;
//import com.relevantcodes.extentreports.LogStatus;
import com.aventstack.extentreports.markuputils.MarkupHelper
import com.aventstack.extentreports.markuputils.MarkupHelper
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import common.CommonReport;
import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.MediaModelProvider;
import org.openqa.selenium.TakesScreenshot;
import com.kms.katalon.core.annotation.Keyword
import projectKeywords.OnlineKeywords
//import common.entities
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
class OnlineKeywords {

	//Navigation to form
	ExtentTest test;
	ExtentTest logger;
	//ExtentReports test;
	//ExtentReports extent;
	static ExtentReports extent = CommonReport.extent1

	@Keyword
	def public String getBrowserName(){
		RemoteWebDriver driver = DriverFactory.getWebDriver()
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();
		println "The browserName is ########### " + browserName
		return browserName
	}

	@Keyword
	def public static String Assessment_monitor(TestObject Element_Click) {

		TestObject to = Element_Click
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement element = WebUiCommonHelper.findWebElement(to, 10)
		JavascriptExecutor executor = ((driver) as JavascriptExecutor)
		executor.executeScript('arguments[0].click()', element)
	}

	@Keyword
	def public String takeScreenshot(ExtentTest test) {
		Date d = new Date();
		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_")+ ".png";
		String dest=WebUI.takeScreenshot(System.getProperty("user.dir") + "\\screenshots\\" + screenshotFile)
		println "dest---->"+ System.getProperty("user.dir") + "\\screenshots\\"
		WebDriver driver=DriverFactory.getWebDriver()
		TakesScreenshot screen =(TakesScreenshot) driver;
		File src =screen.getScreenshotAs(OutputType.FILE);

		File target = new File(dest);
		FileUtils.copyFile(src,target);
		return dest;

	}

	@Keyword
	def public static String captureScreenShot() {
		WebDriver driver=DriverFactory.getWebDriver()
		TakesScreenshot screen =(TakesScreenshot) driver;
		File src =screen.getScreenshotAs(OutputType.FILE);
		String dest="C:\\Users\\Group10\\Desktop\\jar\\Usgbc_LeedOnline\\screenshots\\"+getcurrentdateandtime() +".png";
		File target = new File(dest);
		FileUtils.copyFile(src,target);
		return dest;
	}
	@Keyword
	def private static String getcurrentdateandtime() {
		String str =null;
		try{
			DateFormat dateFormat =new SimpleDateFormat("MM/dd/yyyy   HH:mm:ss:SSS");
			Date date = new Date();
			str = dateFormat.format(date);
			str=str.replace(" ","").replaceAll("/","").replaceAll("/", "");
		} catch (Exception  e)  {
		}
		return str;
	}

	@Keyword
	def countRowsPerPage(String xpath){

		//println "xpath is " + xpath
		WebDriver driver = DriverFactory.getWebDriver()

		//Find the table element on the page

		//	WebUI.switchToFrame(findTestObject('Object Repository/PurchasingPolicy/iframe'), 10)


		WebElement Webtable=driver.findElement(By.xpath(xpath))
		//println Webtable

		List TotalRowCount=Webtable.findElements(By.xpath(xpath))

		//Get the size of the List, this is the number of rows
		int totalNumberOfRows=TotalRowCount.size()
		println('Total Number of rows on the page:= ' + totalNumberOfRows)

		WebUI.switchToDefaultContent()

		return totalNumberOfRows

	}


	@Keyword
	def public static void testStepHandle(String teststatus,WebDriver driver,ExtentTest extenttest,Throwable throwable) {
		switch  (teststatus)  {
			case "FAIL":
				extenttest.fail(MarkupHelper.createLabel("Test case is failed : ",ExtentColor.RED));
				extenttest.error(throwable.fillInStackTrace());

				if(driver !=null)  {
					driver.quit();
				}
				break;
			case "PASS":
				extenttest.pass(MarkupHelper.createLabel("Test case is passed : ", ExtentColor.GREEN));
				break;

			default:
				break;
		}
	}
}


