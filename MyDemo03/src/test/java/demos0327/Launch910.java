package demos0327;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;

public class Launch910 {
	WebDriver driver;
	
  @Test 
  public void logina(String uname, String Password) throws InterruptedException {
	  driver=Drivers101.getDriver("chrome");
//	  driver=Drivers101.getDriver("ie");
	  driver.get("http://www.newtours.demoaut.com");
	  Thread.sleep(3000);
	WebElement El1= driver.findElement((By.name("userName")));
	 El1.sendKeys("demo"); 
	 
	 driver.findElement(By.name("password")).sendKeys("demo");
	 Thread.sleep(2000);
	 driver.findElement(By.name("login")).click();
	 String title = driver.getTitle();
	 System.out.println(title);
//	 Assert.assertEquals(title, "Find a Flight: Mercury Tours:Srinivas");
	 String text1 =driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).getText();
	 System.out.println(text1);
  }
  @Test (enabled=false)
  public void loginb() {
	  driver=Drivers101.getDriver("chrome");
//	  driver=Drivers101.getDriver("");
	  driver.get("file:///C:/Users/srinivas.godari/Desktop/JavaScript/myte.html");
 driver.findElement((By.xpath("//a[text()='MyTE']"))).click();   // Exact Match
 driver.findElement((By.xpath("//a[contains(text(),'My')]"))).click();; // Some Matching
 driver.findElement((By.xpath("//a[@href='https://www.myte.accenture.com']"))).click(); //with Attribute  
  }
  @Test (enabled=false)
  public void loginc() {
	  driver=Drivers101.getDriver("chrome");
//	  driver=Drivers101.getDriver("firefox");
//	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http:/www.newtours.demoaut.com");
	  driver.switchTo().alert();
	  
	  
	if(ExpectedConditions.alertIsPresent()!=null) {
		 Alert alert = driver.switchTo().alert();
	  String s = alert.getText();
	  alert.accept();
	  alert.dismiss(); }
////	  driver.findElement(By.name("password12132")).sendKeys("demo");
//	  WebDriverWait wait1 = new WebDriverWait(driver,5);
////	  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("5646546546")));
//	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("5646546546")));
//	 To Count the links
List<WebElement> T_links =driver.findElements(By.tagName("a"));
System.out.println(T_links.size());
System.out.println(T_links.get(1).getText());
for(int i=0;i<T_links.size();i++)
{
//System.out.println(T_links.get(i).getText());
//System.out.println(T_links.get(1).getText());
  }
}
  
  @Test 
  public void table() {
	  driver= Drivers456.getDriver("chrome");
	  driver.get("file:///C:/Users/srinivas.godari/Desktop/HTML_0325/Demo1.html");
	  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			  .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);
  }
  }