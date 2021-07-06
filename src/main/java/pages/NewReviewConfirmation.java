package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewReviewConfirmation {

	// ---------- WEB ELEMENTS ---------- //

	// Confirmation popup 'Ok' button
	@FindBy(xpath = "//span[contains(.,'OK')]")
	WebElement okBtnReview;

	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public NewReviewConfirmation(WebDriver driver) {
		this.driver = driver;
	}

	public void reviewOkBtn() throws InterruptedException {
		okBtnReview.click();
		Thread.sleep(2000);
	}

}