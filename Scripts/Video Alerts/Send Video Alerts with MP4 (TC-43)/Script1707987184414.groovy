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

WebUI.click(findTestObject('Dashboard Page/Video Alerts'))

WebUI.verifyElementText(findTestObject('Wallpapers/Create Wallpaper Header'), 'Create Video Alert')

not_run: WebUI.refresh()

WebUI.click(findTestObject('Video Alert/Videoalert more btn'))

WebUI.click(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Filter field'))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Filter field'), 'LAPTOP-E6BU4LL9')

WebUI.verifyElementText(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/All user list-filtered'), 
    'LAPTOP-E6BU4LL9 ')

WebUI.click(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/filtered user selection'))

not_run: WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Choosen users filtered'), 
    2)

WebUI.click(findTestObject('Wallpapers/Done'))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-43')

WebUI.verifyElementPresent(findTestObject('Wallpapers/Upload wallpaper area'), 2)

WebUI.uploadFileWithDragAndDrop(findTestObject('Wallpapers/Upload wallpaper area'), 'C:\\Users\\Home\\git\\Katalon\\video\\earth.mp4')

WebUI.delay(90)

WebUI.getAttribute(findTestObject('Wallpapers/uploaded wallpaper file'), 'src')

not_run: WebUI.click(findTestObject('Wallpapers/Send wallpaper button'))

not_run: WebUI.waitForPageLoad(2)

not_run: WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-15')

not_run: WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-15')

