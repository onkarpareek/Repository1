package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageaObjects {

	WebDriver driver;
	By textbox_search = By.xpath("//input[@name='q']");
	By button_search = By.name("btnK");

	public GoogleSearchPageaObjects(WebDriver driver) {
		this.driver = driver;

	}

	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}

	public void click_search_button() {
		driver.findElement(button_search).sendKeys(Keys.ENTER);
	}
}
