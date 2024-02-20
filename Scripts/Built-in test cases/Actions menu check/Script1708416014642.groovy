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

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/Stop-Start alert'))

WebUI.verifyElementPresent(findTestObject('Pop-up Alerts page/Stopped status'), 2)

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/Stop-Start alert'))

WebUI.verifyElementPresent(findTestObject('Pop-up Alerts page/Disributing status'), 2)

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/View graph'))

WebUI.takeElementScreenshot(findTestObject('Pop-up Alerts page/View graph image'))

WebUI.click(findTestObject('Pop-up Alerts page/view graph close btn'))

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/Preview in actions menu'))

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Preview alert iframe'), 2)

WebUI.takeElementScreenshot(findTestObject('Create Pop-up Alert Page/Alert preview window'))

WebUI.click(findTestObject('Create Pop-up Alert Page/close alert preview'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/Duplicate alert'))

