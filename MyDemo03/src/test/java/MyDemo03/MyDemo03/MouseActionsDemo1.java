package MyDemo03.MyDemo03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionsDemo1 {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	 driver= Drivers456.getDriver("chrome");
	 driver.get("http://www.google.com");
	 Actions act3 = new Actions(driver);
	 WebElement Ele1 =driver.findElement(By.xpath("//input[@name='q']"));
	 act3.keyDown(Ele1,Keys.SHIFT).sendKeys("srinivas").keyUp(Keys.SHIFT).build().perform();
//	 act3.keyDown(Ele1,Keys.SHIFT).sendkeys("srinivas54").keyUp(Keys.SHIFT).build().perform();
	 act3.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
     Thread.sleep(5000);
	 act3.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	 
	// right click
	 WebElement Ele2 = driver.findElement(By.xpath("//a[text()='Gmail']"));
	 Thread.sleep(5000);
	 act3.contextClick(Ele2).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	 
	//double click
	 driver.get("http://newtours.demoaut.com/");
	 driver.manage().window().maximize();
//	 Actions act3 = new Actions(driver);
	 
	 WebElement Ele3 = driver.findElement(By.xpath("//b[text()='sign-in here']"));
	 Thread.sleep(5000);
	 act3.doubleClick(Ele3).perform();
	
  }
}
