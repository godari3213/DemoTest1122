package MyDemo03.MyDemo03;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoXML2 {
	 @Test
	  public void login_2() {
		  System.out.println("login_2");
	  }
	  @Test
	  public void lgt_2() {
		  System.out.println("lgt_2");
	  }
	  @BeforeClass
	  public void launch_2() {
		  System.out.println("launch_2");
	  }
	  @AfterClass
	  public void close_2() {
		  System.out.println("close_2");
	  }
	  
     @AfterClass
public void ClearOncemore() {
		  System.out.println("ClearOncemore");
	  }
     
     @BeforeSuite
public void ClearsysMemo() {
		  System.out.println("ClearsysMemo");
	  }
     
     @AfterSuite
public void ClearsysMemo2() {
		  System.out.println("ClearsysMemo2");
	  }
}
