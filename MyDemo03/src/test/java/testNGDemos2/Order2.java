package testNGDemos2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Order2 {
  @Test
  public void removecart() {
	  System.out.println(" code for removecart");
  }
  @Test
  public void register() {
	  System.out.println(" code for register");
  }
  @Test
  public void AddtoCart() {
	  System.out.println(" code for AddtoCart");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("get the valid creds");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("dont share creds");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("login");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("logout");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("clear the browser cache secuity");
  }

  @AfterTest 
  public void afterTest() {
	  System.out.println(" Get access to teh website");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Get some device to proceed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("preserve ur device for future");
  }

}
