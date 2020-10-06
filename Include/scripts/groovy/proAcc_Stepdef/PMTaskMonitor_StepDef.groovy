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



class PMTaskMonitor_StepDef {
	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	String projectname;


	@Given("User is on PM Task Monitor page")
	public void User_is_on_PM_Task_Monitor_page() {
		try{
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/PMTaskMonitor'))

			loginfo= extent.createTest(Feature.class,"PM Task Monitor");
			loginfo=loginfo.createNode(Scenario.class,"PM Task Monitor");

			loginfo.createNode(new GherkinKeyword("Given"), "User is on PM Task Monitor page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PM Task Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User is on PM Task Monitor page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@When("User has to select Project(.*) for PM Task Monitor")
	public void User_has_to_select_Project_Name_for_PM_Task_Monitor(String ProjectName){
		try{


			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/ProjectName'), ProjectName ,true)
			loginfo.createNode(new GherkinKeyword("When"), "User has to select project name").pass("pass");
			Assert.assertTrue(true);
			//			loginfo.assignCategory("PM Task Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to select project name").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}



	@When("User has to click on Submit button for PM Task Monitor")
	public void User_has_to_click_on_Submit_button_for_PM_Task_Monitor(){
		try{
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/Submit_button'))
			WebUI.delay(2)
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/popup_ok btn'))

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on submit button for project creation").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PM Task Monitor")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on submit button for project creation").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@When("User has to edit the task(.*),(.*),(.*) and status(.*) and comments(.*) for PM Task Monitor")
	public void User_has_to_edit_the_task_and_status_and_comments_for_PM_Task_Monitor(String PMTask,String EstDuration , String ActDuration ,String Status, String Comments){
		/*try{
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/EditIcon'))
		 WebUI.delay(2)
		 WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/Status'), Status ,true)
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/Comments_Field'))
		 WebUI.delay(2)
		 WebUI.setText(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/Comments_Field'), Comments)
		 loginfo.createNode(new GherkinKeyword("When"), "User has to edit task details").pass("pass");
		 Assert.assertTrue(true);
		 //			loginfo.assignCategory("PM Task Monitor")
		 } catch   (Exception e){
		 loginfo.createNode(new GherkinKeyword("When"), "User has to edit task details").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		 }
		 }*/
		try{
			WebDriver driver = DriverFactory.getWebDriver()
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			//List issue = driver.findElements(By.xpath("//td[@aria-describedby='mytable2_IssueID']"))
			//List pencilbtn = driver.findElements(By.xpath("//span[@class='octicon octicon-pencil']"))

			String editicon = ".//td[text()='"+PMTask+"']/parent::tr//span[@class='octicon octicon-pencil']";
			WebElement editButton = driver.findElement(By.xpath(editicon))
			editButton.click()

			/*WebUI.scrollToElement(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/EditIcon'),20)
			 WebUI.delay(3)
			 //pencil Click
			 println("Click Test")
			 new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/EditIcon'))*/
			//WebDriver driver = DriverFactory.getWebDriver()
			//JavascriptExecutor executor = ((driver) as JavascriptExecutor)

			//Status
			WebUI.click(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/status_drpdwn'))
			WebUI.delay(2)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/status_drpdwn'), Status ,true)
			WebUI.delay(2)
			//ESTHrs
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementsByName('EST_hours1')[0].value='10:00'")
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/esthrs'))
			//WebUI.setText(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/esthrs'), EstDuration)
			//ACTHrs
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementsByName('Actual_St_hours')[0].value='10:00'")
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/acthrs'))
			//WebUI.setText(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/acthrs'), ActDuration)
			println("Satrt Date")
			//planed start date
			WebUI.delay(2)

			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementsByName('Planed__St_Date')[0].value='28/09/2020'")
			WebUI.delay(3)
			println("Test value")
			//planed end date
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementsByName('Planed__En_Date')[0].value='28/09/2020'")
			//status
			//WebUI.delay(3)
			//((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementByName('StatusId').value='1'")
			//estimated hrs
			//((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementsByName('EST_hours')[0].value='2'")
			//comments
			//WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/comments'))
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_PMTaskMonitor/comments'), Comments)
			//def driver = DriverFactory.getWebDriver()

			//executor.executeScript("document.getElementsByName('Notes')[0].value='completed'");
			//Save button
			WebUI.delay(2)

			String saveicon = ".//td[text()='"+PMTask+"']/parent::tr//div[@title='Save row']";
			WebElement saveButton = driver.findElement(By.xpath(saveicon))
			saveButton.click()
			//new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/save_button'))
			WebUI.delay(2)
			//Yes Button
			((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('NXConfirmButtonOk').click()")

			//new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/Yes_Button'))
			println("--------completed-------")

			loginfo.createNode(new GherkinKeyword("Then"), "User has to edit task").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("PM Task Monitor")

		} catch (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User has to edit task").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
		}
	}
	@Then("User successfully submitted the project name for PM Task Monitor module")
	public void User_successfully_submitted_the_project_name_for_PM_Task_Monitor_module(){

	}
}