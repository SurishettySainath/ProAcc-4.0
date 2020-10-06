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

class ResourceAllocation_StepDef {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User is on Resource Allocation page(.*)")
	public void user_is_on_Resource_Allocation_page(String Phases) {
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
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Pre-Conversion/Pre-Conversion_PM'))
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Pre-Conversion/ResourceAllocation_Pre-Conversion_PM'))

			}

			else if (Phase3.equalsIgnoreCase(Phases))
			{
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Conversion/Conversion_PM'))
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Conversion/ResourceAllocation_Conversion_PM'))

			}
			else if (Phase4.equalsIgnoreCase(Phases))
			{
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Post-Conversion/Post-Conversion'))
				WebUI.click(findTestObject('Object Repository/Pro_Acc_Post-Conversion/ResourceAllocation_Post-Conversion_PM'))

			}


			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Assessment'))

			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Resource Allocation'))
			loginfo= extent.createTest(Feature.class,"Resource Allocation functionality");
			loginfo=loginfo.createNode(Scenario.class,"Resource Allocation");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on Resource Allocation page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Resource Allocation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on Resource Allocation page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@When("User has to select Project Name(.*) and Instance Name(.*) from the dropdown for Resource Allocation")
	public void user_has_to_select_Project_Name_and_Instance_Name_from_the_dropdown_for_Resource_Allocation(String ProjectnameforResourceAllocation, String InstancenameforResourceAllocation) {

		try{
			WebUI.delay(2)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/select_SelectProject'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/select_SelectProject'),
					ProjectnameforResourceAllocation, true)
			WebUI.delay(2)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/select_SelectInstance'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/select_SelectInstance'), InstancenameforResourceAllocation,
					true)
			WebUI.delay(2)
			loginfo.createNode(new GherkinKeyword("When"), "User has to select Customer Name, Project Name and Instance Name from the dropdown for Resource Allocation").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Resource Allocation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select Customer Name, Project Name and Instance Name from the dropdown for Resource Allocation").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User has to click on select instance button for Resource Allocation")
	public void user_has_to_click_on_select_instance_button_for_Resource_Allocation() {
		try{

			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/button_Select Instance'))

			WebUI.delay(2)
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on select instance button for Resource Allocation").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Resource Allocation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on select instance button for Resource Allocation").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User should allocate owner(.*)for a particular task")
	public void user_should_allocate_owner_for_a_particular_task(String Owneroftask) {
		try{
			String xpath_Upload_Site = "//*[@id='jqGrid']/tbody/tr"

			int rowCount_Upload_SMW_Site = (new OnlineKeywords()).countRowsPerPage(xpath_Upload_Site)

			println "rowCount :" +rowCount_Upload_SMW_Site

			//						 if (rowCount_Upload_SMW_Site  > 0){
			WebUI.delay(3)
			for (int k=1;k<=rowCount_Upload_SMW_Site-1;k++) {

				//Edit Button

				TestObject task1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="jEditButton_'+k+'"]/span', true)

				WebUI.delay(2)
				println(task1)
				WebUI.click(task1)

				//Select user from drop down
				WebUI.delay(2)

				TestObject task2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="'+k+'_UserID"]', true)

				WebUI.selectOptionByLabel(task2, Owneroftask, true)
				WebUI.delay(3)

				//Save Button
				TestObject submit = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="jSaveButton_'+k+'"]/span', true)


				WebUI.click(submit)

			}
			loginfo.createNode(new GherkinKeyword("And"), "User should allocate owner for a particular task").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Resource Allocation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User should allocate owner for a particular task").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}


	@Then("User should select instance successfully for Resource Allocation")
	public void user_should_select_instance_successfully_for_Resource_Allocation() {
		try{
			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_ResourceAllocation/a_Assessment'))
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Logout/User_Click'))

			WebUI.click(findTestObject('Object Repository/Pro_Acc_Logout/Logout'))

			loginfo.createNode(new GherkinKeyword("Then"), "User should select instance successfully for Resource Allocation").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Resource Allocation")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User should select instance successfully for Resource Allocation").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
}


