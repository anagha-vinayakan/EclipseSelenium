/*package junitpkg;

import java.util.List;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscount {
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
	}
@Test
public void link()
{
	List <WebElement>li=driver.findElements(By.tagName("a"));
	System.out.println("total no of links"+li.size());
	
}


}*/
package junitpkg;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscount {
    ChromeDriver driver;

    @Before
    public void open() {
        // Set the correct path to your chromedriver.exe file
// <-- Update this path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login.php/");
    }

    @Test
    public void link() {
        List<WebElement> li = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: " + li.size());

        // Optionally print the text and href of each link
        for (WebElement link : li) {
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }
    }

    @After
    public void close() {
        // Close the driver after the test is done
        if (driver != null) {
            driver.quit();
        }
    }
}