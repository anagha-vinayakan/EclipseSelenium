package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ng2 {
ChromeDriver driver;
@BeforeTest
public void refficopen()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

}
@Test(groups= {"smoke"})
public void test()
{
WebElement radiobutton=driver.findElement(By.xpath("//input[1][contains(@name,'gender')]"))	;
boolean l=  radiobutton.isSelected();
if(l)
{
	System.out.println("Radio button is selected");
}
else
{
	System.out.println("Radio button is not selected");	
}}

@Test(groups={"sanity"})
public void test1()
{
	String buttontxt=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
	System.out.println(buttontxt);
	if(buttontxt.equals("Check availability"))
	{
		System.out.println("pass");
	}
	else
	{
		
		System.out.println("fail");
	}
}
@Test(groups= {"sanity"})
public void test2()
{
WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
Select obj=new Select(day);
obj.selectByValue("03");

WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
Select obj1=new Select(month);
obj1.selectByValue("05");
WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
Select obj2=new Select(year);
obj2.selectByValue("2000");
}
@Test(groups={"sanity"})
public void test3()
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


