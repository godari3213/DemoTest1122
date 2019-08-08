package MyDemo03.MyDemo03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardActionsDemo1 {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver = Drivers456.getDriver("chrome");
	  
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   WebElement Searchbar= driver.findElement(By.xpath("//input[@name='q']"));
	   
	   Actions act9 = new Actions(driver);
	   
//	   act9.keyDown(Searchbar,Keys.SHIFT).sendKeys("AccentUre").keyUp(Keys.SHIFT).build().perform();
	   act9.keyDown(Searchbar,Keys.ALT).sendKeys("AccentUre").keyUp(Keys.ALT).build().perform();
	   Thread.sleep(1000);
	   act9.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	   
	   
//	   WebElement inp= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//		 inp.sendKeys("accenture");
//		 Actions act1=new Actions(driver); 
//		 act1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();  
//	   
//	   
	   
	   
	   
	   
  }
}
