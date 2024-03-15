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

'click on Actions menu for specified publisher'
WebUI.click(findTestObject('Survey/3dots Actions'))

'Choose edit option in Actions menu'
WebUI.click(findTestObject('Publishers/Edit publisher'))

'Type email address'
WebUI.setText(findTestObject('Publishers/Publisher email input field'), 'katalon@mail.com')

'Setup phone number'
WebUI.click(findTestObject('Publishers/Phone code drop-down'))

WebUI.scrollToElement(findTestObject('Publishers/US country code'), 2)

WebUI.click(findTestObject('Publishers/US country code'))

WebUI.click(findTestObject('Publishers/Phone number input field'))

WebUI.setText(findTestObject('Publishers/Phone number input field'), '2233445566')

'Save changes'
WebUI.click(findTestObject('Publishers/add btn'))

WebUI.sendKeys(findTestObject('Pop-up Alerts page/Search by title field'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'KatalonAdmin')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Publishers/filtered publisher'), 'KatalonAdmin')

