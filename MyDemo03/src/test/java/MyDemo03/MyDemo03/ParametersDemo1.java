package MyDemo03.MyDemo03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo1 {
	
 WebDriver driver;
  
  @Test
  @Parameters({"uname","pswrd","url"})
  public void login986(String uname,String pswrd,String url) {
	  
	  System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	  driver.get(url);
	  System.out.println("username is :"+uname);
	  System.out.println("password is :"+pswrd);
//	  System.out.println("pswrd is:"+pwrd);
  }
}
