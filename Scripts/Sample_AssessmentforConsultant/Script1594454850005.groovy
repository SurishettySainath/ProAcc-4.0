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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://123.176.34.15:4041/ProAccDev')

WebUI.setText(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Promantus ProAcc Login/input_Login_Username'), 
    'John_Consultant')

WebUI.setEncryptedText(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Promantus ProAcc Login/input_Login_Password'), 
    'tzH6RvlfSTg=')

WebUI.sendKeys(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Promantus ProAcc Login/input_Login_Password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Home/i_Assessment_metismenu-state-icon fa fa-car_276c0f'))

WebUI.click(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Home/a_Assessment Monitor'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/select_-Select-John Test'), 
    '7ce9df09-7a83-49be-8361-01376d00114d', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/select_-Select-John Pilot Phase Test'), 
    '232cd82f-a852-450f-868d-d242ab4d2aa6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/select_-Select-D01'), 
    '09b914f9-405a-48cf-ba7c-96ec3eb5a084', true)

WebUI.click(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/button_Select Instance'))

WebUI.click(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/span_Yet To Start_octicon octicon-pencil'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/select_CompleteWork In ProgressNot Applicab_def7d0'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/span_John_Consultant_octicon octicon-check'))

WebUI.click(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/button_Yes'))

WebUI.click(findTestObject('Object Repository/Pro_Acc_AssessmentMonitorforConsultant/Page_Assessment Monitor/button_Okay'))

WebUI.closeBrowser()

