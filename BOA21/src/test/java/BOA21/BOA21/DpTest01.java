package BOA21.BOA21;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DpTest01 {
	
	WebDriver driver;
	
  @Test(dataProvider = "credentials")
  public void f(String name, String pswrd) throws InterruptedException {
	  driver.findElement(By.name("userName")).sendKeys(name); //uname
	  driver.findElement(By.name("password")).sendKeys(pswrd); //pswrd
	  driver.findElement(By.name("login")).click(); // submit
	  Thread.sleep(5000);
	  Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	  System.out.println("login successfull");
	  driver.close();
  }
  @BeforeMethod
  public void launch() {
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");  
  }
  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
      new Object[] { "demo", "demo" },
      new Object[] { "mercury", "mercury" },
      new Object[] { "srinivas", "Bangalore" },
    };
    
//    Select sel1 = new Select(driver.findElement(By.name("Day")));
//    sel1.selectByIndex(3);
  }
}
