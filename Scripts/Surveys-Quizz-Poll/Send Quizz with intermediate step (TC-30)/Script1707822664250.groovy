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

WebUI.setText(findTestObject('Survey/Survey title'), 'TC-30')

WebUI.setText(findTestObject('Survey/Q1 input'), 'How many legs does a spider have?')

WebUI.setText(findTestObject('Survey/Q1 Answer 1 input field'), '10')

WebUI.setText(findTestObject('Survey/Q1 answer 2 input field'), '8')

WebUI.click(findTestObject('Survey/Mark as correct'))

WebUI.click(findTestObject('Survey/Add intermediary step btn'))

WebUI.setText(findTestObject('Survey/Quizz objects for TC-30/Intermediary step input TC-30'), 'Disney time')

WebUI.setText(findTestObject('Survey/Quizz objects for TC-30/Intermediary step description TC-30'), 'Tricky question')

WebUI.click(findTestObject('Survey/Add question btn'))

WebUI.setText(findTestObject('Survey/Quizz objects for TC-30/Q2 input title TC-30'), 'What is your boss favorite Disney movie?')

WebUI.click(findTestObject('Survey/Quizz objects for TC-30/Choice option TC-30'))

WebUI.click(findTestObject('Survey/Multiple choice'))

WebUI.setText(findTestObject('Survey/Quizz objects for TC-30/Q2 answer 1 TC-30'), 'Frozen')

WebUI.setText(findTestObject('Survey/Quizz objects for TC-30/Q2 answer 2 TC-30'), 'Snow White')

WebUI.click(findTestObject('Survey/Quizz objects for TC-30/Add option TC-30'))

WebUI.setText(findTestObject('Survey/Quizz objects for TC-30/Q2 answer 3 TC-30'), 'Cinderella')

WebUI.click(findTestObject('Survey/Quizz objects for TC-30/Mark as correct Q2(a1) TC-30'))

WebUI.click(findTestObject('Survey/Quizz objects for TC-30/Mark as correct Q2(a3) TC-30'))

WebUI.scrollToElement(findTestObject('Survey/Send btn Survey'), 2)

WebUI.click(findTestObject('Survey/Send btn Survey'))

WebUI.click(findTestObject('Survey/quizz tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-30')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-30')

