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

	public void signInExistentAcc(String email, String pass) throws InterruptedException {
		emailTextBox.sendKeys(email);
		Thread.sleep(1000);
		passTextBox.sendKeys(pass);
		Thread.sleep(2000);
		logInButton.click();

	}

}
