package ddc5_july;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo1 {
	WebDriver driver;
  @Test (enabled=false)
  public void Hover() {
	  driver = Driver987.getDriver("chrome");
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement Trgt_El = driver.findElement(By.xpath("//a[text()='Add-Ons']"));
	  Actions act1 = new Actions(driver); // create actions instance for the driver
//	  act1.moveToElement(Trgt_El).build().perform();  // build and perform
//	  WebElement Trgt_El2 = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]"));
//	  boolean b = Trgt_El2.ismultiple();
//	  System.out.println(b);
	  
//	  WebElement El3 = driver.findElement(By.xpath("//label[contains(text(),'Currency')]"));
//	  act1.doubleClick(El3).build().perform();
	  
	  WebElement El4 = driver.findElement(By.xpath("//*[@id=\"discount-checkbox\"]/span/a"));
	  act1.contextClick(El4).build().perform();
	  
  }
  @Test (enabled=false)
  public void DragnDrop() throws InterruptedException {
	  driver = Driver987.getDriver("chrome");
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement Src = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	  WebElement Dst = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tbody/tr/td"));
      Actions act3 = new Actions(driver);
      act3.dragAndDrop(Src, Dst).build().perform();
      Thread.sleep(5000);
     String New_price = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tfoot/tr/td[2]")).getText();
     System.out.println(New_price);
     Assert.assertNotEquals("$0", New_price);
     driver.close();
  }
  @Test
  public void KeyBoardACT() throws InterruptedException {
	  driver = Driver987.getDriver("chrome");
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement trgt = driver.findElement(By.name("q"));

	  Actions Act5 = new Actions(driver);

	  Act5.keyDown(trgt, Keys.SHIFT).sendKeys("acceNtUre").keyUp(Keys.SHIFT).build().perform();
	  Thread.sleep(5000);
	  Act5.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  
	  
  }
}
