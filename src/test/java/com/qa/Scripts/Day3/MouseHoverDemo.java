package com.qa.Scripts.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(e1).perform();
		
		driver.findElement(By.xpath("(//span[@class='nav-text'])[10]")).click();

	}

}
