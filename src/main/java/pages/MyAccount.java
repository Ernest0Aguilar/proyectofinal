package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount {

	final WebDriver driver;

	public MyAccount(WebDriver driver) {
		this.driver = driver;

	}

	// Search bar
	@FindBy(id = "search_query_top")
	WebElement searchBar;

	// Search button
	@FindBy(xpath = "//button[@name=\"submit_search\"]")
	WebElement searchBtn;

	// Tshirt image
	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	WebElement productImage;

	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	WebElement Fuera;

	// Click on Sign Out button
	public void SignO() throws InterruptedException {
		Fuera.click();
		Thread.sleep(2000);
	}

	public void makeASearch(String busqueda) throws InterruptedException {
		searchBar.sendKeys(busqueda);
		searchBtn.click();
		Thread.sleep(6000);
	}

	public void clickOnImage() throws InterruptedException {
		productImage.click();
		Thread.sleep(6000);
	}
}
