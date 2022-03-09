package com.qa.Scripts.Day3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindowDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// 1. every window of your session has a unique identifier
		// 2. get all the window Handles --> getwindowhandles()
		// 3. iterate over the desired window and switch to it
		// 4. once you switch to that window, you can inspect the elements and perform action on them
		// parent window and child windows
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		// identify the element until which we have to scroll
		
		WebElement e1 = driver.findElement(By.id("win2"));
	
		
        JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);", e1);
		
	
		
		e1.click();
		// As we will click a new window will appear
		
	Set<String> s1 = driver.getWindowHandles();
		
		// start an iterator
	
	Iterator<String> itr = s1.iterator();
	
	         String parent_window  = itr.next(); // fetch the first value from the Set
	         System.out.println(parent_window);
		
	         
	         String child_window = itr.next(); // fetch the next value from the Set
	         System.out.println(child_window);
		
	
	         
	        // parent window & child window
	         // by default we are always on the parent window
	         
	         
	         // switch to child window
	         driver.switchTo().window(child_window);
	         
	        // driver.manage().window().maximize();
	         
	       String title =   driver.getTitle();
	       
	       System.out.println(" title of child window" + title);
	       
	       // Inspect an element on child window 
	       
	       driver.findElement(By.name("q")).sendKeys("Appium");
	       
	      Thread.sleep(2000);
	       
	      // switch back to parent window
	      
	      driver.switchTo().window(parent_window);
	      
	    // driver.close(); // close only that window
	      
	      driver.quit(); // close all the windows associated with the driver session
	       
	       
	       
	       
	       
	       
	       
	       
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
