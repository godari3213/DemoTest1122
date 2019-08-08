package demos0327;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;

public class alertsDemo1 {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver= Drivers456.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("C:\\Users\\srinivas.godari\\Desktop\\Button.html");
	  if(ExpectedConditions.alertIsPresent()==null)
	  {
		  System.out.println("Alerts are present the web page");
	  }
	  else
	  {
		  
		  System.out.println("No alerts  in the web page");
	  }
		  
	driver.findElement(By.xpath("//button[text()='Hi ']")).click();
	Alert alrt1 =driver.switchTo().alert();
	
//	alrt1.dismiss();
	String Alert_message = alrt1.getText();
	alrt1.accept();
	System.out.println(Alert_message);
		  
		  
  }
}


