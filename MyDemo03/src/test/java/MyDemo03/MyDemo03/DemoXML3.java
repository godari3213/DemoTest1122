package MyDemo03.MyDemo03;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoXML3 {
	 @Test
	  public void login_3() {
		  System.out.println("login_3");
	  }
	  @Test
	  public void lgt_3() {
		  System.out.println("lgt_3");
	  }
	  @BeforeClass
	  public void launch_3() {
		  System.out.println("launch_3");
	  }
	  @AfterClass
	  public void close_3() {
		  System.out.println("close_3");
	  }
}
