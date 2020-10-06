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

WebUI.click(findTestObject('Pro_Acc_Configuration/Pro_Acc_CreateProject/a_Configuration'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'H01')

WebUI.selectOptionByValue(findTestObject('null'), 
    'aece7573-5177-4088-b6ca-df68b5336467', true)

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Pro_Acc_Configuration/Pro_Acc_Master/input_ProjectInstanceSearch'), 
    'H01')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()

