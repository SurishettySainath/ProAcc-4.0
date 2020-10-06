import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://123.176.34.15:4041/ProAccDev/login/Login?ReturnUrl=%2fProAccDev%2fCustomers%2fCreate')

WebUI.setText(findTestObject('null'), 'Vikash')

WebUI.setEncryptedText(findTestObject('null'), '9DfwD5Kz8Go=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'demo')

WebUI.selectOptionByValue(findTestObject('null'), 
    '6bbdf61c-a306-466f-b14e-e4f704bdfc49', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    'd114c2c7-b927-4553-b43a-69255dfcc5c9', true)

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Pro_Acc_Configuration/Pro_Acc_ActivityCreation/input_Customerprojectlist'), 'suresh')

WebUI.click(findTestObject('null'))

