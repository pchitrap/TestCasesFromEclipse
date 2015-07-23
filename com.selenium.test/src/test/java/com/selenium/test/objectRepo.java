package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.test.SeleniumOjects.seleniumWebElements;

public class objectRepo {

	 WebDriver driver;
	@BeforeTest
	
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org");
	}
	
	@Test
	
	public void testMethod(){
		
		seleniumWebElements.searchBox(driver).sendKeys("Selenium");
		seleniumWebElements.goButton(driver).click();
		
		
	}
	
	
}
