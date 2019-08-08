package DivyaTR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anupriya {
WebDriver driver;

public void launching()
{

System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://10.243.204.12:8083/TestMeApp");
}
}