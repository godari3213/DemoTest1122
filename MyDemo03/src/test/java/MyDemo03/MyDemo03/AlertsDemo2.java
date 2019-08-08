package MyDemo03.MyDemo03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AlertsDemo2 {
	
	WebDriver driver;
  @Test
  public void f() {
	  driver = Drivers456.getDriver("chrome");
//	  driver.get("https://tsrtconline.in/oprs-web/");
	  driver.get("https://www.redbus.in/bus-tickets/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	  driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	  driver.findElement(By.xpath("//button[@class='search-btn searchBuses']")).click();
	  
	  Alert alrt1 = driver.switchTo().alert();
	 String Str1= alrt1.getText();
	 System.out.println("The alert message is :" +Str1);
	 alrt1.accept();
//	 alrt1.dismiss();
//	 driver.findElement(By.xpath("//input[@name='fromPlaceName']")).sendKeys("Hyderabad");
  }
}
