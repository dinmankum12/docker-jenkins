package com.qa.Scripts.Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
	// if the application is slow and is taking some time to open
		
		// add a wait time : pageLoadtimeout
		
	 driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 
	 // if it is taking time for the elements to be visible  on the application
	 
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 // Implicit wait  : webdriver wait for 10 seconds before throwing the error Element not found
	 
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
	 
	 
	 driver.findElement(By.id("twotabsearchtextbox")).clear();
	 
	 
	 // explicit wait : it is for a single element
	 // 2 things : wait time and condition
	 //  selenium wait for the element until the given condition
	 // or selenium is going to wait for given amount of time
	 
	 
	 WebElement e1 =  driver.findElement(By.id("twotabsearchtextbox"));
	 
	 WebDriverWait wait =  new WebDriverWait(driver, 10);
	 
	 wait.until(ExpectedConditions.visibilityOf(e1));
	 
	 e1.sendKeys("Bags");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	}

}
