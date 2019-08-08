package MyDemo03.MyDemo03;

import org.testng.annotations.Test;

import javax.swing.text.Position;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Launch116 {
WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void Login(String U, String P) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
//	  Dimension d = new Dimension(300,500);
	
//     driver.manage().window().setPosition(d);
	     WebElement UName =  driver.findElement(By.name("userName"));
		 WebElement Pswrd = driver.findElement(By.name("password"));
		 driver.manage().window().maximize();
		
		 UName.sendKeys(U);
		 Pswrd.sendKeys(P); 
		 Thread.sleep(2000);
		 WebElement SubmitButton = driver.findElement(By.name("login"));
		 SubmitButton.click();
		 Thread.sleep(5000);
		String Tname= driver.getTitle();
		System.out.println(Tname);
//		if (Tname.equals("adsadas"))
//			System.out.println("login success");
//		else
//			System.out.println("login Failure as user creds are wrong");
		Assert.assertEquals("Find a Flight: Mercury Tours:", Tname);
		 driver.close();	
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "demo", "demo" },
      new Object[] { "mercury", "mercury" },
    };
  }
}
