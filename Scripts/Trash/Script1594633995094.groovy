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

WebUI.navigateToUrl('http://123.176.34.15:4041/ProAccQA')

WebUI.setText(findTestObject('Object Repository/Trash1/Page_Promantus ProAcc Login/input_Login_Username'), 'Alexa_Consultant')

WebUI.setEncryptedText(findTestObject('Object Repository/Trash1/Page_Promantus ProAcc Login/input_Login_Password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Trash1/Page_Promantus ProAcc Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Trash1/Page_Home/a_Conversion'))

WebUI.click(findTestObject('Object Repository/Trash1/Page_Home/a_Conversion Monitor'))

WebUI.click(findTestObject('Page_Home/a_Conversion'))

WebUI.click(findTestObject('Object Repository/Trash1/Page_Conversion Monitor/a_Post-Conversion'))

WebUI.click(findTestObject('Object Repository/Trash1/Page_Conversion Monitor/a_Post-Conversion Monitor'))

WebUI.click(findTestObject('Page_Conversion Monitor/a_Post-Conversion'))

WebUI.click(findTestObject('Object Repository/Trash1/Page_Post-Conversion Monitor/a_Validation'))

WebUI.click(findTestObject('Object Repository/Trash1/Page_Post-Conversion Monitor/a_Validation Monitor'))

WebUI.closeBrowser()

