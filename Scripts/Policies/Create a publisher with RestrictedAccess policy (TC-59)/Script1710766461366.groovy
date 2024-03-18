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

'Open Publisher page on a dashboard'
not_run: WebUI.click(findTestObject('Publishers/Publisher list left-hand menu'))

'Start Publisher creation process'
WebUI.click(findTestObject('Publishers/Add Publisher btn'))

WebUI.click(findTestObject('Publishers/Publisher name input field'))

'Input Publisher name'
WebUI.setText(findTestObject('Publishers/Publisher name input field'), 'KatalonPublisherRestricted')

WebUI.click(findTestObject('Publishers/Publisher Password'))

'Setup publisher password'
WebUI.setText(findTestObject('Publishers/Publisher Password'), '123')

'Choose Publisher Role'
WebUI.click(findTestObject('Publishers/Publisher type drop-down'))

WebUI.click(findTestObject('Publishers/Publishers type'))

'Choose publisher policy'
WebUI.click(findTestObject('Publishers/Policies/Policies drop-down'))

TestObject testObj = findTestObject('Object Repository/Publishers/Policies/List of policies from drop-down')

'Find all policies in a list'
List<WebElement> policies = WebUI.findWebElements(testObj, 10)

println(policies.size())

'Choose defined FullAccess Policy'
for (WebElement el : policies) {
    println(el.getText())

    if (el.getText().equals('RestrictedAccess')) {
        el.click()

        break
    }
}

WebUI.click(findTestObject('Publishers/add btn'))

WebUI.click(findTestObject('Pop-up Alerts page/Search by title field'))

'Verify if Publisher exist'
WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'KatalonPublisherRestricted')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Publishers/filtered publisher'), 'KatalonPublisherRestricted')

'Verify if publisher has enabled status'
WebUI.verifyElementPresent(findTestObject('Publishers/Enabled status'), 2)

