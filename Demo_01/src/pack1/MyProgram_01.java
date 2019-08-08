package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProgram_01 {
	 
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // exist -
//		
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
//		
//		driver.get("http://www.newtours.demoaut.com");  // launch
////		driver.navigate().to("http://www.newtours.demoaut.com"); // launch
//		
//		driver.manage().window().maximize();   // maximise
//		Thread.sleep(5000);  // static wait
////	Dimension d = new Dimension(300,900);
////	driver.manage().window().setSize(d);
//		WebElement Uname =  driver.findElement(By.name("userName"));
//		WebElement Pswrd =  driver.findElement(By.name("password"));
//		WebElement Sbmt = driver.findElement(By.name("login"));
//		Uname.sendKeys("demo");
//		Pswrd.sendKeys("demo");
//		Sbmt.click();
////		Point p = new Point(300,500);
////		driver.manage().window().setPosition(p);
//		
//		driver.close();  // closes only parent window of the driver instance
//		driver.quit();  // closes all the windows		
//		driver.get("http://www.google.com");
//		driver.manage().window().maximize();
////		Thread.sleep(5000);
//		driver.close();
//	
//		
////		int a = 10;
////		int sum;
////		int b = 20;
////		sum = a+b;
////		System.out.println("the total is : " + sum);
////		
////		driver.findElement(By.name("userName")).sendKeys("Srinivas");
//		
		driver.get("http://www.newtours.demoaut.com"); 
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement Cntry =driver.findElement(By.name("country"));
		
		Select Sel1 = new Select(Cntry);
		Sel1.selectByVisibleText("INDIA");
//		Sel1.selectByValue("92");
//		Sel1.selectByIndex(2);
		G

	}

}
