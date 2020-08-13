package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTestng {
	WebDriver driver = null;
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	@BeforeTest
	public void setup() {
		htmlreporter = new ExtentHtmlReporter("extent.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
	}
	@Test
	public void test1() throws IOException {
		ExtentTest test = extent.createTest("Google search test","For google search");
		 test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
	}
	@AfterTest
	public void teardown() {
		extent.flush();
	}
}
