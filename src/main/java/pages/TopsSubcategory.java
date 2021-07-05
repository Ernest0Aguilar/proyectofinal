package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopsSubcategory {

	final WebDriver driver;

	public TopsSubcategory(WebDriver driver) {
		this.driver = driver;
	}

	// ----------------------------WEB ELEMENTS---------------------------------//

	// Faded Short Sleeve T-shirts -- PRODUCT
	@FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
	WebElement product;

	// ----------------------------INSTRUCTIONS---------------------------------//
	
	public void productSelection() throws InterruptedException {
		product.click();
		Thread.sleep(3000);

	}

}
