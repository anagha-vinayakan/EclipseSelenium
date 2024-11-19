package Testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	public class DragandDrop {
		ChromeDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		}
		@Test
		public void fileupload() throws AWTException, InterruptedException
		{

			driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
			fileUpload("C:\\Users\\ANURAG\\Desktop\\RESUME1- sruthymol - Copy.docx");
		}
	
		public void fileUpload(String string) throws AWTException, InterruptedException {
			StringSelection str=new StringSelection(string);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			Robot r=new Robot();
			r.delay(5000);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		}
	
			
		}

	
		

}
