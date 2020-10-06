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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import projectKeywords.LeedOnlineKeywords

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

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import org.testng.Assert
import java.lang.reflect.Field


WebUI.openBrowser('')

WebUI.navigateToUrl('http://123.176.34.15:4041/ProAccQA')

WebUI.setText(findTestObject('Object Repository/Pro_Acc_Login/input_Login_Username'), 'kamal')

WebUI.setText(findTestObject('Object Repository/Pro_Acc_Login/input_Login_Password'), '123')

WebUI.click(findTestObject('Object Repository/Pro_Acc_Login/button_Login'))

WebUI.delay(40)

WebDriver driver = DriverFactory.getWebDriver()




 //((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('//*[@id='jqGrid']/tbody/tr')".size)
//((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementById('1_Actual_St_Date').value='30/06/2020'")

//WebElement Table = document.getElementsByClassName("jqgfirstrow");

WebElement Table = driver.findElement(By.xpath("//div[@id='gview_jqGrid']//table[@id='jqGrid']"));

//WebElement Table =  ((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript("document.getElementByClassName('jqgfirstrow')")

Table.getSize()

 println("77777"+Table.size)


	 List<WebElement> rows_table = Table
	 int rows_count = rows_table.size()
	 println(rows_count)

//WebElement Table = driver.findElement(By.xpath("//*[@class='jqgrow ui-row-ltr']"));
//println("777777777777777777777777"+Table)
//
//
//WebElement rows_table = Table.findElements(By.id("//*[@id='jqGrid']/tbody/tr"))
//
//println("List value"+rows_table)
////
//WebElement rows_table1 = Table.findElements(By.className("jqgrow ui-row-ltr"))
//println("Without List value"+rows_table1)
//
//int rows_count = rows_table1.size()
//println(rows_count)


//	List  rows = driver.findElement(By.xpath("//*[@class='jqgrow ui-row-ltr']"));
//	 println("Total No of rows are : " + rows.size());
//	 
	 
//
//int rowNo
//for (int row = 0; row < rows_count; row++) {
////List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))
//int columns_count = Columns_row.size()
//for (int column = 0; column < columns_count; column++) {
//String celltext = Columns_row.get(0).getText()
//println(celltext)
//}
//}