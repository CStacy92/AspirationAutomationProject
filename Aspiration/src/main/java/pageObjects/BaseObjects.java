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
	By spendNSave = By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[1]/a");
	By credit = By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[2]/a");
	By enterprise = By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[3]/a");
	By whoWeAre = By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[4]/a");
	By impact = By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[5]/a");
	By getStartedBtn = By.xpath("//*[@id=\"__next\"]/div/header/ul[2]/li[2]/button");
	By signInBtn = By.xpath("//*[@id=\"__next\"]/div/header/ul[2]/li[1]/a");
	
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
