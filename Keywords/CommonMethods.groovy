import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys
import com.kms.katalon.core.annotation.Keyword

public class CommonMethods {
    
    @Keyword
    def CheckDropdownListElement() {
        
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_My Info'))
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_Single_oxd-icon bi-caret-down-fill oxd-select-text--arrow'))
		WebUI.click(findTestObject("Object Repository/Page_OrangeHRM/div_Married"))
		WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_Married'), 'Married')
		
    }
}
