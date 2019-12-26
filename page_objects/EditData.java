package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditData {

	private static final String phone = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[4]/td[2]/input[1]";
	private static final String saveChanges = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";

	
	
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
	
	
	
	// Registration button
	public static WebElement getSaveChanges(WebDriver wd) {
		return wd.findElement(By.xpath(saveChanges));
	}
	public static void clickSaveChanges(WebDriver wd) {
		getSaveChanges(wd).click();
	}

}
