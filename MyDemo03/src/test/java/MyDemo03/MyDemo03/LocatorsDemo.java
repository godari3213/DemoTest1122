package MyDemo03.MyDemo03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LocatorsDemo {
	WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.linkText("REGISTER")).click();
	  driver.findElement(By.name("firstName")).sendKeys("srinivas");
	  driver.findElement(By.name("lastName")).sendKeys("godari");
	  driver.findElement(By.name("phone")).sendKeys("1234567890");
	  driver.findElement(By.id("userName")).sendKeys("testdemo@test.com");
//	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("Hyd50007");
	  driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("hyderabad50007");
      driver.findElement(By.cssSelector("input[name='city'][size='15']")).sendKeys("HYD");
      
      Select Sel1 = new Select(driver.findElement(By.xpath("//select[@name='country']")));
//      Sel1.selectByIndex(1);
//      Sel1.selectByValue(HAITI);
//      Sel1.selectByVisibleText("INDIA");
     Sel1.selectByValue("251");
  }
}
