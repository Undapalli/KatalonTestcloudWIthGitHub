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

WebUI.navigateToUrl('https://dubaihills-production.vizit.co/')

WebUI.click(findTestObject('Object Repository/Dubai hills repo/Page_Emaar Dubai Hills estate/i_v-icon notranslate ml-1 mdi mdi-view-gall_7453f9'))

WebUI.click(findTestObject('Object Repository/Dubai hills repo/Page_Emaar Dubai Hills estate/path'))

WebUI.click(findTestObject('Object Repository/Dubai hills repo/Page_Emaar Dubai Hills estate/i_v-icon notranslate mdi mdi-map-marker the_ebbaae'))

WebUI.click(findTestObject('Object Repository/Dubai hills repo/Page_Emaar Dubai Hills estate/div_STARTING POINT'))

WebUI.click(findTestObject('Object Repository/Dubai hills repo/Page_Emaar Dubai Hills estate/div_To navigate, press the arrow keys.START_08809d'))

WebUI.closeBrowser()
