package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
		WebDriver driver;
		@BeforeTest
		
		
		public void setup()
		{
		
	driver=new ChromeDriver();
		driver.get("https://www.facebook.com/pages/creation");
		}
}


