package demos0327;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;

public class DoubleCLick {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver= Drivers456.getDriver("chrome");
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Actions Act2 = new Actions(driver);
	  Act2.doubleClick(driver.findElement(By.xpath("//b[text()='Mar 28, 2019']"))).build().perform();
	  
  }
}
