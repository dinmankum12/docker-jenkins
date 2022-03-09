package com.qa.Scripts.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		// inspect search box and write xpath for it
		  // 1. inspect the entire listbox and fetch all its children : xpath Axes child or descendant
				//2. store all the options/values in a list object
		//3. print the values of the list
		//4. start a for loop to go to every element in the list
		//5. write a if condition : if the desired text is matched in the available list of values,
		// click on it 
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Appium");
		
		Thread.sleep(5000);
		
	List<WebElement> li = 	driver.findElements(By.xpath("//*[@class='erkvQe']/descendant::li")); //10
		
	Thread.sleep(5000);
		
		System.out.println(li.size());
		
	for(int i =0;i<li.size();i++)
	{
		String text = li.get(i).getText();
		
		System.out.println(text);
		
		if(text.contains("inspector"))
		{
			li.get(i).click();
			break;
		}
	}
		
	
		
		
		

	}

}
