package com.selenium.test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuit {
	
	public static void main(String args[]){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.irctc.co.in");
		driver.findElement(By.id("loginbutton")).click();
		//driver.close();
		driver.quit();
		
	}

}
