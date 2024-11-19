package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class kerala {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void keralapro()
	{
		driver.findElement(By.id("ulogin")).sendKeys("anagha@gmail.com");
		driver.findElement(By.id("upass")).sendKeys("12@34asdf");
		driver.findElement(By.id("sub_logbtn")).click();
	}
	}


