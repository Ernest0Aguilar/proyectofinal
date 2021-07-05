package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authentication {

final WebDriver driver;
	
	public Authentication(WebDriver driver) {
		this.driver=driver;
	}

	//----------------------------WEB ELEMENTS---------------------------------//
	//Login with credentials
	@FindBy(id="email")
	WebElement emailTextBox;
	
	@FindBy(id="passwd")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//a[@title='Recover your forgotten password']")
	WebElement forgotPassword;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement signInLink;
	
	@FindBy(id="SubmitLogin")
	WebElement signInButton;
	//----------------------------Methods---------------------------------//
	
	public void login(String email, String password) throws InterruptedException {
		signInLink.click();
		Thread.sleep(3000);
		emailTextBox.sendKeys(email);
		passwordTextBox.sendKeys(password);
		Thread.sleep(1000);
		signInButton.click();
	}
}
