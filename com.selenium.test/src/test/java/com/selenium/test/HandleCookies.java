package com.selenium.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleCookies {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		driver = new ChromeDriver();
	}
		
  @Test
  public void cookiee(){
	driver.get("http://www.seleniumhq.org/");  
	//Cookie cname = driver.manage().getCookieNamed("AKDC");
	 //driver.manage().deleteCookieNamed("AKDC");
	 driver.manage().deleteAllCookies();
	 
	//System.out.println(cname);
	
	Set<Cookie> ck = driver.manage().getCookies(); 
	//driver.manage().getCookieNamed(arg0)
  System.out.println("Selenium Home page Cookie is "+ck);
  //driver.findElement(By.linkText("Projects")).click();
  
  //Set<Cookie> projectCookie = driver.manage().getCookies(); 
 // System.out.println("Selenium Projects page Cookie is "+projectCookie);
  
  }

}
