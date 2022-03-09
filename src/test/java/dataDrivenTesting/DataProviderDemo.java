package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderDemo {
	
	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
	}


		@Test(dataProvider="testdata")
		public void createaccountTest(String uname, String pwd, String rpwd, String em)
		
		{
    
	    driver.findElement(By.xpath("//*[@id='userlogin2']/descendant::input[1]")).clear();
	    driver.findElement(By.xpath("//*[@id='userlogin2']/descendant::input[1]"))
	    .sendKeys(uname);
	    driver.findElement(By.xpath("//*[@id='userlogin2']/descendant::input[2]")).clear();
	    driver.findElement(By.xpath("//*[@id='userlogin2']/descendant::input[2]"))
	    .sendKeys(pwd);
	    driver.findElement(By.xpath("//*[@id='userlogin2']/descendant::input[3]")).clear();
	    driver.findElement(By.xpath("//*[@id='userlogin2']/descendant::input[3]"))
	    .sendKeys(rpwd);
	    driver.findElement(By.xpath("//*[@id='userlogin2']/descendant::input[4]")).clear();
	    driver.findElement(By.xpath("//*[@id='userlogin2']/descendant::input[4]"))
	    .sendKeys(em);
		driver.close();
		}
	
		@DataProvider(name="testdata")
	public Object[][] readData()
	{
		Object input[][] = Xls_dataProvider.getTestData("Sheet1");
		return input;
	}
}
