package MyDemo03.MyDemo03;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Launch115 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s, String c) {
	  System.out.println("EmpId :"+n+"\tEmpName :"+s+"\tLocation :"+c);
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 11140932, "Srinivas", "Hyderabad" },
      new Object[] { 254546565, "QATest23", "Secunderabad" },
      new Object[] { 897645454, "QATest2564", "Pune" },
    };
  }
}
