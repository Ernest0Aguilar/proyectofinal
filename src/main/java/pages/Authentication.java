package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authentication {

	// ---------- WEB ELEMENTS ---------- //

	// Sing in button / link
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	WebElement signInLink;

	// Email registered text box
	@FindBy(id = "email")
	WebElement emailTextBox;

	// Password text box
	@FindBy(id = "passwd")
	WebElement passwordTextBox;

	// Forgot password link
	@FindBy(xpath = "//a[@title='Recover your forgotten password']")
	WebElement forgotPassword;

	// Log in button
	@FindBy(id = "SubmitLogin")
	WebElement signInButton;

	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public Authentication(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String email, String password) throws InterruptedException {
		signInLink.click();
		Thread.sleep(3000);
		emailTextBox.sendKeys(email);
		passwordTextBox.sendKeys(password);
		Thread.sleep(1000);
		signInButton.click();
	}
}
