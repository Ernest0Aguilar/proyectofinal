package generatePdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Addresses;
import pages.HomePage;
import pages.MyAccount;
import pages.OrderConfirmation;
import pages.OrderHistory;
import pages.OrderSummary;
import pages.PaymentCheckOut;
import pages.Shipping;
import pages.ShoppingCartSummary;
import pages.LoginPage;

public class R12GeneratePdf {

	WebDriver driver;

	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\web_drivers_general\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver",".\\web_drivers_general\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver",".\\web_drivers_general\\msedgedriver.exe");
		//driver = new EdgeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	// ---------- GO TO LOGIN PAGE ---------- //

	@Test(priority = 0)
	public void clickSignIn() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		mainpage.clickSignIn();
	}

	// ---------- SIGN IN ---------- //

	@Test(priority = 1)
	public void SignIn() throws InterruptedException {
		LoginPage signin = PageFactory.initElements(driver, LoginPage.class);
		signin.SignIn("selprueba@gmail.com", "12345");
	}

	// ---------- GO TO HOME PAGE ---------- //

	@Test(priority = 2)
	public void ReturnHomePage() throws InterruptedException {
		MyAccount returnHomePage = PageFactory.initElements(driver, MyAccount.class);
		returnHomePage.ClickHomePage();
	}

	// ----------ADD PRODUCT TO CART ---------- //

	@Test(priority = 3)
	public void AddToCart() throws InterruptedException {
		HomePage addToCart = PageFactory.initElements(driver, HomePage.class);
		addToCart.AddToCart();
	}

	// ---------- PROCEED TO CHECKOUT ---------- //

	@Test(priority = 4)
	public void proceedToCheckOut() throws InterruptedException {
		ShoppingCartSummary checkOut = PageFactory.initElements(driver, ShoppingCartSummary.class);
		checkOut.proceedCheckout();
	}

	// ---------- SELECT ADDRESS ---------- //

	@Test(priority = 5)
	public void addressesCheckOut() throws InterruptedException {
		Addresses checkOut = PageFactory.initElements(driver, Addresses.class);
		checkOut.proceedToCheckout();
	}

	// ---------- SHIPPING ---------- //

	@Test(priority = 6)
	public void shippingCheckOut() throws InterruptedException {
		Shipping checkOut = PageFactory.initElements(driver, Shipping.class);
		checkOut.proceedToCheckout();
	}

	// ---------- PAYMENT ---------- //

	@Test(priority = 7)
	public void choosePaymentMethod() throws InterruptedException {
		PaymentCheckOut method = PageFactory.initElements(driver, PaymentCheckOut.class);
		method.selectPaymentMethod();
	}

	// ---------- ORDER SUMMARY ---------- //

	@Test(priority = 8)
	public void confirmOrder() throws InterruptedException {
		OrderSummary confirm = PageFactory.initElements(driver, OrderSummary.class);
		confirm.confirmOrder();
	}

	// ---------- ORDER CONFIRMATION ---------- //

	@Test(priority = 9)
	public void returnToAccount() throws InterruptedException {
		OrderConfirmation account = PageFactory.initElements(driver, OrderConfirmation.class);
		account.ClickMyAccount();
	}

	// ---------- ORDER HISTORY ---------- //

	@Test(priority = 10)
	public void orderHistory() throws InterruptedException {
		MyAccount orders = PageFactory.initElements(driver, MyAccount.class);
		orders.ClickOrders();
	}

	// ---------- GENERATE PDF ---------- //
	
	@Test(priority = 11)
	public void generatePDF() throws InterruptedException {
		OrderHistory pdf = PageFactory.initElements(driver, OrderHistory.class);
		pdf.ClickPDF();
	}

	@AfterTest
	public void endSession() throws InterruptedException {
		driver.quit();
	}

}
