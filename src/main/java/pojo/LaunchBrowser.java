package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static WebDriver chrome(String url)
	{
		//System.setProperty("webdriver.chrome.driver", "F:\\Arise Java\\jar files\\chromedriver-win64\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;

}
}