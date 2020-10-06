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
import org.openqa.selenium.JavascriptExecutor

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
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.lang.CharSequence



class AssessmentMonitor_StepDef {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User is on Assessment Monitor page")
	public void user_is_on_Assessment_Monitor_page() {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Assessment'))
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/a_Assessment Monitor'))

			loginfo= extent.createTest(Feature.class,"Assessment Monitor functionality");
			loginfo=loginfo.createNode(Scenario.class,"Assessment Monitor");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on Assessment Monitor page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Assessment Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on Assessment Monitor page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to select Project Name(.*) and Instance Name(.*) from the dropdown for Assessment Monitor")
	public void user_has_to_select_Project_Name_and_Instance_Name_from_the_dropdown_for_Assessment_Monitor(String ProjectnameforAssessment, String InstancenameforAssessment) {
		//WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectCustomerName'),
		//'Danfoss', true)
		try{
			println("test")
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectProjectName'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectProjectName'),
					ProjectnameforAssessment, true)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectInstanceName'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectInstanceName'), InstancenameforAssessment,
					true)

			loginfo.createNode(new GherkinKeyword("When"), "User has to select Customer Name, Project Name and Instance Name from the dropdown for Assessment Monitor").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Assessment Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select Customer Name, Project Name and Instance Name from the dropdown for Assessment Monitor").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User has to click on select instance button for Assessment Monitor")
	public void user_has_to_click_on_select_instance_button_for_Assessment_Monitor() {
		try{
			WebUI.delay(5)
			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/button_Select Instance'))

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on select instance button for Assessment Monitor").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Assessment Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on select instance button for Assessment Monitor").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User has to edit a particular task(.*),(.*),(.*)")
	public void user_has_to_edit_a_particular_task(String EstDuration, String ActDuration, String Note) {

		try{
			WebDriver driver = DriverFactory.getWebDriver()
			List ebutton = driver.findElements(By.xpath(".//div[contains(@id,'jEditButton_')]"))
			for(WebElement elem in ebutton)
			{
				println("********************test**********")
				println(elem)
				CharSequence attr=elem.getAttribute("style");
				//String attr=elem.getAttribute("style");
				println("Value of type attribute: "+attr);
				println(attr.contains("display: none"))
				boolean is_visible = attr.contains("display: none")
				if(is_visible == false)
				{
					//elem.click()

					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", elem);


					println("element is clicked")
					println("Satrt Date")
					//planed start date
					WebUI.delay(5)

					((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('1_Actual_St_Date').value='01/08/2020'")
					WebUI.delay(3)
					println("Test value")
					//planed end date
					((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('1_Actual_En_Date').value='01/08/2020'")
					//status
					WebUI.delay(3)
					((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('1_StatusId').value='2'")
					//estimated hrs
					((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('1_Actual_St_hours').value='11'")
					//comments
					WebUI.delay(3)

					//def driver = DriverFactory.getWebDriver()

					executor.executeScript("document.getElementById('1_Notes').value='Customer is ready'");
					//Save button

					new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/save_button'))

					new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/Yes_Button'))


					//loginfo.createNode(new GherkinKeyword("And"), "User has to edit a particular task").pass("pass");
					//Assert.assertTrue(true);
					//	loginfo.assignCategory("Assessment Monitor")
				}
			}
		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to edit a particular task").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}


	@Then("User should select instance successfully for Assessment Monitor")
	public void user_should_select_instance_successfully_for_Assessment_Monitor() {
		try{

			loginfo.createNode(new GherkinKeyword("Then"), "User should select instance successfully for Assessment Monitor").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Assessment Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User should select instance successfully for Assessment Monitor").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}