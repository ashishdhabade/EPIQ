package DMSData.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import DMSData.Library.LoginLibrary;
import utilis.AppUtils;
import utilis.XLUtils;

public class LoginDataTest extends AppUtils
{
	String datafile="C:\\Java Programs\\OrangeHRMDDT\\testdatafiles\\TestData.xlsx";
	String datasheet="DMSLoginData";
	
	@Test
	public void Login() throws IOException
	{
		int rowcount;
		rowcount=XLUtils.getRowCount(datafile, datasheet);
		
		LoginLibrary lp=new LoginLibrary();
		String cpl,uid,pwd;
		
		for(int i=1;i<=rowcount;i++)
		{
			cpl=XLUtils.getStringCellData(datafile, datasheet, i, 0);
			uid=XLUtils.getStringCellData(datafile, datasheet, i, 1);
			pwd=XLUtils.getStringCellData(datafile, datasheet, i, 2);
			
			lp.login(cpl, uid, pwd);
			
			
			
			boolean res =  lp.loginSuccess();
			Assert.assertTrue(res);
			if(res)
			{
				XLUtils.setCellData(datafile, datasheet, i, 3, "Pass");
				XLUtils.fillGreenColor(datafile, datasheet, i, 3);
			}else
			{
				XLUtils.setCellData(datafile, datasheet, i, 3, "Fail");
				XLUtils.fillRedColor(datafile, datasheet, i, 3);
			}
			
			
			
			
			
			
			
			
			lp.logout();
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
