package tripadvicer;




import genric.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Tripadvcr_home_page extends Base_Page
{
	public WebDriver driver;
	public Tripadvcr_home_page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath = "//span[.='Search']")
	public WebElement searchbox;
	
	@FindBy(xpath = "//input[@id='mainSearch']")
	public WebElement mainsearchbox;
	
	public void searchsnt()
	{
		searchbox.click();
		
	}
		
	public void senttxtsearch(String restaurants_name)
	{
		
		mainsearchbox.sendKeys(restaurants_name);
		
	}
}
