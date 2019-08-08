package ddc5_july;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Demo_101 {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver;
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://newtours.demoaut.com/");
////		driver.manage().window().implicitlyWait(TimeUnit.SECONDS, 50);
//		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		Dimension d = new Dimension(300,500);
//		driver.manage().window().setSize(d);
//		
//		Point p = new Point(500,300);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(5000);
//		WebElement Uname =driver.findElement(By.name("userName"));
//		Uname.sendKeys("demo");
//		
//		driver.findElement(By.name("password")).sendKeys("demo");
//		driver.findElement(By.name("login")).click();
//		
//		WebDriverWait wait1 = new WebDriverWait(driver,30);
//		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("erewr")));
int a =10;
int b =10;
System.out.println("program to understand assert");
Assert.assertEquals(a, b);
System.out.println("my validations");
	}

}
