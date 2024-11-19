package junitpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responselinkcount {
	
		ChromeDriver driver;
		@Before
		public void open()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login.php/");
		}
	@Test
	public void link() throws Exception
	{
		List <WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total no of links"+li.size());
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verify(link);
		}
	}
	
	private void verify(String link) throws Exception  {
		try
		{
		URI ob=new URI(link);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
		if(con.getResponseCode()==200)
		{
		System.out.println("sucess response code is 200-----"+link);
		
	}
		else if(con.getResponseCode()==404)
		{
			System.out.println("broken response code is 404-----"+link);
		}
	}
catch (Exception e)
		
		{
	System.out.println(e.getMessage());
		}
}
	}
