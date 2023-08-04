package seleniumcrashcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day2 {

	public static void main(String[] args) {
		// Set the path to your ChromeDriver executable
		// System.setProperty("webdriver.chrome.driver", "Your_Browser_Driver_Path");

		// Create a WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Open Google
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		// Search for Myntra
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Myntra");
		searchBox.submit();

		// Click on the 1st link of Myntra
		WebElement firstLink = driver.findElement(By.xpath("(//span[@class='VuuXrf'][normalize-space()='Myntra'])[1]"));
		firstLink.click();

		// Wait for the Myntra website to load
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Click on the 'Men' category in the top menu using Actions class
		WebElement menCategory = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menCategory).perform();

		// Click on the 'T-Shirts' subcategory in the menu using Actions class
		WebElement tShirtsSubcategory = driver.findElement(By.xpath("//a[text()='T-Shirts']"));
		actions.moveToElement(tShirtsSubcategory).click().perform();

		// Wait for the T-Shirts page to load
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Close the browser
		driver.quit();
	}
}