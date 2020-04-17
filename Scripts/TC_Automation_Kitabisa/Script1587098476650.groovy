import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

try {
	WebUI.openBrowser('https://kitabisa.com/')
	WebUI.waitForPageLoad(1000)
	WebUI.click(findTestObject('e2e/btn_donasi'))
	WebUI.waitForElementPresent(findTestObject('Object Repository/e2e/label_bantu_siapa_hari_ini'), 100)
	WebUI.waitForElementPresent(findTestObject('e2e/menu_corona'), 100)
	WebUI.click(findTestObject('e2e/menu_corona'))
	WebUI.waitForElementPresent(findTestObject('e2e/btn_donasi_sekarang'), 100)
	WebUI.click(findTestObject('e2e/btn_donasi_sekarang'))
	WebUI.click(findTestObject('e2e/menu_10k'))
	WebUI.click(findTestObject('e2e/menu_transfer_bca'))
	WebUI.setText(findTestObject('e2e/input_nama'),GlobalVariable.nama)
	WebUI.setText(findTestObject('e2e/input_nophone'),GlobalVariable.phone)
	WebUI.click(findTestObject('e2e/btn_lanjutkan_pembayaran'))
	def popup = findTestObject('e2e/img_popup')
	if(popup == true){
		WebUI.click(findTestObject('Object Repository/e2e/btn_X'))
	}
	WebUI.click(findTestObject('e2e/btn_kembali_penggalangan'))
	WebUI.click(findTestObject('e2e/btn_back'))
	WebUI.closeBrowser()
} catch (Exception e) {
	e.printStackTrace()
	WebUI.closeBrowser()
}