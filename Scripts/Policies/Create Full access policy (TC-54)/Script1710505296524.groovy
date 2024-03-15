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

'Open Publisher page on a dashboard'
WebUI.click(findTestObject('Publishers/Publishers on the top-menu'))

'Click Policies on the left-hand menu'
WebUI.click(findTestObject('Publishers/Policies/Policies (left-hand menu)'))

'Click add policies button'
WebUI.click(findTestObject('Publishers/Policies/Add Policies btn'))

'Enable Grant full control option'
WebUI.check(findTestObject('Publishers/Policies/Grant Full Control Checkbox'))

WebUI.verifyElementChecked(findTestObject('Publishers/Policies/Grant Full Control Checkbox'), 2)

'Enter policy name'
WebUI.setText(findTestObject('Publishers/Policies/Policy name'), 'FullAccess')

WebUI.scrollToElement(findTestObject('Publishers/Policies/Policy Save btn'), 2)

'Save policy'
WebUI.click(findTestObject('Publishers/Policies/Policy Save btn'))

