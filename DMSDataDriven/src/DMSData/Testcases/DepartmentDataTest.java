package DMSData.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import DMSData.Library.AdminLoginConstants;
import DMSData.Library.DepartmentData;
import DMSData.Library.LoginLibrary;
import utilis.AppUtils;
import utilis.XLUtils;

public class DepartmentDataTest extends AdminLoginConstants
{

	String datafile="C:\\Java Programs\\OrangeHRMDDT\\testdatafiles\\TestData.xlsx";
	String datasheet="Department";
	

	@Test
	public void Department() throws IOException
	{
		int rowcount;
		rowcount=XLUtils.getRowCount(datafile, datasheet);
		
		DepartmentData Dept=new DepartmentData();
		String name,ucode,desc,dtype,esign;
	
		
		
		for(int i=1;i<=rowcount;i++)
		{
			name=XLUtils.getStringCellData(datafile, datasheet, i, 0);
			ucode=XLUtils.getStringCellData(datafile, datasheet, i, 1);
			desc=XLUtils.getStringCellData(datafile, datasheet, i, 2);
			dtype=XLUtils.getStringCellData(datafile, datasheet, i, 3);
			esign=XLUtils.getStringCellData(datafile, datasheet, i, 4);
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
		}	
	
}}
