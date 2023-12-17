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
import org.openqa.selenium.By as By
import org.openqa.selenium.interactions.Actions as Actions
import groovy.console.ui.BytecodeCollector as BytecodeCollector
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.support.ui.Select as Select
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

Random rand = new Random()

WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qa.cscs-apps.com/login')

WebUI.setText(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS/inputusername'), 'sst-testuser@cscs.io')

WebUI.setEncryptedText(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS/inputpassword'), 'L97vtBCiPEsJZi0yP+xfpg==')

WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS/button_LOGIN'))



WebUI.closeBrowser()


