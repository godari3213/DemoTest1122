package demos0327;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch901 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Srinivas;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
		Srinivas = new ChromeDriver();
//		Srinivas.get("http://www.google.com");
		Srinivas.navigate().to("http://www.google.com");
		Thread.sleep(5000);
		Srinivas.close();
//		Srinivas.quit();
	}
	

}
