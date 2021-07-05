package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails {

	final WebDriver driver;

	public ProductDetails(WebDriver driver) {
		this.driver = driver;
	}

	// ----------------------------WEB ELEMENTS---------------------------------//

	@FindBy(xpath = "//span[contains(.,'Add to cart')]")
	WebElement addBtn;

	@FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
	WebElement continueBtn;

	@FindBy(xpath = "//div[@id='product_comments_block_extra']/ul/li/a")
	WebElement linkReview;
	
	@FindBy(xpath = "//div[@id='header_logo']/a/img")
	WebElement principalLogo;

	// ----------------------------INSTRUCTIONS---------------------------------//

	public void addToCart() throws InterruptedException {
		addBtn.click();
		Thread.sleep(3000);
	}

	public void continuar() throws InterruptedException {
		continueBtn.click();
		Thread.sleep(3000);
	}

	public void linkReviewClick() throws InterruptedException {
		linkReview.click();
		Thread.sleep(3000);
	}
	
	public void clickLogo() throws InterruptedException {
		principalLogo.click();
		Thread.sleep(3000);
	}

}
