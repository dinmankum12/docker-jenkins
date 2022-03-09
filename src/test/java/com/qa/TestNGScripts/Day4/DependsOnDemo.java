package com.qa.TestNGScripts.Day4;

import org.testng.annotations.Test;

public class DependsOnDemo {
	
	
	
	
	@Test
   public void login()
   {
	   System.out.println("Loginto the app");
   }
   
	
	// give the name of the method on which create email is dependent
	
	@Test(dependsOnMethods = {"login"})
   public void CreateEmail()
   {
	   System.out.println("Create email");
   }
   
	@Test(dependsOnMethods= {"login","CreateEmail"})
   public void DeleteEmail()
   {
	   System.out.println("Delete email");
   }
   
   
	
	
	
	
}
