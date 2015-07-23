package com.selenium.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class SimpleTestNg {
	
	   WebDriver driver;
	   String baseUrl = "http://google.com";
@Parameters("BrowserType")
@BeforeTest
      public void setUp(String BrowserType){
	if(BrowserType.equals("firefox")){
	   driver= new FirefoxDriver();
	   driver.get(baseUrl);
	} else if(BrowserType.equals("chrome")){
		
		driver= new ChromeDriver();
		   driver.get(baseUrl);

	}
	
	
}
 
	  @Test
	  public void typeText() {
		  
		  driver.findElement(By.id("lst-ib")).sendKeys("Test NG Scripts");	
		  //driver.findElement(By.name("vdg")).click();
		  
	  }
	  
	  @AfterTest
	  public void endTest(){
		  
		  driver.quit();
	  }
	}
