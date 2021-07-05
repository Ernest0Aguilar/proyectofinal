package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Random;

import pages.Addresses;
import pages.FillData;
import pages.HomePage;
import pages.MyAccount;
import pages.OrderConfirmation;
import pages.OrderSummary;
import pages.PaymentCheckOut;
import pages.ProductDetails;
import pages.Shipping;
import pages.ShoppingCartSummary;
import pages.loginPage;

public class Test1 {

	Random rad = new Random();

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

	// ----------------------------GO TO LOGIN PAGE---------------------------------//

	@Test(priority = 1)
	public void clickSignIn() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		mainpage.clickSignIn();
	}

	// ----------------------------FILL MAIL TO CREATE NEW ACCOUNT---------------------------------//

	@Test(priority = 2)
	public void fillCreateMail() throws InterruptedException {
		loginPage authPage = PageFactory.initElements(driver, loginPage.class);
		// CreateAccountPage createAccPage = PageFactory.initElements(driver,
		// CreateAccountPage.class);
		Thread.sleep(4000);
		for (int j = 1; j <= 1; j++) {
			authPage.createAccount("correo" + rad.nextInt(100) + "@gmail.com");
		}
	}

	// ----------------------------FILL REGISTER DATA---------------------------------//

	@Test(priority = 3)
	public void fillRegisterData() throws InterruptedException {
		FillData FillPage = PageFactory.initElements(driver, FillData.class);
		// CreateAccountPage createAccPage = PageFactory.initElements(driver,
		// CreateAccountPage.class);
		Thread.sleep(4000);
		FillPage.registerData("Test", "Apellido", "Dev2021!", "20", "April", "2010", "Address First", "AddressLast",
				"Address", "City Test", "Hawaii", "00000", "United States", "0123456789");
	}

	// ----------------------------SEARCH A PRODUCT---------------------------------//

	@Test(priority = 4)
	public void search() throws InterruptedException {
		MyAccount makeasearch = PageFactory.initElements(driver, MyAccount.class);
		Thread.sleep(4000);
		makeasearch.makeASearch("T-Shirts");
		makeasearch.clickOnImage();
	}

	// ----------------------------ADD PRODUCT TO SHOPPING CART---------------------------------//

	@Test(priority = 5)
	public void colorSelection() throws InterruptedException {
		ProductDetails seleccionar = PageFactory.initElements(driver, ProductDetails.class);
		Thread.sleep(4000);
		seleccionar.addToCart();
	}

	// ----------------------------PROCEED TO CHECKOUT---------------------------------//

	@Test(priority = 6)
	public void continuarSelection() throws InterruptedException {
		ProductDetails seleccionar = PageFactory.initElements(driver, ProductDetails.class);
		Thread.sleep(4000);
		// selection.clickOnColor();
		seleccionar.continuar();
	}

	// -------------------------------------------------------------//

	@Test(priority = 7)
	public void proceedToCheckOut() throws InterruptedException {
		ShoppingCartSummary checkOut = PageFactory.initElements(driver, ShoppingCartSummary.class);
		Thread.sleep(4000);
		checkOut.proceedCheckout();
	}

	// -------------------------------------------------------------//

	@Test(priority = 8)
	public void addressesCheckOut() throws InterruptedException {
		Addresses checkOut = PageFactory.initElements(driver, Addresses.class);
		Thread.sleep(4000);
		checkOut.proceedToCheckout();

	}

	// -------------------------------------------------------------//

	@Test(priority = 8)
	public void shippingCheckOut() throws InterruptedException {
		Shipping checkOut = PageFactory.initElements(driver, Shipping.class);
		Thread.sleep(4000);
		checkOut.proceedToCheckout();

	}

	// -------------------------------------------------------------//

	@Test(priority = 9)
	public void choosePaymentMethod() throws InterruptedException {
		PaymentCheckOut method = PageFactory.initElements(driver, PaymentCheckOut.class);
		Thread.sleep(4000);
		method.selectPaymentMethod();

	}

	// -------------------------------------------------------------//

	@Test(priority = 10)
	public void confirmOrder() throws InterruptedException {
		OrderSummary confirm = PageFactory.initElements(driver, OrderSummary.class);
		Thread.sleep(4000);
		confirm.confirmOrder();

	}

	// -------------------------------------------------------------//

	@Test(priority = 11)
	public void returnToOrders() throws InterruptedException {
		OrderConfirmation confirm = PageFactory.initElements(driver, OrderConfirmation.class);
		Thread.sleep(4000);
		confirm.confirmOrder();

	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
