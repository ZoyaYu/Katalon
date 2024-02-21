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

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-25')

WebUI.setText(findTestObject('Survey/Q1 input'), 'Are you satisfied with our services?')

WebUI.setText(findTestObject('Survey/Q1 Answer 1 input field'), 'Yes')

WebUI.setText(findTestObject('Survey/Q1 answer 2 input field'), 'No')

WebUI.click(findTestObject('Survey/Add question btn'))

WebUI.click(findTestObject('Survey/Q2 delete btn'))

WebUI.verifyElementNotPresent(findTestObject('Survey/Q2 delete btn'), 2)

WebUI.click(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Skin choice button'))

WebUI.click(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Skin with given index'))

WebUI.sendKeys(findTestObject('Survey/alert width'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Survey/alert width'), '400')

WebUI.sendKeys(findTestObject('Survey/alert height'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Survey/alert height'), '500')

WebUI.click(findTestObject('Survey/Preview Survey btn'))

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Preview alert iframe'), 2)

WebUI.takeFullPageScreenshot()

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Survey/Send btn Survey'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-25')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-25')

WebUI.callTestCase(findTestCase('Built-in test cases/Actions menu check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Create Pop-up Alert Page/Alert Title field'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'Duplicate survey')

WebUI.click(findTestObject('Survey/Send btn Survey'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-25')

WebUI.callTestCase(findTestCase('Built-in test cases/Select all and Delete'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'Duplicate survey')

WebUI.waitForElementClickable(findTestObject('Create Pop-up Alert Page/sent alerts checkbox'), 2)

WebUI.check(findTestObject('Create Pop-up Alert Page/sent alerts checkbox'))

WebUI.verifyElementChecked(findTestObject('Create Pop-up Alert Page/sent alerts checkbox'), 2)

WebUI.click(findTestObject('Pop-up Alerts page/delete all'))

WebUI.click(findTestObject('Pop-up Alerts page/Confirm deletion btn'))

