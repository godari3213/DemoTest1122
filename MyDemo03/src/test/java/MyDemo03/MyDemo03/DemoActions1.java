package MyDemo03.MyDemo03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoActions1 {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver= Drivers456.getDriver("chrome");
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	  WebElement E1= driver.findElement(By.xpath("//a[text()='Add-Ons']"));
	  Actions Act1 = new Actions(driver);
	  Act1.moveToElement(driver.findElement(By.xpath("//a[text()='Add-Ons']"))).build().perform();
//	  Act1.d
	  WebDriverWait wait = new WebDriverWait(driver,5);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Travel Insurance']")));
	  driver.findElement(By.xpath("//a[text()='Add-Ons']")).click();
	  
	  Thread.sleep(2000);
	  String Str1 = driver.findElement(By.xpath("//a[text()='Travel Insurance']")).getText();
	  System.out.println(Str1);
	  if(Str1.equals("Travel Insurance"))
	  {
			 
	  System.out.println("hovering Success");
	  }
	  else
	  {
		  System.out.println("hovering fail");
	  }
  }
  @Test (enabled=false)
  public void f1() {
	  driver= Drivers456.getDriver("ie");
	  driver.get("https://www.spicejet.com/");
  }
  @Test (enabled=false)
  public void f2() {
	  driver= Drivers456.getDriver("ff");
	  driver.get("https://www.spicejet.com/");
  }
  
}
