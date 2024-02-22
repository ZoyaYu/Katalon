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

WebUI.check(findTestObject('Survey/Classic survey radio button'))

WebUI.click(findTestObject('Survey/More btn'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-27')

WebUI.setText(findTestObject('Survey/Q1 input'), 'Are you satisfied with our services?')

WebUI.setText(findTestObject('Survey/Q1 Answer 1 input field'), 'Yes')

WebUI.setText(findTestObject('Survey/Q1 answer 2 input field'), 'No')

WebUI.click(findTestObject('Survey/Add question btn'))

WebUI.setText(findTestObject('Survey/Q2 input'), 'Where do you think we can improve our services?')

WebUI.click(findTestObject('Survey/choice options'))

WebUI.click(findTestObject('Survey/Multiple choice'))

WebUI.setText(findTestObject('Survey/Q2 answer 1 input field'), 'Product Quality')

WebUI.setText(findTestObject('Survey/Q2 answer 2 input field'), 'HotFix Delivery')

WebUI.click(findTestObject('Survey/Add option'))

WebUI.setText(findTestObject('Survey/Q2 answer 3 input field'), 'Response Time')

WebUI.click(findTestObject('Survey/Add intermediary step btn'))

WebUI.scrollToElement(findTestObject('Survey/Q3 intermediary step input'), 2)

WebUI.setText(findTestObject('Survey/Q3 intermediary step input'), 'Improvement')

WebUI.setText(findTestObject('Survey/Q3 intermediary input description'), 'Please help us to improve our services')

WebUI.scrollToElement(findTestObject('Survey/Send btn Survey'), 2)

WebUI.click(findTestObject('Survey/Send btn Survey'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-27')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-27')

not_run: WebUI.delay(20)

not_run: WebUI.click(findTestObject('Survey/3dots Actions'))

not_run: WebUI.click(findTestObject('Pop-up Alerts page/View graph'))

not_run: WebUI.delay(2)

not_run: WebUI.takeFullPageScreenshot()

not_run: WebUI.click(findTestObject('Pop-up Alerts page/view graph 2nd page'))

not_run: WebUI.delay(2)

not_run: WebUI.takeFullPageScreenshot()

not_run: WebUI.click(findTestObject('Pop-up Alerts page/view graph close btn'))

