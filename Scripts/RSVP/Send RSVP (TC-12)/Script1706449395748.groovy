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

WebUI.click(findTestObject('Dashboard Page/RSVP'))

WebUI.verifyElementText(findTestObject('Create RSVP/Create RSVP Alert Header'), 'Create RSVP Alert')

WebUI.click(findTestObject('Create Pop-up Alert Page/More button'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

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

WebUI.callTestCase(findTestCase('Built-in test cases/Actions menu check RSVP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Create Pop-up Alert Page/Alert Title field'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'Duplicate RSVP alert')

WebUI.click(findTestObject('Create Pop-up Alert Page/Send button'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-12')

WebUI.waitForPageLoad(5)

WebUI.waitForElementClickable(findTestObject('Survey/3dots Actions'), 2)

WebUI.callTestCase(findTestCase('Built-in test cases/Resend to all'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Pop-up Alerts page/Search by title field'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-12')

WebUI.callTestCase(findTestCase('Built-in test cases/Select all and Delete'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Pop-up Alerts page/Search by title field'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'Duplicate RSVP alert')

WebUI.waitForElementClickable(findTestObject('Create Pop-up Alert Page/sent alerts checkbox'), 2)

WebUI.check(findTestObject('Create Pop-up Alert Page/sent alerts checkbox'))

WebUI.verifyElementChecked(findTestObject('Create Pop-up Alert Page/sent alerts checkbox'), 2)

WebUI.click(findTestObject('Pop-up Alerts page/delete all'))

WebUI.click(findTestObject('Pop-up Alerts page/Confirm deletion btn'))

