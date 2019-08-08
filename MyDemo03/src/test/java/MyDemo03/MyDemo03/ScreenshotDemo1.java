package MyDemo03.MyDemo03;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScreenshotDemo1 {
	
	WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
	  driver= Drivers456.getDriver("chrome");
	  driver.get("http://newtours.demoaut.com/");
	  String Str1 =driver.getTitle();
	  System.out.println(Str1);
	  driver.findElement(By.name("login")).click();
	  Thread.sleep(10000);
	  File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Saving the screenshot file
	  FileHandler.copy(file, new File("C:\\Users\\srinivas.godari\\Pune_CW\\Srini.jpg"));
  }
}
