package com.qa.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		
		driver.get("https://signup.heroku.com/");
		
		// 1. find element using tag and id ==> tagname#idvalue
		
		driver.findElement(By.cssSelector("input#first_name")).sendKeys("sonal04");
		
		//driver.findElement(By.cssSelector("input.required")).sendKeys("Mittal");
		
        driver.findElement(By.cssSelector("input[name=last_name]")).sendKeys("Mittal");
	}

}
