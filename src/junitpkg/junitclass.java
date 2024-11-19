package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitclass {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test
public void titleverification()
{
		String actual=driver.getTitle();
		String exp="Google";
		if (actual.equals(exp)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
		
	

}

@After
public void teardown()
{
	driver.quit();
}
}