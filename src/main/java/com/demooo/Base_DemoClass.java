package com.demooo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_DemoClass {
	
	public static WebDriver driver;
	
public static void getDriver() {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Apple\\eclipse-workspace\\12PM_Project\\driver\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	driver.get("https://www.amazon.in/events/blockbustervaluedays?ref_=nav_cs_gb");

}

public static  void getSS(String a) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File s = ts.getScreenshotAs(OutputType.FILE);
	File d = new File("C:\\Users\\Apple\\eclipse-workspace\\12PM_Project\\Screenshot" + a + ".png");
	FileUtils.copyFile(s, d);
}

public static void inputVlaue( WebElement c, String b) {
	
	c.sendKeys(b);
	

}

public static void actionsClass(String actionName, WebElement element) {
	Actions a= new Actions(driver);
	
	if (actionName.equalsIgnoreCase("Clickon")) {
		a.click(element).build().perform();	
	}
	else if (actionName.equalsIgnoreCase("Doubleclick")) {
		a.doubleClick(element).build().perform();	
	}
	else if (actionName.equalsIgnoreCase("Moveto")) {
		a.moveToElement(element).build().perform();			
	}
	
	
}


	public static void dropdown(String options, WebElement element1, String value) {
		Select s = new Select(element1);
		if(options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}else if(options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}else if(options.equalsIgnoreCase("Index")) {
			int n = Integer.parseInt(value);
			s.selectByIndex(n);
		}
	}
	
	

}
