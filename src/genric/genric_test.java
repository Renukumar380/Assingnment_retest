package genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class genric_test implements Auto_const
{
	public class generic_Test implements Auto_const

	{
	 public WebDriver driver;
	 
	 @BeforeMethod
	 public void openApp()
	 {
		 System.setProperty(chrome_key,chrome_value);
		 driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
	 }
	 

	 @AfterMethod
	 public void closeApp() throws InterruptedException
	 {
		 Thread.sleep(5000);
		driver.quit();
	 }
}}
