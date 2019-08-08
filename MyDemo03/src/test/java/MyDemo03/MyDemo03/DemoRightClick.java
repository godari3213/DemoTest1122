package MyDemo03.MyDemo03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoRightClick {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver = Drivers456.getDriver("chrome");
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  WebElement El2= driver.findElement(By.xpath("//b[text()='sign-in here']"));
	  Actions  act1 = new Actions(driver);
	  act1.doubleClick(El2).build().perform();
//	  Thread.sleep(5000);
//	  driver.close();
	  
  }
}
