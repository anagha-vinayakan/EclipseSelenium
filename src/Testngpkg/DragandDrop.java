package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void test() 
	{
		Actions act =new Actions(driver);
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));	
		WebElement account=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
		 WebElement  amount= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		 WebElement amount1= driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		 
		 WebElement sales= driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	     WebElement account1= driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	     
	     WebElement  amount3= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	     WebElement amount2 = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));

		
		
		act.dragAndDrop( bank, account).perform();
        act.dragAndDrop( amount, amount1).perform();
        act.dragAndDrop(sales,account1).perform();
        act.dragAndDrop(amount3,amount2).perform();
	     WebElement button= driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
	     if (button.isDisplayed())
	     {
	    	 System.out.println("The button is displaced");
	     }
	    	 else
	    	 {
	    		 System.out.println("The button is not displaced"); 
	    	 }
	     }
	}


