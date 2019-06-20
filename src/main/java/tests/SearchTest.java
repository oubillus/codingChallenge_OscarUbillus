package tests;
import org.testng.annotations.Test;


public class SearchTest extends CoreTest{
	public SearchTest(){
		super();
	}
	
	@Test(priority=1)
	public void testvalidateMessageErrorIsnotDsiplayed(){
		authenthicate.authenticatePage().search("NFL");
		searchPage.validateMessageValidationIsNotDisplayed();
	}
	
	@Test(priority=1)
	public void testvalidateMessageErrorIsDsiplayed(){
		authenthicate.authenticatePage().search("NFLFake");
		searchPage.validateMessageValidationIsDisplayed();
	}

}
