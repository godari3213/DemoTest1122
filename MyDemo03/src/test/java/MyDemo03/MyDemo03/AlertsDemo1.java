package MyDemo03.MyDemo03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AlertsDemo1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver= Drivers456.getDriver("chrome");
	  driver.get("https://tsrtconline.in/oprs-web/");
	  driver.findElement(By.xpath("//input[@name=\"searchBtn\"]")).click();
	  if(ExpectedConditions.alertIsPresent()!=null)
	  {
		Alert alt1= driver.switchTo().alert();
		alt1.getText();
	  }
	 Alert alrt =  driver.switchTo().alert();
	String altrmsg= alrt.getText();
	System.out.println(altrmsg);
	Thread.sleep(5000);
//	alrt.accept();
    alrt.dismiss();
    
    // reference for windows URLLLLLLLL
    //https://retail.onlinesbi.com/retail/login.htm
  }
}
