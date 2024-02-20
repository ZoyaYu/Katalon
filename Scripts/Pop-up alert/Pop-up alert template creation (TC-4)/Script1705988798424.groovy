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

WebUI.callTestCase(findTestCase('Login Test Cases/Login with Valid Credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard Page/Left-hand menu_Pop-up Alerts'))

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('Pop-up Alerts page/Pop-up Alerts header'), 2)

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Pop-up Alerts header'), 'Pop-up Alerts')

WebUI.click(findTestObject('Pop-up Alerts page/Templates tab'))

WebUI.click(findTestObject('Pop-up Alerts page/New Template button'))

WebUI.setText(findTestObject('Create Template/Template title'), 'TC-4')

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Alert body iframe'), 2)

TemplateBody = '"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin congue tempus tempor. Donec pretium viverra eleifend.\nAliquam et condimentum sem. Sed molestie nisl lectus, eget ultrices lorem tincidunt in. Morbi sed hendrerit dolor. Aliquam erat volutpat.\nInteger maximus ex tempus auctor elementum. Vivamus vel lacus eu ante maximus consequat. Vestibulum lacus eros, gravida in massa ut, malesuada ultricies quam.\nSuspendisse pharetra eros nec auctor posuere. Nunc sit amet dignissim eros. Suspendisse imperdiet tristique massa, id lacinia orci viverra id.\nEtiam aliquam eros orci, eu malesuada ipsum commodo quis."'

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert body'), TemplateBody)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Create Pop-up Alert Page/Save Button'))

WebUI.click(findTestObject('Pop-up Alerts page/Templates tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-4')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered Template'), 'TC-4')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Preview Template Action'))

WebUI.switchToFrame(findTestObject('Create Pop-up Alert Page/Preview alert iframe'), 2)

WebUI.takeElementScreenshot(findTestObject('Create Pop-up Alert Page/Alert preview window'))

WebUI.click(findTestObject('Create Pop-up Alert Page/close alert preview'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Edit Template Action'))

WebUI.verifyElementPresent(findTestObject('Create Pop-up Alert Page/Create Pop-up Alert header'), 2)

WebUI.verifyElementText(findTestObject('Create Pop-up Alert Page/Create Pop-up Alert header'), 'Edit Template')

WebUI.click(findTestObject('Create Pop-up Alert Page/Save Button'))

WebUI.click(findTestObject('Pop-up Alerts page/Templates tab'))

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-4')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered Template'), 'TC-4')

WebUI.click(findTestObject('Survey/3dots Actions'))

WebUI.click(findTestObject('Templates Action menu/Create alert using this template'))

WebUI.click(findTestObject('Create Pop-up Alert Page/More button'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Template/Template title'), ' Template')

WebUI.click(findTestObject('Create Pop-up Alert Page/Send button'))

