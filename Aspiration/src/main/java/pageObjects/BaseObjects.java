package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseObjects {
	WebDriver driver;

	By logo = By.xpath("//*[@id=\"__next\"]/div/header/div[1]/a/svg");
	
	//Header menu icon and contents
	By menuIcon = By.xpath("//*[@id=\"__next\"]/div/header/ul[3]/li/svg");
	By spendNSave = By.xpath("/html/body/div[5]/div/div/div/div[1]/div[2]/a");
	By credit = By.xpath("/html/body/div[5]/div/div/div/div[1]/div[3]/a");
	By enterprise = By.xpath("");
	By whoWeAre = By.xpath("");
	By impact = By.xpath("");
	By getStartedBtn = By.xpath("/html/body/div[5]/div/div/div/div[2]/button");
	By signInBtn = By.xpath("/html/body/div[5]/div/div/div/div[2]/a");
	
	public WebElement clicklogo() {
		return driver.findElement(logo);
	}
	
	public WebElement clickspendNSave() {
		return driver.findElement(spendNSave);
	}
	

	//move to properties file 
	public void initialize() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\catni\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.aspiration.com");
	}
}
