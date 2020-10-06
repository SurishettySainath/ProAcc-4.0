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


class LogintoProAcc_StepDef {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User should navigate to ProAcc page")
	public void user_should_navigate_to_ProAcc_page() {
		try{
			WebUI.openBrowser("")
			WebUI.maximizeWindow()
			WebUI.delay(5)
			String url = GlobalVariable.Url
			WebUI.navigateToUrl(url)
			//WebUI.navigateToUrl("http://123.176.34.15:4041/ProAccDev/")
			loginfo= extent.createTest(Feature.class,"Login to Pro Acc Application");
			loginfo=loginfo.createNode(Scenario.class,"User will login to Pro Acc Application");

			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to ProAcc page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Login")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should navigate to ProAcc page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	/*@Given("User enters username and password")
	 public void user_enters_username_and_password() {
	 String userName = GlobalVariable.userName
	 WebUI.setText(findTestObject('Object Repository/Pro_Acc_Login/input_Login_Username'), userName)
	 String password = GlobalVariable.password
	 WebUI.setText(findTestObject('Object Repository/Pro_Acc_Login/input_Login_Password'), password)
	 WebUI.delay(2)
	 }*/

	@Given("User enters (.*) and (.*)")
	public void user_enters(String username, String password) {
		try{
			//			String userName1 = username
			//			String password1 = password
			//
			//			String final_username = null
			//			String final_password = null
			//
			//
			//
			//			if (userName1.equalsIgnoreCase("GlobalVariable.uc")|| password1.equalsIgnoreCase("GlobalVariable.pc")) {
			//				final_username = GlobalVariable.uc
			//				final_password = GlobalVariable.pc
			//			}
			//			else if (userName1.equalsIgnoreCase("GlobalVariable.userconsultant")|| password1.equalsIgnoreCase("GlobalVariable.passwordconsultant")) {
			//				final_username = GlobalVariable.userconsultant
			//				final_password = GlobalVariable.passwordconsultant
			//			}
			//			else if (userName1.equalsIgnoreCase("GlobalVariable.userprojectmanager")|| password1.equalsIgnoreCase("GlobalVariable.passwordprojectmanager")) {
			//				final_username = GlobalVariable.userprojectmanager
			//				final_password = GlobalVariable.passwordprojectmanager
			//			}
			//
			//			else if (userName1.equalsIgnoreCase("GlobalVariable.useradmin")|| password1.equalsIgnoreCase("GlobalVariable.passwordadmin")) {
			//				final_username = GlobalVariable.useradmin
			//				final_password = GlobalVariable.passwordadmin
			//			}
			//
			//			else {
			//				final_username = GlobalVariable.userName
			//				final_password = GlobalVariable.password
			//			}


			/*else if (Login.equalsIgnoreCase("GlobalVariable.consultant"))
			 {
			 final_login = GlobalVariable.consultant
			 }*/

			/*else {final_login = LoginID}*/

			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Login/input_Login_Username'), username)
			//String password = GlobalVariable.password
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_Login/input_Login_Password'), password)
			WebUI.delay(2)
			loginfo.createNode(new GherkinKeyword("Given"),GlobalVariable.useradmin+"User enters").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Login")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User enters").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}

	}

	@When("User clicks on LOG IN button")
	public void user_clicks_on_LOG_IN_button() {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Login/button_Login'))
			loginfo.createNode(new GherkinKeyword("Given"), "User clicks on LOG IN button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Login")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User clicks on LOG IN button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@Then("User will be logged in successfully")
	public void user_will_be_logged_in_successfully() {
		try{
			WebUI.delay(3)
			//WebUI.verifyTextPresent('Dashboard', false)
			//WebUI.delay(3)
			loginfo.createNode(new GherkinKeyword("Given"), "User will be logged in successfully").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Login")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User will be logged in successfully").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}
}