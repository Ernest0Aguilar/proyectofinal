package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ConfirmOrder.ChooseProduct;
import ConfirmOrder.Login;
import ConfirmOrder.Logout;
import pages.HomePage;

public class TestConfirmOrder {
	WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//f.gabriel.escareno//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	//Click on the top right corner sign in button
	@Test (priority = 1)
	public void clickSignIn() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		mainpage.clickSignIn();
		Thread.sleep(2000);
	}
	
	@Test (priority = 2)
	public void login() throws InterruptedException{
		Login login = PageFactory.initElements(driver, Login.class);
		login.signInToAccount("correo7851544687@gmail.com", "Dev2021!");
		Thread.sleep(2000);
	}
	
	@Test (priority = 3)
	public void ProductChosen() throws InterruptedException {
		ChooseProduct product = PageFactory.initElements(driver, ChooseProduct.class);
		product.shirtTab();
		Thread.sleep(2000);
		product.chooseShirt();
		Thread.sleep(2000);
		product.addProduct();
		Thread.sleep(2000);
		product.proceedToCheckout();
		Thread.sleep(2000);
		product.proceedToCheckout2();
		Thread.sleep(2000);
		product.proceedToCheckout3();
		Thread.sleep(2000);
		product.proceedToCheckout4();
		Thread.sleep(2000);
		product.payingMethod();
		Thread.sleep(2000);
		product.ConfirmOrder();
		Thread.sleep(2000);
	}
	
	@Test (priority = 4)
	public void LogOutFromPage() throws InterruptedException {
		Logout logout = PageFactory.initElements(driver, Logout.class);
		logout.logoutPage();
		Thread.sleep(3000);
	}
	
	@AfterTest
    public void endSession() {
    driver.quit();
    }
}
