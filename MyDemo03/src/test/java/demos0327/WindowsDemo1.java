package demos0327;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;

public class WindowsDemo1 {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver= Drivers456.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get("https://retail.onlinesbi.com/retail/login.htm");
	  String Winow_Id = driver.getWindowHandle();
	  System.out.println("Primary Window:"+Winow_Id);
	  driver.findElement(By.xpath("//*[@id=\"homeLoanButton\"]/a/img")).click();
	  Thread.sleep(5000);
	  Set<String> Total_windows= driver.getWindowHandles();
		 int TNoWnd= Total_windows.size();
		 System.out.println(TNoWnd);
		 for (String s: Total_windows)  
		 {
			driver.switchTo().window(s);
//			String S2= driver.getWindowHandle();
			System.out.println(s);
		 }
	 driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[9]/a")).click();
	 
//	 driver.close();
	 
	//
	 
	 
  }
}
