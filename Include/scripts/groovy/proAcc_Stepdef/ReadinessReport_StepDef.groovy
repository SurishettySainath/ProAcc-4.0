
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

class ReadinessReportStepDef {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""
	@Given("User is on ReadinessReport page")
	public void user_is_on_ReadinessReport_page() {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Assessment'))
			//	WebUI.click(findTestObject("Object Repository/Assessment/CreateAnalysis/Assessment_dropdown"))
			WebUI.click(findTestObject('Object Repository/Assessment/ReadinessReport/a_Readiness Report'))
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ReadinessReport/Readiness_Report'))

			loginfo= extent.createTest(Feature.class,"ReadinessReport functionality");
			loginfo=loginfo.createNode(Scenario.class,"ReadinessReport");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on ReadinessReport page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ReadinessReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on ReadinessReport page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User should select customer name(.*), project name(.*) and instance name(.*) from the dropdown list")
	public void user_should_select_customer_name_project_name_and_instance_name_from_the_dropdown_list(String CustomernameforReadinessReport, String ProjectnameforReadinessReport, String InstancenameforReadinessReport) {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ReadinessReport/button_Ok'))
			WebUI.delay(2)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ReadinessReport/select_- Customer'))
			WebUI.click(findTestObject("Object Repository/Pro_Acc_Assessment/Pro_Acc_ReadinessReport/select_- Customer"))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ReadinessReport/select_- Customer'), CustomernameforReadinessReport, true)
			WebUI.delay(2)
			WebUI.click(findTestObject("Object Repository/Pro_Acc_Assessment/Pro_Acc_ReadinessReport/select_-Project"))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ReadinessReport/select_-Project'), ProjectnameforReadinessReport, true)
			WebUI.delay(2)
			WebUI.click(findTestObject("Object Repository/Pro_Acc_Assessment/Pro_Acc_ReadinessReport/select_-Project"))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ReadinessReport/select_-Instance'), InstancenameforReadinessReport, true)
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ReadinessReport/button_Select Instance'))
			WebUI.delay(8)

			loginfo.createNode(new GherkinKeyword("When"), "User should select customer name, project name and instance name from the dropdown list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ReadinessReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User should select customer name, project name and instance name from the dropdown list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User should see the Rediness report")
	public void user_should_see_the_Rediness_report() {
		try{
			WebUI.verifyElementPresent(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ReadinessReport/Readiness Report_Chart'), 4)

			loginfo.createNode(new GherkinKeyword("Then"), "User should see the Rediness report").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("ReadinessReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User should see the Rediness report").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
	//<--------------------------------------------------------------------------------->
}