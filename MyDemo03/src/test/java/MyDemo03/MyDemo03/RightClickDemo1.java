package MyDemo03.MyDemo03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickDemo1 {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver = Drivers456.getDriver("chrome");
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  Alert alr1 = driver.switchTo().alert();
//	  System.out.println(alr1);
	  WebElement GmailLink =driver.findElement(By.xpath("//a[text()='Gmail']"));
//	  Thread.sleep(10);
	  Actions act45 = new Actions(driver);
	  act45.contextClick(GmailLink).build().perform();
  }
}
