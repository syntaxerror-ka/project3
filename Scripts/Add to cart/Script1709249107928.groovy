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

WebUI.navigateToUrl('https://www.matahari.com/customer/account/login/')

WebUI.setText(findTestObject('Object Repository/Page_Customer Login  matahari.com/input_Nomor Handphoneemail_loginusername'), 
    '085775337875')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login  matahari.com/input_Password (minimal 8 karakter)_loginpassword'), 
    'XUMyMRZHFO/eblnTdDZY5Q==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login  matahari.com/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Belanja Online Fashion Lifestyle Gampa_b07c33/a_Details Kemeja Rivet'))

WebUI.click(findTestObject('Object Repository/Page_Jual Details Kemeja Rivet Off White Or_7a9dc4/div_S'))

WebUI.click(findTestObject('Object Repository/Page_Jual Details Kemeja Rivet Off White Or_7a9dc4/button_Tambah ke keranjang'))

