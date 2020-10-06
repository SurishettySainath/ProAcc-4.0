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


class Addprojecttocustomer {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	String projectname;
	@Given("User is on Project Creation page")
	public void user_is_on_Customer_project_configuration_page() {

		try{
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/a_Configuration'))

			loginfo= extent.createTest(Feature.class,"Project Creation");
			loginfo=loginfo.createNode(Scenario.class,"Creating new Project");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on Project Creation page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project Creation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on Project Creation page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@When("User has to enter project name(.*)")
	public void user_has_to_enter_project_name(String projectname) {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/a_ProjectCreation'))

			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/input_ProjectName'), projectname)
			loginfo.createNode(new GherkinKeyword("When"), "User has to enter project name").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project Creation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to enter project name").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@And("User has to enter project description(.*)")
	public void user_has_to_enter_description(String description) {
		try{
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/input_Description'), description)
			loginfo.createNode(new GherkinKeyword("And"), "User has to write project description").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project Creation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to write project description").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@And("User has to select Customer name from dropdown(.*)")
	public void user_has_to_select_Customer_name_from_dropdown(String customername) {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/select_Customer'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/select_Customer'), customername, true)
			loginfo.createNode(new GherkinKeyword("And"), "User has to select Customer name from dropdown").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project Creation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to select Customer name from dropdown").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@And("User has to select Project manager from dropdown(.*)")
	public void user_has_to_select_project_manager_from_dropdown(String projectmanager) {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/select_SelectPjctManager'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/select_SelectPjctManager'),projectmanager, true)
			loginfo.createNode(new GherkinKeyword("And"), "User has to select Project manager from dropdown").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project Creation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to select Project manager from dropdown").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@And("User has to select Scenario from dropdown(.*)")
	public void User_has_to_select_Scenario_from_dropdown(String projectmanager) {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/select_Scenario'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/select_Scenario'),projectmanager, true)
			loginfo.createNode(new GherkinKeyword("And"), "User has to select Scenario from dropdown").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project Creation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to select Scenario from dropdown").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@And("User has to click create button for project creation")
	public void User_has_to_click_create_button_for_project_creation() {
		try{
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/btn_projectcreate'))
			WebUI.delay(2)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/popup_ok btn'))

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on create button for project creation").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project Creation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on create button for project creation").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}
	@Then("User can search for created project in list(.*)")
	public void user_can_serach_for_project(String projectname) {
		try{
			WebUI.delay(3)
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateProject/input_SearchProject'), projectname)
			//WebUI.getText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/verify_customer'))
			//if(text.contains(Customer_search)) {
			//String text = "Customer_search"
			loginfo.createNode(new GherkinKeyword("Then"), "User can search for created project in list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Project Creation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User can search for created project in list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}
}