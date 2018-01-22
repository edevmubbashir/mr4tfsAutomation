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

//	Test Object Declaration Open	//
tfsServerUrl = 'M4Tfs-StandAlone/LoginPage/mr4tfs-TFSServerURL'

tfsUserName = 'M4Tfs-StandAlone/LoginPage/mr4tfs-EmailAddress'

tfsPassword = 'M4Tfs-StandAlone/LoginPage/mr4tfs-Password'

signInBtn = 'M4Tfs-StandAlone/LoginPage/mr4tfs-SignInBtn'

browseProjectButton = 'M4Tfs-StandAlone/RecentProjectPage/mr4tfs-_BrowseProjects'

//	Test Object Declration Closed	//
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(findTestData('Configurations').getValue('ServiceUrl', 1))

WebUI.setText(findTestObject(tfsServerUrl), findTestData('Configurations').getValue('ServerName', 1))

WebUI.setText(findTestObject(tfsUserName), findTestData('Configurations').getValue('UserName', 1))

WebUI.setText(findTestObject(tfsPassword), findTestData('Configurations').getValue('Password', 1))

WebUI.click(findTestObject(signInBtn))

WebUI.waitForElementVisible(findTestObject(browseProjectButton), 20, FailureHandling.STOP_ON_FAILURE)

browseProjectButtonText = WebUI.getText(findTestObject(browseProjectButton))

assert browseProjectButtonText == 'Browse'

