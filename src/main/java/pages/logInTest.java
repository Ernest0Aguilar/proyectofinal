package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class logInTest {
	
	final WebDriver driver; 
	
	public logInTest(WebDriver driver) {
		this.driver=driver;
}
	@FindBy(xpath="//a[@class='login']")
	WebElement loginbtn;
	//Email and Password
	@FindBy(xpath="//input[@id='email']")
	WebElement EmailInfo;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement PassInfo;
	@FindBy(xpath="//button[@id='SubmitLogin']/span")
	WebElement Submitbtn;

	public void openSignIn() throws InterruptedException {
		loginbtn.click();
		Thread.sleep(3000);
	}
}

