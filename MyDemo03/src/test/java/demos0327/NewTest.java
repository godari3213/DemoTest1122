package demos0327;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;

  @Test(priority=1,enabled=false)
  public void LaunchIn_IE() throws InterruptedException 
  {
		System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();		 
	  driver.get("https://www.oracle.com/technetwork/java/javase/downloads/index.html");
	  Thread.sleep(2000);
	  driver.close();
  }
  @Test(priority=3)
  public void LaunchIn_Chrome() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();		 
	  driver.get("https://www.oracle.com/technetwork/java/javase/downloads/index.html");
	  Thread.sleep(2000);
	  driver.close();
  }
  @Test(priority=2)
  public void LaunchIn_Mozilla() throws InterruptedException 
  {
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();		 
	  driver.get("https://www.oracle.com/technetwork/java/javase/downloads/index.html");
	  Thread.sleep(2000);
	  driver.close();
  }
}
