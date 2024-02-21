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

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-48')

WebUI.verifyElementPresent(findTestObject('Video Alert/Videoalert upload area'), 2)

WebUI.click(findTestObject('Video Alert/Select video from the server'))

WebUI.click(findTestObject('Wallpapers/Select image from server button'))

WebUI.click(findTestObject('Video alerts/First video from the server'))

WebUI.delay(1)

WebUI.click(findTestObject('Video alerts/Video alert description'))

WebUI.setText(findTestObject('Video alerts/Video alert description'), 'Hello! This is automated video alert from Katalon')

WebUI.click(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Skin choice button'))

WebUI.click(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Skin with given index'))

WebUI.sendKeys(findTestObject('Survey/alert width'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Survey/alert width'), '400')

WebUI.sendKeys(findTestObject('Survey/alert height'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Survey/alert height'), '500')

WebUI.check(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Acknowledgement checkbox'))

WebUI.verifyElementChecked(findTestObject('Create Pop-up Alert Page/Alerts settings right-hand menu/Acknowledgement checkbox'), 
    2)

WebUI.click(findTestObject('Video alerts/Preview video alert btn'))

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Preview alert iframe'), 2)

WebUI.takeFullPageScreenshot()

WebUI.switchToDefaultContent()

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Wallpapers/Send wallpaper button'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-48')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-48')

