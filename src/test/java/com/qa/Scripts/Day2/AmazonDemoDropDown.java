package com.qa.Scripts.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDemoDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		WebElement e1 = driver.findElement(By.xpath("//select[contains(@id,'search')]"));
		
		Select dd = new Select(e1);
		
		// select the option in the dropdown using index
		
		dd.selectByIndex(1);
		
		Thread.sleep(2000);
		
		dd.selectByValue("search-alias=baby-products-intl-ship");
		
		Thread.sleep(2000);
		
		dd.selectByVisibleText("Books");
		
		
		// checkbox ==> isSelected() ==> true or false
		
		
		
		
		
		
		
		
		
		

	}

}
