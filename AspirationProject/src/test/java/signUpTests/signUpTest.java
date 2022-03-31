package signUpTests;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import pageObjects.SignUpPage;

public class signUpTest {
	
	SignUpPage s = new SignUpPage();
	JavascriptExecutor js;

	@Before
	public void initialize() throws IOException {
		s.initialize();
		js = (JavascriptExecutor) s.driver;
	}
	
	//verify redirect to sign up page
	@Test
	public void getStarted() throws InterruptedException, IOException {
		s.clickGetStarted().click();
		Thread.sleep(50);
		s.enterAlertEmail().sendKeys(s.email());
		s.clickAlertBtn().click();
		Thread.sleep(5000);
		
		Assert.assertEquals(s.driver.getCurrentUrl(), s.signUpPage());
		s.driver.close();
	}
}
