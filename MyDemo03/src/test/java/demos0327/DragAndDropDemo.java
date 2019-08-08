package demos0327;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;

public class DragAndDropDemo {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver= Drivers456.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	  driver.get("http://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  WebElement Src = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	  System.out.println(Src.getText());
	  Actions Act4=  new Actions(driver);
	  WebElement Dst=  driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tbody/tr/td"));
	  System.out.println(Dst.getText());
	  Thread.sleep(10000);
	  Act4.dragAndDrop(Src, Dst).build().perform();
//	  Act4.clickAndHold(Src).release(Dst).build().perform();
  }
}
