package DMS.library;

import org.openqa.selenium.By;

import Utils.AppUtils;

public class LoginDMS extends AppUtils
{

	
	public void login(String cpl,String uid,String pwd)
	{
		driver.findElement(By.id("company")).sendKeys(cpl);
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		driver.findElement(By.className("proceed")).click();
		


		/*
		try {
			if (driver.findElement(By.xpath("//*[@id='btnYes']")).isDisplayed()) {
			driver.findElement(By.xpath("//*[@id='btnYes']")).click();
			driver.findElement(By.xpath("//*[@id='ddlSelectedPlant_238']")).click();
			driver.findElement(By.xpath("//*[@id='toast-container']/div/button")).click();
			}
			} catch (Exception e) {
			driver.findElement(By.xpath("//*[@id='ddlSelectedPlant_238']")).click();
			driver.findElement(By.xpath("//*[@id='toast-container']/div/button")).click();
			}
*/
		driver.findElement(By.id("selectPlant_238")).click();
		driver.findElement(By.className("toast-close-button")).click();
		
		
	}
	
	public void logout()
	{
		driver.findElement(By.xpath("/html/body/nav/div/ul[2]/li[3]/a/i")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
