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

'Logout from current user'
WebUI.waitForElementClickable(findTestObject('Dashboard Page/Profile button'), 2)

WebUI.mouseOver(findTestObject('Dashboard Page/Profile button'))

WebUI.click(findTestObject('Dashboard Page/Profile button'))

WebUI.mouseOver(findTestObject('Dashboard Page/Profile menu-Logout'))

WebUI.click(findTestObject('Dashboard Page/Profile menu-Logout'))

WebUI.verifyElementPresent(findTestObject('Login Page/DAlogo'), 2)

'Login with newly created publisher'
WebUI.setText(findTestObject('Object Repository/Login Page/Login input field'), 'KatalonPublisher')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Page/Password input field'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Login Page/button_Log in'))

WebUI.delay(4)

WebUI.takeFullPageScreenshot()

'Logout'
WebUI.click(findTestObject('Dashboard Page/Profile button'))

WebUI.mouseOver(findTestObject('Dashboard Page/Profile menu-Logout'))

WebUI.click(findTestObject('Dashboard Page/Profile menu-Logout'))

'Login back with tester profile'
WebUI.setText(findTestObject('Object Repository/Login Page/Login input field'), 'Zoya')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Page/Password input field'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Login Page/button_Log in'))

