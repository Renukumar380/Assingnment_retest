package test_class;
import genric.genric_test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import tripadvicer.Review_page;
import tripadvicer.Tripadvcr_home_page;
import tripadvicer.Writereview_page;

public class Trip_test_page extends genric_test
{
	@Test
	public void test() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		driver.get("https://www.tripadvisor.in/");
		
		
		Tripadvcr_home_page Thp = new Tripadvcr_home_page(driver);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(Thp.searchbox));
		Thp.searchsnt();
		
		Thp.senttxtsearch("Club Mahindra");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Review_page  hp = new Review_page(driver);
		wait.until(ExpectedConditions.visibilityOf(hp.Writereviewbtn));
			Set<String> all_windows1 = driver.getWindowHandles();
			for (String str1 : all_windows1) 
			{
				driver.switchTo().window(str1);
			}
			
		hp.Writereviewclk();	
		
		Writereview_page wp = new Writereview_page(driver);
		wait.until(ExpectedConditions.visibilityOf(wp.bubblebtn));
			Set<String> all_windows = driver.getWindowHandles();
			for (String str : all_windows) 
			{
				driver.switchTo().window(str);
			}
			wp.bubblebtnclk();
		
		wp.ReviewTitlebox("Very Good");
		wait.until(ExpectedConditions.visibilityOf(wp.ReviewTxt));
		wp.ReviewTextbox("Recently I visited Club Mahindra ,Coorg with my family. Everything was spot on right from the rooms, facilities,children's play area, Food and the Spa. Special mention abt Joshi from the Green cardamom restaurant and Ajit from the Sales team who took care"
		+ " of us very well. Thanks to all the staff who made my trip enjoyable. I definitely recommend this place to everyone");
		wp.Couplessele();
		wait.until(ExpectedConditions.visibilityOf(wp.dropdownclk));
		wp.dropdownoption();
		
		wp.shoeshineservicesyes();
		
		wp.cleanhotelyes();
		wp.modernhotelyes();
		wp.wartagThemedyes();
		wp.wartagWeddingyes();
		wp.wartagSafeyes();
		wp.ServiceBubblesbtn();
		wp.RoomBubblesbtn();
		wp.SleepQualityBubblesbtn();
		wp.Submitreviewchkbx();
		wp.Submitreviewbtn();
		
		
		
		
}}
