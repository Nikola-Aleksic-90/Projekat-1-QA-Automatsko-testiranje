package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page_objects.SignIn;
import utility.ExcelUtils;
import utility.Wait;

public class SignIn_main_method {

	public static void main(String[] args) {
		// Purpose of this method is to sign in previously registrated users from excel
		// file

		// Purpose of this method is to input registration data from provided excel file

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(SignIn.signInPage);
		wd.manage().window().maximize();
		Wait.waitN(1.0);

		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);
		
		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
			
			wd.get(SignIn.signInPage);
			Wait.waitN(1.0);
			
			SignIn.getSignInUser(wd).clear();
			SignIn.clickSignInUser(wd);
			SignIn.inputSignInUser(wd, ExcelUtils.getDataAt(i, 0));
			Wait.waitN(2d);
			
			SignIn.getSignInPassword(wd).clear();
			SignIn.clickSignInPassword(wd);
			SignIn.inputSignInPassword(wd, ExcelUtils.getDataAt(i, 1));
			Wait.waitN(2d);
			
			SignIn.signIn(wd);
			SignIn.clickSignIn(wd);
			Wait.waitN(2d);
			
			SignIn.clickGoToAccount(wd);
			SignIn.clickGoToAccount(wd);
			Wait.waitN(2d);
			
			SignIn.logOut(wd);
			SignIn.clickLogOut(wd);
			Wait.waitN(2d);
			
		}
		
		Wait.waitN(2.5);
		wd.quit();
		
	}

}
