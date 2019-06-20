package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import common.ConfigProp;
import drivers.DriverFactory;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.SearchPage;

public class CoreTest {
	final Logger LOGGER = LoggerFactory.getLogger(CoreTest.class);
	WebDriver driver;
	DriverFactory driverFactory;
	AuthenticationPage authenthicate;
	SearchPage searchPage;
	HomePage home;
	
	@BeforeTest
	public void setup() throws IOException{
	driverFactory= new DriverFactory();
	driverFactory.getDriver(ConfigProp.getBrowser());
	driver= driverFactory.driver();	
	authenthicate = new AuthenticationPage(driver);
	searchPage = new SearchPage(driver);
	home = new HomePage(driver);
	LOGGER.info("@BeforeTest- Setup");
	}
	
	@AfterTest
	public void tearDown(){
		driverFactory.tearDown();
		LOGGER.info("@AfterTest- tearDown");
	}
}
