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


class ViewIssue {

	ExtentTest test;
	ExtentTest loginfo;
	static ExtentReports extent = CommonReport.extent1
	String browserName = ""


	@Given("User should be navigate Issue List page")
	public void user_should_be_navigate_Issue_List_page() {

		try{

			WebUI.click(findTestObject('Object Repository/Pro_Acc_IssueTrack/a_IssueTracker'))
			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/Pro_Acc_IssueTrack/ViewIssue/a_Issue List'))
			WebUI.delay(2)

			loginfo= extent.createTest(Feature.class,"View Issue List");
			loginfo=loginfo.createNode(Scenario.class,"View Issue");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate Issue List page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("IssueTrack")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be navigate Issue List page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@When("User should select Project name(.*) and Instance name(.*) from the dropdown for issue list")
	public void user_should_select_Project_name_and_Instance_name_from_the_dropdown(String ProjectNameforIssuelist, String InstanceNameforIssuelist) {

		try{

			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_IssueTrack/Select_ProjName'),
					ProjectNameforIssuelist, true)

			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_IssueTrack/Select_InstName'),
					InstanceNameforIssuelist, true)

			WebUI.delay(4)
			loginfo.createNode(new GherkinKeyword("When"), "User has to fill the fields like project name and instance name").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("IssueTrack")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to fill the fields like project name and instance name").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}



	@When("User should click on select instance button for issue list")
	public void user_should_click_on_select_instance_button() {

		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_IssueTrack/Select_SelectInstance'))

			loginfo.createNode(new GherkinKeyword("And"), "User should click on select instance button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("IssueTrack")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User should click on select instance button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

}



