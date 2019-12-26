package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page_objects.Registration;
import utility.ExcelUtils;
import utility.Wait;

public class Registration_main_method {

	public static void main(String[] args) {
		// Purpose of this method is to input registration data from provided excel file
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get(Registration.registrationURL);
		wd.manage().window().maximize();
		Wait.waitN(1.0);
		
		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);
		
		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
			
			wd.get(Registration.registrationURL);
			Wait.waitN(1.0);
			
			Registration.getUserID(wd).clear();
			Registration.clickUserID(wd);
			Registration.inputUserID(wd, ExcelUtils.getDataAt(i, 0));
			Wait.waitN(0.5);
			
			Registration.getPassword(wd).clear();
			Registration.clickPassword(wd);
			Registration.inputPassword(wd, ExcelUtils.getDataAt(i, 1));
			Wait.waitN(0.5);
			
			Registration.getRepeatPassword(wd).clear();
			Registration.clickRepeatPassword(wd);
			Registration.inputRepeatPassword(wd, ExcelUtils.getDataAt(i, 1));
			Wait.waitN(0.5);
			
			Registration.getName(wd).clear();
			Registration.clickName(wd);
			Registration.inputName(wd, ExcelUtils.getDataAt(i, 2));
			Wait.waitN(0.5);
			
			Registration.getLastName(wd).clear();
			Registration.clickLastName(wd);
			Registration.inputLastName(wd, ExcelUtils.getDataAt(i, 3));
			Wait.waitN(0.5);
			
			Registration.getEmail(wd).clear();
			Registration.clickEmail(wd);
			Registration.inputEmail(wd, ExcelUtils.getDataAt(i, 4));
			Wait.waitN(0.5);
			
			Registration.getPhone(wd).clear();
			Registration.clickPhone(wd);
			Registration.inputPhone(wd, ExcelUtils.getDataAt(i, 5));
			Wait.waitN(0.5);
			
			Registration.getAddress1(wd).clear();
			Registration.clickAddress1(wd);
			Registration.inputAddress1(wd, ExcelUtils.getDataAt(i, 6));
			Wait.waitN(0.5);
			
			Registration.getAddress2(wd).clear();
			Registration.clickAddress2(wd);
			Registration.inputAddress2(wd, ExcelUtils.getDataAt(i, 7));
			Wait.waitN(0.5);
			
			Registration.getCity(wd).clear();
			Registration.clickCity(wd);
			Registration.inputCity(wd, ExcelUtils.getDataAt(i, 8));
			Wait.waitN(0.5);
			
			Registration.getState(wd).clear();
			Registration.clickState(wd);
			Registration.inputState(wd, ExcelUtils.getDataAt(i, 9));
			Wait.waitN(0.5);
			
			Registration.getZip(wd).clear();
			Registration.clickZip(wd);
			Registration.inputZip(wd, ExcelUtils.getDataAt(i, 10));
			Wait.waitN(0.5);
			
			Registration.getCountry(wd).clear();
			Registration.clickCountry(wd);
			Registration.inputCountry(wd, ExcelUtils.getDataAt(i, 11));
			Wait.waitN(0.5);
			
			Registration.getRegistrationButton(wd);
			Registration.clickRegistrationButton(wd);
			Wait.waitN(0.5);
			
	}
		
		Wait.waitN(2.5);
		wd.quit();

	}

}
