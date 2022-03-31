package SpendNSaveTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pageObjects.SignUpPageObjects;

public class SignUpTests {

	SignUpPageObjects s = new SignUpPageObjects();
	WebDriver driver = s.getDriver();
	
	
	@Test
	public void redirectToSignUp() throws InterruptedException {
		
		s.clickGetStarted().click();
		Assert.assertTrue(s.signUpAlertVisible().isDisplayed());
		
		//Use properties file for this
		s.enterAlertEmail().sendKeys("christisoncorey@yahoo.com");
		
		s.clickSignUpBtn().click();
		Thread.sleep(5000);
		Assert.assertEquals(s.signUpPageURL(), driver.getCurrentUrl());
		
	}
	

	
}
