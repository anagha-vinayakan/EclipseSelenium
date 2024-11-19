package Testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileuploadautoIT {
RemoteWebDriver driver;
@BeforeTest
public void settest()
{
	driver=new ChromeDriver();
}
@SuppressWarnings("deprecation")
@Test
public void main() throws IOException,Exception
{
driver.get("https://www.ilovepdf.com/word_to_pdf");
driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
Thread.sleep(3000);
Runtime.getRuntime().exec("C:\\Users\\ANURAG\\Documents\\FileuploadAutoIT.exe");
Thread.sleep(3000);
}
}