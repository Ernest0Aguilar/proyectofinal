package ReviewTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Random;

import pages.HomePage;
import pages.MyAccount;
import pages.NewReviewConfirmation;
import pages.ProductDetails;
import pages.ReviewPopUp;
import pages.TopsSubcategory;
import pages.WomenCategory;
import pages.LoginPage;



public class writeAReview {

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

	// ----------- GO TO LOGIN ----------- //

	@Test(priority = 1)
	public void clickSignIn() throws InterruptedException {
		HomePage mainpage = PageFactory.initElements(driver, HomePage.class);
		mainpage.clickSignIn();
	}

	// ----------- MAKE LOGIN ------------ //

	@Test(priority = 2)
	public void signIn() throws InterruptedException {
		LoginPage mainpage = PageFactory.initElements(driver, LoginPage.class);
		mainpage.SignIn("testautom@gmail.com", "Dev2021!");
	}

	// ----------- GO TO WOMEN CATEGORY ----------- //

	@Test(priority = 3)
	public void navigateToWomen() throws InterruptedException {
		MyAccount navigate = PageFactory.initElements(driver, MyAccount.class);
		navigate.womenCategory();
	}

	// ----------- GO TO TOPS SUBCATEGORY ----------- //

	@Test(priority = 4)
	public void navigateToTops() throws InterruptedException {
		WomenCategory navigate = PageFactory.initElements(driver, WomenCategory.class);
		navigate.topsSubcategory();
	}

	// ----------- SELECT T-SHIRT ----------- //

	@Test(priority = 5)
	public void selecProduct() throws InterruptedException {
		TopsSubcategory chooseProduct = PageFactory.initElements(driver, TopsSubcategory.class);
		chooseProduct.productSelection();
	}

	// ----------- OPEN REVIEW POP UP ----------- //

	@Test(priority = 6)
	public void clickWriteAReview() throws InterruptedException {
		ProductDetails chooseProduct = PageFactory.initElements(driver, ProductDetails.class);
		chooseProduct.linkReviewClick();
	}

	// ----------- MAKE THE REVIEW ----------- //

	@Test(priority = 7)
	public void leaveReview() throws InterruptedException {
		ReviewPopUp writeReview = PageFactory.initElements(driver, ReviewPopUp.class);
		writeReview.writeOpinion("New opinion", "This is an opinion for a product");
	}

	// ----------- CLICK SEND REVIEW ----------- //

	@Test(priority = 8)
	public void finishReview() throws InterruptedException {
		NewReviewConfirmation finish = PageFactory.initElements(driver, NewReviewConfirmation.class);
		finish.reviewOkBtn();
	}

	// ----------- RETURN TO HOMEPAGE ----------- //

	@Test(priority = 9)
	public void returnHome() throws InterruptedException {
		ProductDetails finish = PageFactory.initElements(driver, ProductDetails.class);
		finish.clickLogo();
	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}

}
