package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseObjects {
	static WebDriver driver;

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
	
	//sign up alert contents
	By signUpAlert = By.xpath("/html/body/div[4]/div/div");
	By emailBox = By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[1]/div/input");
	By signUpBtn = By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[2]/button");
	
	public WebElement clickSignUpBtn() {
		return driver.findElement(signUpBtn);
	}
	
	public WebElement enterEmail() {
		return driver.findElement(emailBox);
	}
	
	public WebElement signUpAlertVisible() {
		return driver.findElement(signUpAlert);
	}
	
	public WebElement clickGetStarted() {
		return driver.findElement(getStartedBtn);
	}
	
	public WebElement clicklogo() {
		return driver.findElement(logo);
	}
	
	public WebElement clickspendNSave() {
		return driver.findElement(spendNSave);
	}
	

	//move to properties file 
	public static void initialize() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\catni\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.aspiration.com");
		driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() {
		initialize();
		return driver;
	}
	
	public void closeDriver() {
		driver.close();
	}
}
