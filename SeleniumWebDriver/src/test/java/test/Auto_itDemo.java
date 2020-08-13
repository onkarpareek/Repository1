package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_itDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.tinyupload.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Abhishek\\Desktop\\auto_it.exe");
		
		Thread.sleep(5000);
		driver.close();
		
	}
		public static void test() throws IOException, InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://www.tinyupload.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("")).click();
			
			Runtime.getRuntime().exec("C:\\Users\\Abhishek\\Desktop\\auto_it.exe");
			
			Thread.sleep(5000);
			driver.close();
			
		}

	}


