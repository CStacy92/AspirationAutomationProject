package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SpendNSaveObjects extends BaseObjects{

	By slogan = By.xpath("//*[@id=\"__next\"]/div/section[1]/div/div[1]/h1");
	By spendSustHeading = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/h2");
	By saveMoneyHeading = By.xpath("//*[@id=\"__next\"]/div/section[3]/div[2]/div[1]/h2");
	By plansHeading = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/h2");
	By apyItem = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[1]");
	By cashBackItem = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[2]");
	By aspirationPlan = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[1]");
	By aspPlusPlan = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]");
	
	public WebElement aspirationPlanText() {
		return driver.findElement(aspirationPlan);
	}
	
	public WebElement aspPlusPlanText() {
		return driver.findElement(aspPlusPlan);
	}
	
	public WebElement plansHeading() {
		return driver.findElement(plansHeading);
	}
}
