package com.selenium.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class MultipleWindows {
	WebDriver driver;
	@BeforeMethod
	public void init()
	{
		driver=new FirefoxDriver();
	}
	/*@AfterMethod
	public void stop()
	{
		driver.quit();
	} */
	@Test
	public void testMultiwindow()
	{
		driver.get("https://www.irctc.co.in/");
		String p=driver.getWindowHandle();
		System.out.println(p);
		String ptitle=driver.getTitle();
		System.out.println("Parent window title is:"+ptitle);
		driver.findElement(By.linkText("Concierge/Cab")).click();
		for(String c:driver.getWindowHandles())
		{
			System.out.println(c);
			driver.switchTo().window(c);
		}
		String ctitle=driver.getTitle();
		System.out.println("Child window title is:"+ctitle);
		driver.findElement(By.name("pnrNumber")).sendKeys("546546");
		driver.close();
		driver.switchTo().window(p);
		String pt=driver.getTitle();
		System.out.println("Parent window title is:"+pt);
		driver.findElement(By.id("usernameId")).sendKeys("Typed User Name");
		
	}
}
