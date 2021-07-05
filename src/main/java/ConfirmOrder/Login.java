package ConfirmOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	final WebDriver driver; 
	
	public Login(WebDriver driver) {
		this.driver=driver;
}

	//Sign In top right corner button
	@FindBy(id="//a[@class='login']")
	WebElement signInBtn;
	
	//Input email
	@FindBy(id="email")
	WebElement txtEmail;
	
	//Input password
	@FindBy(id="passwd")
	WebElement txtPassword;
	
	//Click Sign in button
	@FindBy(xpath="//button[@id='SubmitLogin']/span")
	WebElement signInUserBtn;
	
	public void clickSignIn() throws InterruptedException {
		Thread.sleep(2000);
		signInBtn.click();
		Thread.sleep(3000);	
	}
	
	public void signInToAccount(String email, String password) throws InterruptedException{
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
		signInUserBtn.click();
	}
}
