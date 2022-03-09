package com.qa.Scripts.Day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	
		
		// driver cannot inspect the elements on an Alert box
		
		// We will fetch the error message/ text
		// click on OK button or cancel
		// enter data
		
		// Class called as Alert
		// Methods : accept() : to click on OK button
		// dismiss() method : to click on Cancel button
		// getText() : fetch the text on the alert box
		// sendKeys() : enter dinput in the text box on Alert
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		// Switch from main window to Alert box
		
		Alert a = driver.switchTo().alert();
		
		
		String text = a.getText(); // fetch text from alert box
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		a.accept();  // click on OK button and alert box should close
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
