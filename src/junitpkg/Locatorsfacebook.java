package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsfacebook {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
}
@Test
public void fblogin()
{
	driver.findElement(By.id("email")).sendKeys("anagha@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("12@34asdf");
	driver.findElement(By.name("login")).click();
}
}
