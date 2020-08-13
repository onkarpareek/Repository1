package seleniumfirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageaObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		googleSearchTest();
	}
	public static void googleSearchTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		GoogleSearchPageaObjects searchPageObj = new GoogleSearchPageaObjects(driver);

		driver.navigate().to("https://google.com");

		searchPageObj.setTextInSearchBox("hello");

		searchPageObj.click_search_button();

		Thread.sleep(3000);

		driver.close();
	}
}
