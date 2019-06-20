package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import common.ConfigProp;
import junit.framework.Assert;
import webObjects.Header;


public class SearchPage extends WebPage{
	
public SearchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		header = new Header(driver);

	}
final Logger LOGGER = LoggerFactory.getLogger(SearchPage.class);
Header header;


private  By messageSearchValidation= By.xpath("//h4[contains(text(),'A few suggestions')]");


	public void validateMessageValidationIsDisplayed() {
		Assert.assertTrue(seleniumUtils.existElement(messageSearchValidation));
		
	}
	public void validateMessageValidationIsNotDisplayed() {
		Assert.assertTrue(!seleniumUtils.existElement(messageSearchValidation));
		
	}
	
	public Header getHeader(){
		return header;
	}
	

}
