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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407')

WebUI.setText(findTestObject('Object Repository/dummy repo/Page_Selenium Practice Form/input_RESULT_TextField-1'), 'RA')

WebUI.setText(findTestObject('Object Repository/dummy repo/Page_Selenium Practice Form/input_RESULT_TextField-2'), 'JY')

WebUI.setText(findTestObject('Object Repository/dummy repo/Page_Selenium Practice Form/input_RESULT_TextField-3'), '23456789')

WebUI.setText(findTestObject('Object Repository/dummy repo/Page_Selenium Practice Form/input_RESULT_TextField-4'), 'India')

WebUI.setText(findTestObject('Object Repository/dummy repo/Page_Selenium Practice Form/input_RESULT_TextField-5'), 'hyderabad')

WebUI.setText(findTestObject('Object Repository/dummy repo/Page_Selenium Practice Form/input_RESULT_TextField-6'), '')

WebUI.closeBrowser()

