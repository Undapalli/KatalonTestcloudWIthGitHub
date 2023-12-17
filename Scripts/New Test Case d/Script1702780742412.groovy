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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qa.cscs-apps.com/login')

//Side bar Scrollbar 
String className = 'ps-sidebar-container css-dip3t8'

int scrollValue = 600

WebUI.setText(findTestObject('Object Repository/CSCS Application/Page_CSCS/inputusername'), 'sst-testuser@cscs.io')

WebUI.setEncryptedText(findTestObject('Object Repository/CSCS Application/Page_CSCS/inputpassword'), 'L97vtBCiPEsJZi0yP+xfpg==')

WebUI.click(findTestObject('Object Repository/CSCS Application/Page_CSCS/button_Login'))

WebUI.click(findTestObject('Object Repository/CSCS Application/Page_CSCS - Driver Pay/img_sidebarMenuIcon'))

WebUI.click(findTestObject('Object Repository/CSCS Application/Page_CSCS - Driver Pay/span_Setup'))