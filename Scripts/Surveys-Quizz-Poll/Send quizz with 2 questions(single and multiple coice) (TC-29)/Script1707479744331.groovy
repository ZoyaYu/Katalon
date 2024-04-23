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

WebUI.click(findTestObject('Dashboard Page/Survey-Quizz-Poll'))

WebUI.check(findTestObject('Survey/Quizz radio btn'))

WebUI.verifyElementChecked(findTestObject('Survey/Quizz radio btn'), 1)

WebUI.click(findTestObject('Survey/More btn'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Survey/Survey title'), 'TC-29')

WebUI.setText(findTestObject('Survey/Q1 input'), 'Who is the youngest Disney princess?')

WebUI.setText(findTestObject('Survey/Q1 Answer 1 input field'), 'Mermaid')

WebUI.setText(findTestObject('Survey/Q1 answer 2 input field'), 'Snow White')

WebUI.click(findTestObject('Survey/Mark as correct'))

WebUI.click(findTestObject('Survey/Add question btn'))

WebUI.setText(findTestObject('Survey/Q2 input'), 'What is your boss favorite food?')

WebUI.click(findTestObject('Survey/choice options'))

WebUI.click(findTestObject('Survey/Multiple choice'))

WebUI.setText(findTestObject('Survey/Q2 answer 1 input field'), 'Pasta')

WebUI.setText(findTestObject('Survey/Q2 answer 2 input field'), 'Pizza')

WebUI.click(findTestObject('Survey/Add option'))

WebUI.setText(findTestObject('Survey/Q2 answer 3 input field'), 'Sushi')

WebUI.click(findTestObject('Survey/Mark as correct Q2(a1)'))

WebUI.click(findTestObject('Survey/Mark as correct Q2(a3)'))

WebUI.scrollToElement(findTestObject('Survey/Send btn Survey'), 2)

WebUI.click(findTestObject('Survey/Send btn Survey'))

WebUI.click(findTestObject('Survey/quizz tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-29')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-29')

WebUI.delay(20)

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/View graph'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Pop-up Alerts page/view graph 2nd page'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Pop-up Alerts page/view graph close btn'))

