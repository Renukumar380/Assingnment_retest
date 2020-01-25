package tripadvicer;


import genric.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Review_page extends Base_Page
{
	public WebDriver driver;
	public Review_page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[.='Write a review']")
	public WebElement Writereviewbtn;

	public void Writereviewclk()
	{
	
		Writereviewbtn.click();
	}
}
