package spendNSaveTests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.JavascriptExecutor;


import pageObjects.SpendNSave;

public class ProductTests {

	SpendNSave s = new SpendNSave();
	JavascriptExecutor js;
	
	
	@Before
	public void initialize() throws IOException {
		s.initialize();
		js = (JavascriptExecutor) s.driver;
	}
	
	
	//verify page returned after clicking spend and save is product page
	@Test
	public void isProductPage() {
		s.clickSpendNSave().click();
		Assert.assertEquals(s.driver.getCurrentUrl(), s.productPage());
		s.driver.close();
	}
	
	//verify plans and costs
	@Test
	public void cardProducts() throws InterruptedException {
		s.clickSpendNSave().click();
		Thread.sleep(5000);
		Assert.assertEquals(s.aspirationPlan().getText().toLowerCase(), "aspiration");
		
		Assert.assertEquals(s.aspirationPlus().getText().toLowerCase(), "aspiration plus");
		Assert.assertEquals(s.annualPlusPrice().getText(), "$5.99/mo if you pay annually");
		Assert.assertEquals(s.plusMonthlyPricing().getText(), "$7.99/mo");
		s.driver.close();
	}
	
	//Ensure aspiration plan check boxes are unselected
	@Test
	public void emptyCheckBoxes() throws InterruptedException {
		s.clickSpendNSave().click();
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true);",s.personalImpactRow());
		
		Assert.assertEquals(s.offsetCheck().getAttribute("src"), null);
		Assert.assertEquals(s.atmReimbursementCheck().getAttribute("src"), null);
		Assert.assertEquals(s.purchaseCheck().getAttribute("src"), null);
		s.driver.close();
	}
	

}
