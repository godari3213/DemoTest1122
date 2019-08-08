import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f1() {
	  System.out.println("login");
  }
  @BeforeMethod
  public void f2() {
	  System.out.println("launch");
  }
  @AfterMethod
  public void f3() {
	  System.out.println("logout");
  }
  @BeforeClass
  public void f4() {
	  System.out.println("welcome");
  }
}
