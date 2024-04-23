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

WebUI.click(findTestObject('Dashboard Page/Compose alert button expansion'))

WebUI.click(findTestObject('Dashboard Page/Scrolling tickers'))

WebUI.refresh()

WebUI.verifyElementText(findTestObject('Create Scrolling ticker/Create Scrolling ticker header'), 'Create Scrolling Ticker')

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Create Pop-up Alert Page/More button'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-11')

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Alert body iframe'), 2)

WebUI.setMaskedText(findTestObject('Create Pop-up Alert Page/Alert body'), 'Hello! This is automated ticker with preview from Katalon')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/ticker skin choice button'))

WebUI.click(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Ticker skin with given index'))

WebUI.check(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Acknowledgement checkbox'))

WebUI.verifyElementChecked(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Acknowledgement checkbox'), 
    2)

WebUI.scrollToElement(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Enable user feedback checkbox'), 
    2)

WebUI.check(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Enable user feedback checkbox'))

WebUI.verifyElementChecked(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Enable user feedback checkbox'), 
    2)

WebUI.click(findTestObject('Create Pop-up Alert Page/Preview button'))

WebUI.switchToFrame(findTestObject('Create Scrolling ticker/preview ticker iframe'), 2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('Create Scrolling ticker/ticker aknowledgement ok'), 1)

WebUI.verifyElementPresent(findTestObject('Create Scrolling ticker/ticker user feedback'), 1)

WebUI.verifyElementPresent(findTestObject('Create Scrolling ticker/Notification ticker logo'), 1)

WebUI.verifyElementText(findTestObject('Create Scrolling ticker/ticker title preview'), 'TC-11')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Create Pop-up Alert Page/Send button'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-11')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-11')

