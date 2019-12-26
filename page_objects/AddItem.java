package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddItem {
	
	public static final String amazonParrot = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/a[1]";
	public static final String addItem = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/a[1]";
	public static final String basket = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[1]/img[1]";
	
	
	
	public static WebElement goToParrot(WebDriver wd) {
		return wd.findElement(By.xpath(amazonParrot));
	}
	public static void clickParrot(WebDriver wd){
		goToParrot(wd).click();
	}
	
	
	
	public static WebElement addItem(WebDriver wd) {
		return wd.findElement(By.xpath(addItem));
	}
	public static void clickAddItem(WebDriver wd){
		addItem(wd).click();
	}
	
	
	
	public static WebElement goToBasket(WebDriver wd) {
		return wd.findElement(By.xpath(basket));
	}
	public static void clickGoToBasket(WebDriver wd){
		goToBasket(wd).click();
	}
	
}
