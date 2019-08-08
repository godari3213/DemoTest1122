package mavenex1.mavenex9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launch9 {
	WebDriver driverc;
  @Test
  public void f() {
	  driverc.get("http://www.google.com");
	  driverc.manage().window().maximize();
	  driverc.findElement(By.id("lst-ib")).sendKeys("demotours");
	  driverc.findElement(By.name("btnK")).click();
	  driverc.findElement(By.linkText("Mercury Tours - 974636 www.demoaut.com")).click();
	  driverc.findElement(By.name("userName")).sendKeys("demo");
	  driverc.findElement(By.name("password")).sendKeys("demo");
	  driverc.findElement(By.name("login")).click();
	  
	  
	  
	  driverc.close();
  }
  
  @BeforeMethod
  public void BrowserSetUp() 
  {
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	 driverc= new ChromeDriver();
		 
	 //System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\Drivers\\geckodriver.exe");
   //  driverc= new FirefoxDriver();
	  
    //  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
    //  driverc= new FirefoxDriver();
      
	// System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\IEDriverServer.exe");
	// driverc= new InternetExplorerDriver();
  }
  
}
