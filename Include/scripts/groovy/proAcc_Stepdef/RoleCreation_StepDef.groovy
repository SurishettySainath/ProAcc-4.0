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



class RoleCreation_StepDef {
	@Given("User is on Role Creation page")
	public void user_is_on_Role_Creation_page() {
		WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_RoleCreation/click_rolecreation'))
	}

	@When("User has to enter Role name(.*)")
	public void user_has_to_enter_Role_name(String Rolename) {
		WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_RoleCreation/add_rolename'), Rolename)
	}

	@When("User has to click on create button for create Role")
	public void user_has_to_click_on_create_button_for_create_Role() {
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_RoleCreation/click_rolecreate'))
	}

	@Then("User can search for created Role in list(.*)")
	public void user_can_search_for_created_Role_in_list(String Rolesearch) {
		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/Pro_Acc_Configuration/Pro_Acc_RoleCreation/btn_rolesearch'), Rolesearch)
		WebUI.delay(3)
	}
}