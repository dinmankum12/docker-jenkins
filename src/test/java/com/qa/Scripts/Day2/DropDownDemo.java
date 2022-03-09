package com.qa.Scripts.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		
		driver.manage().window().maximize();
		
		// find the dropdown, store the location in the drop down
		
	WebElement e1=	driver.findElement(By.xpath("//select[@name='coffee']"));
	
	Select dd = new Select(e1);
	
	// to handle options for a static dropdown
	
	// selectByIndex() Select option with sugar
	
	dd.selectByIndex(2);
	
	Thread.sleep(2000);
	
	//selectByValue("value") ==> select an element based on argument value in the options tag
	
	dd.selectByValue("regular");
	
	//select the value based on the text in between tags
	
	dd.selectByVisibleText("Crisp (har har...)");
	
	Thread.sleep(2000);
	
	// Select black option using  index
	
	dd.selectByIndex(0);
	
	Thread.sleep(2000);
	
	// select with cream using option value
	
	dd.selectByValue("cream");
	
	Thread.sleep(2000);
	
	// select by visible text
	
	dd.selectByVisibleText("With sugar");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
