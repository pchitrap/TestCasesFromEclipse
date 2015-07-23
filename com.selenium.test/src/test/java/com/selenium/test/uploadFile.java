package com.selenium.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class uploadFile {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeTest
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    baseUrl = "http://www.gmail.com/";
    driver.get(baseUrl);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
   driver.findElement(By.id("Email")).sendKeys("selemium.cpr");
   driver.findElement(By.id("next")).click();
   driver.findElement(By.id("Passwd")).sendKeys("Selenium@123");
   driver.findElement(By.id("signIn")).click();
   //driver.findElement(By.id("signIn")).click();
   driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
   driver.findElement(By.xpath("//div[@id=':ax']")).isDisplayed();
   driver.findElement(By.xpath("//div[@id=':ax']")).click();
   driver.findElement(By.className("a-b-c d-u d-u-Q")).click();
   //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("C:\\Users\\pchitrap\\Desktop\\advisesh.png");
   driver.findElement(By.className("a-b-c d-u d-u-Q")).sendKeys("C:\\Users\\pchitrap\\Desktop\\advisesh.png");
   driver.findElement(By.xpath("//div[@id=':ax']")).click();
  }
  @AfterTest
  public void tearDown() throws Exception {
    driver.quit();
   
    }
  }

 