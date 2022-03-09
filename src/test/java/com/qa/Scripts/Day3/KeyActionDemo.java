package com.qa.Scripts.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		WebElement e1 = driver.findElement(By.id("searchInput"));
		
		// Actions methods : 
		// keyDown => press a key from your keyboard
		// keyUp => releasing a key from your keyboard
		// doubleClick(), contextClick()
		
	Actions a = new Actions(driver);
	
	// go to the element input box
	// press sift key and enter the data : observe : data will be entered in uppercase
	
	 a.moveToElement(e1).keyDown(e1, Keys.SHIFT).sendKeys("automation testing")
	 .keyUp(e1, Keys.SHIFT).pause(2)
	 .doubleClick()
	 .contextClick(e1)
	 .perform();
		
		
		
		
		
		

	}

}
