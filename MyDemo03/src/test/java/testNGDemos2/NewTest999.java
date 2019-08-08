package testNGDemos2;

import org.testng.annotations.Test;

public class NewTest999 {
  @Test(invocationCount=5)
  public void f() {
	  System.out.println("Hi Srini");
  }
}
