package demos0327;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;

public class ActionsDemo1 {
	WebDriver driver;
	//Mouse Hovering
  @Test
  public void f() {
	  driver= Drivers456.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.spicejet.com/");
	  
	  WebElement El1 = driver.findElement(By.xpath("//a[text()='Add-Ons']"));
	  Actions Act1 = new Actions(driver);
	  Act1.moveToElement(El1).build().perform();
	  
	  
	  
	  
	
	
	  
  }
}
