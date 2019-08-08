package ddc5_july;

import org.testng.annotations.Test;

public class DemotestNg_01 {
  @Test(priority=2)
  public void login() {
	  System.out.println("code for login");
  }
  @Test(priority=1, enabled=false)
  public void register() {
	  System.out.println("code for register");
  }
  @Test(priority=3)
  public void logout() {
	  System.out.println("code for logout");
  }
 
}
