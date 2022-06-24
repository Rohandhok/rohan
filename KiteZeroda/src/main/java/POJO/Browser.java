package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver openBrowser() {
		
//		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();//class of Selenium
//		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://kite.zerodha.com/");
		
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		return driver;
	}

}

