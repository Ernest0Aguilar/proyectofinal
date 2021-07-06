package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopsSubcategory {

	// ---------- WEB ELEMENTS ---------- //

	// Faded Short Sleeve T-shirts (Product)
	@FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
	WebElement product;

	// ---------- INSTRUCTIONS ---------- //
	
	final WebDriver driver;
	
	public TopsSubcategory(WebDriver driver) {
		this.driver = driver;
	}
	
	public void productSelection() throws InterruptedException {
		product.click();
		Thread.sleep(2000);
	}

}
