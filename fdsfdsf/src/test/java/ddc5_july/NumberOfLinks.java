package ddc5_july;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NumberOfLinks {
	WebDriver driver;
  @Test
  public void f() {
	  driver = Driver987.getDriver("chrome");
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	List<WebElement> MyEl =   driver.findElements(By.tagName("a"));  //  links tag name is a
	int T_links = MyEl.size();  // size for count
	System.out.println("The total links in the page are : "+T_links); 
	
	for(int i=0; i<T_links-1;i++)
	{
		String D_link =MyEl.get(i).getText();
		System.out.println("The "+i+"st link is: "+D_link);
	
  }
	driver.close();
}
}