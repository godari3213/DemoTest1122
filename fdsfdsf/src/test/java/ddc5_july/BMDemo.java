package ddc5_july;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BMDemo {
  @BeforeMethod
  public void login() {
	  System.out.println("code for lgn");
  }
  @Test
  public void profileUpdate() {
	  System.out.println("code for profileUpdate");
  }
  @AfterMethod
  public void logout() {
	  System.out.println("code for logout");
  }
  @Test
  public void RewardCheck() {
	  System.out.println("code for RewardCheck");
  }
  @BeforeClass
  public void register()
  {
	  System.out.println("code for Register");
  }
  @AfterClass
  public void brwserHistory()
  {
	  System.out.println("code for brwserHistory");
  }
  
  }

