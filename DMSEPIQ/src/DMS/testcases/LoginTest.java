package DMS.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DMS.library.LoginDMS;
import Utils.AppUtils;

public class LoginTest extends AppUtils
{
	
	@Parameters({"cpl","userid","password"})
	@Test
	public void DMSLogin(String cpl,String uid,String pwd)
	
	{
		LoginDMS lg=new LoginDMS();
		lg.login(cpl,uid,pwd);
		
		lg.logout();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
