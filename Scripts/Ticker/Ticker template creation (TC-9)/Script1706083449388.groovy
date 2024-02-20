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

WebUI.click(findTestObject('Pop-up Alerts page/Templates tab'))

WebUI.click(findTestObject('Pop-up Alerts page/New Template button'))

WebUI.setText(findTestObject('Create Template/Template title'), 'TC-9')

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Alert body iframe'), 2)

TemplateBody = '"The News Tickers is a handy and easy tool for creating a creeping line(running text, ticker). This is perfect for news broadcasts, updates, and more projects that refer to current events. Use for any formats and themes of video: news, sports, advertising, video blog, and others. Special made for COVID-19 situation in the world. Color controls available. A video tutorial is also included in the download."'

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert body'), TemplateBody)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Create Pop-up Alert Page/Save Button'))

WebUI.click(findTestObject('Pop-up Alerts page/Templates tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-9')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered Template'), 'TC-9')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Preview Template Action'))

WebUI.switchToFrame(findTestObject('Create Scrolling ticker/Preview ticker frame'), 2)

WebUI.takeFullPageScreenshot([])

WebUI.click(findTestObject('Create Scrolling ticker/Close ticker preview'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Edit Template Action'))

WebUI.verifyElementPresent(findTestObject('Create Scrolling ticker/Create Scrolling ticker header'), 2)

WebUI.verifyElementText(findTestObject('Create Pop-up Alert Page/Create Pop-up Alert header'), 'Edit Template')

WebUI.click(findTestObject('Create Pop-up Alert Page/Save Button'))

WebUI.click(findTestObject('Pop-up Alerts page/Templates tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-9')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered Template'), 'TC-9')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Create alert using this template'))

WebUI.click(findTestObject('Create Pop-up Alert Page/More button'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Template/Template title'), ' Template')

WebUI.click(findTestObject('Create Pop-up Alert Page/Send button'))

