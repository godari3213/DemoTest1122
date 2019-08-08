package demos0327;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;

public class FramesDemo1 {
	WebDriver driver;
  @Test
  

  public void f() {
	  driver= Drivers456.getDriver("chrome");
	  driver.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
//	 String s1 =driver.findElement(By.xpath("//span[text()='JavaScript Alert']")).getText();
//	 System.out.println(s1);
	 driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  driver.switchTo().alert().accept();
//	  alert.accept()
	  driver.switchTo().defaultContent();
	  String s1 =driver.findElement(By.xpath("//span[text()='JavaScript Alert']")).getText();
		 System.out.println(s1);
	//span[text()='JavaScript Alert']
  }
}
