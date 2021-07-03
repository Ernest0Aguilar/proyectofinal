package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FillData;
import pages.HomePage;
import pages.MyAccount;
import pages.ProductDetails;
import pages.loginPage;


public class Test1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//ernesto.aguilar//Documents//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(8000);
	}
	
	//----------------------------GO TO LOGIN PAGE---------------------------------//
	
	@Test (priority = 1) 
	public void clickSignIn() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		mainpage.clickSignIn();
	}
	

	//----------------------------FILL MAIL TO CREATE NEW ACCOUNT---------------------------------//
	
	@Test (priority = 2) 
	public void fillCreateMail() throws InterruptedException {
		loginPage authPage = PageFactory.initElements(driver, loginPage.class);
		//CreateAccountPage createAccPage = PageFactory.initElements(driver, CreateAccountPage.class);
		Thread.sleep(6000);
		authPage.createAccount("coeo7851544687@gmail.com");
	}
	
	@Test (priority = 3)
	public void fillRegisterData() throws InterruptedException {
		FillData FillPage = PageFactory.initElements(driver, FillData.class);
		//CreateAccountPage createAccPage = PageFactory.initElements(driver, CreateAccountPage.class);
		Thread.sleep(6000);
		FillPage.registerData("Test", "Apellido", "Dev2021!", "20", "April", "2010", "Address First", "AddressLast", "Address",
				"City Test", "Hawaii", "00000", "United States", "0123456789");
	}
	
	@Test (priority = 4)
	public void search() throws InterruptedException {
		MyAccount makeasearch = PageFactory.initElements(driver, MyAccount.class);
		Thread.sleep(6000);
		makeasearch.makeASearch("T-Shirts");
		makeasearch.clickOnImage();
	}
	
	@Test (priority = 5)
	public void colorSelection() throws InterruptedException {
		ProductDetails seleccionar = PageFactory.initElements(driver, ProductDetails.class);
		Thread.sleep(6000);
		//selection.clickOnColor();
		seleccionar.addToCart();
	}
	
	@Test (priority = 6)
	public void continuarSelection() throws InterruptedException {
		ProductDetails seleccionar = PageFactory.initElements(driver, ProductDetails.class);
		Thread.sleep(6000);
		//selection.clickOnColor();
		seleccionar.continuar();
	}
	
	//@AfterMethod(alwaysRun = true)
    //public void afterTest() {
    //WebDriverSteps.closeTheBrowser();
    //WebDriverSession.getWebDriverSession().quit();
    //map.clear();
    
    @AfterTest
    public void endSession() {
    driver.quit();
    }
}
