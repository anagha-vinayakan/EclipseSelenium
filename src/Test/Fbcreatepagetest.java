package Test;

import org.testng.annotations.Test;
import Page.Fbcreatepage;


public class Fbcreatepagetest extends BaseClass {
	@Test
	public void test()
	{
		Fbcreatepage ob=new  Fbcreatepage(driver);
		 ob.checktext();
		ob.click();
		
	}
	

	}

