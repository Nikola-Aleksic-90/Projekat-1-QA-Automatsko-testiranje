package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page_objects.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Wait;

public class HomePage_TestNG {
	
	@BeforeClass
	public void EntryText() {
		System.out.println("Home Page Test start");
	}
	
	@AfterClass
	public void ExitText() {
		System.out.println("Home Page Test end");
	}
	
	@Test
	public void GoToHomePage() {
		// Purpose of this class is to test going to Home Page

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(HomePage.homeURL);
		wd.manage().window().maximize();
		Wait.waitN(1.5);

		HomePage.clickEnterHomePage(wd);
		String home1URL = wd.getCurrentUrl();
		String home2URL = "https://petstore.octoperf.com/actions/Catalog.action";
		Wait.waitN(1.5);

		Assert.assertEquals(home2URL, home1URL);

		Wait.waitN(1.5);
		wd.quit();

	}
}
