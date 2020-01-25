package genric;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Base_Page 
{
public WebDriver driver;
	
	public Base_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void titleIspresent(int seconds, String title)
    {
  	 WebDriverWait wait= new WebDriverWait(driver, seconds);
  	 try {
  		  wait.until(ExpectedConditions.titleContains(title));
  		  Reporter.log("title displayed", true); 
	     } 
  	  
  	 catch (Exception e) 
  	  {
  		Reporter.log("title not displayed", true); 
	  }}
  	public void elementClickable_bylocator(int seconds, By locator)
    {
  	 WebDriverWait wait= new WebDriverWait(driver, seconds);
  	 try{
  	 wait.until(ExpectedConditions.elementToBeClickable(locator));
  	 Reporter.log("locator", true); 
  	 }	
  	 catch (Exception e) 
  	 {
  		 Reporter.log("locator not found", true); 
    }}
  	public void alertIspresent(int seconds)
	  {
			 WebDriverWait wait= new WebDriverWait(driver, seconds);
			 try{
			 wait.until(ExpectedConditions.alertIsPresent());
			 Reporter.log("alert is present",true);
			 }	
			 catch (Exception e) 
			  {
				 Reporter.log("alert is not present",true);
			  }
  }

public void elementClickable_bywebele(int seconds, WebElement element)
{
		 WebDriverWait wait= new WebDriverWait(driver, seconds);
		 try{
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		 Reporter.log("Element found",true);
		 }	
		 catch (Exception e) 
		  {
			Reporter.log("weblelement is not found",true);
		  }
}


public void urlContains(int seconds, String title)
{
	      WebDriverWait wait= new WebDriverWait(driver, seconds);
	      try {
		  wait.until(ExpectedConditions.urlContains(title));
		  Reporter.log("URL contains this title",true);
	      }
	      catch (Exception e) 
	      {
		   Reporter.log("URL not contains this title", true);
	      }
}
	

public void urlTobe(int seconds, String url)
{
	 WebDriverWait wait= new WebDriverWait(driver, seconds);
	 try {
		  wait.until(ExpectedConditions.urlToBe(url));
		  Reporter.log("URL is correct", true);
	     }
	 catch (Exception e) 
	  {
		 Reporter.log("URL is not correct", true);
	  }
}

public void visibilty(int seconds, WebElement element)
{
	 WebDriverWait wait= new WebDriverWait(driver, seconds);
	 try {
		  wait.until(ExpectedConditions.visibilityOf(element));
		  Reporter.log("element is found",true);
	     }
	 catch (Exception e) 
	  {
		 Reporter.log("element is not found",true);
	  }
}


	public void mouseOver(WebDriver driver,WebElement element)
  {
	 Actions act=new Actions(driver);
	 act.moveToElement(element).perform();
	 
  }


public void contextClick(WebDriver driver,WebElement element)
  {
   Actions act=new Actions(driver);
   act.contextClick(element).perform();
  }
}
