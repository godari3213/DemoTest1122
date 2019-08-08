package MyDemo03.MyDemo03;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WindowsDemo2 {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver = Drivers456.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://retail.onlinesbi.com/retail/login.htm");
	  String Win1 =driver.getWindowHandle();
	  System.out.println(Win1);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"homeLoanButton\"]/a/img")).click();
	 Set<String>  Allwndws = driver.getWindowHandles();   //Allwndws (p,c1)
	 int totawindows =Allwndws.size();
	 System.out.println(totawindows); 
	 for (String i : Allwndws )
	 {
		 driver.switchTo().window(i);
		 System.out.println(i); 
	 } 	 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"parentHorizontalTab\"]/div[2]/div/div[1]/p[3]/a")).click();
	  Thread.sleep(5000);
	  driver.switchTo().window(Win1);
	  
//	  driver.switchTo().window(Win1);
//	  driver.switchTo().window(parentWindowHandler);
//	  driver.switchTo().
	  driver.findElement(By.xpath("//*[@id=\"forms\"]/li[2]/a")).click();
  }
}
