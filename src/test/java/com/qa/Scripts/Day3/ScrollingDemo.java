package com.qa.Scripts.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// Scenario: How to perform Scrolling Action using Selenium
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		// write a javaScript using Interface JavascriptExecutor and method executeScript()
		
		// argument here is the element to be tested:
		
		WebElement e1 = driver.findElement(By.xpath("//*[contains(@name,'browser')][3]"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);", e1);
		
		e1.click();
		
		
		
		
		
		
		
		
	/*	js.executeScript("scroll(0, 1500)"); // scroll the page downwards
		
		Thread.sleep(2000);
		
		
		js.executeScript("scroll(0, -1500)"); // scroll the page upwards */
		

	}

}
