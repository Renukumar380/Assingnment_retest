package Flipkart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_phnordr_page 
{
	 
public WebDriver driver;
	
	public Amz_phnordr_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[@id='priceblock_ourprice']")
	public WebElement amzgetprice;
	
	
	public int get_price() throws InterruptedException
	{
		String Amazone_price = amzgetprice.getText();
		System.out.println(Amazone_price);
        String str5=Amazone_price.replace("₹","");
        String str6=str5.replace("&","");
       
       String str7=str6.replace("nbsp","");
       
       String str8=str7.replace(";","");
       
        String str9=str8.replace(",","");
       
        String str10=str9.replace(".00","");
        
        String str11=str10.replace(" ","");
        System.out.println(str11);
      
        	int AM_val=Integer.parseInt(str11);
	        System.out.println(AM_val);
	        System.out.println("Amazon iphone rate is "+AM_val);
			return AM_val;
		        
	
       
	}
}
