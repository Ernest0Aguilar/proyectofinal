package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummary {

	// ---------- WEB ELEMENTS ---------- //

	// Confirm order button
	@FindBy(xpath = "//p[@id='cart_navigation']/button/span")
	WebElement confirmOrder;

	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public OrderSummary(WebDriver driver) {
		this.driver = driver;

	}

	public void confirmOrder() throws InterruptedException {
		confirmOrder.click();
		Thread.sleep(3000);
	}
}
