package seleniumfirst;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirstjava {
	private static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {

		googleSearch();
	}
	public static void googleSearch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
		GoogleSearchPage.textbox_search(driver).sendKeys("Hello");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.close();

	}

}
