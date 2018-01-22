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

//	Test Object Declaration Open	//
browseButton = 'M4Tfs-StandAlone/RecentProjectPage/mr4tfs-_BrowseProjects'
navigateButton = 'Object Repository/M4Tfs-StandAlone/RecentProjectPage/mr4tfs-ProjectNavigate'

//	Test Object Declation Close	//

//	Click Browse Button	//
WebUI.click(findTestObject(browseButton))

//	Select Collection	//
TestObject collectionList = CustomKeywords.'edev.automatekatlon.com.GetCustomTestObject.getCustomTestObjectBy'('css', CollectionValue(
		GetCollectionName()))

String className = WebUI.getAttribute(collectionList, 'class', FailureHandling.STOP_ON_FAILURE)

if (className.contains('k-i-expand')) {
	WebUI.click(collectionList)
}

//	Select Project	//
TestObject projectList = CustomKeywords.'edev.automatekatlon.com.GetCustomTestObject.getCustomTestObjectBy'('css', ProjectValue(GetProjectName()))

if(WebUI.verifyElementVisible(projectList) == false)
{
	WebUI.scrollToElement(projectList, 10)
	WebUI.click(projectList)
}
else
{
	WebUI.click(projectList)
}

//	Click Navigate	//
WebUI.waitForElementClickable(findTestObject(navigateButton), 5)
WebUI.click(findTestObject(navigateButton));

//	Check Is Dashboard Showing	//
TestObject dashboardProjectName = CustomKeywords.'edev.automatekatlon.com.GetCustomTestObject.getCustomTestObjectBy'('css', 'span.title.project-name')
WebUI.waitForElementVisible(dashboardProjectName, 15)
assert WebUI.getText(dashboardProjectName) == GetProjectName()

//	----	Test Case Custom Methods	---//
String GetCollectionName() {
	return findTestData('Configurations').getValue('CollectionName', 1)
}
String GetProjectName() {
	return findTestData('Configurations').getValue('Project', 1)
}
String CollectionValue(String collectionName) {
	return ('#treeviewProjects > ul > li[title="' + collectionName) + '"] span'
}
String ProjectValue(String projectName)
{
	return ('li[title="'+projectName+'"]')
}
//-===================================-/