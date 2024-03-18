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
import org.openqa.selenium.WebElement as WebElement

'Open Publisher page on a dashboard'
WebUI.click(findTestObject('Publishers/Publishers on the top-menu'))

'Click Policies on the left-hand menu'
WebUI.click(findTestObject('Publishers/Policies/Policies (left-hand menu)'))

'Click add policies button'
WebUI.click(findTestObject('Publishers/Policies/Add Policies btn'))

'Enter policy name'
WebUI.setText(findTestObject('Publishers/Policies/Policy name'), 'RestrictedAccess')

WebUI.check(findTestObject('Publishers/Policies/Pop-up checkbox'))

not_run: WebUI.verifyElementChecked(findTestObject('Publishers/Policies/Pop-up checkbox'), 2)

WebUI.scrollToElement(findTestObject('Publishers/Policies/Policy Save btn'), 2)

'Save policy'
WebUI.click(findTestObject('Publishers/Policies/Policy Save btn'))

WebUI.click(findTestObject('Pop-up Alerts page/Search by title field'))

'Verify if Policy exist'
WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'RestrictedAccess')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Publishers/filtered publisher'), 'RestrictedAccess')

'Click on Actions menu'
WebUI.click(findTestObject('Survey/3dots Actions'))

'Select Edit'
WebUI.click(findTestObject('Publishers/Edit publisher'))

WebUI.check(findTestObject('Publishers/Policies/Wallpapers checkbox'))

not_run: WebUI.verifyElementChecked(findTestObject('Publishers/Policies/Wallpapers checkbox'), 2)

WebUI.scrollToElement(findTestObject('Publishers/Policies/Policy Save btn'), 2)

'Save policy'
WebUI.click(findTestObject('Publishers/Policies/Policy Save btn'))

WebUI.click(findTestObject('Pop-up Alerts page/Search by title field'))

'Verify if Policy exist'
WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'RestrictedAccess')

WebUI.waitForElementClickable(findTestObject('Survey/3dots Actions'), 3)

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Publishers/Policies/Duplicate Policies'))

WebUI.click(findTestObject('Pop-up Alerts page/Search by title field'))

'Verify if Policy exist'
WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'RestrictedAccess copy')

WebUI.delay(5)

WebUI.getText(findTestObject('Publishers/filtered publisher'))

WebUI.verifyElementText(findTestObject('Publishers/filtered publisher'), 'RestrictedAccess copy')

'Create publisher with restricted policy'
WebUI.callTestCase(findTestCase('Policies/Create a publisher with RestrictedAccess policy (TC-59)'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Policies on the left-hand menu'
WebUI.click(findTestObject('Publishers/Policies/Policies (left-hand menu)'))

'Verify if Policy exist'
WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'RestrictedAccess')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Publishers/filtered publisher'), 'RestrictedAccess')

'Click on Actions menu'
WebUI.click(findTestObject('Survey/3dots Actions'))

'Click on view publishers linked to this policy'
WebUI.click(findTestObject('Publishers/Policies/view publishers linked to the policy'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Publishers/Policies/View publishers close btn'))

