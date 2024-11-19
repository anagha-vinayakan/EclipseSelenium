package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		//driver.quit();
		String actual=driver.getTitle();
		String exp="Google";
		if (actual.equals(exp)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
		driver.quit();
	}

}
