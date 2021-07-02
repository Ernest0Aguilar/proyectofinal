package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FillData;
import pages.HomePage;
import pages.loginPage;


public class Test1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//ernesto.aguilar//Documents//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void clickSignIn() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		mainpage.clickSignIn();
	}
	
	@Test
	public void fillCreateMail() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		loginPage authPage = PageFactory.initElements(driver, loginPage.class);
		//CreateAccountPage createAccPage = PageFactory.initElements(driver, CreateAccountPage.class);
		Thread.sleep(5000);
		authPage.createAccount("correo678986@gmail.com");
	}
	
	@Test
	public void fillRegisterData() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		loginPage authPage = PageFactory.initElements(driver, loginPage.class);
		FillData FillPage = PageFactory.initElements(driver, FillData.class);
		//CreateAccountPage createAccPage = PageFactory.initElements(driver, CreateAccountPage.class);
		Thread.sleep(5000);
		FillPage.registerData("Test", "Apellido", "Dev2021!", "20", "April", "2010", "Address First", "AddressLast", "Address",
				"City Test", "Hawaii", "00000", "United States", "0123456789");
	}
	

}
