package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmation {

	// ---------- WEB ELEMENTS ---------- //
	
	// Back to orders button
	@FindBy(xpath = "//a[contains(text(),'Back to orders')]")
	WebElement backToOrders;

	// MyAccount button
	@FindBy(xpath = "//a[@class='account']")
	WebElement MyAccountBtn;

	// ---------- INSTRUCTIONS ---------- //

	public OrderConfirmation(WebDriver driver) {
		this.driver = driver;
	}

	final WebDriver driver;

	public void confirmOrder() throws InterruptedException {
		backToOrders.click();
		Thread.sleep(2000);

	}

	public void ClickMyAccount() throws InterruptedException {
		MyAccountBtn.click();
		Thread.sleep(2000);
	}

}
