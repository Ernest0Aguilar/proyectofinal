package testCreateNewUser;

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
import pages.loginPage;

public class CreateNewUser {
	WebDriver driver;

	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\o.tavares.cordova\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	// --- GO TO LOGIN PAGE ---//
	@Test(priority = 1)
	public void clickSignIn() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		mainpage.clickSignIn();
	}

	// --- GO TO AUTHENTICATION PAGE ---//
	@Test(priority = 2)
	public void fillCreateMail() throws InterruptedException {
		loginPage authPage = PageFactory.initElements(driver, loginPage.class);
		Thread.sleep(2000);
		authPage.createAccount("jw@personalmail.com");
	}

	// --- FILL REGISTER DATA ---//
	@Test(priority = 3)
	public void fillRegisterData() throws InterruptedException {
		FillData FillPage = PageFactory.initElements(driver, FillData.class);
		Thread.sleep(4000);
		FillPage.registerData("Jacobo", "Wong", "YouTuber", "20", "April", "2010", "Address First", "AddressLast",
				"Address", "City Test", "Hawaii", "00000", "United States", "0123456789");
	}

	// --- LOG OUT ---//
	public void Sout() throws InterruptedException {
		MyAccount acc = PageFactory.initElements(driver, MyAccount.class);
		acc.SignO();
	}

	@AfterTest
	public void endSession() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
