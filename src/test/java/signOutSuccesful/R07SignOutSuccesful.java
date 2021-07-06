package signOutSuccesful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MyAccount;

public class R07SignOutSuccesful {

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
	
	// ---------- FILL ACCES INFORMATION ---------- //

	@Test (priority = 1)
	public void FillEmailPass() throws InterruptedException {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.openSignIn();
		login.SignIn("badunny@gmail.com", "1234567");
	}
	
	// ---------- MY ACCOUNT PAGE SIGNOUT ---------- //
	
	@Test (priority = 2)
	public void Sout() throws InterruptedException {
		MyAccount acc = PageFactory.initElements(driver, MyAccount.class);
		acc.SignO();
	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}

}
