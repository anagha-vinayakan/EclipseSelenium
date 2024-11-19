package Testngpkg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DesignpatternTest 
	{
		WebDriver driver;
		@BeforeTest
		
		public void setup()
		{
		
	driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
	
		
	@Test
	public void testlogin()
	{
		
		Designpattern_fb ob =new Designpattern_fb(driver);
		ob.setvalues("anagha@gmail.com","abcd");
		ob.login();
		
	}
}
