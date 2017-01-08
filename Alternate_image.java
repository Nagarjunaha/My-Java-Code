package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Alternate_image
{
	
	public String baseUrl="http://selenium.couponapitest.com/";
	public WebDriver driver;
	static boolean c;
	
	@BeforeTest
	
	public void setBaseUrl()
	{
		driver=new FirefoxDriver();
		driver.get(baseUrl);}
		
	

		@Test(description="Launches the couponapitest site")
		
		public void launchSite() throws InterruptedException
		{ 
			driver.navigate().to(baseUrl);
		    driver.findElement(By.xpath("html/body/ul/li[3]/a")).click();// click on the link
		    c= driver.findElement(By.xpath("html/body/img")).isDisplayed();//clicked image should be displayed
	        if(c==true) //if c is true image is present else not present
	        {
	        System.out.println("ImageFile is  present");
	        }
	        else
	        {
	        System.out.println("ImageFile is  not present");
	        }
	        //image file consist alt with text text
	        WebElement ImageFile = driver.findElement(By.xpath("html/body/img"));  
		 	String str = ImageFile.getAttribute("alt");
	        if(str==null || str=="") //alt is empty display else part
	        {
	        System.out.println("alt is prsent and alternative text is present");
	        }
	        else
	        {
	        System.out.println("alt is prsent but no alternative text is present");
	        }
		}
}