package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccessInf {

	// ---------- WEB ELEMENTS ---------- //
	
	@FindBy(id = "email_create")
	WebElement createEmailTextBox;
	
	@FindBy(id = "SubmitCreate")
	WebElement createAccountButton;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailTextBox;
	
	@FindBy(id = "passwd")
	WebElement passwordTextBox;
	
	@FindBy(xpath = "//a[@title='Recover your forgotten password']")
	WebElement forgotPassword;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']/span")
	WebElement signInBtn;

	final WebDriver driver;

	public AccessInf(WebDriver driver) {
		this.driver = driver;
	}

	// Add Email information
	public void Account(String email) throws InterruptedException {
		emailTextBox.sendKeys(email);
		Thread.sleep(3000);
	}

	// Add Password information
	public void Pass(String passwd) throws InterruptedException {
		passwordTextBox.sendKeys(passwd);
		Thread.sleep(3000);
	}

	// Click on Sign In button
	public void clickSign() throws InterruptedException {
		signInBtn.click();
		Thread.sleep(3000);
	}
}
