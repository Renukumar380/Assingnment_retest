package Flipkart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_home_page 
{
public WebDriver driver;
	
	public Amz_home_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement searchclk;
	
	@FindBy(xpath="//span[.='Apple iPhone XR (64GB) - Yellow']")
	private WebElement seletphnclk;
	
	public void passvalue(String Name_Phone)
	{
		searchbox.sendKeys(Name_Phone);
	}
	public void clkon_srch()
	{
		searchclk.click();
	}
	public void clkon_iphne()
	{
		seletphnclk.click();
	}
}
