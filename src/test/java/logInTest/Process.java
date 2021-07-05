package logInTest;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Process {
	
	WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//a.garcia.barrios//Desktop//Accenture//Selenium//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	//Fill Access Information
	@Test
	public void FillEmailPass() throws InterruptedException{
		logInTest login = PageFactory.initElements(driver, logInTest.class);
		AccessInf acces = PageFactory.initElements(driver, AccessInf.class);
		
		login.openSignIn();
		acces.Account("badunny@gmail.com");
		acces.Pass("1234567");
		acces.clickSign();
		Thread.sleep(4000);
	}
	@Test
	//My Account Page SignOut
	public void Sout() throws InterruptedException{
		MyAccount acc = PageFactory.initElements(driver, MyAccount.class);
		acc.SignO();
	}
	
    @AfterTest
    public void endSession() {
    driver.quit();
    }
	

}
