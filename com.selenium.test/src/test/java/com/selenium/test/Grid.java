package com.selenium.test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Grid {
	WebDriver driver;
	@BeforeMethod
	public void f() throws MalformedURLException
	{
		
	  DesiredCapabilities cap = DesiredCapabilities.firefox();
	  cap.setBrowserName("firefox");
	  cap.setPlatform(Platform.WIN8_1);
	  

		driver = new RemoteWebDriver(new URL("http://localhost:3452/wd/hub"), cap);
	}
	@Test
	public void textType() 
	{
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		
			}
	@AfterMethod
	public void stop()
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
			FileUtils.copyFile(src, new File("C:\\Screenshots\\scrnshotFile.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
