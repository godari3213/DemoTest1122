package ddc5_july;

import org.testng.annotations.Test;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class dpdemo_2 {
	WebDriver driver;
  @Test(dataProvider = "dp", priority=2)
  public void login(String n, String s) {
	  driver.findElement(By.name("userName")).sendKeys(n);
	  driver.findElement(By.name("password")).sendKeys(s);
	  driver.findElement(By.name("login")).click();
  }
  
  //@Test(priority=1)
  @BeforeMethod
  public void launch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
//	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.get("http://newtours.demoaut.com");
  }
  
  @Test(priority=3)
  public void verification() 
  {
	  String e_title = "Srinivaas";
	  String a_title = driver.getTitle();
	  Assert.assertEquals(e_title, a_title);
	  	System.out.println("Login Success");
  }
  
  @Test(priority=4)
  public void closingApp() 
  {
	  driver.close();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "demo", "demo" },
      new Object[] { "mercury", "mercury" },
    };
  }
}
