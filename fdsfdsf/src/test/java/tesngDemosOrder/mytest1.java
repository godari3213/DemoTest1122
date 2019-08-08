package tesngDemosOrder;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mytest1 {
  @Test
  public void m1() {
	  System.out.println("code for m1");
  }
  @Test
  public void m2() {
	  System.out.println("code for m2");
  }
  @Test
  public void m3() {
	  System.out.println("code for m3");
  }
  @BeforeTest
  public void Bt1() {
	  System.out.println("code for Bt1");
  }
  
}
