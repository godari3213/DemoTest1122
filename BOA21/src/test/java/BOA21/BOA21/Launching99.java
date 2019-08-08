package BOA21.BOA21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Launching99 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.name("userName")).sendKeys("demo"); //uname
	  driver.findElement(By.name("password")).sendKeys("demo"); //pswrd
	  driver.findElement(By.name("login")).click(); // submit
	  Thread.sleep(15000);
	  Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	  System.out.println("login successfull");
//	  driver.close();
  }
}
