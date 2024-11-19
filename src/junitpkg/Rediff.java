package junitpkg;

import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff{
	ChromiumDriver driver;
	@Before
	public void setUp()
	{
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void redd()
	{
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select obj=new Select(day);
		obj.selectByValue("03");

		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select obj1=new Select(month);
		obj1.selectByValue("05");
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select obj2=new Select(year);
		obj2.selectByValue("2000");
	}
	}





