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

WebUI.callTestCase(findTestCase('login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Swag Labs/div_Sauce Labs Backpack'))

WebUI.click(findTestObject('Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Page_Swag Labs/a_Swag Labs_shopping_cart_link'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/shopping cart item'), 'Sauce Labs Backpack')

WebUI.click(findTestObject('Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_firstName'), 'wong')

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_lastName'), 'jessica')

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_postalCode'), '12345')

WebUI.click(findTestObject('Page_Swag Labs/input_Cancel_continue'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/shopping cart item'), 'Sauce Labs Backpack')

WebUI.verifyElementText(findTestObject('Page_Swag Labs/div_29.99'), '$29.99')

WebUI.click(findTestObject('Page_Swag Labs/button_Finish'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/h2_Thank you for your order'), 'Thank you for your order!')

WebUI.verifyElementText(findTestObject('Page_Swag Labs/span_Checkout Complete'), 'Checkout: Complete!')

