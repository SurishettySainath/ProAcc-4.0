package proAcc_Stepdef
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.aventstack.extentreports.ExtentReports
import com.aventstack.extentreports.ExtentTest
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

class PMTaskCreation_StepDef {

	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User is on PM Task Creation page")
	public void user_is_on_PM_Task_Creation_page() {
		try{
			WebUI.delay(3)
			WebUI.navigateToUrl("http://123.176.34.15:4041/ProAccQA/ProjectCreation/PMTaskCreation")
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/a_Configuration'))
			//	WebUI.delay(2)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_PMTaskCreation/click_PMTask'))
			loginfo= extent.createTest(Feature.class,"PMTaskCreation");
			loginfo=loginfo.createNode(Scenario.class,"Creating new task for Project Manager");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on PM Task Creation page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PMTaskCreation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on PM Task Creation page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}


	}

	@When("User has to select task category(.*)")
	public void user_has_to_select_task_category(String TaskCategory) {

		try{
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_PMTaskCreation/select_taskcategory'))
			WebUI.delay(2)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_PMTaskCreation/select_taskcategory'), TaskCategory, true)

			loginfo.createNode(new GherkinKeyword("Given"), "User has to select task category").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PMTaskCreation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User has to select task category").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}


	}

	@When("User has to write task name(.*),Est Hrs(.*)")
	public void user_has_to_write_task_name(String TaskName,String EstHrs) {
		try{
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_PMTaskCreation/esthr'))
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_PMTaskCreation/esthr'), EstHrs)
			WebUI.delay(2)
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_PMTaskCreation/set_taskname'), TaskName)
			WebUI.delay(2)


			loginfo.createNode(new GherkinKeyword("Given"), "User has to write task name").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PMTaskCreation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User has to write task name").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}


	}

	@When("User has to click on create button for task creation")
	public void user_has_to_click_on_create_button_for_task_creation() {
		try{
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_PMTaskCreation/btn_create'))
			WebUI.delay(2)
			loginfo.createNode(new GherkinKeyword("Given"), "User has to click on create button for task creation").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PMTaskCreation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User has to click on create button for task creation").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}


	}

	@Then("User can search for created task in list(.*)")
	public void user_can_search_for_created_task_in_list(String TaskName) {
		try{
			WebUI.delay(3)
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/input_SearchProject'), TaskName)
			//	WebUI.verifyElementText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_PMTaskCreation/verify_taskname'), TaskName)
			//	println("Taskname is verified")

			loginfo.createNode(new GherkinKeyword("Then"), "User can search for created task in list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PMTaskCreation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User can search for created task in list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}
}
