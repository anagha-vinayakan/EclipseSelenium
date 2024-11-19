package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Designpattern_fb {
WebDriver driver;
By fbemail=By.id("email");
By fbpassword=By.id("password");
By fblogin=By.name("login");
public Designpattern_fb(WebDriver driver)
{
	this.driver=driver;
}
public void setvalues(String email, String password)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpassword).sendKeys(password);
}
public void login()
{
driver.findElement(fblogin).click();	
}
}
