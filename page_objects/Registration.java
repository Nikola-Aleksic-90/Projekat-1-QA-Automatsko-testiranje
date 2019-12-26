package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {

	public static final String registrationURL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";

	// Relative path is not working, I will use absolute path
	private static final String userID = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String newPassword = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
	private static final String repeatPassword = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]";

	private static final String firstName = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String lastName = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[2]/td[2]/input[1]";
	private static final String email = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[3]/td[2]/input[1]";
	private static final String phone = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[4]/td[2]/input[1]";
	private static final String address1 = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[5]/td[2]/input[1]";
	private static final String address2 = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[6]/td[2]/input[1]";
	private static final String city = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[7]/td[2]/input[1]";
	private static final String state = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[8]/td[2]/input[1]";
	private static final String zip = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[9]/td[2]/input[1]";
	private static final String country = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[10]/td[2]/input[1]";

	private static final String registrationButton = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";
	
	
	// Username
	public static WebElement getUserID(WebDriver wd) {
		return wd.findElement(By.xpath(userID));
	}
	public static void clickUserID(WebDriver wd) {
		getUserID(wd).click();
	}
	public static void inputUserID(WebDriver wd, String usernameData) {
		getUserID(wd).sendKeys(usernameData);
	}

	
	
	// Password
	public static WebElement getPassword(WebDriver wd) {
		return wd.findElement(By.xpath(newPassword));
	}
	public static void clickPassword(WebDriver wd) {
		getPassword(wd).click();
	}
	public static void inputPassword(WebDriver driver, String passwordData) {
		getPassword(driver).sendKeys(passwordData);
	}

	
	
	// Repeat Password
	public static WebElement getRepeatPassword(WebDriver wd) {
		return wd.findElement(By.xpath(repeatPassword));
	}
	public static void clickRepeatPassword(WebDriver driver) {
		getPassword(driver).click();
	}
	public static void inputRepeatPassword(WebDriver driver, String repeatPasswordData) {
		getRepeatPassword(driver).sendKeys(repeatPasswordData);
	}

	
	
	// First Name
	public static WebElement getName(WebDriver wd) {
		return wd.findElement(By.xpath(firstName));
	}
	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}
	public static void inputName(WebDriver wd, String firstNameData) {
		getName(wd).sendKeys(firstNameData);
	}

	
	
	// Last Name
	public static WebElement getLastName(WebDriver wd) {
		return wd.findElement(By.xpath(lastName));
	}
	public static void clickLastName(WebDriver wd) {
		getLastName(wd).click();
	}
	public static void inputLastName(WebDriver wd, String lastNameData) {
		getLastName(wd).sendKeys(lastNameData);
	}

	
	
	// Email
	public static WebElement getEmail(WebDriver wd) {
		return wd.findElement(By.xpath(email));
	}
	public static void clickEmail(WebDriver wd) {
		getEmail(wd).click();
	}
	public static void inputEmail(WebDriver wd, String emailData) {
		getEmail(wd).sendKeys(emailData);
	}

	
	
	// Phone
	public static WebElement getPhone(WebDriver wd) {
		return wd.findElement(By.xpath(phone));
	}
	public static void clickPhone(WebDriver wd) {
		getPhone(wd).click();
	}
	public static void inputPhone(WebDriver wd, String phoneData) {
		getPhone(wd).sendKeys(phoneData);
	}

	
	
	// Address1
	public static WebElement getAddress1(WebDriver wd) {
		return wd.findElement(By.xpath(address1));
	}
	public static void clickAddress1(WebDriver wd) {
		getAddress1(wd).click();
	}
	public static void inputAddress1(WebDriver wd, String address1Data) {
		getAddress1(wd).sendKeys(address1Data);
	}

	
	
	// Address2
	public static WebElement getAddress2(WebDriver wd) {
		return wd.findElement(By.xpath(address2));
	}
	public static void clickAddress2(WebDriver wd) {
		getAddress2(wd).click();
	}
	public static void inputAddress2(WebDriver wd, String address2Data) {
		getAddress2(wd).sendKeys(address2Data);
	}

	
	
	// City
	public static WebElement getCity(WebDriver wd) {
		return wd.findElement(By.xpath(city));
	}
	public static void clickCity(WebDriver wd) {
		getCity(wd).click();
	}
	public static void inputCity(WebDriver wd, String cityData) {
		getCity(wd).sendKeys(cityData);
	}

	
	
	// State
	public static WebElement getState(WebDriver wd) {
		return wd.findElement(By.xpath(state));
	}
	public static void clickState(WebDriver wd) {
		getState(wd).click();
	}
	public static void inputState(WebDriver wd, String stateData) {
		getState(wd).sendKeys(stateData);
	}

	
	
	// Zip
	public static WebElement getZip(WebDriver wd) {
		return wd.findElement(By.xpath(zip));
	}
	public static void clickZip(WebDriver wd) {
		getZip(wd).click();
	}
	public static void inputZip(WebDriver wd, String zipData) {
		getZip(wd).sendKeys(zipData);
	}

	
	
	// Country
	public static WebElement getCountry(WebDriver wd) {
		return wd.findElement(By.xpath(country));
	}
	public static void clickCountry(WebDriver wd) {
		getCountry(wd).click();
	}
	public static void inputCountry(WebDriver wd, String countryData) {
		getCountry(wd).sendKeys(countryData);
	}
	
	
	
	// Registration button
	public static WebElement getRegistrationButton(WebDriver wd) {
		return wd.findElement(By.xpath(registrationButton));
	}
	public static void clickRegistrationButton(WebDriver wd) {
		getRegistrationButton(wd).click();
	}

}
