package seleniumcrashcourse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldTest {

	public static void main(String[] args) {

			// Create a new instance of ChromeDriver
			WebDriver driver = new ChromeDriver();

			// Navigate to a website
			driver.get("https://www.google.com");

			// Get and print the page title
			String pageTitle = driver.getTitle();
			System.out.println("Page Title: " + pageTitle);

			// Close the browser
			driver.quit();
			}

	}

