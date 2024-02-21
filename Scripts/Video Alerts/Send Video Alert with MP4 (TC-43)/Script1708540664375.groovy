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

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-43')

WebUI.verifyElementPresent(findTestObject('Video Alert/Videoalert upload area'), 2)

WebUI.uploadFileWithDragAndDrop(findTestObject('Video Alert/Videoalert upload area'), 'C:\\Users\\Home\\git\\Katalon\\video\\rabbit.mp4')

WebUI.delay(5)

WebUI.getAttribute(findTestObject('Video alerts/uploaded video file'), 'src')

WebUI.click(findTestObject('Video alerts/Video alert description'))

WebUI.setText(findTestObject('Video alerts/Video alert description'), 'Hello! This is automated MP4 video alert from Katalon')

WebUI.click(findTestObject('Wallpapers/Send wallpaper button'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-43')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-43')

not_run: WebUI.click(findTestObject('Survey/3dots Actions'))

not_run: WebUI.mouseOver(findTestObject('Pop-up Alerts page/Stop-Start alert'))

not_run: WebUI.click(findTestObject('Pop-up Alerts page/Stop-Start alert'))

not_run: WebUI.verifyElementPresent(findTestObject('Pop-up Alerts page/Stopped status'), 2)

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/View graph'))

WebUI.takeElementScreenshot(findTestObject('Pop-up Alerts page/View graph image'))

WebUI.click(findTestObject('Pop-up Alerts page/view graph close btn'))

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/Preview in actions menu'))

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Preview alert iframe'), 2)

WebUI.takeFullPageScreenshot([])

WebUI.click(findTestObject('Create Pop-up Alert Page/close alert preview'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/Duplicate alert'))

WebUI.sendKeys(findTestObject('Create Pop-up Alert Page/Alert Title field'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'Duplicate video alert')

WebUI.click(findTestObject('Wallpapers/Send wallpaper button'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-43')

WebUI.waitForPageLoad(2)

WebUI.waitForElementClickable(findTestObject('Survey/3dots Actions'), 2)

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.waitForElementClickable(findTestObject('Pop-up Alerts page/resend alert from actions menu'), 2)

WebUI.click(findTestObject('Pop-up Alerts page/resend alert from actions menu'))

WebUI.click(findTestObject('Pop-up Alerts page/Resend btn'))

WebUI.sendKeys(findTestObject('Pop-up Alerts page/Search by title field'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-43')

WebUI.verifyElementClickable(findTestObject('Pop-up Alerts page/Select all checkbox'))

WebUI.check(findTestObject('Pop-up Alerts page/Select all checkbox'))

WebUI.verifyElementChecked(findTestObject('Pop-up Alerts page/Select all checkbox'), 1)

WebUI.click(findTestObject('Pop-up Alerts page/delete all'))

WebUI.click(findTestObject('Pop-up Alerts page/Confirm deletion btn'))

WebUI.sendKeys(findTestObject('Pop-up Alerts page/Search by title field'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'Duplicate video alert')

WebUI.waitForElementClickable(findTestObject('Create Pop-up Alert Page/sent alerts checkbox'), 2)

WebUI.check(findTestObject('Create Pop-up Alert Page/sent alerts checkbox'))

WebUI.verifyElementChecked(findTestObject('Create Pop-up Alert Page/sent alerts checkbox'), 2)

WebUI.click(findTestObject('Pop-up Alerts page/delete all'))

WebUI.click(findTestObject('Pop-up Alerts page/Confirm deletion btn'))

