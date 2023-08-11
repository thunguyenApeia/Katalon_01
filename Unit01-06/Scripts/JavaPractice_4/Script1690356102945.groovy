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


Scanner scanner = new Scanner(System.in)

System.out.print('Nhập vào số N: ')

int inputValue = scanner.nextInt()

List<String> danhSach = generateDanhSach(inputValue)

System.out.println('Danh sách gồm ' + inputValue + ' phần tử:' + danhSach)

List<String> generateDanhSach(int N) {
    List<String> danhSach = new ArrayList()

    for (int i = 1; i <= N; i++) {
        danhSach.add('So_' + i)
    }
    
    return danhSach
}