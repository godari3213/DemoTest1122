package demos0327;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;

public class SelectDemo {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver= Drivers456.getDriver("chrome");
	  driver.get("http://www.newtours.demoaut.com");
	  driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
	  Select Sel1  = new Select(driver.findElement(By.xpath("//select[@name='country']")));
	  Sel1.selectByValue("7");
//   Sel1.selectByIndex(0);
//	  Sel1.selectByVisibleText("ALBANIA");	
	  
	  driver.findElement(By.xpath("//select[@name='country']/option[@value='7']")).click();
  }
}
