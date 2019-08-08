package MyDemo03.MyDemo03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Launch117 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
	  
	  driver.manage().window().maximize(); 
	  Dimension d = new Dimension(600,900);
	  Thread.sleep(5000);
	  driver.manage().window().setSize(d);
	  WebDriverWait wait = new WebDriverWait(driver, 10);
   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("///abcddfff")));
	 driver.manage().window().setPosition(new Point(400,200)); 
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	
  }
}
