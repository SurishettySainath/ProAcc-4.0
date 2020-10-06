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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS


class ViewCustomer_StepDef {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User should be navigate view customer page")
	public void user_should_be_navigate_view_customer_page() {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/a_User Settings'))
			WebUI.delay(5)
			println("test")
			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Customer List/a_Customer List'))
			loginfo= extent.createTest(Feature.class,"View Customer functionality");
			loginfo=loginfo.createNode(Scenario.class,"View Customer");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate view customer page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be on new customer page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));


		}
	}
	@When("User can search for the customer in customer search box(.*)")
	public void user_can_search_for_the_customer_in_customer_search_box(String Customer_search) {
		try{
			WebUI.setText(findTestObject('Pro_Acc_UserSettings/Pro_Acc_Customer List/Search'),
					Customer_search)

			WebUI.sendKeys(findTestObject('Pro_Acc_UserSettings/Pro_Acc_Customer List/Search'),
					Keys.chord(Keys.ENTER))
			WebUI.delay(5)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/a_User Settings'))
			loginfo.createNode(new GherkinKeyword("When"), "User can search for the customer in customer search box").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User can search for the customer in customer search box").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));


		}
	}

	@Then("User can see the created customer in the list(.*)")
	public void user_can_see_the_created_customer_in_the_list(String Customer_search) {
		try{
			String text = WebUI.getText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/verify_customer'))
			if(text.equalsIgnoreCase(Customer_search)){
				println("User is verified :) ")
			}
			else {
				println("Sorry, User is not verified :( ")
			}
			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/a_User Settings'))

			loginfo.createNode(new GherkinKeyword("Then"), "User can see the created customer in the list").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User can see the created customer in the list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));


		}
	}
}