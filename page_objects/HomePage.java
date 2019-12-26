package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	public static final String homeURL = "https://petstore.octoperf.com/";
	private static final String enterHomePage = "//a[contains(text(),'Enter the Store')]";
	
	private static WebElement goToURL(WebDriver wd) {
		return wd.findElement(By.xpath(enterHomePage));
	}
	
	public static void clickEnterHomePage(WebDriver wd){
		goToURL(wd).click();
	}
	

}
