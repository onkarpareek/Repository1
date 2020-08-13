package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {
	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentreports.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);

		ExtentTest test = extent.createTest("Google search test","For google search");

		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		test.log(Status.INFO, "starting test case");
		
		driver.get("https://google.com");
		test.pass("Navigated to google.com");
		
		driver.manage().window().maximize();
		test.pass("maximize the window");
		
		driver.findElement(By.name("q")).sendKeys("abcd");
		test.pass("Enter text in search box");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		test.pass("press keyboard enter key");
		
		Thread.sleep(3000);
		
		driver.close();
		test.pass("close the browser");
		
		test.info("Test is completed");
		
		extent.flush();
	}
}
