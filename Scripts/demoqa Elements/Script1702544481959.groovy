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
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.JavascriptExecutor


WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/elements')

WebUI.click(findTestObject('Object Repository/Demoqa Elements/Page_DEMOQA/li_Text Box'))

WebUI.setText(findTestObject('Object Repository/Demoqa Elements/Page_DEMOQA/inputuserName'), 'ra')

WebUI.click(findTestObject('Object Repository/Demoqa Elements/Page_DEMOQA/li_Check Box'))

WebUI.click(findTestObject('Object Repository/Demoqa Elements/Page_DEMOQA/svg_rct-icon rct-icon-expand-close'))

WebUI.click(findTestObject('Object Repository/Demoqa Elements/Page_DEMOQA/li_Radio Button'))

WebUI.click(findTestObject('Object Repository/Demoqa Elements/Page_DEMOQA/label_Impressive'))

WebUI.click(findTestObject('Object Repository/Demoqa Elements/Page_DEMOQA/span_Web Tables'))

WebUI.click(findTestObject('Object Repository/Demoqa Elements/Page_DEMOQA/span_Buttons'))

WebUI.click(findTestObject('Object Repository/Demoqa Elements/Page_DEMOQA/button_Click Me'))

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = (JavascriptExecutor) driver

// Scroll down the page by 500 pixels
js.executeScript("window.scrollBy(0, 500);")

WebUI.click(findTestObject('Object Repository/Demoqa Elements/Page_DEMOQA/li_Links'))

WebUI.click(findTestObject('Object Repository/Demoqa Elements/Page_DEMOQA/a_Home'))


WebUI.closeBrowser()