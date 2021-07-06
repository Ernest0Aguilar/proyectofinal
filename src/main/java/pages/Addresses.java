package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addresses {

	// ---------- WEB ELEMENTS ---------- //
	
	//Checkout 'continue' button
	@FindBy(xpath = "//div[@id='center_column']/form/p/button/span")
	WebElement checkOutBtn;

	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public Addresses(WebDriver driver) throws InterruptedException {
		this.driver = driver;
		Thread.sleep(3000);
	}

	public void proceedToCheckout() throws InterruptedException {
		checkOutBtn.click();
		Thread.sleep(3000);
	}
}
