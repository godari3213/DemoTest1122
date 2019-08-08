package demos0327;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;

public class RightclickDemo {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver = Drivers456.getDriver("chrome");
	  driver.get("https://www.google.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	WebElement El1 =  driver.findElement(By.xpath("//a[text()='Gmail']"));
	WebElement El2 =  driver.findElement(By.name("q"));
	  Actions act3 = new Actions(driver);
//	  act3.contextClick(driver.findElement(By.xpath("//a[text()='Gmail']"))).build().perform();
//	  Thread.sleep(5000);
//	  act3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
//	  .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
//	  .sendKeys(Keys.ENTER).build().perform();
	//a[text()='Gmail']
	  act3.keyDown(El2,Keys.SHIFT).sendKeys("accenture").keyUp(Keys.SHIFT).build().perform();
	  Thread.sleep(5000);
	  act3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//	  act3.dra
	  
  }
}
