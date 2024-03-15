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

WebUI.click(findTestObject('Survey/Survey templates tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-32')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-32')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Create alert using this template'))

not_run: WebUI.click(findTestObject('Survey/Delete Everyone in recipients field'))

WebUI.click(findTestObject('Survey/More btn'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Create Pop-up Alert Page/Alert Title field'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-33')

WebUI.verifyElementAttributeValue(findTestObject('Survey/Q1 input'), 'value', 'If you freeze water, what do you get?', 0)

WebUI.verifyElementAttributeValue(findTestObject('Survey/Q1 Answer 1 input field'), 'value', 'coffee', 0)

WebUI.verifyElementAttributeValue(findTestObject('Survey/Q1 answer 2 input field'), 'value', 'ice', 0)

WebUI.verifyElementAttributeValue(findTestObject('Survey/Q2 input'), 'value', 'At what temperature does water change its state?', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Survey/Q2 answer 1 input field'), 'value', '0', 0)

WebUI.verifyElementAttributeValue(findTestObject('Survey/Q2 answer 2 input field'), 'value', '50', 0)

WebUI.verifyElementAttributeValue(findTestObject('Survey/Q2 answer 3 input field'), 'value', '100', 0)

WebUI.click(findTestObject('Survey/Send btn Survey'))

WebUI.click(findTestObject('Survey/quizz tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-33')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-33')

