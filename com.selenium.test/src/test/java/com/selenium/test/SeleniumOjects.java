package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumOjects {
	 WebDriver driver;
	public static  class seleniumWebElements{
		
		public static WebElement searchBox(WebDriver driver){
			
			WebElement searchTextBox = driver.findElement(By.id("q"));
			return searchTextBox;
		}
			
        public static WebElement goButton(WebDriver driver){
			
			WebElement goButton = driver.findElement(By.id("submit"));
			return goButton;
		}
		
	}

}
