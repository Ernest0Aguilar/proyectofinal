package logInTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AccessInf;
import pages.MyAccount;
import pages.logInTest;

public class Process {

	WebDriver driver;

	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//ernesto.aguilar//Documents//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}

	// Fill Access Information
	@Test
	public void FillEmailPass() throws InterruptedException {
		logInTest login = PageFactory.initElements(driver, logInTest.class);
		AccessInf acces = PageFactory.initElements(driver, AccessInf.class);
		login.openSignIn();
		acces.Account("badunny@gmail.com");
		acces.Pass("1234567");
		acces.clickSign();
	}

	@Test
	// My Account Page SignOut
	public void Sout() throws InterruptedException {
		MyAccount acc = PageFactory.initElements(driver, MyAccount.class);
		acc.SignO();
	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}

}
