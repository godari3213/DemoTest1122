package MyDemo03.MyDemo03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch111  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver Srinivas;
System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");

Srinivas = new ChromeDriver();
//	driver=Drivers100.getDriver("chrome");	
Srinivas.get("http://newtours.demoaut.com/");
//Srinivas.navigate().to("http://www.google.com");
Thread.sleep(5000);
Srinivas.close();
//
//System.setProperty("webdriver.gecko.driver","C:\\Drivers\\Drivers\\geckodriver.exe");
//
//Srinivas = new FirefoxDriver();
//Srinivas.get("http://newtours.demoaut.com/");
////Srinivas.navigate().to("http://www.google.com");
//Thread.sleep(5000);
//Srinivas.close();
////Srinivas.quit();

System.setProperty("webdriver.ie.driver","C:\\Drivers\\Drivers\\IEDriverServer.exe");

Srinivas = new InternetExplorerDriver();
Srinivas.get("http://www.google.com");
//Srinivas.navigate().to("http://www.google.com");
Thread.sleep(5000);
Srinivas.close();
	}

}
