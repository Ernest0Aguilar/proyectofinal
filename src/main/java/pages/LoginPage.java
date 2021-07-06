package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	// ---------- WEB ELEMENTS ---------- //

	// Input email to register
	@FindBy(id = "email_create")
	WebElement emailTextBoxCreate;

	// Input password to register
	@FindBy(id = "SubmitCreate")
	WebElement createButton;

	// Input registered email
	@FindBy(id = "email")
	WebElement emailTextBox;

	// Input password registered email
	@FindBy(id = "passwd")
	WebElement passTextBox;
	
	// Log in button
	@FindBy(xpath = "//button[@id='SubmitLogin']/span")
	WebElement logInButton;

	// Login button
	@FindBy(id = "SubmitLogin")
	WebElement submitButton;

	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createAccount(String email) throws InterruptedException {
		emailTextBoxCreate.sendKeys(email);
		Thread.sleep(1000);
		createButton.click();
		Thread.sleep(5000);
	}

	public void SignIn(String email, String password) throws InterruptedException {
		emailTextBox.sendKeys(email);
		passTextBox.sendKeys(password);
		Thread.sleep(1000);
		submitButton.click();
		Thread.sleep(3000);
	}
}
