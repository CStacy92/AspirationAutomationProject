package SpendNSaveTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import pageObjects.BaseObjects;
import pageObjects.SpendNSaveObjects;

public class ProductVisibility {

	SpendNSaveObjects sns = new SpendNSaveObjects();
	WebDriver driver = sns.getDriver();

	@Test
	public void isProductPage() {
		sns.clickspendNSave().click();
		Assert.assertTrue(driver.getCurrentUrl().equals(sns.productPageURL()));
		sns.closeDriver();
	}
	
	@Test
	public void productVisibility() throws InterruptedException {
		sns.clickspendNSave().click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView(true);",sns.aspirationPlanText());
		
		//verify aspiration plan and pricing label
		Assert.assertTrue(sns.aspirationPlanText().getText().equalsIgnoreCase("Aspiration"));
		Assert.assertTrue(sns.aspLabelPricingText().getText().equalsIgnoreCase("Pay What Is Fair\n"
				+ "even if it’s $0"));
		
		//verify aspiration plus and pricing label
		Assert.assertTrue(sns.aspPlusPlanText().getText().equalsIgnoreCase("Aspiration Plus"));
		Assert.assertTrue(sns.aspPlusLabelPricingText().getText().equalsIgnoreCase("$7.99/mo\n"
				+ "$5.99/mo if you pay annually"));
		
		sns.closeDriver();
		
		
	}
	
}
