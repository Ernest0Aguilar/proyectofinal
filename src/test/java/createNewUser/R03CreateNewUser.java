package createNewUser;

import java.util.Random;

//Build path + Jars
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Pages elements
import pages.FillData;
import pages.HomePage;
import pages.MyAccount;
import pages.LoginPage;

public class R03CreateNewUser {
	WebDriver driver;
	Random rad = new Random();

	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//ernesto.aguilar//Documents//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}

	// ---------- GO TO LOGIN PAGE ---------- //
	
	@Test(priority = 1)
	public void clickSignIn() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		mainpage.clickSignIn();
	}

	// ---------- FILL NEW MAIL AND GO TO FILL DATA PAGE ---------- //
	
	@Test(priority = 2)
	public void fillCreateMail() throws InterruptedException {
		LoginPage authPage = PageFactory.initElements(driver, LoginPage.class);
		for (int j = 1; j <= 1; j++) {
			authPage.createAccount("email" + rad.nextInt(10000) + "@gmail.com");
		}
	}

	// ---------- FILL DATA OF NEW USER ---------- //
	
	@Test(priority = 3)
	public void fillRegisterData() throws InterruptedException {
		FillData FillPage = PageFactory.initElements(driver, FillData.class);
		FillPage.registerData("Jacobo", "Wong", "YouTuber", "20", "April", "2010", "Address First", "AddressLast",
				"Address", "City Test", "Hawaii", "00000", "United States", "0123456789");
	}

	// ---------- LOG OUT ---------- //
	
	@Test(priority = 4)
	public void Sout() throws InterruptedException {
		MyAccount acc = PageFactory.initElements(driver, MyAccount.class);
		acc.SignO();
	}

	@AfterTest
	public void endSession() throws InterruptedException {
		driver.quit();
	}
}
