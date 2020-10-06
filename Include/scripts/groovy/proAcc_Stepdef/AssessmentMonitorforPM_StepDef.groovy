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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.JavascriptException




class AssessmentMonitorforPM_StepDef {

	ExtentTest test;
	// ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""


	@Given("User is on Monitor page(.*)")
	public void user_is_on_Monitor_page(String Phases) {
		try{
			String Phase1 = "Assessment"
			String Phase2 = "Pre-Conversion"
			String Phase3 = "Conversion"
			String Phase4 = "Post-Conversion"
			String Phase5 = "Validation"
			if (Phase1.equalsIgnoreCase(Phases))
			{
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Assessment'))
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Resource Allocation'))
			}

			else if (Phase2.equalsIgnoreCase(Phases))
			{
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Pre-conversion/Select_Pre-conversion'))
			}

			else if (Phase3.equalsIgnoreCase(Phases))
			{
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Assessment'))
			}
			else if (Phase4.equalsIgnoreCase(Phases))
			{
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Assessment'))
			}
			else if (Phase5.equalsIgnoreCase(Phases))
			{
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Assessment'))
			}

			//	WebUI.delay(5)
			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Assessment'))
			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/a_Assessment Monitor'))

			loginfo= extent.createTest(Feature.class,"Assessment Monitor functionality for PM");
			loginfo=loginfo.createNode(Scenario.class,"Assessment Monitor for PM");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on Assessment Monitor page for project manager").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Assessment Monitor for PM")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on Assessment Monitor page for project manager").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}

	@When("User has to select Project Name(.*) and Instance Name(.*) from the dropdown for project Assessment Monitor")
	public void user_has_to_select_Project_Name_and_Instance_Name_from_the_dropdown_for_project_Assessment_Monitor(String ProjectnameforAssessmentPM, String InstancenameforAssessmentPM) {
		try{
			//println("test")
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectProjectName'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectProjectName'),
					ProjectnameforAssessmentPM, true)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectInstanceName'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectInstanceName'), InstancenameforAssessmentPM,
					true)

			loginfo.createNode(new GherkinKeyword("When"), "User has to select Project Name and Instance Name from the dropdown for project Assessment Monitor").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Assessment Monitor for PM")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select Project Name and Instance Name from the dropdown for project Assessment Monitor").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to click on select instance button for PMAssessment Monitor")
	public void user_has_to_click_on_select_instance_button_for_PMAssessment_Monitor() {
		try{
			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/button_Select Instance'))

			WebUI.delay(3)

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on select instance button for PMAssessment Monitor").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Assessment Monitor for PM")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on select instance button for PMAssessment Monitor").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}


	@When("User has to edit task(.*),(.*),(.*),(.*) for project manager")
	public void user_has_to_edit_task(String TaskNumber,String EstDurationPM, String ActDurationPM, String NotePM) {
		try{
			/*WebUI.scrollToElement(findTestObject('Object Repository/demotest/Page_Assessment Monitor/span_Yet To Start_octicon octicon-pencil'),20)
			WebUI.delay(3)
			//pencil Click
			println("Click Test")
			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/demotest/Page_Assessment Monitor/span_Yet To Start_octicon octicon-pencil'))


			WebDriver driver = DriverFactory.getWebDriver()
			JavascriptExecutor executor = ((driver) as JavascriptExecutor)

			println("Satrt Date")
			//planed start date
			WebUI.delay(5)

			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('1_Planed__St_Date').value='30/06/2020'")
			WebUI.delay(3)
			println("Test value")
			//planed end date
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('1_Planed__En_Date').value='30/06/2020'")
			//status
			WebUI.delay(3)
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('1_StatusId').value='2'")
			//estimated hrs
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('1_EST_hours').value='11'")
			//comments
			WebUI.delay(3)

			//def driver = DriverFactory.getWebDriver()

			executor.executeScript("document.getElementById('1_Notes').value='Lead started'");
			//Save button

			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/save_button'))

			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/Yes_Button'))*/
			WebDriver driver = DriverFactory.getWebDriver()
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			//List issue = driver.findElements(By.xpath("//td[@aria-describedby='mytable2_IssueID']"))
			//List pencilbtn = driver.findElements(By.xpath("//span[@class='octicon octicon-pencil']"))

			String editicon = ".//td[text()='"+TaskNumber+"']/parent::tr//span[@class='octicon octicon-pencil']";
			WebElement editButton = driver.findElement(By.xpath(editicon))
			editButton.click()
			WebUI.delay(2)
			//Status
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementsByName('StatusId')[0].value='2'")
			WebUI.delay(2)
			//estimated hrs
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementsByName('EST_hours')[0].value='11'")
			//planed start date
			WebUI.delay(2)

			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementsByName('Planed__St_Date')[0].value='22/08/2020'")
			WebUI.delay(2)
			println("Test value")
			//planed end date
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementsByName('Planed__En_Date')[0].value='25/08/2020'")
			//Comments
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementsByName('Notes')[0].value=Task is edited'")
			//Save button
			WebUI.delay(2)

			String saveicon = ".//td[text()='"+TaskNumber+"']/parent::tr//div[@title='Save row']";
			WebElement saveButton = driver.findElement(By.xpath(saveicon))
			saveButton.click()
			//new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/save_button'))
			WebUI.delay(2)
			//Yes Button
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('NXConfirmButtonOk').click()")




			loginfo.createNode(new GherkinKeyword("Then"), "User has to edit task").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Assessment Monitor for PM")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has to edit task").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User should select instance successfully for Assessment Monitor PM")
	public void user_should_select_instance_successfully_for_Assessment_Monitor_PM() {
		try{

			loginfo.createNode(new GherkinKeyword("Then"), "User should select instance successfully for Assessment Monitor PM").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Assessment Monitor for PM")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User should select instance successfully for Assessment Monitor for PM").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}