package MyDemo03.MyDemo03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragNdropDemo1 {
	
WebDriver driver;

  @Test
  public void f() throws InterruptedException {
	  driver = Drivers456.getDriver("ff");
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  Thread.sleep(5000);
	  
	WebElement Src=  driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[2]/div/div/span"));
	WebElement Dst=  driver.findElement(By.xpath("/html/body/form/div[4]/div[3]/div[1]/div[2]/div/div[3]/div/div/table/tbody/tr/td"));
	System.out.println(Src.getText());
	System.out.println(Dst.getText());
	Actions Act2 = new Actions(driver);
	Act2.dragAndDrop(Src, Dst).build().perform();
	Act2.clickAndHold(Src).release(Dst).build().perform();
  }
}
