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

WebUI.click(findTestObject('Dashboard Page/Compose alert button expansion'))

WebUI.click(findTestObject('Dashboard Page/Lockscreens'))

WebUI.verifyElementText(findTestObject('Lockscreen/Create Lockscreen header'), 'Create Lockscreen')

WebUI.click(findTestObject('Wallpapers/more'))

WebUI.callTestCase(findTestCase('Built-in test cases/Choose recipients'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Pop-up Alert Page/Alert Title field'), 'TC-22')

WebUI.verifyElementPresent(findTestObject('Wallpapers/Upload wallpaper area'), 2)

WebUI.uploadFileWithDragAndDrop(findTestObject('Wallpapers/Upload wallpaper area'), 'C:\\Users\\Home\\git\\Katalon\\Imagesfortest\\future.bmp')

WebUI.delay(10)

WebUI.getAttribute(findTestObject('Wallpapers/uploaded wallpaper file'), 'src')

WebUI.click(findTestObject('Wallpapers/Send wallpaper button'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('Pop-up Alerts page/Search by title field'), 'TC-22')

WebUI.verifyElementText(findTestObject('Pop-up Alerts page/Filtered sent alert'), 'TC-22')

