package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class textverification {
	static String pagesource="http://www.google.com";
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(pagesource);
		String s=driver.getPageSource();
		if (s.contains("search")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        
        driver.quit();
    }
}
