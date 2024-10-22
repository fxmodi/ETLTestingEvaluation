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
import java.util.regex.Pattern
import java.util.regex.Matcher

// Open browser and navigate to Amazon
WebUI.openBrowser('https://www.amazon.in/')

// Click on Sign in
WebUI.click(findTestObject('Object Repository/Object Repository Record Mode/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

// Email to be validated
String emailToValidate = 'modifremil@yahoo.com'

// Set email in the input field
WebUI.setText(findTestObject('Object Repository/Object Repository Record Mode/Page_Amazon Sign In/input_Enter your email or mobile phone numb_c9e171'), 
    emailToValidate)

// Simplified email regex pattern
String emailRegex = '^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$'

// Validate the email
if (emailToValidate ==~ emailRegex) {
    WebUI.comment("Valid email: " + emailToValidate)
    // Add your next steps for valid email here
} else {
    WebUI.comment("Invalid email: " + emailToValidate)
    // Add your error handling for invalid email here
}

// Close the browser
WebUI.closeBrowser()