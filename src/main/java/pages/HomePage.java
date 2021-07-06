package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	// ---------- WEB ELEMENTS ---------- //

	// Sign in link
	@FindBy(xpath = "//a[@class='login']")
	WebElement SignInBtn;

	// Add to cart button
	@FindBy(xpath = "//a[@data-id-product='1']")
	WebElement AddtoCartBtn;

	// Product
	@FindBy(xpath = "(//div[@class='product-container'])[1]")
	WebElement SelectElement;

	// Checkout green button
	@FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
	WebElement CheckOut;

	// Delete product from car buttpn
	@FindBy(xpath = "//a[@class='cart_quantity_delete']")
	WebElement DeletetoCartBtn;

	// ---------- INSTRUCTIONS ---------- //
	
	final WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void AddToCart() throws InterruptedException {
		Actions actionProvider = new Actions(driver);
		actionProvider.moveToElement(SelectElement).build().perform();
		Thread.sleep(2000);
		AddtoCartBtn.click();
		Thread.sleep(2000);
		CheckOut.click();
		Thread.sleep(2000);
	}

	public void DeleteToCart() throws InterruptedException {
		DeletetoCartBtn.click();
		Thread.sleep(2000);
	}

	public void clickSignIn() throws InterruptedException {
		Thread.sleep(2000);
		SignInBtn.click();
		Thread.sleep(2000);
	}
}