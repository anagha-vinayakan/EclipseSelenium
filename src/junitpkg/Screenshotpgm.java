package junitpkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
	ChromeDriver driver;
	@Before
	public void screen()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	}
	
		@Test
		public void fblogin() throws Exception
		{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("C:\\Users\\ANURAG\\Desktop\\screenshot1.png"));
		WebElement button=driver.findElement(By.name("login"));
		File s1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s1, new File("./Screenshot/buttonscreenshot.png"));
		}
		
}
	

