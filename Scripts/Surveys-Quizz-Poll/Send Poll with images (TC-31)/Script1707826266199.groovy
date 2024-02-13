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

WebUI.click(findTestObject('Dashboard Page/Survey-Quizz-Poll'))

not_run: WebUI.click(findTestObject('Survey/New Survey btn'))

WebUI.check(findTestObject('Survey/Poll radio btn'))

WebUI.verifyElementChecked(findTestObject('Survey/Poll radio btn'), 1)

WebUI.click(findTestObject('Survey/More btn'))

WebUI.click(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Filter field'))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Filter field'), 'LAPTOP-E6BU4LL9')

WebUI.verifyElementText(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/All user list-filtered'), 
    'LAPTOP-E6BU4LL9 ')

WebUI.click(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/filtered user selection'))

WebUI.click(findTestObject('Wallpapers/Done'))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-31')

WebUI.setText(findTestObject('Survey/Q1 input'), 'Choose image with mountains')

WebUI.setText(findTestObject('Survey/Q1 Answer 1 input field'), 'Picture 1')

WebUI.click(findTestObject('Survey/Add image Q1(a1)'))

WebUI.click(findTestObject('Wallpapers/first image on a server'))

WebUI.setText(findTestObject('Survey/Q1 answer 2 input field'), 'Picture 2')

WebUI.click(findTestObject('Survey/add image Q1(a2)'))

WebUI.click(findTestObject('Survey/6th image from server TC-31'))

WebUI.click(findTestObject('Survey/Send btn Survey'))

WebUI.click(findTestObject('Survey/Poll tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-31')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-31')

