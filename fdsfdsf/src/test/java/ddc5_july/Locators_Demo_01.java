package ddc5_july;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Locators_Demo_01 {

	public static void main(String[] args) {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Iksha");
		driver.findElement(By.name("lastName")).sendKeys("Omar");
		driver.findElement(By.name("phone")).sendKeys("885145");
		driver.findElement(By.id("userName")).sendKeys("iksha.omar@acc.com");
		driver.findElement(By.name("address1")).sendKeys("address");
		driver.findElement(By.name("city")).sendKeys("Kanpur");
		driver.findElement(By.name("state")).sendKeys("UP");
		driver.findElement(By.name("postalCode")).sendKeys("5254");
//		driver.findElement(By.name("country")).
		Select sel1 = new Select(driver.findElement(By.name("country")));
//		sel1.selectByIndex(1);
//		sel1.selectByValue("7");	
		sel1.selectByVisibleText("AMERICAN SAMOA");
		driver.findElement(By.name("email")).sendKeys("abc.fgh@ghi.com");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("1234");
		
		driver.findElement(By.name("register")).click();
		String e_title = "Register: Mercury Tours";
		String a_title = driver.getTitle();
//		if (e_title.equals(a_title))			
//		{
//			System.out.println("Login Successfully");
//		}
//		else
//		{
//			System.out.println("Oops!! :( Login Failure");
//		}
		
		Assert.assertEquals(e_title, a_title);
		System.out.println("Congratulations!!!!!!");
		
		
		
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
