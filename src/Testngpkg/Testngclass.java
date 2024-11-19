package Testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngclass {
	
@BeforeTest
public void setup()
{
	System.out.println("before test,browser open");
}
@BeforeMethod
public void mthd()

{
	System.out.println("url opening");
}

@Test(priority=2,invocationCount=3,dependsOnMethods= {"test2"})
public void test1()
{
System.out.println("test1");
}
@Test(priority=4)
public void test2()
{
System.out.println("test2");
}
@Test(priority=1)
public void test3()
{
System.out.println("test3");
}
@Test(priority=3,enabled=false)

public void test4()
{
System.out.println("test4");
}
@AfterMethod
public void afmthd()

{
	System.out.println("after method");
}
@AfterTest
public void aftest()
{
	System.out.println("after test");	
}
}