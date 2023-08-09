package com.demooo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
public static void getBrowser() {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Apple\\eclipse-workspace\\12PM_Project\\driver\\chromedriver.exe");
	
	 driver= new ChromeDriver();
}
	
public static void getUrl() {
driver.get("https://www.facebook.com/\"");
	}

public static void Maximize() {
	driver.manage().window().maximize();
}
public static void getSS(String a) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File s = ts.getScreenshotAs(OutputType.FILE);
	File d = new File("C:\\Users\\Apple\\eclipse-workspace\\12PM_Project\\Screenshot" + a + ".png");
	FileUtils.copyFile(s, d);
}
}
