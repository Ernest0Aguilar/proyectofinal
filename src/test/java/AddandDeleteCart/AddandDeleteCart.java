package AddandDeleteCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.MyAccount;

public class AddandDeleteCart {
WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//l.castillo.calamaco//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}

	//----------------------------va a home page
	
	@Test(priority = 1)
	public void ReturnHomePage() throws InterruptedException {
		MyAccount returnHomePage = PageFactory.initElements(driver, MyAccount.class);
		returnHomePage.ClickHomePage();
	}
	
	//----------------------------agrega al carrito
	
	@Test (priority = 2)
	public void AddToCart() throws InterruptedException {
		HomePage addToCart =  PageFactory.initElements(driver, HomePage.class);
		addToCart.AddToCart();
	}

    //-------------------------Elimina del carrito
	    @Test (priority = 3)
	    public void DeleteToCart() throws InterruptedException {
		HomePage deleteToCart =  PageFactory.initElements(driver, HomePage.class);
		deleteToCart.DeleteToCart();
		}
	}
