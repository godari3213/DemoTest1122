package ddc5_july;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemoWithTryCatchFinally {
  @Test
  public void f() {
	  
	  int a=10;
	  int b=0;
//	  System.out.println("validations");
////	  Assert.assertEquals(a,b);  // Hard Assertion
//	  // Soft Assertion
//	  SoftAssert myasrt1 = new SoftAssert();
//	  myasrt1.assertEquals(a, b);
//	  System.out.println("Successs");
//	  int c=a/b;
//	  System.out.println(c);
	try {
		int c =a/b;
	  }
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
	 System.out.println("we can't devide by zero"); 
  }
}
}