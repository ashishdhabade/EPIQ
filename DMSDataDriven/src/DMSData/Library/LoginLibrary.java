package DMSData.Library;

import org.openqa.selenium.By;

import utilis.AppUtils;

public class LoginLibrary extends AppUtils
{

	

	public void login(String cpl,String uid,String pwd)
	{
		driver.findElement(By.name("Company")).sendKeys(cpl);
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		driver.findElement(By.className("proceed")).click();
		driver.findElement(By.id("selectPlant_238")).click();
		//driver.findElement(By.className("toast-close-button")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/button")).click();
		
	}
	
	public void logout()
	{
		driver.findElement(By.xpath("/html/body/nav/div/ul[2]/li[3]/a/i")).click();
	}
	
	

	public boolean loginSuccess()
	{
		if(driver.findElement(By.id("Logout")) != null)
				{
			return true;
		}else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
