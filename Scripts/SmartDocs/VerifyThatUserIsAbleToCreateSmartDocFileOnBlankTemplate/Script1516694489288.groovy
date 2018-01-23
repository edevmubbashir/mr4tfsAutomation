import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('M4Tfs-StandAlone/SmartDocs/span_New'))

WebUI.click(findTestObject('M4Tfs-StandAlone/SmartDocs/span_Smart Docs'))

WebUI.setText(findTestObject('M4Tfs-StandAlone/SmartDocs/input_ig-newfile-textbox-smd-n'), 'HelloWorld-1')

WebUI.click(findTestObject('M4Tfs-StandAlone/SmartDocs/input_ig-newfile-ok-button-smd'))

WebUI.click(findTestObject('M4Tfs-StandAlone/SmartDocs/div_smd-add-wi-icon'))

WebUI.click(findTestObject('M4Tfs-StandAlone/SmartDocs/span_Feature'))

WebUI.setText(findTestObject('M4Tfs-StandAlone/SmartDocs/input_smdNewWItemTxtBox'), 'hssd')

WebUI.sendKeys(findTestObject('M4Tfs-StandAlone/SmartDocs/input_smdNewWItemTxtBox'), Keys.chord(Keys.ENTER))

