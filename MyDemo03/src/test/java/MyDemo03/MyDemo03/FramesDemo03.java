package MyDemo03.MyDemo03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FramesDemo03 {
	WebDriver driver;
  @Test
  public void f() {
	  driver = Drivers456.getDriver("chrome");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
	  driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  driver.switchTo().defaultContent();
  }
}
