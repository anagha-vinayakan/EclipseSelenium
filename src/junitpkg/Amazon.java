package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void amazon()
	{
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']/input")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
		driver.navigate().back();//to move into back page:
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
	
	}
	}

