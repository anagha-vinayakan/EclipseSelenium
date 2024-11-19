package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {
	
		ChromeDriver driver;
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			
		}
		@Test
		public void facebook()
		{
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anagha@gmail.com");
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ammu123");
			driver.findElement(By.xpath("//button[@name='login']")).click();
			
		}
		}


