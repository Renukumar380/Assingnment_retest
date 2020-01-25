package Flipkart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genric.Base_Page;
public class Flip_Phnordr_page extends Base_Page
{
	public WebDriver driver;
	public Flip_Phnordr_page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath = "//div[@class='_1vC4OE _3qQ9m1']")
	private WebElement phnprice;
	
	public  int get_price() throws InterruptedException
	{
		String Flip_price = phnprice.getText();
		System.out.println(Flip_price);
		String str2=Flip_price.replace("₹","");
		 System.out.println(str2);
		 Thread.sleep(3000);
	        String str3=str2.replace(",","");
	        System.out.println(str3);
	        Thread.sleep(3000);
	        int Flip_val=Integer.parseInt(str3);
	        System.out.println("Flipkart iphone rate is "+Flip_val);
			return Flip_val;
	        
	}

}
