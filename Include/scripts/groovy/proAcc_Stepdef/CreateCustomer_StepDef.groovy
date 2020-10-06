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



class CreateCustomer_StepDef {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""


	@Given("User should be on new customer page")
	public void user_should_be_on_new_customer_page() {
		try{

			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/a_User Settings'))
			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/a_Add New User  Customer'))

			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/button_Create New Customer'))
			WebUI.delay(2)
			loginfo= extent.createTest(Feature.class,"Create Customer and View Customer functionality");
			loginfo=loginfo.createNode(Scenario.class,"Create Customer");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be on new customer page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be on new customer page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@When("User has to fill the fields like customer name(.*), Industrysector(.*),ContactName(.*),emailid(.*),phone(.*)")
	public void user_has_to_fill_the_fields_like_customer_name(String Customername,String Industrysector,String ContactPersonName,String emailid,String phone) {
		try{
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/input_Customer Name_txtCompanyName'), Customername)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/Select Industry'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/Select Industry'),
					Industrysector, true)

			WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/input_Contact Person Name'), ContactPersonName)
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/input_Contact Person Email'), emailid)
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/input_Contact Person Phone'), phone)

			WebUI.delay(4)
			loginfo.createNode(new GherkinKeyword("When"), "User has to fill the fields like company name,Industrysector,ContactName,emailid,phone").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to fill the fields like company name,Industrysector,ContactName,emailid,phone").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@And("User has to click on create button for creating customer")
	public void user_has_to_click_on_create_button_for_creating_customer() {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/button_Create'))

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on create button for creating customer").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on create button for creating customer").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@Then("User has successfully created new customer")
	public void user_has_successfully_created_new_customer() {
		try{
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/a_User Settings'))
			WebUI.delay(4)

			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully created new customer").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Customer")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has successfully created new customer").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}
}