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

WebUI.callTestCase(findTestCase('Login Test Cases/Login with Valid Credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard Page/Compose Alert Button'))

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Create Pop-up Alert header'), 2)

WebUI.verifyElementText(findTestObject('Create Pop-up Alert Page/Create Pop-up Alert header'), 'Create Pop-up Alert')

WebUI.click(findTestObject('Create Pop-up Alert Page/More button'))

WebUI.click(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Filter field'))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Filter field'), 'LAPTOP-E6BU4LL9')

WebUI.verifyElementText(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/All user list-filtered'), 
    'LAPTOP-E6BU4LL9 ', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/filtered user selection'))

WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Choosen users filtered'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Wallpapers/Done'))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-6')

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Alert body iframe'), 2)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert body'), 'Hello! This is automated alert with preview check from Katalon')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Skin choice button'))

WebUI.click(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Skin with given index'))

WebUI.check(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Acknowledgement checkbox'))

WebUI.verifyElementChecked(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Acknowledgement checkbox'), 
    2)

WebUI.scrollToElement(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Add print button'), 2)

WebUI.check(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Add print button'))

WebUI.verifyElementChecked(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Add print button'), 
    2)

WebUI.scrollToElement(findTestObject('Create Pop-up Alert Page/More button'), 2)

not_run: WebUI.scrollToElement(findTestObject('Create Pop-up Alert Page/Preview button'), 4)

WebUI.waitForElementClickable(findTestObject('Create Pop-up Alert Page/Preview button'), 3)

WebUI.click(findTestObject('Create Pop-up Alert Page/Preview button'))

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Preview alert iframe'), 2)

WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Alert Preview/print button'), 1)

WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Alert Preview/Postpone time selection'), 1)

WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Alert Preview/Postpone button'), 1)

WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Alert Preview/Creation Date'), 1)

WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Alert Preview/Alert Title Preview'), 1)

WebUI.verifyElementVisible(findTestObject('Create Pop-up Alert Page/Alert Preview/Alert logo Preview'))

WebUI.click(findTestObject('Create Pop-up Alert Page/Alert Preview/Acknowledgement OK button'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Create Pop-up Alert Page/Save Button'))

