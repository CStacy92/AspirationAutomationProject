package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SpendNSaveObjects extends BaseObjects{

	String productPage = "https://www.aspiration.com/spendandsave";
	By aspirationPlanLabel = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[1]/div[1]");
	By aspPlusPlanLabel = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[1]");
	By aspLabelPricing = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[1]/div[2]");
	By aspPlusLabelPricing = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[2]");

	public String productPageURL() {
		return productPage;
	}
	public WebElement aspPlusLabelPricingText() {
		return driver.findElement(aspPlusLabelPricing);
	}
	
	public WebElement aspLabelPricingText() {
		return driver.findElement(aspLabelPricing);
	}
	
	public WebElement aspirationPlanText() {
		return driver.findElement(aspirationPlanLabel);
	}
	
	public WebElement aspPlusPlanText() {
		return driver.findElement(aspPlusPlanLabel);
	}
	

}
