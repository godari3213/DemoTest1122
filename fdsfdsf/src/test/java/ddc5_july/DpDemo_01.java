package ddc5_july;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DpDemo_01 {
  @Test(dataProvider = "Credentials")
  public void f(String n, String s) {
	  System.out.println("username is: "+n+ "\t"+"Password is: "+s);
//	  System.out.println("Password is: "+s);
  }

  @DataProvider
  public Object[][] Credentials() {
    return new Object[][] {
      new Object[] { "Srinivas", "HDC3" },
      new Object[] { "Pravin", "DDC5" },
    };
  }
}
