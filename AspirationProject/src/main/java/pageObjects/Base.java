package pageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	Properties config = new Properties();
	FileInputStream in;

	//Header objects
	By logo = By.xpath("//*[@id=\"__next\"]/div/header/div[1]/a");
	By spendNSave = By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[1]/a");
	By getStartedBtn = By.xpath("//*[@id=\"__next\"]/div/header/ul[2]/li[2]/button");
	
	//Get started alert objects
	By alertEmailBox = By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[1]/div/input");
	By alertBtn = By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[2]/button");
	
	public WebElement clickAlertBtn() {
		return driver.findElement(alertBtn);
	}
	
	public WebElement enterAlertEmail() {
		return driver.findElement(alertEmailBox);
	}
	
	public WebElement clickGetStarted() {
		return driver.findElement(getStartedBtn);
	}
	
	public WebElement clickSpendNSave() {
		return driver.findElement(spendNSave);
	}
	
	public WebElement clickLogo() {
		return driver.findElement(logo);
	}
	

	public void properties() throws IOException {
		try {
			in = new FileInputStream("C:\\Users\\catni\\AspirationAutomationProject\\AspirationProject\\config\\config.properties");
			config.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String email() throws IOException {
		properties();
		return config.getProperty("email");
	}
	
	
	public void initialize() throws IOException {
		properties();
		System.setProperty("webdriver.chrome.driver",
				config.getProperty("path"));
		driver = new ChromeDriver();
		driver.get(config.getProperty("homePage"));
		driver.manage().window().maximize();
	}
}
