package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import common.ConfigProp;
import webObjects.Header;


public class HomePage extends WebPage{
	
public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);



/* ## Web Elements ##*/
private  By search= By.id("search-button");
private  By searchInput= By.id("search-input-field");
private  By submitSearch= By.id("submit-button");





/* ## Methods ##*/

	public void search(String searchValue){
		seleniumUtils.click(search);
		seleniumUtils.setText(searchInput, searchValue);
		seleniumUtils.click(submitSearch);
	}

}
