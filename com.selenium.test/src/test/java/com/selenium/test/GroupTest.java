package com.selenium.test;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups="G1")
	public void method1() {  
	  System.out.println("This is Method1");
	}  
 
	@Test(groups="G2")
	public void method2() {  
		System.out.println("This is Method2");
	}  
 
	@Test(groups="G1")
	public void method3() {  
		System.out.println("This is Method3");
	}  
 
	@Test(groups="G2")
	public void method4() {  
		System.out.println("This is Method4");
	}

}
