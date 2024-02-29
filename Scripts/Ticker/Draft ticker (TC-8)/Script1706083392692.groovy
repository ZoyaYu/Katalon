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

WebUI.verifyElementText(findTestObject('Create Scrolling ticker/Create Scrolling ticker header'), 'Create Scrolling Ticker')

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Create Pop-up Alert Page/More button'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Choose recipients modal window/Choosen users filtered'), 
    2)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-8')

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Alert body iframe'), 2)

WebUI.setMaskedText(findTestObject('Create Pop-up Alert Page/Alert body'), 'Hello! This is automated DRAFT ticker from Katalon')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Create Pop-up Alert Page/Save Button'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Pop-up Alerts page/Draft tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-8')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-8')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/Preview Draft alert Actions'))

WebUI.switchToFrame(findTestObject('Create Scrolling ticker/Preview ticker frame'), 2)

WebUI.delay(2)

WebUI.takeFullPageScreenshot([])

WebUI.click(findTestObject('Create Scrolling ticker/Close ticker preview'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Pop-up Alerts page/Edit Draft alert Actions'))

WebUI.verifyElementPresent(findTestObject('Create Scrolling ticker/Create Scrolling ticker header'), 2)

WebUI.verifyElementText(findTestObject('Create Pop-up Alert Page/Create Pop-up Alert header'), 'Create Scrolling Ticker')

WebUI.click(findTestObject('Create Pop-up Alert Page/Save Button'))

