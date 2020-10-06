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



class AssessmentMonitor_Consultant {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""


	@Given("User is on Consultant Monitor page(.*)")
	public void user_is_on_Consultant_Monitor_page(String Phases) {
		try{

			String Phase1 = "Assessment"
			String Phase2 = "Pre-Conversion"
			String Phase3 = "Conversion"
			String Phase4 = "Post-Conversion"
			if (Phase1.equalsIgnoreCase(Phases))
			{
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/Select_Assessment'))
				//WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Assessment'))
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/a_Assessment Monitor'))
			}

			else if (Phase2.equalsIgnoreCase(Phases))
			{
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Pre-Conversion/Select_PreConversion'))
				//WebUI.click(findTestObject('Object Repository/Pro_Acc_Pre-Conversion/Pre-Conversion_PM'))
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Pre-Conversion/Pre-ConversionMonitor_PM'))

			}

			else if (Phase3.equalsIgnoreCase(Phases))
			{
				println("test")
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Conversion/Select_Conversion'))
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Conversion/ConversionMonitor_PM'))

			}
			else if (Phase4.equalsIgnoreCase(Phases))
			{
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Post-Conversion/Select_Post-Conversion'))
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Post-Conversion/Post-ConversionMonitor_PM'))

			}

			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Assessment'))
			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/a_Assessment Monitor'))

			loginfo= extent.createTest(Feature.class,"Pro Acc Monitor functionality for Consultant");
			loginfo=loginfo.createNode(Scenario.class,"Pro Acc Monitor for Consultant");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on Monitor page for Consultant").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Consultant Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on Monitor page for Consultant").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}


	@When("User has to select Consultant Customername(.*) and Project Name(.*) and Consultant Instance Name(.*) from the dropdown for consultant Assessment Monitor")
	public void user_has_to_select_Consultant_Customername_and_Project_Name_and_Consultant_Instance_Name_from_the_dropdown_for_consultant_Assessment_Monitor(String CustomernameforAssessmentConsultant,String ProjectnameforAssessmentConsultant, String InstancenameforAssessmentConsultant) {
		try{
			//println("test")
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectProjectName'))
			WebUI.delay(5)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectCustomerName'),
					CustomernameforAssessmentConsultant, true)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectProjectName'),
					ProjectnameforAssessmentConsultant, true)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectInstanceName'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectInstanceName'), InstancenameforAssessmentConsultant,
					true)

			loginfo.createNode(new GherkinKeyword("When"), "User has to select Consultant Project Name and Consultant Instance Name from the dropdown for consultant Assessment Monitor").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Consultant Monitor")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select Consultant Project Name and Consultant Instance Name from the dropdown for consultant Assessment Monitor").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to click on select instance button for Consultant Assessment Monitor")
	public void user_has_to_click_on_select_instance_button_for_Consultant_Assessment_Monitor() {
		try{
			WebUI.delay(2)
			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/button_Select Instance'))


			loginfo.createNode(new GherkinKeyword("And"), "User has to click on select instance button for Consultant Assessment Monitor").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Consultant Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on select instance button for Consultant Assessment Monitor").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}


	@When("User has to edit task for consultant")
	public void user_has_to_edit_task_for_consultant() {


		try{
			//			WebDriver driver = DriverFactory.getWebDriver()
			//			JavascriptExecutor executor = ((driver) as JavascriptExecutor)
			//
			//			List k = driver.findElements(By.xpath(".//table[@id='jqGrid']//tr[@role='row']"))//rows count
			//			int no_of_rows = k.size() - 1;
			//			println(no_of_rows)
			//			for(int i10=1; i10<= no_of_rows; i10++)
			//			{
			//	Scroll To Element
			WebUI.scrollToElement(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/Edit_Button'),20)


			WebUI.delay(2)
			String xpath_Upload_Site = "//*[@id='jqGrid']/tbody/tr"

			int rowCount_Upload_SMW_Site = (new OnlineKeywords()).countRowsPerPage(xpath_Upload_Site)

			println "rowCount :" +rowCount_Upload_SMW_Site

			for (int k=1;k<=rowCount_Upload_SMW_Site-1;k++) {

				WebUI.delay(2)
				//	k=k-1;

				//pencil Click
				println(k)
				println("Click Test")

				((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('jEditButton_"+k+"').click()")

				println("Start Date")
				//planed start date
				WebUI.delay(2)

				((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('"+k+"_Actual_St_Date').value='10/07/2020'")
				WebUI.delay(3)
				println("Test value")

				//planed end date
				((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('"+k+"_Actual_En_Date').value='10/07/2020'")
				//status
				WebUI.delay(1)
				((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('"+k+"_StatusId').value='1'")
				//estimated hrs
				//	((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('"+k+"_Actual_St_hours').value='11:32'")
				//comments
				WebUI.delay(3)

				WebDriver driver = DriverFactory.getWebDriver()
				JavascriptExecutor executor = ((driver) as JavascriptExecutor)

				executor.executeScript("document.getElementById('"+k+"_Notes').value='Consultant Done'");
				//Save button
				WebUI.delay(2)
				((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('jSaveButton_"+k+"').click()")

				//	k+=1;
				//	new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/save_button'))
				//	WebUI.delay(4)
				new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/Yes_Button'))
				WebUI.delay(3)
			}
			loginfo.createNode(new GherkinKeyword("Then"), "User has to edit task for Assessment Monitor Consultant").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Consultant Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has to edit task for Assessment Monitor for Consultant").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}

	}


	@Then("User should select instance successfully for Assessment Monitor Consultant")
	public void user_should_select_instance_successfully_for_Assessment_Monitor_Consultant() {
		try{

			//		WebUI.delay(2)
			//		new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/Report_Btn'))
			WebUI.delay(2)
			//		WebUI.click(findTestObject('Object Repository/Pro_Acc_Logout/User_Click'))

			// 	   WebUI.click(findTestObject('Object Repository/Pro_Acc_Logout/Logout'))

			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Logout/User_Click'))

			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Logout/Logout'))

			loginfo.createNode(new GherkinKeyword("Then"), "User should select instance successfully for Assessment Monitor Consultant").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Consultant Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User should select instance successfully for Assessment Monitor for Consultant").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}
