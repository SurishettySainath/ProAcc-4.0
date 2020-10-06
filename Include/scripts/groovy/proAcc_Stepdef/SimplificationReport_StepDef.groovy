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


class SimplificationReportStepDef {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User is on SimplificationReport page")
	public void user_is_on_SimplificationReport_page() {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_SimplificationReport/a_Simplification Report'))
			loginfo= extent.createTest(Feature.class,"SimplificationReport functionality");
			loginfo=loginfo.createNode(Scenario.class,"SimplificationReport");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on SimplificationReport page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("SimplificationReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on SimplificationReport page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User should select value from dropdownlist")
	public void user_should_select_value_from_dropdownlist() {
		try{
			WebUI.selectOptionByValue(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_SimplificationReport/select_ALLApplication'), '0', false)

			loginfo.createNode(new GherkinKeyword("When"), "User should select value from dropdownlist").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("SimplificationReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User should select value from dropdownlist").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User should see the Simplification report")
	public void user_should_see_the_Simplification_report() {
		try{
			WebUI.verifyElementPresent(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_SimplificationReport/Simplification Report_Chart'), 4)

			loginfo.createNode(new GherkinKeyword("Then"), "User should see the Simplification report").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("SimplificationReport")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User should see the Simplification report").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}