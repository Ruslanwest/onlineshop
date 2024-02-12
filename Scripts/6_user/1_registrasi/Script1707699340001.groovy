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

CustomKeywords.'ruslan.initial.openBrowser'()

WebUI.click(findTestObject('Object Repository/6_user/Page_Advantage Shopping/1_profile'))

WebUI.click(findTestObject('Object Repository/6_user/Page_Advantage Shopping/2_create_new_account'))

WebUI.setText(findTestObject('Object Repository/6_user/Page_Advantage Shopping/3_username'), 'ruslanwest')

WebUI.setText(findTestObject('Object Repository/6_user/Page_Advantage Shopping/4_email'), 'r@r.com')

WebUI.setText(findTestObject('Object Repository/6_user/Page_Advantage Shopping/5_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.setText(findTestObject('Object Repository/6_user/Page_Advantage Shopping/6_confirm_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.setText(findTestObject('Object Repository/6_user/Page_Advantage Shopping/7_first_name'), 'ruslan')

WebUI.setText(findTestObject('Object Repository/6_user/Page_Advantage Shopping/8_last_name'), 'ruslan')

WebUI.setText(findTestObject('Object Repository/6_user/Page_Advantage Shopping/9_phone'), '085766')

WebUI.selectOptionByLabel(findTestObject('Object Repository/6_user/Page_Advantage Shopping/10_country'), 
    'object:250', true)

WebUI.setText(findTestObject('Object Repository/6_user/Page_Advantage Shopping/11_city'), 'Depok')

WebUI.setText(findTestObject('Object Repository/6_user/Page_Advantage Shopping/12_address'), 
    'depok')

WebUI.setText(findTestObject('Object Repository/6_user/Page_Advantage Shopping/13_state'), 
    'jawa barat')

WebUI.setText(findTestObject('Object Repository/6_user/Page_Advantage Shopping/14_poscal_code'), 
    '16452')

WebUI.click(findTestObject('Object Repository/6_user/Page_Advantage Shopping/15_check_exclusive_offers'))

WebUI.click(findTestObject('Object Repository/6_user/Page_Advantage Shopping/16_Register'))

