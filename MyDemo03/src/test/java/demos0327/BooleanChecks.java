package demos0327;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;

public class BooleanChecks {
	
	WebDriver driver;
  @Test
  public void f() {
	  driver= Drivers456.getDriver("chrome");
	  driver.get("http://www.newtours.demoaut.com");
	  WebElement El1= driver.findElement(By.name("login"));
//	  El1.isDisplayed();
//	  El1.isSelected();   //check boxes
//	  El1.isEnabled();  // 
//	  
//	  driver.navigate().to("");
//	  
	  List<WebElement> T_Links= driver.findElements(By.tagName("a"));
	  System.out.println(T_Links.size());   //size
      System.out.println(T_Links.get(0).getText()); // for frst link text
	  
	  for (int i=0; i<T_Links.size();i++)
	  {
		  System.out.println(T_Links.get(i).getText());
	  }
	  
//	  driver.findElements(By.xpath("//a[contains,@text ='dasdas'))
	 
	  
	  
	  
	  
  }
}
