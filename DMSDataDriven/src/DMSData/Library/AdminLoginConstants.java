package DMSData.Library;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utilis.AppUtils;

public class AdminLoginConstants extends AppUtils
{
	String cpl="cpl02";
	String uid="ashish1";
	String pwd="pass2";
	
	@BeforeTest
	public void login()
	{
		driver.findElement(By.name("Company")).sendKeys(cpl);
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		driver.findElement(By.className("proceed")).click();
		driver.findElement(By.id("selectPlant_238")).click();
		//driver.findElement(By.className("toast-close-button")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/button")).click();
		
	}
	
	/*
	@AfterTest
	public void logout()
	{
		driver.findElement(By.xpath("/html/body/nav/div/ul[2]/li[3]/a/i")).click();
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
