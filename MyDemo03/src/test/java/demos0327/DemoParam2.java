package demos0327;

import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class DemoParam2 {
	WebDriver driver;
  @Test(dataProvider = "creds")
  public void login(String uname, String pwrd) throws InterruptedException {
	  driver=Drivers456.getDriver("chrome");
	  driver.get("http://www.newtours.demoaut.com");
	  driver.findElement(By.name("userName")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(pwrd);
	  Thread.sleep(5000);
	  driver.findElement(By.name("login")).click();
      try 
     {
Assert.assertEquals("srinivas", driver.getTitle()); 
  }
      catch (Exception e)
      {
    	  if (e.getMessage().equals("Srinivas"))
    		  System.out.println("login failed");
    	  else
    		  System.out.println("login success test5646544");
      }
  }
  @DataProvider
  public Object[][] creds() {
    return new Object[][] {
      new Object[] { "demo", "demo" },
      new Object[] { "mercury", "mercury" },
    };
  }
}
