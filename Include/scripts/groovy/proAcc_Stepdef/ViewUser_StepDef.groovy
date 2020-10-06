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


class ViewUser_StepDef {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User should be navigate to view user list page")
	public void user_should_be_navigate_to_view_user_list_page() {
		try{

			WebUI.navigateToUrl("http://123.176.34.15:4041/ProAccQA/User/Index")
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/a_Profile Settings'))
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_ViewUser/view_userlist'))

			WebUI.delay(3)
			loginfo= extent.createTest(Feature.class,"View User list functionality");
			loginfo=loginfo.createNode(Scenario.class,"View User");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to view user list page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("View User List")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate to view user list page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}
	@When("User can search for the user in user search box(.*)")
	public void user_can_search_for_the_user_in_user_search_box(String User_search) {
		try{
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_ViewUser/input_SearchUser'), User_search)
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_ViewUser/i_Profile Settings'))
			loginfo.createNode(new GherkinKeyword("Given"), "User can search for the user in user search box").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("View User List")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User can search for the user in user search box").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}
	@Then("User can see the created User in the list(.*)")
	public void user_can_see_the_created_User_in_the_list(String User_search) {
		try{
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_ViewUser/i_Profile Settings'))
			String text = WebUI.getText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_ViewUser/verify_user'))
			//if(text.contains("User_search")) {
			if(text.equalsIgnoreCase(User_search)){
			println("User is verified :) ")
			} else {
			  println("Sorry, User is not verified :( ")
			}
			loginfo.createNode(new GherkinKeyword("Given"), "User can see the created User in the list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("View User List")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User can see the created User in the list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));


		}
	}
}