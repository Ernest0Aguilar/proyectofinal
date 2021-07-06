package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartSummary {

	// ---------- WEB ELEMENTS ---------- //

	// Check out continue button
	@FindBy(xpath = "//div[@id='center_column']/p[2]/a/span")
	WebElement checkOutBtn;

	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public ShoppingCartSummary(WebDriver driver) {
		this.driver = driver;
	}

	public void proceedCheckout() throws InterruptedException {
		checkOutBtn.click();
		Thread.sleep(3000);
	}

}
