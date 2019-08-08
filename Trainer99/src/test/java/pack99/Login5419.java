package pack99;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login5419 {
	
  WebDriver divya;
  
  @BeforeMethod
  public void launch() throws InterruptedException
  {
//  divya.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//	  Thread.sleep(10000);
  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
  divya =new ChromeDriver();
//  divya.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS); //implicit wait
//  divya.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @Test
  public void sgnIn() throws InterruptedException  {
	    divya.navigate().to("http://newtours.demoaut.com/");
	    divya.findElement(By.name("userName")).sendKeys("demo"); // for user name
//        Thread.sleep(5000);  // Explicit wait Type1
//	    WebDriverWait halt = new WebDriverWait(divya,10);
//	    halt.until(ExpectedConditions.presenceOfElementLocated((By.name("passwor54d"))));
	    
	    divya.findElement(By.name("password")).sendKeys("demo");
//        WebDriverWait	cool = new   WebDriverWait(divya,5);  // Explicit wait Type2
//        cool.until(ExpectedConditions.presenceOfElementLocated((By.name("login5"))));
	    
	    
	    divya.findElement(By.name("login")).click();
	    
	    Select sel1 = new Select(divya.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select")));
//        boolean a= sel1.isMultiple();
       
        Assert.assertTrue(sel1.isMultiple());
         
//	   Assert.assertEquals(actual, expected);
//	   
	   
//	   b = divya.findElement(By.name("userName").isMultiple();
//	   Assert.assertEquals(b,True);
//	    String a=   divya.getTitle();
//	    Assert.assertEquals(a,"Find dsad Flight: Mercury Tours:");
//	    divya.close();
//	    
//	    divya.manage().window().maximize(); // for maximizing
//	    
//  Dimension d = new Dimension (300,900);
//  divya.manage().window().setSize(d);
	    
//	    Point p = new Point (100,900);
//	    divya.manage().window().setPosition(p);

  }
  }
  