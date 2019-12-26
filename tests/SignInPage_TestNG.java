package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page_objects.SignIn;
import utility.Wait;

public class SignInPage_TestNG {

	@BeforeClass
	public void EntryText() {
		System.out.println("Sign In Test start");
	}

	@AfterClass
	public void ExitText() {
		System.out.println("Sign In Test end");
	}

	@Test
	public void GoToSignInPage() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(SignIn.homePage);
		wd.manage().window().maximize();
		Wait.waitN(1d);
		
		SignIn.clickEnterSignIn(wd);
		String SignIn1URL = wd.getCurrentUrl();
		String SignIn2URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
		
		if (SignIn1URL.contains("jsessionid") ) {
			if (SignIn1URL.contains("signonForm") && SignIn2URL.contains("signonForm") ) {
				SignIn1URL = "";
				SignIn2URL = "";
			}
		}
		
		Assert.assertEquals(SignIn1URL, SignIn2URL);
		
		Wait.waitN(1.5);
		wd.quit();
		
	}
}
