package MyDemo03.MyDemo03;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WindowsDemo1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver=Drivers456.getDriver("chrome");
	  driver.get("https://retail.onlinesbi.com/retail/login.htm");
	  driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
	  Thread.sleep(5000);
//	  driver.close();  // Closes the current instance opened by the Driver
	 // driver.quit();   // Closes all the instances opened by the Driver
	String Str1=  driver.getWindowHandle();
	System.out.println(Str1);
	Set<String> wndws=  driver.getWindowHandles();
	int n = wndws.size();
//	Iterator<String> ita=wndws.iterator();
	
	System.out.println(n);
	for( String txt:wndws )
	{
	System.out.println(txt);
	driver.switchTo().window(txt); // to take it to the new window
    }
	driver.findElement(By.xpath("//a[text()='Apply Now ']")).click();
	driver.switchTo().window(Str1);  // to make it parent window
	
}
}