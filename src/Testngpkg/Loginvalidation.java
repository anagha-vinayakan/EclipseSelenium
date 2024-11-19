package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidation {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	driver.get("https://keralaproperty.in/member/login/");
	
}
@Test

public void Test() throws InterruptedException
{
	driver.findElement(By.id("ulogin")).sendKeys("ammu@gmail.com");
	driver.findElement(By.id("upass")).sendKeys("123456");
	driver.findElement(By.id("sub_logbtn")).click();
	 Thread.sleep(3000);
String expectedUrl = "https://keralaproperty.in/member/myhome/";
String actualUrl = driver.getCurrentUrl();
if (actualUrl.equals(expectedUrl)) {
    System.out.println("Login successful");
} else {
    System.out.println("Login failed");
    
}
}
}

