package mavenex1.mavenex9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FbLogin {
	
	WebDriver driverfb;
  @Test
  public void f() {
	  driverfb.get("https://www.facebook.com");
	  //Assert.assertEquals(driverfb.getTitle(), "Hi Srinivas");
	 // System.out.println(driverfb.getCurrentUrl());
	 // System.out.println(driverfb.getTitle());
	  //System.out.println(driverfb.getPageSource());
	  driverfb.findElement(By.id("u_0_j")).sendKeys("srinivas");
	  driverfb.findElement(By.id("u_0_o")).sendKeys("9642256000");
	  //driverfb.findElement(By.id("u_0_o")).sendKeys("9642256000"); 
	  driverfb.findElement(By.id("u_0_v")).sendKeys("Srini@3213");
	  Select day=new Select (driverfb.findElement(By.id("day")));
	  day.selectByIndex(14);
	  Select month=new Select (driverfb.findElement(By.id("month")));
	  month.selectByIndex(6);
	  Select year=new Select (driverfb.findElement(By.id("year")));
	  year.selectByValue("1988");
	 // driverfb.findElement(By.xpath("//span[@id='u_0_z']/span[2]/label")).click();
	  //driverfb.findElement(By.xpath("*[@id='u_0_z']/span[2]")).click();
	  driverfb.findElement(By.cssSelector("[id=u_0_j]")).click();
	  driverfb.findElement(By.id("u_0_11")).submit();
	 
  }
  @BeforeMethod
  public void BrowserSettup() {
	 // System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	 // driverfb= new ChromeDriver();
	System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\IEDriverServer.exe");
    driverfb= new InternetExplorerDriver();
  }
  
}