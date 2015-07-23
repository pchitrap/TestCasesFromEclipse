package com.selenium.test;

import org.testng.annotations.Test;

public class B {
	@Test(groups="G3")
	public void method1() {  
	  System.out.println("This is Method1 in B");
	}  
 
	@Test(groups="G1")
	public void method2() {  
		System.out.println("This is Method2 in B");
	}  
 
	@Test(groups="G3")
	public void method3() {  
		System.out.println("This is Method3 in B");
	}  
 
	@Test(groups="G2")
	public void method4() {  
		System.out.println("This is Method4 in B");
	}


}
