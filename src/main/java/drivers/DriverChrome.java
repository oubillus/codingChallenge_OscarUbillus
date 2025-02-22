package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.ConfigProp;



public class DriverChrome extends Driver {
	
	@Override
	public void instanceDriver(){
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ConfigProp.getChromePath());
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/chromedriver");
		System.out.println(System.getProperty("user.dir")+ "/chromedriver");
		System.out.println(ConfigProp.getChromePath());
		System.out.println(System.getProperty("user.dir"));
		LOGGER.debug("webdriver.chrome.driver,ConfigProp.getChromePath()");
		driver = new ChromeDriver();
		// return driver;
	}

	@Override
	public void freeDriver() {
		driver.quit();
		driver.close();
	}

	@Override
	public WebDriver returnDriver() {
		return driver;
	}

}
