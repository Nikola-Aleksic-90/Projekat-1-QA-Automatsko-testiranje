package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page_objects.AddItem;
import page_objects.EditData;
import page_objects.PetStoreMenu;
import page_objects.Registration;
import page_objects.SignIn;
import utility.ExcelUtils;
import utility.Wait;

public class SingleUserFullTest_TestNG {
	// Purpose of this test is to:
	// 1) register single user,
	// 2) log him in,
	// 3) change any user data (I choose to change his/her Phone number) and
	// 4) test if adding item to basket works (I choose to add parrot )

	String user = "59.0";
	String password = "QsukPSnF";

	@Test(priority = 1)
	public void SingleUserRegisterTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(Registration.registrationURL);
		wd.manage().window().maximize();
		Wait.waitN(1.0);

		wd.get(Registration.registrationURL);
		Wait.waitN(1.0);

		Registration.getUserID(wd).clear();
		Registration.clickUserID(wd);
		Registration.inputUserID(wd, user);
		Wait.waitN(0.5);

		Registration.getPassword(wd).clear();
		Registration.clickPassword(wd);
		Registration.inputPassword(wd, password);
		Wait.waitN(0.5);

		Registration.getRepeatPassword(wd).clear();
		Registration.clickRepeatPassword(wd);
		Registration.inputRepeatPassword(wd, password);
		Wait.waitN(0.5);

		Registration.getName(wd).clear();
		Registration.clickName(wd);
		Registration.inputName(wd, "Pera");
		Wait.waitN(0.5);

		Registration.getLastName(wd).clear();
		Registration.clickLastName(wd);
		Registration.inputLastName(wd, "Peric");
		Wait.waitN(0.5);

		Registration.getEmail(wd).clear();
		Registration.clickEmail(wd);
		Registration.inputEmail(wd, "peraperic@peraperic.org");
		Wait.waitN(0.5);

		Registration.getPhone(wd).clear();
		Registration.clickPhone(wd);
		Registration.inputPhone(wd, "555-333");
		Wait.waitN(0.5);

		Registration.getAddress1(wd).clear();
		Registration.clickAddress1(wd);
		Registration.inputAddress1(wd, "Pere Perica bb");
		Wait.waitN(0.5);

		Registration.getAddress2(wd).clear();
		Registration.clickAddress2(wd);
		Registration.inputAddress2(wd, "Pere Perica 1");
		Wait.waitN(0.5);

		Registration.getCity(wd).clear();
		Registration.clickCity(wd);
		Registration.inputCity(wd, "Pera Town");
		Wait.waitN(0.5);

		Registration.getState(wd).clear();
		Registration.clickState(wd);
		Registration.inputState(wd, "State of Pera");
		Wait.waitN(0.5);

		Registration.getZip(wd).clear();
		Registration.clickZip(wd);
		Registration.inputZip(wd, "12345");
		Wait.waitN(0.5);

		Registration.getCountry(wd).clear();
		Registration.clickCountry(wd);
		Registration.inputCountry(wd, "People Republic of Pera");
		Wait.waitN(0.5);

