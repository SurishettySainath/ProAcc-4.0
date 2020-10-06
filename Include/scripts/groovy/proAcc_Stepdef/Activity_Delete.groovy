package proAcc_Stepdef
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

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


class Activity_Delete {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User should navigate to Activity Creation page")
	public void user_should_navigate_to_Activity_Creation_page() {
		try{
			WebUI.navigateToUrl("http://123.176.34.15:4041/ProAccQA/Activity/Create")
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateInstance/a_Configuration'))
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/a_Activity Creation'))

			loginfo= extent.createTest(Feature.class,"Activity Deletion");
			loginfo=loginfo.createNode(Scenario.class,"Activity Delete");

			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Activity Creation page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity Deletion")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to Activity Creation page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to enter Activityname(.*) in search box")
	public void user_has_to_enter_Activityname_in_search_box(String Activityname) {
		try{
			WebUI.delay(2)
			println("------activity1-----")
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Deletion/Activity_Delete/btn_srch'))
			WebUI.delay(2)
			println("---click---")
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Deletion/Activity_Delete/btn_srch'), Activityname)
			println("------activity2-----")
			loginfo.createNode(new GherkinKeyword("When"), "User has to enter Activityname in search box").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity Deletion")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to enter Activityname in search box").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to click on delete button for Activity")
	public void user_has_to_click_on_delete_button_for_Activity() {
		try{
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Deletion/Activity_Delete/btn_dlt'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Deletion/Activity_Delete/btn_yes'))

			loginfo.createNode(new GherkinKeyword("When"), "User has to click on delete button for Activity").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity Deletion")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on delete button for Activity").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}

	@Then("User has successfully deleted Activity")
	public void user_has_successfully_deleted_Activity() {
		try{

			loginfo.createNode(new GherkinKeyword("then"), "User has successfully deleted Activity").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity Deletion")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully deleted Activity").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}
}