package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	public static final String homePage = "https://petstore.octoperf.com/actions/Catalog.action";
	public static final String signInPage = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	private static final String signInXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]";

	private static final String signInUser = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	private static final String signInPassword = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]";
	
	private static final String logInButton = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";
	private static final String logOutButton = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]";
	
	private static final String accountButton = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[3]";
	
	
	
	// Go to Sign In
	private static WebElement goToSignInPage(WebDriver wd) {
		return wd.findElement(By.xpath(signInXpath));
	}
	public static void clickEnterSignIn(WebDriver wd){
		goToSignInPage(wd).click();
	}
	
	
	
	// Log Out User
	public static WebElement logOut(WebDriver wd) {
		return wd.findElement(By.xpath(logOutButton));
	}
	public static void clickLogOut(WebDriver wd){
		logOut(wd).click();
	}
	
	
	
	// Log In
	public static WebElement signIn(WebDriver wd) {
		return wd.findElement(By.xpath(logInButton));
	}
	public static void clickSignIn(WebDriver wd){
		signIn(wd).click();
	}
	
	
	
	// GoToAccount
	public static WebElement goToAccount(WebDriver wd) {
		return wd.findElement(By.xpath(accountButton));
	}
	public static void clickGoToAccount(WebDriver wd){
		goToAccount(wd).click();
	}
		
	
	
	// Username
	public static WebElement getSignInUser(WebDriver wd) {
		return wd.findElement(By.xpath(signInUser));
	}
	public static void clickSignInUser(WebDriver wd) {
		getSignInUser(wd).click();
	}
	public static void inputSignInUser(WebDriver wd, String signInData) {
		getSignInUser(wd).sendKeys(signInData);
	}

	
	
	// Password
	public static WebElement getSignInPassword(WebDriver wd) {
		return wd.findElement(By.xpath(signInPassword));
	}
	public static void clickSignInPassword(WebDriver wd) {
		getSignInPassword(wd).click();
	}
	public static void inputSignInPassword(WebDriver wd, String signInData) {
		getSignInPassword(wd).sendKeys(signInData);
	}

}
