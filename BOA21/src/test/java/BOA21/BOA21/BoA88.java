package BOA21.BOA21;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BoA88 {
  @BeforeMethod
  public void text() {
	  System.out.println("login frist");
  }
  @Test
  public void un() {
	  System.out.println("search");
  }
  @Test
  public void um() {
	  System.out.println("logout");
  }
  
  @AfterMethod
  public void text98() {
	  System.out.println("close window");
  }
}
