package demos0327;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class LoginParameters_Demo1 {
// (dataProvider = "credentials")
 @Test
  public void f(String Uname, int Id) {
	  System.out.println("username is:\t"+Uname+"Password is:\t"+Id);
//	  System.out.println("Password is:"+Id);
  }
//  @DataProvider
//  public Object[][] credentials() {
//    return new Object[][] {
//      new Object[] { "demo", 123 },
//      new Object[] { "mercury", 654 },
//      new Object[] { "srinivas", 564654 },
//      new Object[] { "lkm", 5445 },
//    };
//  }
}
