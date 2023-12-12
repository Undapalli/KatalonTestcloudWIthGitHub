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

'Open the browser '
WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qa.cscs-apps.com/login')

WebUI.setText(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS/inputusername'), 'sst-testuser@cscs.io')

WebUI.setEncryptedText(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS/inputpassword'), 'L97vtBCiPEsJZi0yP+xfpg==')

WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/svg_sidebarMenuIcon'))

WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/span_Setup'))

/*
 * //Side bar Scrollbar String className = 'pro-sidebar-layout'
 * 
 * int scrollValue = 600
 * 
 * // Use JavascriptExecutor to scroll JavascriptExecutor js =
 * ((DriverFactory.getWebDriver()) as JavascriptExecutor)
 * 
 * js.
 * executeScript("document.getElementsByClassName('$className')[0].scrollTop += $scrollValue;"
 * )
 */

//***************ASSET TYPE******************************************
WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/span_Asset Types'))

String randomAssetType = 'lift_' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/input_assetType'), randomAssetType)

WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/button_Add'))

//****************PROJECT TYPE****************************************
String randomProjectType = 'Highway bridge_1' + rand.nextInt(1000)

WebUI.click(findTestObject('Object Repository/Project Type/Page_CSCS - Driver Pay/span_Project Types'))

WebUI.setText(findTestObject('Object Repository/Project Type/Page_CSCS - Driver Pay/input_projectType'), randomProjectType)

WebUI.click(findTestObject('Object Repository/Project Type/Page_CSCS - Driver Pay/button_Add'))

//***************************EmployeeType***************************************
WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/span_Employee Types'))

String randomEmpType = 'Construction__Engineer' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/input_employeeType'), 
    randomEmpType)

WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/button_Add'))

WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/path'))

//EMPLOYEE TYPE UPDATE 
String randomEmployeeType = 'QAEngineer_' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/input_employeeType'), 
    randomEmployeeType)

WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/button_Update'))

//********************WorkOrderStatus******************************
WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/span_Work Order Status'))

String randomWorkorderStatus = 'planned_' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/input_workorderStatus'), 
    randomWorkorderStatus)

WebUI.click(findTestObject('Object Repository/CSCS Application Automation/Page_CSCS - Driver Pay/button_Add'))

//Click  on Asset Management
WebUI.click(findTestObject('Object Repository/Asset Management/Page_CSCS - Driver Pay/div_Asset Management'))

//**************1-GeoFence*******************
WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/span_Geofence'))

WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/span_Add Geofence'))

WebUI.setText(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/input_name'), 'Mmissippi')

WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/a_Draw a polygon'))

//WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/button_Add'))
WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/span_Geofences'))

WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/svg'))

WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/button_Update'))

//************2-Employee under Master Data*********************
WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/span_pro-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/span_pro-arrow-wrapper_1'))

WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/span_pro-arrow-wrapper_1_2'))

WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/span_Add Employee'))

WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/div_Add Employee Employee Code First Name L_a5bebd'))

String randomCode = 'plantOEp_' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/input_code'), randomCode)

String randomFirstName = 'KELLY' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/input_firstName'), randomFirstName)

String randomSecondName = 'Dobby' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/input_lastName'), randomSecondName)

WebUI.selectOptionByValue(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/select_SelecttestConstruction Worker Xemplo_9ea524'), 
    '520', true)

WebUI.setText(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/input_email'), 'kely1234@gmail.com')

WebUI.setText(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/input_PhoneInputInput'), '567 586 3457')

WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/button_Add'))

WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/div_Employees'))

WebUI.click(findTestObject('Object Repository/Page_CSCS - Driver Pay/path_1'))

WebUI.click(findTestObject('Object Repository/GeofenceMasterData/Page_CSCS - Driver Pay/button_Update'))

//***************************************3-Asset *******************************************************
WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/span_Asset'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/div_Add Asset'))

String randomAssetCode = 'AssCode_' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/input_code'), randomAssetCode)

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/div_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/div_lift730002'))

//WebUI.click(findTestObject("Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/div_$randomAssetType"))
String randomDeviceCode = 'AssDeviceCode_' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/input_deviceCode'), randomDeviceCode)

String randomIdentificationCode = 'AssIdNumber_' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/input_identificationNumber'), 
    randomIdentificationCode)

js.executeScript('document.body.style.zoom = "80%"')

//WebUI.click(findTestObject('Object Repository/AssetManagement WorkFlow/Page_CSCS - Driver Pay/button_Add'))
driver.findElement(By.xpath('//div//button[@class=\'cscsButton cscsButton addCscsButton\']')).click()

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/span_Assets'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/svg'))

