package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPopUp {

	// ---------- WEB ELEMENTS ---------- //

	// Review title text box
	@FindBy(id = "comment_title")
	WebElement reviewTitle;

	// Review content text box
	@FindBy(id = "content")
	WebElement reviewContent;

	// Satisfaction stars (5 stars)
	@FindBy(xpath = "//ul[@id='criterions_list']/li/div/div[6]/a")
	WebElement starsCalification;

	// Send review button
	@FindBy(id = "submitNewMessage")
	WebElement sendReview;

	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public ReviewPopUp(WebDriver driver) {
		this.driver = driver;
	}

	public void writeOpinion(String title, String content) throws InterruptedException {
		starsCalification.click();
		Thread.sleep(2000);
		reviewTitle.sendKeys(title);
		Thread.sleep(2000);
		reviewContent.sendKeys(content);
		Thread.sleep(2000);
		sendReview.click();
		Thread.sleep(4000);
	}
}
