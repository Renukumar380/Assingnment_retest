package test_class;
import genric.genric_test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Flipkart1.Amz_home_page;
import Flipkart1.Amz_phnordr_page;
import Flipkart1.Flip_Home_page;
import Flipkart1.Flip_Phnordr_page;

public class Test_page extends genric_test
{
	int AM_val=0;
	int Flip_val=0;
	@Test
	
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Flip_Home_page hp = new Flip_Home_page(driver);
		wait.until(ExpectedConditions.visibilityOf(hp.closebtn));
		hp.close();
		wait.until(ExpectedConditions.visibilityOf(hp.searchbox));
		hp.serch("iphone xr yellow 64 GB");
		hp.searchclk();
		wait.until(ExpectedConditions.visibilityOf(hp.selectphn));
		hp.select_phn();
		
		Flip_Phnordr_page pp = new Flip_Phnordr_page(driver);
		Set<String> all_windows = driver.getWindowHandles();
		for (String str : all_windows) 
		{
			driver.switchTo().window(str);
		}
		Thread.sleep(3000);
		 pp.get_price();
		
		 System.out.println("============================================================");
		
		 driver.get("https://www.amazon.in/");
		 
		 Amz_home_page Ahp = new Amz_home_page(driver);
		 wait.until(ExpectedConditions.visibilityOf(Ahp.searchbox));
		 Ahp.passvalue("iphone xr 64gb - yellow");
		
		 Ahp.clkon_srch();
		 
		 Ahp.clkon_iphne();
		 
		 Amz_phnordr_page App = new Amz_phnordr_page(driver);
		 
			Set<String> all_windows1 = driver.getWindowHandles();
			for (String str1 : all_windows1) 
			{
				driver.switchTo().window(str1);
			}
			wait.until(ExpectedConditions.visibilityOf(App.amzgetprice));
			App.get_price();
			
			if(AM_val<Flip_val)
			{
			System.out.println("Flipkart is cheeper,buy here");
			}
			else
			{
				System.out.println("Amazon is cheeper,buy here");
			}
			
		 
		 
	}
}
