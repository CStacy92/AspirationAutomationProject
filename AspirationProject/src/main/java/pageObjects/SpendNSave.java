package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SpendNSave extends Base{

	String productPageURL = "https://www.aspiration.com/spendandsave";
	
	By plans = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]");
	
	By aspPlanLabel = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[1]/div[1]");
	By aspPricing = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[1]/div[2]");
	
	By aspPlusLabel = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[1]");
	By aspPlusAnnual = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[2]/p[2]");
	By aspPlusMonthly = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[2]/p[1]");
	
	//should be null if no check
	By personalImpactRow = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[8]");
	By offsetCheck = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[9]/div[1]/div[2]");
	By atmReimburseCheck = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[10]/div[1]/div[2]");
	By purchaseCheck = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[11]/div[1]/div[2]");
	
	public WebElement annualPlusPrice() {
		return driver.findElement(aspPlusAnnual);
	}
	
	public WebElement plans() {
		return driver.findElement(plans);
	}
	
	public WebElement personalImpactRow() {
		return driver.findElement(personalImpactRow);
	}
	
	public WebElement purchaseCheck() {
		return driver.findElement(purchaseCheck);
	}
	
	public WebElement atmReimbursementCheck() {
		return driver.findElement(atmReimburseCheck);
	}
	
	public WebElement offsetCheck() {
		return driver.findElement(offsetCheck);
	}
	
	public String productPage() {
		return productPageURL;
	}
	
	public WebElement aspirationPlan() {
		return driver.findElement(aspPlanLabel);
	}
	
	public WebElement aspirationPricing() {
		return driver.findElement(aspPricing);
	}
	
	public WebElement aspirationPlus() {
		return driver.findElement(aspPlusLabel);
	}
	
	public WebElement plusAnnualPricing() {
		return driver.findElement(aspPlusAnnual);
	}
	
	public WebElement plusMonthlyPricing() {
		return driver.findElement(aspPlusMonthly);
	}

}
