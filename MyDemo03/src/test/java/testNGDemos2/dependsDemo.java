package testNGDemos2;

import org.testng.annotations.Test;

public class dependsDemo {
  @Test
  public void login() {
	  int a=10;
	  int b=0;
	  int div=a/b;
	  System.out.println(div);
  }
  @Test(dependsOnMethods="login")
  public void logout() {
	  System.out.println("logout");
  }
  @Test
  public void addcart() {
	  System.out.println("addcart");
  }
}
