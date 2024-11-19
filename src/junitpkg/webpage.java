package junitpkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class webpage {
	WebDriver driver;
	@Before
	public void setUp()
	{
		 driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ANURAG/Desktop/javaprograms/web.html");
	}
	@Test
	public void amazon()
	{
		driver.findElement(By.xpath("//input[@value='display alert box']")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println("alert text="+text);
		a.accept();
		//a.dismiss();//to cancel the alert box
		driver.findElement(By.name("firstname")).sendKeys("anagha");
		driver.findElement(By.name("lastname")).sendKeys("vinayakan");
		driver.findElement(By.xpath("//input[@value='submit']")).click();

		
	
	}
	}




