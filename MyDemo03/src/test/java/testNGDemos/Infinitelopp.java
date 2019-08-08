package testNGDemos;

import org.testng.annotations.Test;

public class Infinitelopp {
  @Test
  public void f() {
	  int i=1;
	  while(i==1);
	  System.out.println(i);
  }
}
