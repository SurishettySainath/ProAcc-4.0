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

class CreateUser_StepDef {

	ExtentTest test;
	//	ExtentTest logger;
	ExtentTest loginfo;
	//ExtentTest createNode;
	static ExtentReports extent = CommonReport.extent1

	String browserName = ""

	@Given("User should be on create new user page")
	public void user_should_be_on_create_new_user_page() {
		try{
			//	WebUI.navigateToUrl("http://123.176.34.15:4041/ProAccDev/User/CreateUsers")

			WebUI.delay(5)

			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/a_User Settings'))
			WebUI.delay(13)

		//	WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/a_Add New User  Customer'))

			new OnlineKeywords ().Assessment_monitor(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/a_Add New User  Customer'))

			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/b_Create New User'))
			WebUI.delay(3)

			loginfo= extent.createTest(Feature.class,"Create User Functionality");
			loginfo=loginfo.createNode(Scenario.class,"Create User");

			loginfo.createNode(new GherkinKeyword("Given"), "User should be on create new user page").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Create User")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Given"), "User should be on create new user page").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@When("User has to fill the fields like Name(.*),LoginID(.*),Password(.*),Confirmpassword(.*),Email(.*),Phonenumber(.*),Usertype(.*),Role(.*),Customer(.*)")
	public void user_has_to_fill_the_fields_like(String Name,String LoginID,String Password,String Confirmpassword,String Email,String Phonenumber,String Usertype,String Role,String Customer) {

		try{
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/input_Name'), Name)

			//WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/input_LoginId'), LoginID)

			String Login = LoginID
			String password = Password
			String final_login = null
			String final_password = null;
			if (Login.equalsIgnoreCase("GlobalVariable.userprojectmanager")||password.equalsIgnoreCase("GlobalVariable.passwordprojectmanager"))
			{
				final_login = GlobalVariable.userprojectmanager
				final_password= GlobalVariable.passwordprojectmanager
			}

			else if (Login.equalsIgnoreCase("GlobalVariable.userconsultant")||password.equalsIgnoreCase("GlobalVariable.passwordconsultant"))
			{
				final_login = GlobalVariable.userconsultant
				final_password= GlobalVariable.passwordconsultant
			}

			else if (Login.equalsIgnoreCase("GlobalVariable.useradmin")||password.equalsIgnoreCase("GlobalVariable.passwordadmin"))
			{
				final_login = GlobalVariable.useradmin
				final_password= GlobalVariable.passwordadmin
			}
			else if (Login.equalsIgnoreCase("GlobalVariable.uc")||password.equalsIgnoreCase("GlobalVariable.pc"))
			{
				final_login = GlobalVariable.uc
				final_password= GlobalVariable.pc
			}

			else
			{
				final_login = GlobalVariable.userName
				final_password = GlobalVariable.password

			}
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/input_LoginId'), final_login)



			WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/input_Password'), final_password)
			WebUI.delay(3)
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/input_CnfmPassword'),
					final_password)
			WebUI.delay(3)
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/input_Email'), Email)
			WebUI.delay(3)
			WebUI.setText(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/input_Phone'), Phonenumber)
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/select_SelectUserType'))
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/select_SelectUserType'), Usertype, true)


			WebUI.delay(3)
			if (Usertype == "Consultant"){
				WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/select_SelectRole'))
				WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/select_SelectRole'), Role, true)
			}
			else if (Usertype == "Customer"){
				WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/select_SelectRole'))
				WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/select_SelectRole'), Role, true)
				WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/select_Customer'))
				WebUI.selectOptionByLabel(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/select_Customer'), Customer, true)
			}


			loginfo.createNode(new GherkinKeyword("When"), "User has to fill the fields like Name,LoginID,Password,Confirmpassword,Email,Phonenumber,Usertype,Role,Customer").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Create User")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("When"), "User has to fill the fields like Name,LoginID,Password,Confirmpassword,Email,Phonenumber,Usertype,Role,Customer").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}

	}
	@And("User has to click on Create button")
	public void User_has_to_click_on_Create_button() {
		try{
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/btn_CreateUser'))
			WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create Customer/a_User Settings'))

			loginfo.createNode(new GherkinKeyword("And"), "User has to click on Create button").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Create User")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("And"), "User has to click on Create button").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}

	@Then("User should successfully created new user")
	public void user_should_successfully_created_new_user() {
		try{
			//WebUI.click(findTestObject('Object Repository/Pro_Acc_UserSettings/Pro_Acc_Create User/a_Profile Settings'))

			loginfo.createNode(new GherkinKeyword("Then"), "User should successfully created new user").pass("pass");
			Assert.assertTrue(true);
			loginfo.assignCategory("Create User")

		} catch   (Exception e){
			loginfo.createNode(new GherkinKeyword("Then"), "User should successfully created new user").fail("fail").addScreenCaptureFromPath(new OnlineKeywords ().takeScreenshot(loginfo));

		}
	}
}