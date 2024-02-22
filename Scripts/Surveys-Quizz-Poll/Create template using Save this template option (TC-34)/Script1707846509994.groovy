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

WebUI.click(findTestObject('Dashboard Page/Left-hand menu Surveys-Quizz-Poll'))

WebUI.click(findTestObject('Survey/New Survey btn'))

WebUI.check(findTestObject('Survey/Classic survey radio button'))

WebUI.click(findTestObject('Survey/More btn'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-34')

WebUI.setText(findTestObject('Survey/Q1 input'), 'Do you agree with the following statement, “It is easy to navigate your web app?')

WebUI.setText(findTestObject('Survey/Q1 Answer 1 input field'), 'I agree')

WebUI.setText(findTestObject('Survey/Q1 answer 2 input field'), 'I disagree')

WebUI.scrollToElement(findTestObject('Survey/Save this template btn'), 2)

WebUI.click(findTestObject('Survey/Save this template btn'))

WebUI.click(findTestObject('Survey/Survey templates tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-34')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-34')

