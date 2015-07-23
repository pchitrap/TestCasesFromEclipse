package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MvClass {
	
	WebDriver driver;
	   String baseUrl = "http://google.com";

@BeforeTest
   public void setUp(){
	   driver= new FirefoxDriver();
	   driver.get(baseUrl);
	   
	
}

	  @Test
	  public void typeText() {
		  
		  driver.findElement(By.id("lst-ib")).sendKeys("Test NG Scripts");	  
		  
	  }
	  
	  @AfterTest
	  public void endTest(){
		  
		  driver.quit();
	  }
	}

