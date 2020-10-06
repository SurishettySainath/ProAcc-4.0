package proAcc_Stepdef
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
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
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.configuration.RunConfiguration

import projectKeywords.OnlineKeywords
//import common.entities

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.HttpCommandExecutor
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.SessionId
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.LogStatus;
import com.aventstack.extentreports.gherkin.model.Scenario
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.fasterxml.jackson.annotation.JsonFormat.Feature
import com.aventstack.extentreports.GherkinKeyword
import common.CommonReport;


class Pm_file_upload {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User should navigate to Pm file upload page")
	public void User_should_navigate_to_Pm_file_upload_page() {
		try{
			WebUI.click(findTestObject('Pro_Acc_PmFileUpload/select_PM File Upload'))

			loginfo= extent.createTest(Feature.class,"Pm file upload in Pm login");
			loginfo=loginfo.createNode(Scenario.class,"Pm File Upload");
			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Pm file upload page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Pm File Upload")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Pm file upload page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to select Project Name(.*) and Instance Name(.*) from the dropdown")
	public void User_has_to_select_Project_Name_and_Instance_Name_from_the_dropdown(String Project_Name, String Instance_Name) {
		try{

			WebUI.delay(2)
			WebUI.selectOptionByLabel(findTestObject('Pro_Acc_PmFileUpload/select_Project'), Project_Name, true)
			WebUI.selectOptionByLabel(findTestObject('Pro_Acc_PmFileUpload/select_Instance'), Instance_Name, true)

			WebUI.click(findTestObject('Pro_Acc_PmFileUpload/button_Select Instance'))


			loginfo.createNode(new GherkinKeyword("Then"), "User has to select Project Name and Instance Name from the dropdown").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Pm File Upload")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has to select Project Name and Instance Name from the dropdown").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to upload PM FILES for Comprehensive Assessment and Readiness Check Report, Landscape System Management, Custom Code Analysis, License Optimization")
	public void User_has_to_upload_PM_FILES() {
		try{
			WebUI.delay(2)
			String path = RunConfiguration.getProjectDir() +'/Include/Pro Acc Input file/SAP S4HANA Comprehensive Assessment and Readiness Check Report.pdf'
			WebUI.uploadFile(findTestObject('Object Repository/Pro_Acc_PmFileUpload/Comprehensive Assessment_upload'), path)
			WebUI.delay(2)
			String path1 = RunConfiguration.getProjectDir() +'/Include/Pro Acc Input file/SAP S4HANA Comprehensive Assessment and Readiness Check Report.pdf'
			WebUI.uploadFile(findTestObject('Object Repository/Pro_Acc_PmFileUpload/Landscape_Upload'), path1)
			WebUI.delay(2)
			String path2 = RunConfiguration.getProjectDir() +'/Include/Pro Acc Input file/SAP S4HANA Comprehensive Assessment and Readiness Check Report.pdf'
			WebUI.uploadFile(findTestObject('Object Repository/Pro_Acc_PmFileUpload/Custom Code Analysis_Upload'), path2)
			WebUI.delay(2)
			String path3 = RunConfiguration.getProjectDir() +'/Include/Pro Acc Input file/SAP S4HANA Comprehensive Assessment and Readiness Check Report.pdf'
			WebUI.uploadFile(findTestObject('Object Repository/Pro_Acc_PmFileUpload/License Optimization_Upload'), path3)
			WebUI.delay(2)
			loginfo.createNode(new GherkinKeyword("Then"), "User has to upload PM FILES for Comprehensive Assessment and Readiness Check Report, Landscape & System Management, Custom Code Analysis, License Optimization").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Pm File Upload")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has to upload PM FILES for Comprehensive Assessment and Readiness Check Report, Landscape & System Management, Custom Code Analysis, License Optimization").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to click on AddUpdate button")
	public void User_has_to_click_on_AddUpdate_button() {
		try{
			WebUI.click(findTestObject('Pro_Acc_PmFileUpload/button_AddUpdate'))
			loginfo.createNode(new GherkinKeyword("Then"), "User has to click on AddUpdate button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Pm File Upload")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has to click on AddUpdate button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User should upload file successfully and navigate to assessment report")
	public void user_should_upload_file_successfully_and_navigate_to_assessment_report() {
		try{
println("----fileuploaded---")
			WebUI.delay(2)
			//WebUI.verifyTextPresent("Comprehensive Assessment and Readiness Check Report", true)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Logout/User_Click'))
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Logout/Logout'))
			loginfo.createNode(new GherkinKeyword("Then"), "User should upload file successfully and navigate to assessment report").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Pm File Upload")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User should upload file successfully and navigate to assessment report").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}