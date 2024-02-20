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

WebUI.click(findTestObject('Dashboard Page/Left-hand menu_RSVP'))

WebUI.click(findTestObject('Create RSVP/RSVP templates tab'))

WebUI.click(findTestObject('Create RSVP/New Template RSVP'))

WebUI.setText(findTestObject('Create RSVP/RSVP template title'), 'TC-13')

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Alert body iframe'), 1)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert body'), 'Hello! This is automated RSVP template from Katalon')

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Create RSVP/Question 1 title input'), 'What is your favorite movie?')

WebUI.setText(findTestObject('Create RSVP/Answer 1 input'), 'Harry Potter')

WebUI.setText(findTestObject('Create RSVP/Answer 2 input'), 'Kill Bill')

WebUI.scrollToElement(findTestObject('Create RSVP/Question 2 switch'), 2)

WebUI.waitForElementClickable(findTestObject('Create RSVP/Question 2 switch'), 2)

WebUI.check(findTestObject('Create RSVP/Question 2 switch'))

WebUI.verifyElementChecked(findTestObject('Create RSVP/Question 2 switch'), 1)

WebUI.setText(findTestObject('Create RSVP/Question 2 title input'), 'Why?')

WebUI.click(findTestObject('Create RSVP/RSVP template Save button'))

WebUI.click(findTestObject('Create RSVP/RSVP templates tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-13')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Create RSVP/Filtered RSVP template'), 'TC-13')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Preview Template Action'))

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Preview alert iframe'), 2)

WebUI.takeFullPageScreenshot([])

WebUI.click(findTestObject('Create Pop-up Alert Page/close alert preview'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Edit Template Action'))

WebUI.verifyElementPresent(findTestObject('Create RSVP/Create RSVP Alert Header'), 2)

WebUI.verifyElementText(findTestObject('Create RSVP/Create RSVP Alert Header'), 'Edit RSVP template')

WebUI.scrollToElement(findTestObject('Create RSVP/RSVP template Save button'), 2)

WebUI.click(findTestObject('Create RSVP/RSVP template Save button'))

WebUI.click(findTestObject('Create RSVP/RSVP templates tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-13')

WebUI.delay(2)

not_run: WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered Template'), 'TC-13')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Create alert using this template'))

WebUI.click(findTestObject('Create Pop-up Alert Page/More button'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Template/Template title'), ' Template')

WebUI.click(findTestObject('Create Pop-up Alert Page/Send button'))

