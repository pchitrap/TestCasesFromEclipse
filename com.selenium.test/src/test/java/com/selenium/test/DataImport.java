package com.selenium.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataImport 
{


public static void main(String args[]) throws BiffException, IOException{
	
	
	WebDriver driver = new ChromeDriver();
	String baseUrl ="http://www.seleniumhq.org/";
	driver.get(baseUrl);
	driver.findElement(By.id("q")).sendKeys("Selenium");
	driver.findElement(By.id("q")).submit();
 
  FileInputStream fi=new FileInputStream("C:\\Prakash\\TestData.xls");
  Workbook w=Workbook.getWorkbook(fi);
  Sheet s=w.getSheet(0);
  driver.get("http://www.google.com");
 
  for (int i = 0; i< s.getRows(); i++)
   { 
     //Read data from excel sheet
     driver.findElement(By.id("lst-ib")).sendKeys(s.getCell(0,i).getContents());
     driver.findElement(By.name("btnG")).click();
     driver.findElement(By.id("lst-ib")).clear();
   
      } 
    }
 
}


