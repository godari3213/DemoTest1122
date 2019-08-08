package demos0327;

import javax.swing.text.Position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Launch902 {
	WebDriver driver;

  @Test
  public void f() throws InterruptedException {
System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\IEDriverServer.exe");
   driver = new InternetExplorerDriver();
   driver.get("https://www.spicejet.com/SeatPlusMealComboOffer.aspx");
   Thread.sleep(5000);
   Dimension d = new Dimension(600,900);
   driver.manage().window().setSize(d);
   driver.manage().window().maximize();
   Point p1= new Point(300,500);
   driver.manage().window().setPosition(p1);
}
}