package SpendNSaveTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import pageObjects.SpendNSaveObjects;

public class ProductVisibility {

	SpendNSaveObjects sns = new SpendNSaveObjects();
	WebDriver driver;

	@Test
	public void productVisibility() throws InterruptedException {
		driver = sns.getDriver();
		sns.clickspendNSave().click();
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView(true);",sns.plansHeading());
		
		sns.closeDriver();
	}
	
}
