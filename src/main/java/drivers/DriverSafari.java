package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import common.ConfigProp;



public class DriverSafari extends Driver {
	
	@Override
	public void instanceDriver(){
		
		driver = new SafariDriver();
		// return driver;
	}

	@Override
	public void freeDriver() {
		driver.quit();
	}

	@Override
	public WebDriver returnDriver() {
		return driver;
	}

}
