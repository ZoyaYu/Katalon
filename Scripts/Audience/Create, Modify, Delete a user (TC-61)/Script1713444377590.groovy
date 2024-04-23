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

WebUI.click(findTestObject('Audience/Audience tab'))

WebUI.click(findTestObject('Audience/Add recipient button'))

WebUI.click(findTestObject('Audience/recipient name input field'))

WebUI.setText(findTestObject('Audience/recipient name input field'), 'Katalon')

WebUI.click(findTestObject('Audience/recipient display name input field'))

WebUI.setText(findTestObject('Audience/recipient display name input field'), 'Katalon User')

WebUI.click(findTestObject('Audience/recipient password input'))

WebUI.setText(findTestObject('Audience/recipient password input'), '123')

WebUI.click(findTestObject('Publishers/add btn'))

WebUI.click(findTestObject('Pop-up Alerts page/Search by title field'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'Katalon')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Publishers/filtered publisher'), 'Katalon')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Publishers/Edit publisher'))

WebUI.click(findTestObject('Publishers/Publisher email input field'))

WebUI.setText(findTestObject('Publishers/Publisher email input field'), 'katalon@gmail.com')

'Setup phone number'
WebUI.click(findTestObject('Publishers/Phone code drop-down'))

WebUI.scrollToElement(findTestObject('Publishers/US country code'), 2)

WebUI.click(findTestObject('Publishers/US country code'))

WebUI.click(findTestObject('Publishers/Phone number input field'))

WebUI.setText(findTestObject('Publishers/Phone number input field'), '2233445566')

'Save changes'
WebUI.click(findTestObject('Publishers/add btn'))

WebUI.sendKeys(findTestObject('Pop-up Alerts page/Search by title field'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'Katalon')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Publishers/filtered publisher'), 'Katalon')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Audience/View user details'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Pop-up Alerts page/view graph close btn'))

WebUI.callTestCase(findTestCase('Built-in test cases/Select all and Delete'), [:], FailureHandling.STOP_ON_FAILURE)

