package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {
	
	static WebDriver driver;
	

	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sirupokharel/selenium/pomProject/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
		
		public static void TearDown() {
		driver.close();
		driver.quit();
			
		
		
		
	}
	
	
	
	
	

}
