package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Driver {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {

		if (driver == null) {
			
			driver = new ChromeDriver();
			
		}
		return driver;
	}
	public static void terminar() {
		if(driver != null) {
		driver.quit();
		driver = null;
	}
}
}
