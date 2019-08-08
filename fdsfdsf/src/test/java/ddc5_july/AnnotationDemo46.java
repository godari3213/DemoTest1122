package ddc5_july;

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

public class AnnotationDemo46 {
  @Test(dataProvider = "dp")
  public void login(Integer n, String s) {
	  System.out.println(n);
	  System.out.println(s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("code for @@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("code for @@AfterMethod");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 15646, "Srinivas" },
      new Object[] { 654464, "iksha" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("code for @@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("code for @@AfterClass");
  }

  @AfterTest
  public void beforeTest() {
	  System.out.println("code for @@AfterTest");
  }

  @BeforeTest
  public void afterTest() {
	  System.out.println("code for @@BeforeTest");
  }

  @AfterSuite
  public void beforeSuite() {
	  System.out.println("code for @@AfterSuite");
  }

  @BeforeSuite
  public void afterSuite() {
	  System.out.println("code for @@BeforeSuite");
  }

}
