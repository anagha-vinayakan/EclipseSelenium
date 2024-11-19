package junitpkg;



import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflinkcount {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void linkcount()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		int linkcount=li.size();
		if(linkcount==30)
		{
			System.out.println("link count= 30");
		}
		else 
		{
			System.out.println("link count is actually "+linkcount);
		}
	}
	@Test
	public void checktext()
	{
		String etext="Create a rediffmail account";
		String src=driver.getPageSource();
		if(src.contains(etext))
		{	
			System.out.println("contains text");
		}
		else {
			System.out.println("not contains ");
		}
	}

}