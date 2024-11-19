package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcepgm {

	
		static String url="http://www.gmail.com";
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get(url);
			String s1=driver.getPageSource();
			if (s1.contains("Forgot")) {
	            System.out.println("Test Passed");
	        } else {
	            System.out.println("Test Failed");
	        }

	        
	        
	    }
	


	}


