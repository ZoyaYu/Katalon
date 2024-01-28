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

WebUI.click(findTestObject('Dashboard Page/Compose alert button expansion'))

WebUI.click(findTestObject('Dashboard Page/RSVP'))

WebUI.verifyElementText(findTestObject('Create RSVP/Create RSVP Alert Header'), 'Create RSVP Alert')

WebUI.click(findTestObject('Create Pop-up Alert Page/More button'))

WebUI.click(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Filter field'))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Filter field'), 'LAPTOP-E6BU4LL9')

WebUI.verifyElementText(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/All user list-filtered'), 
    'LAPTOP-E6BU4LL9 ')

WebUI.click(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/filtered user selection'))

WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Choosen users filtered'), 
    2)

WebUI.click(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Done button'))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-12')

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Alert body iframe'), 2)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert body'), 'Hello! This is automated RSVP alert from Katalon')

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Create RSVP/Question 1 title input'), 'What drink do You prefer?')

WebUI.setText(findTestObject('Create RSVP/Answer 1 input'), 'Tea')

WebUI.setText(findTestObject('Create RSVP/Answer 2 input'), 'Coffee')

WebUI.check(findTestObject('Create RSVP/Question 2 switch'))

WebUI.verifyElementChecked(findTestObject('Create RSVP/Question 2 switch'), 1)

WebUI.setText(findTestObject('Create RSVP/Question 2 title input'), 'Why?')

WebUI.click(findTestObject('Create Pop-up Alert Page/Send button'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-12')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-12')

