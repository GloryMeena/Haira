package com.demooo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_demo {
	
	public static WebDriver driver; 
	
	public static void getBrowser(String value ) {

		if (value.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Apple\\eclipse-workspace\\demo_June\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();

	}
		else if (value.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Apple\\eclipse-workspace\\demo_June\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
			
		}
	
	public static void geturl(String url ) {
		driver.get(url);
	}
	
	public static void getMax() {
		driver.manage().window().maximize();
	}
	public static void getSS() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\Apple\\eclipse-workspace\\demo_June\\SS\\img.png");
		FileUtils.copyFile(s, d);
		
	}
	
	
}
