import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.aventstack.extentreports.util.Assert as Assert
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

try {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://www.saucedemo.com')

    WebUI.maximizeWindow()

    WebUI.setText(findTestObject('Swag Labs Demo/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

    WebUI.verifyAlertPresent(0)

    CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'('Step1')

    //CustomKeywords.'com.katalon.extent.report.ExtentReport.addScreenshot'()
    WebUI.setEncryptedText(findTestObject('Object Repository Manual Mode/Page_OrangeHRM/input_Password_password'), 'qcu24s4901FyWDTwXGr6XA==')

    CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'('Step2')

    //CustomKeywords.'com.katalon.extent.report.ExtentReport.addScreenshot'()
    WebUI.click(findTestObject('Swag Labs Demo/Page_Swag Labs/input_Swag Labs_login-button'))

    CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'('Step3')

    //CustomKeywords.'com.katalon.extent.report.ExtentReport.addScreenshot'()
    WebUI.verifyTextPresent('Product', true)
}
catch (Exception e) {
    CustomKeywords.'com.katalon.extent.report.ExtentReport.addScreenshot'()

    WebUI.closeBrowser()
} //WebUI.verifyElementText(findTestObject(null), 'Products')

