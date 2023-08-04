
package seleniumcrashcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2BounusGoIbiboExercise {

	private WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		WebElement element = driver.findElement(By.cssSelector("span.logSprite.icClose"));
		element.click();
	}

	@Test
	public void testFlightSearch() {
		// Select the 'Round Trip' radio button

		// Wait for the page to load
		try {
			Thread.sleep(5000); // You can use explicit wait or other wait strategies here if needed
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Enter the departure city
		WebElement departureCityInputSpan = driver.findElement(By.cssSelector(""));
		departureCityInputSpan.click();
		departureCityInputSpan.sendKeys("Delhi");

		// Enter the departure city
		WebElement departureCityInput = driver.findElement(By.xpath(""));
		departureCityInput.sendKeys("");
		departureCityInput.sendKeys(Keys.ENTER);

		// Enter the destination city
		WebElement destinationCityInput = driver.findElement(By.xpath(""));
		destinationCityInput.sendKeys("");
		destinationCityInput.sendKeys(Keys.ENTER);

		// Choose the departure and return dates
		String departureDate = "2023-08-10"; // Replace with your desired departure date in the format "YYYY-MM-DD"
		String returnDate = "2023-08-17"; // Replace with your desired return date in the format "YYYY-MM-DD"

		WebElement departureDateInput = driver.findElement(By.id(""));
		departureDateInput.click();
		WebElement departureDateElement = driver.findElement(By.xpath(""));
		departureDateElement.click();

		WebElement returnDateInput = driver.findElement(By.id(""));
		returnDateInput.click();
		WebElement returnDateElement = driver.findElement(By.xpath(""));
		returnDateElement.click();

		// Click on the 'Search' button
		WebElement searchButton = driver.findElement(By.id(""));
		searchButton.click();

		// Wait for the search results page to load
		try {
			Thread.sleep(5000); // You can use explicit wait or other wait strategies here if needed
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Verify the search results
		WebElement searchResults = driver.findElement(By.id(""));
		Assert.assertTrue(searchResults.isDisplayed(), "Search results not displayed");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}