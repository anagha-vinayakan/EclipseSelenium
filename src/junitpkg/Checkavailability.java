package junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkavailability
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
@Test
public void rediffmail()
{
	String buttontxt=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
	System.out.println(buttontxt);
	if(buttontxt.equals("Check availability"))
	{
		System.out.println("pass");
	}
	else
	{
		
		System.out.println("fail");
	}
}
public void test() throws Exception
{
	URI ob=new URI(link);
	HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
	int code=con.getResponseCode();
	System.out.println("response code="+code);
}
}