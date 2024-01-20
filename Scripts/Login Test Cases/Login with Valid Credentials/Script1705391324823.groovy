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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dadebug.commclouds.com/Demo/admin/auth')

WebUI.waitForPageLoad(3)

WebUI.maximizeWindow()

not_run: WebUI.waitForImagePresent(findTestObject('Login Page/DAlogo'), 2)

WebUI.verifyElementPresent(findTestObject('Login Page/Version number'), 2)

WebUI.verifyElementText(findTestObject('Login Page/Version number'), 'Version: 11.3.0.5')

WebUI.setText(findTestObject('Object Repository/Login Page/Login input field'), 'Zoya')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Page/Password input field'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Login Page/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login Page/h1_Dashboard'), 2)

