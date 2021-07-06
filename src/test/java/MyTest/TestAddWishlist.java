package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Authentication;
import pages.AddWishlist;

public class TestAddWishlist {
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

	@Test
	public void fillFirstAndLastName() throws InterruptedException {
		AddWishlist addWish = PageFactory.initElements(driver, AddWishlist.class);
		Authentication auth = PageFactory.initElements(driver, Authentication.class);
		auth.login("correodeprueba2021@gmail.com", "1234567");
		addWish.searchClothes("Dress");
		addWish.addToWishlist();

	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}

}
