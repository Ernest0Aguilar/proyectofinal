package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

	final WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	// ----------------------------WEB ELEMENTS---------------------------------//

	// Input register email
	@FindBy(id = "email_create")
	WebElement emailTextBoxCreate;

	// Input password
	@FindBy(id = "SubmitCreate")
	WebElement createButton;

	// Input registered email
	@FindBy(id = "email")
	WebElement emailTextBox;

	// Input password registered email
	@FindBy(id = "passwd")
	WebElement passTextBox;

	@FindBy(xpath = "//button[@id='SubmitLogin']/span")
	WebElement logInButton;

	public void createAccount(String email) throws InterruptedException {
		emailTextBoxCreate.sendKeys(email);
		Thread.sleep(1000);
		createButton.click();
		Thread.sleep(5000);
	}

			//Input email
			@FindBy(id="email_create")
			WebElement emailTextBoxCreate;
			
			//Create account button
			@FindBy(id="SubmitCreate")
			WebElement createButton;
			
			@FindBy(id="email")
			WebElement emailTextBoxLogin;
			
			@FindBy(id="passwd")
			WebElement passwordTextBoxLogin;
			
			//Login button
			@FindBy(id="SubmitLogin")
			WebElement submitButton;
			
			
			public void createAccount(String email) throws InterruptedException {
				emailTextBoxCreate.sendKeys(email);
				Thread.sleep(1000);
				createButton.click();
				Thread.sleep(5000);
			}


			public void SignIn(String email, String password) throws InterruptedException {
				emailTextBoxLogin.sendKeys(email);
				passwordTextBoxLogin.sendKeys(password);
				Thread.sleep(1000);
				submitButton.click();
				Thread.sleep(3000);
			}

}
