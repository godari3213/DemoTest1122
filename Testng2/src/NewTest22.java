import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class NewTest22 {
  @Test
  public void f2() {
	  System.out.println("reigister");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("launch");
	 
  }
  
  @BeforeTest
  public void f45() {
	  System.out.println("launch453");
	 

  }
  
  @AfterTest
  public void f46() {
	  System.out.println("99launch");
	 
	 
  }

}
