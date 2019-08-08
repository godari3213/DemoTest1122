package MyDemo03.MyDemo03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers100 {

	public static WebDriver getDriver(String brw)
	{
if (brw.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe\\");
return new ChromeDriver();
	}

	else if (brw.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\chromedriver.exe\\");
	return new ChromeDriver();
	}
	else if (brw.equals("ff"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\chromedriver.exe\\");
	return new ChromeDriver();
	}
	else 
	{
	return null;
	}
}

}