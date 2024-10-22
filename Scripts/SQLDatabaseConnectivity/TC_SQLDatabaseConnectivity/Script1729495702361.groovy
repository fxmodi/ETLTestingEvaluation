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




// Database connection parameters
String url = 'jdbc:sqlserver://azsqldidevscus:1433;databaseName=QuestDB_NewTrunk_2000'
String username = 'EEPSQLAdmin'
String password = '3xPr355t3St!#3xPr355t3St!#D3vD13xPr355t3St!#3xPr355t3St!#D3vD12'

// Call the custom keyword to check the connection
//boolean isConnected = CustomKeywords.'db.DatabaseConnection.connectToMySQL'(url, username, password)

//boolean isConnected = testDBKeyword.DatabaseConnectionTest.connectToMySQL(url, username, password)

boolean isConnected = CustomKeywords.'testDBKeyword.DatabaseConnectionTest.connectToMySQL'(url, username, password)

if (isConnected) {
	println("Test Case: Database connection successful!")
	// Add further test steps if needed
} else {
	println("Test Case: Database connection failed!")
	// Handle failure case (e.g., stop test or retry)
}
