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

WebUI.click(findTestObject('Survey/Survey templates tab'))

WebUI.click(findTestObject('Survey/Survey template btn'))

WebUI.check(findTestObject('Survey/Quizz radio btn'))

WebUI.verifyElementChecked(findTestObject('Survey/Quizz radio btn'), 1)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-32')

WebUI.setText(findTestObject('Survey/Q1 input'), 'If you freeze water, what do you get?')

WebUI.setText(findTestObject('Survey/Q1 Answer 1 input field'), 'coffee')

WebUI.setText(findTestObject('Survey/Q1 answer 2 input field'), 'ice')

WebUI.click(findTestObject('Survey/Mark as correct'))

WebUI.click(findTestObject('Survey/Add question btn'))

WebUI.setText(findTestObject('Survey/Q2 input'), 'At what temperature does water change its state?')

WebUI.scrollToElement(findTestObject('Survey/choice options'), 1)

WebUI.click(findTestObject('Survey/choice options'))

WebUI.click(findTestObject('Survey/Multiple choice'))

WebUI.setText(findTestObject('Survey/Q2 answer 1 input field'), '0')

WebUI.setText(findTestObject('Survey/Q2 answer 2 input field'), '50')

WebUI.click(findTestObject('Survey/Add option'))

WebUI.setText(findTestObject('Survey/Q2 answer 3 input field'), '100')

WebUI.click(findTestObject('Survey/Mark as correct Q2(a1)'))

WebUI.click(findTestObject('Survey/Mark as correct Q2(a3)'))

WebUI.click(findTestObject('Survey/Save survey template btn'))

WebUI.verifyElementPresent(findTestObject('Survey/Survey templates tab'), 3)

WebUI.click(findTestObject('Survey/Survey templates tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-32')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-32')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Preview Template Action'))

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Preview alert iframe'), 2)

WebUI.takeFullPageScreenshot([])

WebUI.click(findTestObject('Create Pop-up Alert Page/close alert preview'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Edit Template Action'))

WebUI.click(findTestObject('Survey/Save survey template btn'))

WebUI.verifyElementPresent(findTestObject('Survey/Survey templates tab'), 3)

WebUI.click(findTestObject('Survey/Survey templates tab'))

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Create alert using this template'))

WebUI.click(findTestObject('Survey/More btn'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Survey/Send btn Survey'))

WebUI.click(findTestObject('Survey/Survey templates tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-32')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-32')

