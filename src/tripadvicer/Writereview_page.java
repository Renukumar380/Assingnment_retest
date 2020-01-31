package tripadvicer;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;


import genric.Base_Page;

public class Writereview_page extends Base_Page
{
	public WebDriver driver;
	
	public Writereview_page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[@id='bubble_rating']")
	public WebElement bubblebtn ;
	
	
	@FindBy(xpath="//input[@id='ReviewTitle']")
	public WebElement ReviewTitle ;
	
	@FindBy(xpath="//textarea[@id='ReviewText']")
	public WebElement ReviewTxt;
	
	@FindBy(xpath="//div[.='Couples']")
	private WebElement Couplesbtn;
	
	@FindBy(xpath="//select[@id='trip_date_month_year']")
	public WebElement dropdownclk;
	
	@FindBy(xpath="//div[@data-tagid='-190721']")
	private WebElement shoeshineservicesbtn;
	
	@FindBy(xpath="//div[@data-tagid='-202641']")
	private WebElement cleanhotel;
	
	@FindBy(xpath="//div[@data-tagid='-202791']")
	private WebElement modernhotel;
	
	@FindBy(xpath="//div[@data-tagid='-202861']")
	private WebElement wartagThemed;
	
	@FindBy(xpath="//div[@data-tagid='-202911']")
	private WebElement wartagWedding;

	@FindBy(xpath="//div[@data-tagid='-203581']")
	private WebElement wartagSafe;
	
	
	@FindBy(xpath="//span[@data-name='Service']")
	public WebElement ServiceBubbles;
	
	@FindBy(xpath="//input[@id='noFraud']")
	public WebElement Submitreviewchkbox;
	
	@FindBy(xpath="//div[@id='SUBMIT']")
	private WebElement Submitbtn;
	
	public void bubblebtnclk()
	{
			bubblebtn.click();
	}
	public void ReviewTitlebox(String feedback )
	{
		
		ReviewTitle.sendKeys(feedback);
	}
	public void ReviewTextbox(String feedback )
	{
		ReviewTxt.sendKeys(feedback);
	}
	
	public void Couplessele()
	{
		Couplesbtn.click();
	}
	public void dropdownoption()
	{
		dropdownclk.click();
		Select s = new Select(dropdownclk);
		s.selectByValue("10,2019");
		}
	public void shoeshineservicesyes()
	{
		shoeshineservicesbtn.click();
	}
	public void cleanhotelyes()
	{
		cleanhotel.click();
	}
	public void modernhotelyes()
	{
		modernhotel.click();
	}
	public void wartagThemedyes()
	{
		wartagThemed.click();
	}
	public void wartagWeddingyes()
	{
		wartagWedding.click();
	}
	public void wartagSafeyes()
	{
		wartagSafe.click();
	}
	public void ServiceBubblesbtn()
	{
		
		ServiceBubbles.click();
	}
	
	public void Submitreviewchkbxbtn()
	{
		Submitreviewchkbox.click();
	}
	public void Submitreviewbtn()
	{
		Submitbtn.click();
	}
}