		Registration.getRegistrationButton(wd);
		Registration.clickRegistrationButton(wd);
		Wait.waitN(2.0);
		wd.quit();

	}

	@Test(priority = 2)
	public void SingleUserLogIn() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(SignIn.signInPage);
		wd.manage().window().maximize();
		Wait.waitN(1.0);

		wd.get(SignIn.signInPage);
		Wait.waitN(1.0);

		SignIn.getSignInUser(wd);
		SignIn.clickSignInUser(wd);
		SignIn.inputSignInUser(wd, user);
		Wait.waitN(1d);

		SignIn.getSignInPassword(wd).clear();
		SignIn.clickSignInPassword(wd);
		SignIn.inputSignInPassword(wd, password);
		Wait.waitN(1d);

		SignIn.signIn(wd);
		SignIn.clickSignIn(wd);
		Wait.waitN(2d);

		SignIn.clickGoToAccount(wd);
		SignIn.clickGoToAccount(wd);
		Wait.waitN(2d);

		SignIn.logOut(wd);
		SignIn.clickLogOut(wd);
		Wait.waitN(3d);

		wd.quit();
	}

	@Test(priority = 3)
	public void EditProfileData() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(SignIn.signInPage);
		wd.manage().window().maximize();
		Wait.waitN(1.0);

		SignIn.getSignInUser(wd);
		SignIn.clickSignInUser(wd);
		SignIn.inputSignInUser(wd, user);
		Wait.waitN(1d);

		SignIn.getSignInPassword(wd).clear();
		SignIn.clickSignInPassword(wd);
		SignIn.inputSignInPassword(wd, password);
		Wait.waitN(1d);

		SignIn.signIn(wd);
		SignIn.clickSignIn(wd);
		Wait.waitN(2d);

		SignIn.clickGoToAccount(wd);
		SignIn.clickGoToAccount(wd);
		Wait.waitN(2d);

		EditData.getPhone(wd).clear();
		EditData.clickPhone(wd);
		EditData.inputPhone(wd, "PROMENA");
		Wait.waitN(4d);
		
		Registration.getPassword(wd).clear();
		Registration.clickPassword(wd);
		Registration.inputPassword(wd, password);
		Wait.waitN(0.5);

		Registration.getRepeatPassword(wd).clear();
		Registration.clickRepeatPassword(wd);
		Registration.inputRepeatPassword(wd, password);
		Wait.waitN(0.5);

		EditData.getSaveChanges(wd);
		EditData.clickSaveChanges(wd);
		Wait.waitN(4d);

		wd.get("https://petstore.octoperf.com/actions/Catalog.action");
		Wait.waitN(1d);

		SignIn.clickGoToAccount(wd);
		SignIn.clickGoToAccount(wd);
		Wait.waitN(4d);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(EditData.getPhone(wd).getAttribute("value"), "PROMENA");
		sa.assertAll();

		SignIn.logOut(wd);
		SignIn.clickLogOut(wd);
		Wait.waitN(3d);

		wd.quit();

	}

	@Test(priority = 4)
	public void AddItemToBasket() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(SignIn.signInPage);
		wd.manage().window().maximize();
		Wait.waitN(1.0);

		SignIn.getSignInUser(wd);
		SignIn.clickSignInUser(wd);
		SignIn.inputSignInUser(wd, user);
		Wait.waitN(1d);

		SignIn.getSignInPassword(wd).clear();
		SignIn.clickSignInPassword(wd);
		SignIn.inputSignInPassword(wd, password);
		Wait.waitN(1d);

		SignIn.signIn(wd);
		SignIn.clickSignIn(wd);
		Wait.waitN(2d);

		wd.get("https://petstore.octoperf.com/actions/Catalog.action");
		Wait.waitN(1.5);

		PetStoreMenu.getBirdsCenter(wd);
		PetStoreMenu.clickBirdsCenter(wd);
		Wait.waitN(2d);

		AddItem.goToParrot(wd);
		AddItem.clickParrot(wd);
		Wait.waitN(2d);

		AddItem.addItem(wd);
		AddItem.clickAddItem(wd);
		Wait.waitN(2d);
		
		wd.get("https://petstore.octoperf.com/actions/Catalog.action");
		Wait.waitN(1.5);
		
		PetStoreMenu.getBirdsCenter(wd);
		PetStoreMenu.clickBirdsCenter(wd);
		Wait.waitN(2d);

		AddItem.goToParrot(wd);
		AddItem.clickParrot(wd);
		Wait.waitN(2d);
		
		AddItem.addItem(wd);
		AddItem.clickAddItem(wd);
		Wait.waitN(2d);

		wd.get("https://petstore.octoperf.com/actions/Catalog.action");
		Wait.waitN(2d);

		AddItem.goToBasket(wd);
		AddItem.clickGoToBasket(wd);
		Wait.waitN(3d);

		boolean parrotBoolean = wd.findElements(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[3]")).equals("Adult Male Amazon Parrot");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(true, parrotBoolean);
		sa.assertAll();
	
		wd.quit();
	}

}
