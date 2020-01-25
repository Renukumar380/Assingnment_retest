package Flipkart1;

import genric.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Flip_Home_page extends Base_Page
{
public WebDriver driver;

	public Flip_Home_page(WebDriver driver)
	{
		super(driver);
	}
@FindBy(xpath ="//button[.='✕']")  
public WebElement closebtn;
	
@FindBy(xpath ="//input[@name='q']")
public
 WebElement searchbox;

@FindBy(xpath="//button[@type='submit']")
public WebElement searchbtn;

@FindBy(xpath = "//div[.='Apple iPhone XR (Yellow, 64 GB)']")
public WebElement selectphn;



public void close()
{
	closebtn.click();
}
public void serch(String phnname)
{

	searchbox.sendKeys(phnname);
}
public void searchclk()
{
	
	searchbtn.click();
}

public void select_phn()
{
	
	selectphn.click();
}
}
