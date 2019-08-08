package JanDemo1.JanDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	
	WebDriver driver;
	
  @Test
  public void launch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
//	  driver.close();
	  driver.findElement(By.xpath(xpathExpression)
  }
}
