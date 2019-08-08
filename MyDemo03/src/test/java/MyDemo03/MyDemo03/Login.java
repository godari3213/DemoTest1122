package MyDemo03.MyDemo03;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class Login {
	
	WebDriver driver;
  @Test(priority=2)
  public void login9415() throws InterruptedException {
	  
	 WebElement UName=  driver.findElement(By.name("userName"));
	 WebElement Pswrd =driver.findElement(By.name("password"));
	 UName.sendKeys("demo");
	 Pswrd.sendKeys("demo"); 
	 Thread.sleep(2000);
	 WebElement SubmitButton = driver.findElement(By.name("login"));
	 SubmitButton.click();
	
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	  driver.get("http://newtours.demoaut.com");
	  Thread.sleep(2000);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  @Test (priority=1)
  public void register() throws InterruptedException {
	  
		 driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		 Thread.sleep(5000);
  }
}
