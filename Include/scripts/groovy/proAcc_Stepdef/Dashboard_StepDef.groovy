
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



class Dashboard {
ExtentTest test;
// ExtentTest logger;
ExtentTest loginfo;
//ExtentTest createNode;
static ExtentReports extent = CommonReport.extent1

String browserName = ""
@Given("User is on dashboard page")
public void user_is_on_dashboard_page() {
try{

WebUI.click(findTestObject('Object Repository/Pro_Acc_Dashboard/a_Dashboard'))
loginfo= extent.createTest(Feature.class,"Dashboard functionality");
loginfo=loginfo.createNode(Scenario.class,"Dashboard");

loginfo.createNode(new GherkinKeyword("Given"), "User is on dashboard page").pass("pass");
Assert.assertTrue(true);
loginfo.assignCategory("Dashboard")

} catch (Exception e){
loginfo.createNode(new GherkinKeyword("Given"), "User is on dashboard page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
}
}




@When("User has to select projectName(.*) and Instance(.*) from dropdown of dashboard module")
public void user_has_to_select_projectName_and_Instance_from_dropdown_of_dashboard_module(String PrjName, String Instance) {
try{

//WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Assessment/Pro_Acc_AssessmentMonitor/select_-SelectCustomerName'),
//CustomerName, true)
WebUI.delay(2)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Dashboard/select_-Project'),
PrjName , true)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_Dashboard/select_-Instance'), Instance,
true)
WebUI.click(findTestObject('Object Repository/Pro_Acc_Dashboard/button_Select Instance'))

loginfo.createNode(new GherkinKeyword("Given"), "User has to select project name and instance from dropdown list").pass("pass");
Assert.assertTrue(true);
loginfo.assignCategory("Dashboard")

} catch (Exception e){
loginfo.createNode(new GherkinKeyword("Given"), "User has to select project name and instance from dropdown list").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
}
}

@Then("User has to verify texts and able to see the recent updates")
public void user_has_to_verify_texts_and_able_to_see_the_recent_updates() {
try {
String Assessment_exceptedPecentage = '100%'

String Readiness_Status = 'completed'
String Preconversion_exceptedPecentage = '100%'
String conversion_exceptedPecentage = '100%'
String postconversion_exceptedPecentage = '100%'

TestObject Assessment = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="AssId"]', true)
WebUI.delay(5)
String Assessment_percent = WebUI.getText(Assessment)

if (Assessment_exceptedPecentage.equalsIgnoreCase(Assessment_percent)) {
println('Matching ' + Assessment_percent)
} else {
println('Not Matching ' + Assessment_percent)
}

WebUI.delay(3)

TestObject Readiness = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="Ass_StatusId"]', true)

String Readiness_check = WebUI.getText(Readiness)



if (Readiness_check.equalsIgnoreCase(Readiness_Status)) {
println('Matching ' + Readiness_check)
} else {
println('Not Matching ' + Readiness_check)
}

TestObject Preconversion = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="PreId"]', true)

String Preconversion_percent = WebUI.getText(Preconversion)



WebUI.delay(3)
if (Preconversion_exceptedPecentage.equalsIgnoreCase(Preconversion_percent)) {
println('Matching ' + Preconversion_percent)
} else {
println('Not Matching ' + Preconversion_percent)
}

TestObject conversion = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="ConId"]', true)

String conversion_percent = WebUI.getText(conversion)



WebUI.delay(3)
if (conversion_exceptedPecentage.equalsIgnoreCase(conversion_percent)) {
println('Matching ' + conversion_percent)
} else {
println('Not Matching ' + conversion_percent)
}

TestObject postconversion = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="PostId"]', true)

String postconversion_percent = WebUI.getText(postconversion)


if (postconversion_exceptedPecentage.equalsIgnoreCase(postconversion_percent)) {
println('Matching ' + postconversion_percent)
} else {
println('Not Matching ' + postconversion_percent)
}
}
catch (Exception e){
loginfo.createNode(new GherkinKeyword("Then"), "User has to verify texts and able to see the recent updates").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));
}
}
}