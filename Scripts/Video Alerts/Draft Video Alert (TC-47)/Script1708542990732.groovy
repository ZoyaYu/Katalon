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

WebUI.click(findTestObject('Dashboard Page/Video Alerts'))

WebUI.verifyElementText(findTestObject('Wallpapers/Create Wallpaper Header'), 'Create Video Alert')

WebUI.click(findTestObject('Video Alert/Videoalert more btn'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-47')

WebUI.verifyElementPresent(findTestObject('Video Alert/Videoalert upload area'), 2)

WebUI.click(findTestObject('Video Alert/Select video from the server'))

WebUI.click(findTestObject('Wallpapers/Select image from server button'))

WebUI.click(findTestObject('Video alerts/First video from the server'))

WebUI.delay(1)

WebUI.click(findTestObject('Video alerts/Video alert description'))

WebUI.setText(findTestObject('Video alerts/Video alert description'), 'Hello! This is automated Draft video alert from Katalon')

WebUI.click(findTestObject('Wallpapers/Save wallpaper button'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Pop-up Alerts page/Draft tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-47')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-47')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/Preview Draft alert Actions'))

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Preview alert iframe'), 2)

WebUI.takeFullPageScreenshot([])

WebUI.click(findTestObject('Create Pop-up Alert Page/close alert preview'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/Edit Draft alert Actions'))

WebUI.verifyElementText(findTestObject('Wallpapers/Create Wallpaper Header'), 'Create Video Alert')

WebUI.click(findTestObject('Wallpapers/Save wallpaper button'))

WebUI.verifyElementPresent(findTestObject('Pop-up Alerts page/Draft tab'), 2)

