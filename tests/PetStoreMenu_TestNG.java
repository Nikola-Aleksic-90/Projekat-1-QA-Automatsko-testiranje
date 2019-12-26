package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page_objects.HomePage;
import page_objects.PetStoreMenu;
import utility.Wait;

public class PetStoreMenu_TestNG {
	
	@BeforeClass
	public void EntryText() {
		System.out.println("Pet Store Menu Test start");
	}
	
	@AfterClass
	public void ExitText() {
		System.out.println("Pet Store Menu Test end");
	}
	
	String home2URL = "https://petstore.octoperf.com/actions/Catalog.action";
	
	@Test
	public void FishTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();
 
		wd.get(home2URL);
		wd.manage().window().maximize();
		Wait.waitN(1.5);

		PetStoreMenu.getFishLeft(wd);
		PetStoreMenu.clickFishLeft(wd);
		String fishLeftURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		PetStoreMenu.getFishUp(wd);
		PetStoreMenu.clickFishUp(wd);
		String fishUpURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		PetStoreMenu.getFishCenter(wd);
		PetStoreMenu.clickFishCenter(wd);
		String fishCenterURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		SoftAssert sa = new SoftAssert();
		
		if (fishLeftURL.contains("jsessionid") || fishUpURL.contains("jsessionid") || fishCenterURL.contains("jsessionid") ) {
			if (fishLeftURL.contains("FISH") && fishUpURL.contains("FISH") && fishCenterURL.contains("FISH")) {
				fishLeftURL = "";
				fishUpURL = "";
				fishCenterURL = "";
			}
		}
		
		sa.assertEquals(fishLeftURL, fishUpURL, fishCenterURL);
		sa.assertAll();
	}
	
	@Test
	public void DogsTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(home2URL);
		wd.manage().window().maximize();
		Wait.waitN(1.5);

		PetStoreMenu.getDogsLeft(wd);
		PetStoreMenu.clickDogsLeft(wd);
		String dogsLeftURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		PetStoreMenu.getDogsUp(wd);
		PetStoreMenu.clickDogsUp(wd);
		String dogsUpURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		PetStoreMenu.getDogsCenter(wd);
		PetStoreMenu.clickDogsCenter(wd);
		String dogsCenterURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		SoftAssert sa = new SoftAssert();
		
		if (dogsLeftURL.contains("jsessionid") || dogsUpURL.contains("jsessionid") || dogsCenterURL.contains("jsessionid") ) {
			if (dogsLeftURL.contains("DOGS") && dogsUpURL.contains("DOGS") && dogsCenterURL.contains("DOGS")) {
				dogsLeftURL = "";
				dogsUpURL = "";
				dogsCenterURL = "";
			}
		}
		
		sa.assertEquals(dogsLeftURL, dogsUpURL, dogsCenterURL);
		sa.assertAll();
	}
	
	@Test
	public void CatsTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(home2URL);
		wd.manage().window().maximize();
		Wait.waitN(1.5);

		PetStoreMenu.getCatsLeft(wd);
		PetStoreMenu.clickCatsLeft(wd);
		String catsLeftURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		PetStoreMenu.getCatsUp(wd);
		PetStoreMenu.clickCatsUp(wd);
		String catsUpURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		PetStoreMenu.getCatsCenter(wd);
		PetStoreMenu.clickCatsCenter(wd);
		String catsCenterURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		SoftAssert sa = new SoftAssert();
		
		if (catsLeftURL.contains("jsessionid") || catsUpURL.contains("jsessionid") || catsCenterURL.contains("jsessionid") ) {
			if (catsLeftURL.contains("CATS") && catsUpURL.contains("CATS") && catsCenterURL.contains("CATS")) {
				catsLeftURL = "";
				catsUpURL = "";
				catsCenterURL = "";
			}
		}
		
		sa.assertEquals(catsLeftURL, catsUpURL, catsCenterURL);
		sa.assertAll();
	}
	
	@Test
	public void ReptilesTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(home2URL);
		wd.manage().window().maximize();
		Wait.waitN(1.5);

		PetStoreMenu.getReptilesLeft(wd);
		PetStoreMenu.clickReptilesLeft(wd);
		String reptilesLeftURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		PetStoreMenu.getReptilesUp(wd);
		PetStoreMenu.clickReptilesUp(wd);
		String reptilesUpURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		PetStoreMenu.getReptilesCenter(wd);
		PetStoreMenu.clickReptilesCenter(wd);
		String reptilesCenterURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		SoftAssert sa = new SoftAssert();
		
		if (reptilesLeftURL.contains("jsessionid") || reptilesUpURL.contains("jsessionid") || reptilesCenterURL.contains("jsessionid") ) {
			if (reptilesLeftURL.contains("REPTILES") && reptilesUpURL.contains("REPTILES") && reptilesCenterURL.contains("REPTILES")) {
				reptilesLeftURL = "";
				reptilesUpURL = "";
				reptilesCenterURL = "";
			}
		}
		
		sa.assertEquals(reptilesLeftURL, reptilesUpURL, reptilesCenterURL);
		sa.assertAll();
	}
	
	@Test
	public void BirdsTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(home2URL);
		wd.manage().window().maximize();
		Wait.waitN(1.5);

		PetStoreMenu.getBirdsLeft(wd);
		PetStoreMenu.clickBirdsLeft(wd);
		String birdsLeftURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		PetStoreMenu.getBirdsUp(wd);
		PetStoreMenu.clickBirdsUp(wd);
		String birdsUpURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		PetStoreMenu.getBirdsCenter(wd);
		PetStoreMenu.clickBirdsCenter(wd);
		String birdsCenterURL = wd.getCurrentUrl();
		Wait.waitN(1d);
		
		wd.get(home2URL);
		Wait.waitN(1.5);
		
		SoftAssert sa = new SoftAssert();
		
		if (birdsLeftURL.contains("jsessionid") ||  birdsUpURL.contains("jsessionid") || birdsCenterURL.contains("jsessionid") ) {
			if (birdsLeftURL.contains("BIRDS") && birdsUpURL.contains("BIRDS") && birdsCenterURL.contains("BIRDS")) {
				birdsLeftURL = "";
				birdsUpURL = "";
				birdsCenterURL = "";
			}
		}
		
		sa.assertEquals(birdsLeftURL, birdsUpURL, birdsCenterURL);
		sa.assertAll();
	}
	
}
