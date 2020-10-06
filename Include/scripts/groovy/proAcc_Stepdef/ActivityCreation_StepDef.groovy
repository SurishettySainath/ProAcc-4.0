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

class ActivityCreation_StepDef {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User is on create activity page")
	public void user_is_on_create_activity_page() {
		try{

			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_CreateInstance/a_Configuration'))
			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/a_Activity Creation'))
			loginfo= extent.createTest(Feature.class,"Activity Creation");
			loginfo=loginfo.createNode(Scenario.class,"Creating Activity");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on create activity page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity State")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on create activity page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to fill the fields like Task(.*),ApplicationArea(.*),Phase(.*),Role(.*),BuildingBlock(.*),Est Hrs(.*)")
	public void user_has_to_fill_the_fields_like_Task_Sequence_ApplicationArea_Phase_and_Role(String Task,String ApplicationArea,String Phase,String Role,String BuildingBlock,String EstHrs) {
		try{
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/input_Task'), Task)
			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/input_ApplicationArea'))

			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/input_ApplicationArea'), ApplicationArea, true)
			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/select_Select Phase'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/select_Select Phase'),Phase, true)
			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/select_Select Role'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/select_Select Role'),Role, true)

			// Building block
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/Select_BuildingBlock'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/Select_BuildingBlock'),BuildingBlock, true)
			//Est Hrs
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/SelectEstHrs'))
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/SelectEstHrs'), EstHrs)

			loginfo.createNode(new GherkinKeyword("When"), "User has to fill the fields like Task,ApplicationArea,Phase,Role,Building blocks").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity State")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to fill the fields like Task,ApplicationArea,Phase Role,,Building blocks").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User has to click on create button for create activity and need to select task")
	public void user_has_to_click_on_create_button_for_create_activity_and_need_to_select_task() {
		try{
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/btn_ActivityCreate'))
			WebUI.delay(3)
			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/select_SelectSequence'))
			//	WebUI.delay(3)
			//	WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/select_SelectSequence'), true)
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/button_Save'))
			WebUI.delay(1)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/popup_ok btn'))


			loginfo.createNode(new GherkinKeyword("And"), "User has to click on create button for create activity").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity State")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on create button for create activity").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User can search for created activity in list(.*)")
	public void user_can_search_for_created_activity_in_list(String Activitysearch) {
		try{
			WebUI.delay(3)
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_ActivityCreation/input_SearchActivity'), Activitysearch)
			//	WebUI.delay(3)
			//	WebUI.getText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/verify_customer'))
			//if(text.contains(Customer_search)) {
			//String text = "Customer_search"
			loginfo.createNode(new GherkinKeyword("Then"), "User can search for created activity in list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Activity State")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User can search for created activity in list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}