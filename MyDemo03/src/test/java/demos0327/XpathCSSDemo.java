package demos0327;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import MyDemo03.MyDemo03.Drivers456;

public class XpathCSSDemo {
	WebDriver driver;
	//xpath:  Absolute  (html) ---& realtive --(refernce tag)
	// IE not having xpath engine
	 // abs ex/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input
 ///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]
	@Test
  public void f() {
		driver= Drivers456.getDriver("chrome");
		driver.get("http://www.newtours.demoaut.com");
		//With Attribute
//		driver.findElement(By.xpath("//tagname[@atr1='val1'][@atr2='val2']"));
//		//Xpath starting with abcddd
//		driver.findElement(By.xpath("//tagname[starts-with(@atr1,'val3')]"));
//		//Xpath Ending with abcddd
//		driver.findElement(By.xpath("//tagname[ends-with(@atr1,'val3')]"));
//		//Xpath Contains
//		driver.findElement(By.xpath("//tagname[contains(text(),'val4')]"));
//		//Xpath Exact Match with text
//		driver.findElement(By.xpath("//tagname[@id='val4']"));
//		driver.findElement(By.xpath("//tagname[text()='val4']"));
//		
////		CSS:
//			
//		    //id
//			Java Syntax : WebElement uid=driver.findElement(By.cssSelector(“input#policy_no”));
//	
//			//classname
//		Java Syntax : WebElement uid=driver.findElement(By.cssSelector(“input.policy”));
//
//			//atrbts
//		Java Syntax : WebElement logo=driver.findElement(By.cssSelector(“img[alt=‘hplogo’]”));
//
 }
//	
}
