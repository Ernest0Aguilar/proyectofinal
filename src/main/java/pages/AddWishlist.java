package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddWishlist {

	// ---------- WEB ELEMENTS ---------- //

	// Search bar
	@FindBy(id = "search_query_top")
	WebElement searchBox;

	// Enter / Search button
	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement searchButton;

	// Page logo / link to HomePage
	@FindBy(xpath = "//img[@alt='My Store']")
	WebElement logoImg;

	// Product / dress
	@FindBy(xpath = "//img[@alt='Printed Chiffon Dress']")
	WebElement pcd;

	// Sign In button / link
	@FindBy(xpath = "//a[@class='login']")
	WebElement signIn;

	// Add to whishlist button
	@FindBy(css = ".wishlistProd_7")
	WebElement wishlistButton;

	// Successfully added to wishlist
	@FindBy(css = ".fancybox-error")
	WebElement aler;

	// Close alert button
	@FindBy(css = ".fancybox-item")
	WebElement closeBtn;

	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public AddWishlist(WebDriver driver) {
		this.driver = driver;
	}

	public void searchClothes(String clothes) throws InterruptedException {
		searchBox.sendKeys(clothes);
		Thread.sleep(1000);
		searchButton.click();
		Thread.sleep(1000);
	}

	public void addToWishlist() throws InterruptedException {
		Actions actionProvider = new Actions(driver);
		actionProvider.moveToElement(pcd).build().perform();
		wishlistButton.click();
		Thread.sleep(4000);
		actionProvider.moveToElement(aler).build().perform();
		closeBtn.click();
	}
}
