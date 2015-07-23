package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class differentMouseEvents {
	
	WebDriver driver;
	Action mouseOv,mousDn,sndkeys,keedown,doubleClk,contextclk, rels,keeUp;
	Actions baction;
	
	
	@BeforeTest
	 public void setUp(){
		
	    driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org/");
	    baction = new Actions(driver);
	   // mouseOv = baction.moveToElement(driver.findElement(By.id("q"))).build();
	    //mousDn = baction.clickAndHold(driver.findElement(By.id("submit"))).build();
	   //sndkeys = baction.sendKeys(driver.findElement(By.id("q")), "selenium").build();
	   // contextclk = baction.contextClick(driver.findElement(By.id("q"))).build();
	   // rels = baction.release(driver.findElement(By.id("submit"))).build();
	    keedown = baction.keyDown(Keys.SHIFT).build();
	    
	   keeUp = baction.keyUp(Keys.SHIFT).build();
	}
	@Test
	
	public void mouseOver()  {
		
		keedown.perform();
		keeUp.perform();
		driver.findElement(By.linkText("Projects")).click();
		
				
		//mouseOv.perform();
		//sndkeys.perform();
		//mousDn.perform();
		//contextclk.perform();
		
		//rels.perform();
	}
	
	

}
