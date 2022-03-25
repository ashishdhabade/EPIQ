package DMS.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DMS.library.DocumentRepository;
import Utils.AppUtils;

public class DocumentRepositoryTest extends AppUtils
{
	
	
	@Parameters({"drid","title","find","sections","stitle1","sid1","stitle2","sid2"})
	@Test
	public void DocRepo(String Rid,String title,String find,String Nsec,String Stitle1,String Sid1,String Stitle2,String Sid2)
	{
		
		
		DocumentRepository drepo= new DocumentRepository();
		drepo.repo(Rid, title, find, Nsec, Stitle1, Sid1, Stitle2, Sid2);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
