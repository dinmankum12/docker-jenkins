package com.qa.TestNGScripts.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsertest {
	
	// check if you have firefox browser in your machine
	// check if you have installed geckodriver
	
	public WebDriver driver;
	
	@Parameters({"browserName"})
	@BeforeClass
	public void openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			}
		
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			}
	}
	
	@Parameters({"loc1","loc2"})
	@Test
	public void testcase(String loc1, String loc2)
	{
        driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id(loc1));
		WebElement dest = driver.findElement(By.id(loc2));
		
		Actions a = new Actions(driver);
		
		//a.dragAndDrop(source, dest).perform();
		
		a.clickAndHold(source).moveToElement(dest).release().perform();
	}

}
