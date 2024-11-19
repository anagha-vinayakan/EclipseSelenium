package Testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramitarised {
@Parameters("s")
@Test
public void test(String s)
{
	System.out.println(s);
}
}
