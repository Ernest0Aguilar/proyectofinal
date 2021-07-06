package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	// ---------- WEB ELEMENTS ---------- //

	// Input email to register
	@FindBy(id = "email_create")
	WebElement emailTextBoxCreate;

	// Submit create acconut
	@FindBy(id = "SubmitCreate")
	WebElement createButton;

	// Input registered email
	@FindBy(id = "email")
	WebElement emailTextBox;

	// Input password registered email
	@FindBy(id = "passwd")
	WebElement passTextBox;
	
	// Forgot password link
	@FindBy(xpath = "//a[@title='Recover your forgotten password']")
	WebElement forgotPassword;
	
	// Log in button
	@FindBy(xpath = "//button[@id='SubmitLogin']/span")
	WebElement logInButton;
	
	// Log in button
	@FindBy(xpath = "//header[@id='header']/div[2]/div/div/nav/div/a")
	WebElement logInTopLink;
	
	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createAccount(String email) throws InterruptedException {
		emailTextBoxCreate.sendKeys(email);
		Thread.sleep(2000);
		createButton.click();
		Thread.sleep(2000);
	}

	public void SignIn(String email, String password) throws InterruptedException {
		emailTextBox.sendKeys(email);
		Thread.sleep(2000);
		passTextBox.sendKeys(password);
		Thread.sleep(2000);
		logInButton.click();
		Thread.sleep(2000);
	}
	
	public void openSignIn() throws InterruptedException {
		logInTopLink.click();
		Thread.sleep(3000);
	}
	
}
