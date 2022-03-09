package com.qa.Scripts.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	// 1. Frames : you will always, switch to the freame, find the element and click on it
	
	// name of frame where element is present : packageListFrame
	
	driver.switchTo().frame("packageListFrame"); // find name of frame form html document
	
	Thread.sleep(2000);
	
	// Inpect the first link and click on it
	
	driver.findElement(By.linkText("org.openqa.selenium")).click();
	
	
	driver.switchTo().parentFrame();
	
	
	driver.switchTo().frame("classFrame");
	
	// Inspect the second link and click on it
	
	driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();
	

	}

}














