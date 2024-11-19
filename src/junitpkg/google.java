package junitpkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	ChromeDriver driver;
	@Before
	public void googleopen()
	{
	driver=new 	ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	
	}
	@Test
	public void googletext()
	{
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("anagha");
		driver.findElement(By.xpath("//body[@jsmodel='hspDDf ']")).click();
	}

}
