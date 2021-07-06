package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount {

	// ---------- WEB ELEMENTS ---------- //

	// Search bar
	@FindBy(id = "search_query_top")
	WebElement searchBar;

	// Search button
	@FindBy(xpath = "//button[@name=\"submit_search\"]")
	WebElement searchBtn;

	// T-shirt title
	@FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
	WebElement productImage;

	// Sign out button / link
	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	WebElement Fuera;

	// WOMEN category Button
	@FindBy(xpath = "//a[contains(text(),'Women')]")
	WebElement womenCategBtn;

	// Homepage button
	@FindBy(xpath = "//img[@alt='My Store']")
	WebElement homePageImage;

	// Order History button
	@FindBy(xpath = "//a[@title='Orders']")
	WebElement OrdersButton;

	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public MyAccount(WebDriver driver) {
		this.driver = driver;

	}

	public void SignO() throws InterruptedException {
		Fuera.click();
		Thread.sleep(3000);
	}

	public void makeASearch(String busqueda) throws InterruptedException {
		searchBar.sendKeys(busqueda);
		searchBtn.click();
		Thread.sleep(3000);
	}

	public void clickOnImage() throws InterruptedException {
		productImage.click();
		Thread.sleep(3000);
	}

	public void womenCategory() throws InterruptedException {
		womenCategBtn.click();
		Thread.sleep(3000);
	}

	public void ClickHomePage() throws InterruptedException {
		homePageImage.click();
		Thread.sleep(3000);

	}

	public void ClickOrders() throws InterruptedException {
		OrdersButton.click();
		Thread.sleep(3000);
	}

}
