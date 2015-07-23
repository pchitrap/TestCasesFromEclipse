package com.selenium.test;

//import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//import org.testng.TestNGException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class mouseEvents {
	
	WebDriver driver;
	Action mouseOv;
	Actions baction;
	
	
	@BeforeTest
	 public void setUp(){
		
	    driver = new ChromeDriver();
	    driver.get("http://www.seleniumhq.org/");
	    baction = new Actions(driver);
	    mouseOv = baction.moveToElement(driver.findElement(By.id("q"))).build();
                
	
	}
	
	@Test
	
	public void mouseOver()  {
		
		
				
		mouseOv.perform();
		
		
	}
	
	

}
