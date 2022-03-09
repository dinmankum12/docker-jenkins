package com.qa.Scripts.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       WebDriver driver = new ChromeDriver(); // start browser session
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.manage().window().maximize();
		
		// click on RED checkbox
		
		driver.findElement(By.xpath("(//*[contains(@name,'color')])[1]")).click();
		
		boolean sel = driver.findElement(By.xpath("(//*[contains(@name,'color')])[1]")).isSelected(); //true
		
		System.out.println(" is the checkbox selected ?" +sel); // true
		
		// click on Blue checkbox
		
		Thread.sleep(2000);
		
	boolean sel2 = driver.findElement(By.xpath("(//*[contains(@name,'color')])[3]")).isSelected();
	
	System.out.println(" is the checkbox selected ?"+sel2); //false
		 
        driver.findElement(By.xpath("(//*[contains(@name,'color')])[3]")).click();
        
        boolean sel3 = driver.findElement(By.xpath("(//*[contains(@name,'color')])[3]")).isSelected();
        
    	System.out.println(" is the checkbox selected ?"+ sel3);  // true
    	
    	
        // isSelected() : true or false
        
        // htis method returns if the checkbos is selected or not
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
