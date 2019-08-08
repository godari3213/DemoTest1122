package MyDemo03.MyDemo03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FramesDemo1 {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver= Drivers456.getDriver("chrome");
	  driver.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
	  driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  driver.switchTo().defaultContent();
  }
}
