package MyDemo03.MyDemo03;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoXML1 {
  @Test
  public void login() {
	  System.out.println("login");
  }
  @Test
  public void lgt() {
	  System.out.println("lgt");
  }
  @BeforeClass
  public void launch() {
	  System.out.println("launch");
  }
  @AfterClass
  public void close() {
	  System.out.println("close");
  }
  
  @BeforeTest
  public void ClearTemp() {
	  System.out.println("ClearTemp");
  }
}
