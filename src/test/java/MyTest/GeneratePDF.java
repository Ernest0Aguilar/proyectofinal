package MyTest;

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
import pages.loginPage;

public class GeneratePDF {
	
	WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//e.esquivel.macias//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	//----------------------------GO TO LOGIN PAGE---------------------------------//
	
	@Test (priority = 1)
	public void clickSignIn() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		mainpage.clickSignIn();
	}
	
	//----------------------------SIGN IN------------------------------------------//
	
	@Test(priority = 2)
	public void SignIn() throws InterruptedException {
		loginPage signin = PageFactory.initElements(driver, loginPage.class);
		signin.SignIn("selprueba@gmail.com", "12345");
	}
	
	//----------------------------GO TO Home PAGE----------------------------------//
	
	@Test(priority = 3)
	public void ReturnHomePage() throws InterruptedException {
		MyAccount returnHomePage = PageFactory.initElements(driver, MyAccount.class);
		returnHomePage.ClickHomePage();
	}
	
	//----------------------------ADD TO CART--------------------------------------//
	
	@Test (priority = 4)
	public void AddToCart() throws InterruptedException {
		HomePage addToCart =  PageFactory.initElements(driver, HomePage.class);
		addToCart.AddToCart();
	}
	
	 //----------------------------PROCEED TO CHEKOUT-----------------------------//
	
	@Test (priority = 5)
    public void proceedToCheckOut() throws InterruptedException {
    	ShoppingCartSummary checkOut = PageFactory.initElements(driver, ShoppingCartSummary.class);
    	Thread.sleep(4000);
    	checkOut.proceedCheckout();
    }
    
    //--------------------------ADDRESSES----------------------------------------//
    
    @Test (priority = 6)
    public void addressesCheckOut() throws InterruptedException {
    	Addresses checkOut = PageFactory.initElements(driver, Addresses.class);
    	Thread.sleep(4000);
    	checkOut.proceedToCheckout();
    	
    }
    
    //--------------------------SHIPPING-----------------------------------------//
    
    @Test (priority = 7)
    public void shippingCheckOut() throws InterruptedException {
    	Shipping checkOut = PageFactory.initElements(driver, Shipping.class);
    	Thread.sleep(4000);
    	checkOut.proceedToCheckout();
    	
    }
    
    //-------------------------PAYMENT------------------------------------------//
    
    @Test (priority = 8)
    public void choosePaymentMethod() throws InterruptedException {
    	PaymentCheckOut method = PageFactory.initElements(driver, PaymentCheckOut.class);
    	Thread.sleep(4000);
    	method.selectPaymentMethod();
    	
    }
    
    //-------------------------ORDERSUMMARY-------------------------------------//
    
    @Test (priority = 9)
    public void confirmOrder() throws InterruptedException {
    	OrderSummary confirm = PageFactory.initElements(driver, OrderSummary.class);
    	Thread.sleep(4000);
    	confirm.confirmOrder();
    	
    }
    
    //--------------------------ORDERCONFIRMATION------------------------------//
    
    @Test (priority = 10)
    public void returnToAccount() throws InterruptedException {
    	OrderConfirmation account = PageFactory.initElements(driver, OrderConfirmation.class);
    	Thread.sleep(4000);
    	account.ClickMyAccount();
    }
    
    //--------------------------ORDERHISTORY----------------------------------//
    
    @Test (priority = 11)
    public void orderHistory() throws InterruptedException {
    	MyAccount orders = PageFactory.initElements(driver, MyAccount.class);
    	Thread.sleep(4000);
    	orders.ClickOrders();
    }
	
  //---------------------------GENERATEPDF-----------------------------------//
   @Test(priority = 12)
  public void generatePDF() throws InterruptedException {
	  OrderHistory pdf = PageFactory.initElements(driver, OrderHistory.class);
	  Thread.sleep(4000);
	  pdf.ClickPDF();//revisar OrderHistory.java
  }
	
	@AfterTest
	public void endSession() throws InterruptedException {
		Thread.sleep(4000);
	    driver.quit();
	}
	
}
