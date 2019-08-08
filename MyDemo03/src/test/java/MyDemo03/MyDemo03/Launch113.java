package MyDemo03.MyDemo03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch113 {
	WebDriver driver;
	
  @Test
  public void login() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");  
	 WebElement UName=  driver.findElement(By.name("userName"));
	 WebElement Pswrd =driver.findElement(By.name("password"));
	 UName.sendKeys("demo");
	 Pswrd.sendKeys("demo"); 
	 Thread.sleep(2000);
	 WebElement SubmitButton = driver.findElement(By.name("login"));
	 SubmitButton.click();
	 Thread.sleep(5000);
	 driver.close();	 
  }
}
