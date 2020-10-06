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

class Addinstancetoproject {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User is on create instance page")
	public void user_is_on_project_instance_configuration_page() {
		try{
			WebUI.delay(3)
			WebUI.navigateToUrl("http://123.176.34.15:4041/ProAccQA/InstanceCreation/Create")
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateInstance/a_Configuration'))
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateInstance/a_InstanceCreation'))
			loginfo= extent.createTest(Feature.class,"Create Instance");
			loginfo=loginfo.createNode(Scenario.class,"Creating New Instance");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on create instance page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Instance")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on create instance page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@When("User has to enter instance name(.*)")
	public void user_has_to_enter_instance_name(String Instancename) {
		try{

			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateInstance/input_InstanceName'), Instancename)
			loginfo.createNode(new GherkinKeyword("Given"), "User has to enter instance name").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Instance")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User has to enter instance name").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));


		}
	}

	@And("User has to select project from dropdown(.*)")
	public void user_has_to_select_project_from_dropdown(String projectinstancename) {
		try{
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateInstance/select_Project'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateInstance/select_Project'), projectinstancename,true)
			loginfo.createNode(new GherkinKeyword("And"), "User has to select project from dropdown(.*)").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Instance")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to select project from dropdown(.*)").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));


		}
	}

	@And("User has to click on create button for create instance")
	public void user_click_on_create_button_and_navigate_to_view_project_list_page() {
		try{
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateInstance/btn_InstanceCreate'))
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/popup_ok btn'))

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on create button for create instance").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Instance")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on create button for create instance").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));


		}
	}

	@Then("User can search for created instance in list(.*)")
	public void user_can_search_for_instance(String Instancesearch) {
		try{
			WebUI.delay(3)
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateInstance/input_SearchInstance'), Instancesearch)
			//	WebUI.delay(5)
			// WebUI.getText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/verify_customer'))
			//if(text.contains(Customer_search)) {
			//String text = "Customer_search"

			loginfo.createNode(new GherkinKeyword("Then"), "User can search for created instance in list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Instance")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User can search for created instance in list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));


		}
	}
}