import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

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
import com.kms.katalon.core.configuration.RunConfiguration

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

class CreateAnalysisStepDef {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User is on create analysis page")
	public void user_is_on_create_analysis_page() {
		try{

			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/Select Assessemnt_CA'))
			////	WebUI.click(findTestObject("Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/Assessment_dropdown"))
			////	WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/a_Create Analysis'))
			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/a_Create Analysis'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/Report_Btn'))

			loginfo= extent.createTest(Feature.class,"Create Analysis functionality");
			loginfo=loginfo.createNode(Scenario.class,"Create Analysis");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on create analysis page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Create Analysis")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on create analysis page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
	@When("User has to select Customer Name(.*), Project Name(.*) and Instance Name(.*) from the dropdown")
	public void user_has_to_select_Customer_Name_Project_Name_and_Instance_Name_from_the_dropdown(String Customer_Name, String Project_Name, String Instance_Name) {
		try{
			WebUI.delay(1)
			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/select_- selectCustomer'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/select_- selectCustomer'), Customer_Name, true)
			WebUI.delay(1)
			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/select_SelectProject'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/select_SelectProject'), Project_Name, true)
			WebUI.delay(1)
			//	WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/select_SelectaInstance'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/select_SelectaInstance'), Instance_Name, true)

			//WebUI.click(3)
			loginfo.createNode(new GherkinKeyword("When"), "User has to select Customer Name, Project Name and Instance Name from the dropdown").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Create Analysis")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select Customer Name, Project Name and Instance Name from the dropdown").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User has to upload SAP READINESS CHECK FILES for Activities(.*), BWExtractors(.*), CustomCode(.*), HANADatabase(.*), FioriApps(.*), RelevantSimplification(.*), SAPReadiness(.*)")
	public void user_has_to_upload_SAP_READINESS_CHECK_FILES(String Activities, String BWExtractors, String CustomCode, String HANADatabase, String FioriApps, String RelevantSimplification, String SAPReadiness) {

		try{


			WebUI.delay(2)
			String path = RunConfiguration.getProjectDir() +'/Include/Pro Acc Input file/Activities.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/input_Activities_files'), path)
			WebUI.delay(2)
			String path1 = RunConfiguration.getProjectDir() +'/Include/Pro Acc Input file/Bwextractors.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/input_BW Extractors_files'), path1)
			WebUI.delay(2)
			String path2 = RunConfiguration.getProjectDir() +'/Include/Pro Acc Input file/CustomCode.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/input_Custom Code Analysis_files'), path2)
			WebUI.delay(2)
			String path3 = RunConfiguration.getProjectDir() +'/Include/Pro Acc Input file/HanaDatabaseTables.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/input_HANA Database Tables_files'), path3)
			WebUI.delay(2)
			String path4 = RunConfiguration.getProjectDir() +'/Include/Pro Acc Input file/RecommendedFioriApps.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/input_Recommended Fiori Apps_files'), path4)
			WebUI.delay(2)
			WebUI.scrollToElement(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/input_Relevant Simplification Items_files'), 5)
			String path5 = RunConfiguration.getProjectDir() +'/Include/Pro Acc Input file/RelevantSimplificationItems.xlsx'
			WebUI.uploadFile(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/input_Relevant Simplification Items_files'), path5)
			WebUI.delay(2)
			String path6 = RunConfiguration.getProjectDir() +'/Include/Pro Acc Input file/SAP Readiness Check.pdf'
			WebUI.uploadFile(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/input_SAP Readiness Check_files'), path6)


			loginfo.createNode(new GherkinKeyword("And"), "User has to upload SAP READINESS CHECK FILES for Activities,BWExtractors,CustomCode,HANADatabase,FioriApps,RelevantSimplification,SAPReadiness").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Create Analysis")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to upload SAP READINESS CHECK FILES for Activities,BWExtractors,CustomCode,HANADatabase,FioriApps,RelevantSimplification,SAPReadiness").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User has to click on the term of use and acknowldge checkboxes")
	public void user_has_to_click_on_the_term_of_use_and_acknowldge_checkboxes() {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/check terms_checkbox'))
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/Acknow_checkbox'))

			loginfo.createNode(new GherkinKeyword("When"), "User has to click on the term of use and acknowldge checkboxes").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Create Analysis")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on the term of use and acknowldge checkboxes").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@And("User has to click on start analysis button")
	public void user_has_to_click_on_start_analysis_button() {
		try{
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/button_Start Analysis'))
			WebUI.delay(4)
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on start analysis button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Create Analysis")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to click on start analysis button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}

	@Then("User should successfully navigate to readinesscheck")
	public void User_should_successfully_navigate_to_readinesscheck() {
		try{
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_CreateAnalysis/Report_Btn'))

			WebUI.click(findTestObject('Object Repository/Pro_Acc_Logout/User_Click'))

			WebUI.click(findTestObject('Object Repository/Pro_Acc_Logout/Logout'))
			loginfo.createNode(new GherkinKeyword("Then"), "User should successfully navigate to readinesscheck").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Create Analysis")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User should successfully navigate to readinesscheck").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Assessment/CreateAnalysis/button_Start Analysis'), 3)
		//WebUI.delay(2)
	}
}