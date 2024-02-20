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

WebUI.click(findTestObject('Pop-up Alerts page/New alert button'))

WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Create Pop-up Alert header'), 2)

WebUI.verifyElementText(findTestObject('Create Pop-up Alert Page/Create Pop-up Alert header'), 'Create Pop-up Alert')

WebUI.click(findTestObject('Create Pop-up Alert Page/More button'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-2')

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Alert body iframe'), 2)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert body'), 'Hello! This is automated alert with image from Katalon')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Create Pop-up Alert Page/Upload image window/Upload image button'))

WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Upload image window/Upload image area'), 2)

WebUI.uploadFileWithDragAndDrop(findTestObject('Create Pop-up Alert Page/Upload image window/Upload image area'), 'C:\\Users\\Home\\Downloads\\SampleJPGImage_500kbmb.jpg')

WebUI.delay(90)

WebUI.getAttribute(findTestObject('Create Pop-up Alert Page/Upload image window/uploaded file'), 'src')

WebUI.click(findTestObject('Create Pop-up Alert Page/Upload image window/Ok button'))

WebUI.click(findTestObject('Create Pop-up Alert Page/Send button'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-2')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-2')

