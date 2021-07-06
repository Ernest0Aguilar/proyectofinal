package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
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
		System.setProperty("webdriver.chrome.driver",
				"C://Users//ernesto.aguilar//Documents//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}

	// Click on the top right corner sign in button
	@Test(priority = 1)
	public void clickSignIn() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		mainpage.clickSignIn();
	}

	@Test(priority = 2)
	public void login() throws InterruptedException {
		Login login = PageFactory.initElements(driver, Login.class);
		login.signInToAccount("correo7851544687@gmail.com", "Dev2021!");
	}

	@Test(priority = 3)
	public void ProductChosen() throws InterruptedException {
		ChooseProduct product = PageFactory.initElements(driver, ChooseProduct.class);
		product.shirtTab();
		product.chooseShirt();
		product.addProduct();
		product.proceedToCheckout();
		product.proceedToCheckout2();
		product.proceedToCheckout3();
		product.proceedToCheckout4();
		product.payingMethod();
		product.ConfirmOrder();
	}

	@Test(priority = 4)
	public void LogOutFromPage() throws InterruptedException {
		Logout logout = PageFactory.initElements(driver, Logout.class);
		logout.logoutPage();
	}

	//@AfterTest
	//public void endSession() {
	//	driver.quit();
	//}
}
