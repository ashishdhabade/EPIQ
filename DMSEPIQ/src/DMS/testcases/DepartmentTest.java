package DMS.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DMS.library.Department;
import Utils.AppUtils;

public class DepartmentTest extends AppUtils
{

	
	
	@Parameters({"dname","dcode","desc","domaintype","esign"})
	@Test
	public void Dept(String name,String ucode,String desc,String dtype,String esign)
	{
		Department dpt = new Department();
		dpt.depart(name,ucode,desc,dtype,esign);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
