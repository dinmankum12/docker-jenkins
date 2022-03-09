package com.qa.Scripts.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.manage().window().maximize();
		
		// if radio button for Opera is not selected , click on it 
		
		// first write locator/address of the radio button and store it in a WebElement object
		
		WebElement e1 = driver.findElement(By.xpath("//*[contains(@name,'browser')][3]"));
		
		// use this object to check if Opera is selected or not
		
		 boolean sel= e1.isSelected(); // false
		 
		 System.out.println(sel);
		 
		 // write if condition ie: if isSelected() method returns false, then click on radio button
		 
		 // if(loc.isSelected()==true)
		 if(sel==true)
		 {
			 System.out.println("checkbox is selected");
		 }
		 else {
			 e1.click();
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
