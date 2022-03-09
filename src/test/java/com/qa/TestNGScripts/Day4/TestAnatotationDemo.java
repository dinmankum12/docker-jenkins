package com.qa.TestNGScripts.Day4;

import org.testng.annotations.Test;

public class TestAnatotationDemo {
	
	// this is a test method
	// @Test annotation over multiple test methods, then 
	// methods will get executed in an alphabetical order
	// you can set priority on your test method
	
	@Test(priority='1')
	public void Login()
	{
		System.out.println(" Code to log into an application");
	}

	@Test(priority='2')
	public void Create()
	{
		System.out.println(" Code to create an email into an application");
	}
	
	@Test(priority='3')
	public void Logout()
	{
		System.out.println(" Code to log out of an application");
	}
}
