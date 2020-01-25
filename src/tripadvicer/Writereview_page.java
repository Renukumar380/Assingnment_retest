package tripadvicer;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import genric.Base_Page;

public class Writereview_page extends Base_Page
{
	public WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, 5);
	public Writereview_page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[@class='ui_bubble_rating fl bubble_50']")
	public WebElement bubblebtn ;
	
	
	@FindBy(xpath="//input[@id='ReviewTitle']")
	public WebElement ReviewTitle ;
	
	@FindBy(xpath="//textarea[@id='ReviewText']")
	public WebElement ReviewTxt;
	
	@FindBy(xpath="//div[.='Couples']")
	private WebElement Couplesbtn;
	
	@FindBy(xpath="//select[@id='trip_date_month_year']")
	public WebElement dropdownclk;
	
	@FindBy(xpath="(//div[@class='wartag-Shoeshine  answersYesNo jfy_cloud'])[1]")
	private WebElement shoeshineservicesbtn;
		
	@FindBy(xpath="//(div[@class='wartag-CleanThemeBased  answersYesNo jfy_cloud'])[1]")
	private WebElement cleanhotel;
	
	@FindBy(xpath="//div[@class='wartag-ModernThemeBased selected  answersYesNo jfy_cloud']")
	private WebElement modernhotel;
	
	@FindBy(xpath="//div[@class='wartag-ThemedThemeBased selected  answersYesNo jfy_cloud']")
	private WebElement wartagThemed;
	
	
	@FindBy(xpath="//div[@class='wartag-WeddingThemeBased selected  answersYesNo jfy_cloud']")
	private WebElement wartagWedding;
	
	@FindBy(xpath="//div[@class='wartag-SafeThemeBased selected  answersYesNo jfy_cloud']")
	private WebElement wartagSafe;
	
	@FindBy(xpath="//span[@class='answersBubbles ui_bubble_rating fl qid12 bubble_50']")
	private WebElement ServiceBubbles;
	
	@FindBy(xpath="//span[@class='answersBubbles ui_bubble_rating fl qid11 bubble_50']")
	private WebElement RoomsBubbles;
	
	@FindBy(xpath="//span[@class='answersBubbles ui_bubble_rating fl qid190 bubble_50']")
	private WebElement SleepQualityBubbles;
	
	@FindBy(xpath="//input[@id='noFraud']")
	private WebElement Submitreviewchkbox;
	
	@FindBy(xpath="//div[@id='SUBMIT']")
	private WebElement Submitbtn;
	
	public void bubblebtnclk()
	{
		wait.until(ExpectedConditions.visibilityOf(bubblebtn));
		Actions act = new Actions(driver);
		act.moveToElement(bubblebtn).perform();
		bubblebtn.click();
	}
	public void ReviewTitlebox(String feedback )
	{
		wait.until(ExpectedConditions.visibilityOf(ReviewTitle));
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
		shoeshineservicesbtn.click();;
	}
	public void cleanhotelyes()
	{
		cleanhotel.click();;
	}
	public void modernhotelyes()
	{
		modernhotel.click();;
	}
	public void wartagThemedyes()
	{
		wartagThemed.click();;
	}
	public void wartagWeddingyes()
	{
		wartagWedding.click();;
	}
	public void wartagSafeyes()
	{
		wartagSafe.click();;
	}
	public void ServiceBubblesbtn()
	{
		Actions act1 = new Actions(driver);
		act1.moveToElement(ServiceBubbles).perform();
		ServiceBubbles.click();;
	}
	public void RoomBubblesbtn()
	{
		Actions act1 = new Actions(driver);
		act1.moveToElement(RoomsBubbles).perform();
		RoomsBubbles.click();;
	}
	public void SleepQualityBubblesbtn()
	{
		Actions act1 = new Actions(driver);
		act1.moveToElement(SleepQualityBubbles).perform();
		SleepQualityBubbles.click();;
	}
	public void Submitreviewchkbx()
	{
		Submitreviewchkbox.click();;
	}
	public void Submitreviewbtn()
	{
		Submitbtn.click();;
	}
}
