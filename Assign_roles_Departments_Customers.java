package adminModule;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_roles_Departments_Customers 
{
	public static void main(String[] args)throws InterruptedException 
	{
			String baseUrl="BASEURL";
			WebDriver driver;
			driver=new FirefoxDriver();
			driver.get(baseUrl);	
		// Login as CLIENT
			driver.findElement(By.id("pop")).click();	
			driver.findElement(By.id("_58_uname")).clear();
			driver.findElement(By.id("_58_uname")).sendKeys("test_username");
			driver.findElement(By.id("_58_pword")).sendKeys("test");
			driver.findElement(By.id("LoginButton")).click();
			Thread.sleep(4000);
//---------------------------------------------------------------------------------------------------------------------
		//Navigation: Administration-Create Customer and go to Add Customer page
			driver.findElement(By.linkText("MENU")).click();
			driver.findElement(By.linkText("Administration")).click();
			Thread.sleep(200);
			driver.findElement(By.linkText("Assign Role")).click();
			Thread.sleep(400);
			driver.findElement(By.linkText("assign role")).click();
			Thread.sleep(4000);
			
		//Assign Roles (Multiple)
			List<WebElement> els = driver.findElements(By.xpath(".//*[@id='_jgclientadmin_WAR_JobsGuruportlet_rolesCheckbox']"));
			for ( WebElement el : els ) 
			{
				if ( !el.isSelected() ) 
				{
				      el.click();
				}
			}
		//Click on Assign Button
			driver.findElement(By.xpath(".//*[@id='_jgclientadmin_WAR_JobsGuruportlet_assign']")).click();
			Thread.sleep(4000);
				
		//Search a particular Roles
	    	driver.findElement(By.id("_jgclientadmin_WAR_JobsGuruportlet_clientAdminUserName")).sendKeys();
	    	Thread.sleep(2000);
	    				
	    //Click on Submit button
	    	driver.findElement(By.id("_jgclientadmin_WAR_JobsGuruportlet_searchButton")).click();
	    	Thread.sleep(8000);			
//--------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------	    		
	    //Navigation: Administration-Create Customer and go to Add Customer page
			driver.findElement(By.linkText("MENU")).click();
			driver.findElement(By.linkText("Administration")).click();
			driver.findElement(By.linkText("Assign Department")).click();
			Thread.sleep(4000);
			driver.findElement(By.linkText("assign departments")).click();
			Thread.sleep(4000);

		//Assign Department (Multiple)
			List<WebElement> els_1 = driver.findElements(By.xpath(".//*[@id='_jgclientadmin_WAR_JobsGuruportlet_departmentsCheckbox']"));
			for ( WebElement el : els_1 ) 
			{
				if ( !el.isSelected() )
				{
				        el.click();
				}
			}
				
		//Click on Assign Button
			driver.findElement(By.xpath(".//*[@id='_jgclientadmin_WAR_JobsGuruportlet_assign']")).click();
			Thread.sleep(4000);
				
		//Search a particular Department
	    	driver.findElement(By.id("_jgclientadmin_WAR_JobsGuruportlet_clientAdminUserName")).sendKeys();
	    	Thread.sleep(2000);
	    				
	    //Click on Submit button
	    	driver.findElement(By.id("_jgclientadmin_WAR_JobsGuruportlet_searchButton")).click();
	    	Thread.sleep(2000);
//-----------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------	
	    //Navigation: 
			driver.findElement(By.linkText("MENU")).click();
			driver.findElement(By.linkText("Administration")).click();
			driver.findElement(By.linkText("Assign Customer")).click();
			Thread.sleep(4000);
			driver.findElement(By.linkText("assign customers")).click();
			Thread.sleep(4000);

		//Assign Department (Multiple)
			List<WebElement> els_2 = driver.findElements(By.xpath(".//*[@id='_jgclientadmin_WAR_JobsGuruportlet_customersCheckbox']"));
			for ( WebElement el : els_2 ) 
			{
				if ( !el.isSelected() ) 
				{
				        el.click();
				}
			}	
		//Click on Assign Button
			driver.findElement(By.xpath(".//*[@id='_jgclientadmin_WAR_JobsGuruportlet_assign']")).click();
			Thread.sleep(4000);
				
		//Search a particular User 
	    	driver.findElement(By.id("_jgclientadmin_WAR_JobsGuruportlet_clientAdminUserName")).sendKeys();
	    	Thread.sleep(2000);
	    				
	    //Click on Submit button
	    	driver.findElement(By.id("_jgclientadmin_WAR_JobsGuruportlet_searchButton")).click();
	    	Thread.sleep(2000);		
	}
}
