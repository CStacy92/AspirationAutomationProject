package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects extends BaseObjects{
	
	String signUpPage = "https://my.aspiration.com/register/smart-sign-up/S0UKHBZ7S7Y1A";
	By alertEmail = By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[1]/div/input");
	
	public WebElement enterAlertEmail() {
		return driver.findElement(alertEmail);
	}
	
	public String signUpPageURL() {
		return signUpPage;
	}

}
