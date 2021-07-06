package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shipping {

	// ---------- WEB ELEMENTS ---------- //

	// Check mark terms & conditions
	@FindBy(xpath = "//input[@id='cgv']")
	WebElement checkTerms;

	// Check out continue button
	@FindBy(xpath = "//form[@id='form']/p/button/span")
	WebElement chckBtn;

	// ---------- INSTRUCTIONS ---------- //

	public Shipping(WebDriver driver) {
		this.driver = driver;
	}

	final WebDriver driver;

	public void proceedToCheckout() throws InterruptedException {
		checkTerms.click();
		Thread.sleep(2000);
		chckBtn.click();
		Thread.sleep(2000);
	}

}
