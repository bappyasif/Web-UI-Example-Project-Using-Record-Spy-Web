import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Open Browser
WebUI.openBrowser('http://lifecharger.org')

// click
WebUI.click(findTestObject('Object Repository/LifeCharger/Page_Life Charger   a new beginning/a_You will definitely reach your goal'))

// Set Text
WebUI.setText(findTestObject('Object Repository/LifeCharger/Page_Life Charger   a new beginning/input_Search for_s'), 'Goal')

// Serahing Text
//not_run: WebUI.click(findTestObject('Object Repository/LifeCharger/Page_Life Charger   a new beginning/span_Search for_fa fa-search'));
WebUI.click(findTestObject('Object Repository/LifeCharger/Page_Life Charger   a new beginning/span_Search for_fa fa-search'))

// Verify Elmement
WebUI.verifyElementPresent(findTestObject('Object Repository/LifeCharger/Page_Life Charger   a new beginning/a_Home'), 4)

// Closing Browser
WebUI.closeBrowser()

