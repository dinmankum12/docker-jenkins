package com.qa.TestNGScripts.Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	
	
public WebDriver driver;
	
	@BeforeClass
	public void startbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
	}
	
	@Parameters({"inputData"})
	@Test(priority='1')
	public void TestWikiHomepage(String inputData) throws InterruptedException
	{
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.findElement(By.id("searchInput")).sendKeys(inputData);
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
