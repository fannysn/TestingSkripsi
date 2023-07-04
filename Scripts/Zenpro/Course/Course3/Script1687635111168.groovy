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

WebUI.navigateToUrl('https://zenpro.id/')

WebUI.click(findTestObject('Object Repository/Course3/Page_Kursus Online Bersertifikat dan Pelati_305123/span_Masuk'))

WebUI.setText(findTestObject('Object Repository/Course3/Page_Kursus Online Bersertifikat dan Pelati_305123/input_Email_email'), 
    'fannysntest@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Course3/Page_Kursus Online Bersertifikat dan Pelati_305123/input_Kata Sandi_password'), 
    '8rnxVmT9pieEqmmF1SkAqw==')

WebUI.sendKeys(findTestObject('Object Repository/Course3/Page_Kursus Online Bersertifikat dan Pelati_305123/input_Kata Sandi_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Course3/Page_Kursus Online Bersertifikat dan Pelati_305123/span_Pelatihan Saya'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Pelatihan Saya/span_Lanjutkan Latihan'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/svg_Langkah Awal Belajar Bahasa Inggris_Mui_599bfe'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Pelatihan Belajar Bahasa Inggris dari _c2b525/span_Lanjut'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Quiz/div_b'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Quiz/span_Next'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Quiz/div_b'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Quiz/span_Next'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Quiz/div_c'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Quiz/span_Next'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Quiz/div_c'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Quiz/span_Next'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Quiz/div_d'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Quiz/span_Next'))

WebUI.click(findTestObject('Object Repository/Course3/Page_Quiz/span_Lanjutkan'))

WebUI.closeBrowser()

