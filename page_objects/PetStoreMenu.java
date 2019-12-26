package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMenu {

	public static final String HomePageCatalog = "https://petstore.octoperf.com/actions/Catalog.action";

	private static final String fishLeft = "//div[@id='Content']//a[1]//img[1]";
	private static final String dogsLeft = "//div[@id='Content']//a[2]//img[1]";
	private static final String catsLeft = "//div[@id='Content']//a[3]//img[1]";
	private static final String reptilesLeft = "//div[@id='Content']//a[4]//img[1]";
	private static final String birdsLeft = "//div[@id='Content']//a[5]//img[1]";

	private static final String fishUp = "//div[@id='QuickLinks']//a[1]//img[1]";
	private static final String dogsUp = "//div[@id='Header']//a[2]//img[1]";
	private static final String catsUp = "//div[@id='Header']//a[4]//img[1]";
	private static final String reptilesUp = "//div[@id='Header']//a[3]//img[1]";
	private static final String birdsUp = "//div[@id='Header']//a[5]//img[1]";

	private static final String fishCenter = "//body//area[2]";
	private static final String dogsCenter = "//body//area[3]";
	private static final String catsCenter = "//body//area[5]";
	private static final String reptilesCenter = "//body//area[4]";
	private static final String birdsCenter = "//body//area[6]";

	
	
	// Fish
	public static WebElement getFishLeft(WebDriver wd) {
		return wd.findElement(By.xpath(fishLeft));
	}
	public static void clickFishLeft(WebDriver wd) {
		getFishLeft(wd).click();
	}
	public static WebElement getFishUp(WebDriver wd) {
		return wd.findElement(By.xpath(fishUp));
	}
	public static void clickFishUp(WebDriver wd) {
		getFishUp(wd).click();
	}
	public static WebElement getFishCenter(WebDriver wd) {
		return wd.findElement(By.xpath(fishCenter));
	}
	public static void clickFishCenter(WebDriver wd) {
		getFishCenter(wd).click();
	}

	
	
	// Dogs
	public static WebElement getDogsLeft(WebDriver wd) {
		return wd.findElement(By.xpath(dogsLeft));
	}
	public static void clickDogsLeft(WebDriver wd) {
		getDogsLeft(wd).click();
	}
	public static WebElement getDogsUp(WebDriver wd) {
		return wd.findElement(By.xpath(dogsUp));
	}
	public static void clickDogsUp(WebDriver wd) {
		getDogsUp(wd).click();
	}
	public static WebElement getDogsCenter(WebDriver wd) {
		return wd.findElement(By.xpath(dogsCenter));
	}
	public static void clickDogsCenter(WebDriver wd) {
		getDogsCenter(wd).click();
	}
	
	
	
	// Cats
	public static WebElement getCatsLeft(WebDriver wd) {
		return wd.findElement(By.xpath(catsLeft));
	}
	public static void clickCatsLeft(WebDriver wd) {
		getCatsLeft(wd).click();
	}
	public static WebElement getCatsUp(WebDriver wd) {
		return wd.findElement(By.xpath(catsUp));
	}
	public static void clickCatsUp(WebDriver wd) {
		getCatsUp(wd).click();
	}
	public static WebElement getCatsCenter(WebDriver wd) {
		return wd.findElement(By.xpath(catsCenter));
	}
	public static void clickCatsCenter(WebDriver wd) {
		getCatsCenter(wd).click();
	}

	
	
	// Reptiles
	public static WebElement getReptilesLeft(WebDriver wd) {
		return wd.findElement(By.xpath(reptilesLeft));
	}
	public static void clickReptilesLeft(WebDriver wd) {
		getReptilesLeft(wd).click();
	}
	public static WebElement getReptilesUp(WebDriver wd) {
		return wd.findElement(By.xpath(reptilesUp));
	}
	public static void clickReptilesUp(WebDriver wd) {
		getReptilesUp(wd).click();
	}
	public static WebElement getReptilesCenter(WebDriver wd) {
		return wd.findElement(By.xpath(reptilesCenter));
	}
	public static void clickReptilesCenter(WebDriver wd) {
		getReptilesCenter(wd).click();
	}

	
	
	// Birds
	public static WebElement getBirdsLeft(WebDriver wd) {
		return wd.findElement(By.xpath(birdsLeft));
	}
	public static void clickBirdsLeft(WebDriver wd) {
		getBirdsLeft(wd).click();
	}
	public static WebElement getBirdsUp(WebDriver wd) {
		return wd.findElement(By.xpath(birdsUp));
	}
	public static void clickBirdsUp(WebDriver wd) {
		getBirdsUp(wd).click();
	}
	public static WebElement getBirdsCenter(WebDriver wd) {
		return wd.findElement(By.xpath(birdsCenter));
	}
	public static void clickBirdsCenter(WebDriver wd) {
		getBirdsCenter(wd).click();
	}

}
