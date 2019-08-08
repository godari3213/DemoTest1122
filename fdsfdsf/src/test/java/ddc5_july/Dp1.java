package ddc5_july;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Dp1 {
  @Test
  public void order() {
	  System.out.println("order");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("register");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("close app");
  }
}