WebElement dropdownElement = driver.findElement(By.id('status'))

// Use the Select class for interacting with dropdowns
Select dropdown = new Select(dropdownElement)

// Select the option with value "Ready"
dropdown.selectByValue('Ready')

//WebUI.click(findTestObject('Object Repository/AssetManagement WorkFlow/Page_CSCS - Driver Pay/button_Update'))
driver.findElement(By.xpath('//div//button[normalize-space()=\'Update\']')).click()

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/div_Asset'))

//************4-Base Activities*****************
//*******************************5-Add Project*************************************
WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/span_Project'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/span_Add Project'))

String randomProjectCode = 'Project_' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/input_code'), randomProjectCode)

String randomProjectName = 'Construction_' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/input_name'), randomProjectName)

WebUI.selectOptionByValue(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/select_SelectLowMediumHighVery High'), 
    'MEDIUM', true)

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/svg_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/div_436, hyjg'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/div_css-19bb58m'))

WebUI.click(findTestObject("Object Repository/project_objects/Page_CSCS - Driver Pay/div_$randomProjectType"))

//WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/div_projectType_dutmq'))
WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/div_ant-picker-input'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/div_20'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/div_ant-picker-input'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/span_ant-picker-super-next-icon'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/div_20'))

WebUI.setText(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/input_plannedEstimateCost'), '67000')

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/button_Select Person'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/button_Select'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/button_Select Manager'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/button_Select'))

WebUI.setText(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/input_numberOfAssets'), '4')

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/div_css-15lsz6c-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/div_assetType_du89j30u'))

WebUI.setText(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/input_plannedCost'), '30000')

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/button_Add'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/button_Add_1'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/div_Projects'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/path'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/button_Update'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/span_Projects'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/path_1'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/button_Approve'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/button_Yes'))

WebUI.click(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/span_pro-arrow'))

WebUI.doubleClick(findTestObject('Object Repository/project_objects/Page_CSCS - Driver Pay/div_Project - Construction_2345 EditCodepro_fb032d'))

//*********************6-Asset Assignment****************************************************
WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/div_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/div_1268, randomProjectName'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/div_609, Robin0'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/svg_css-8mmkcg_1'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/div_css-15lsz6c-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/div_MAD, Mr'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/button_Assign'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/div_css-15lsz6c-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/div_DJF, Mr'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/div_161662626'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/button_Assign'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/path_1'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/div_DJF, Mr_1'))

WebUI.click(findTestObject('Object Repository/Asset Assignment/Page_CSCS - Driver Pay/div_Please select a project.DJF, Mr.DJF, Mr'))

//**************************************7-Workorder*******************************//
WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/span_Work Order'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/span_Add Work Order'))

String randomWOcode = 'wo_' + rand.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/input_code'), randomWOcode)

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/div_1268, randomProjectName'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/select_SelectLowMediumHighVery High_1'), 
    'LOW', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/select_Selectapproved_qu6t25approved_j0c6cc_aafe9b'), 
    '396', true)

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/div_ant-picker-input'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/div_1'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/input_1'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/button_ant-picker-header-super-next-btn'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/div_20'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/button_Select Manager'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/button_Select'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/svg_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/svg_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/button_Add'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/span_Work Orders'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/path_1'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/button_Update'))

WebUI.click(findTestObject('Object Repository/Asset Management WorkFlow/Page_CSCS - Driver Pay/span_pro-arrow-wrapper'))

//***********************8-Incident Reporting*******************************
WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/span_Incident Reporting'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/span_Add Incident'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/path_1'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/div_project_123, ramya_qq'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/svg_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/div_luna_223343'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/svg_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/div_luna_123'))

WebUI.setText(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/input_reportedBy'), 'JohnSmithh')

WebUI.selectOptionByValue(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/select_SelectSubmittedReviewed'), 
    'Select', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/select_SelectSubmittedReviewed'), 
    'Submitted', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/select_SelectLowMediumHighVery High'), 
    'MEDIUM', true)

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/svg_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/div_kaurugh, kdfg'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/svg_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/div_Movies Chile Tools Spurs'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/div_ant-picker-input'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/div_23'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/span_OK'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/button_Add'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/span_Incidents'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/path_1_2'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/button_Update'))

WebUI.click(findTestObject('Object Repository/Incident Add/Page_CSCS - Driver Pay/span_pro-arrow-wrapper'))

WebUI.closeBrowser()

