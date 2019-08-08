package ddc5_july;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class WindowsDemo1 {
	WebDriver driver;
  @Test(enabled=false)
  public void windows() {
	  driver=Driver987.getDriver("chrome");
	  driver.get("https://retail.onlinesbi.com/retail/login.htm");
	  String p_window_id = driver.getWindowHandle();
	  System.out.println(p_window_id);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
//	  driver.close();
	  
	 Set<String> T_windows = driver.getWindowHandles();
	 for(String S: T_windows)
	 {
		 driver.switchTo().window(S);
		 System.out.println(driver.getWindowHandle());
	 }
	 
	  driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[8]/a")).click(); //aplynow
	  driver.switchTo().window(p_window_id);
//	  driver.quit();
	  
  }
  @Test (enabled=false)
  public void Frames() {
	  driver=Driver987.getDriver("chrome");
	  driver.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  driver.switchTo().defaultContent(); // to come back to the main page content
	  
  } 
  @Test
  public void AlertDemo() {
	  driver=Driver987.getDriver("chrome");
	  driver.get("https://www.tsrtconline.in/oprs-web/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	  if(ExpectedConditions.alertIsPresent()!=null)
	  {
	  Alert alrt1 =  driver.switchTo().alert();
	  String S1= alrt1.getText();
	  System.out.println(S1);
	  alrt1.accept();
//		 alrt1.dismiss();  
	  }
	  else
	  {
		  System.out.println("No alerts present in the give page");
	  }
  } 
	  
}
