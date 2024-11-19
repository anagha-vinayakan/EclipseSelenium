package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"headerInnerContainer\"]/div[1]")
	WebElement createpagetext;
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement signupbutton;
	
	public Fbcreatepage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public void checktext()
	
	{
		String text="create a page";
		String atext=createpagetext.getText();
		System.out.println(atext);
		if(atext.equalsIgnoreCase(text))
		{
			System.out.println("pass");
		}
		else
		{
			
			System.out.println("fail");
		}
	}

	
	public void click()
	{
	signupbutton.click();	
	
	}
}
