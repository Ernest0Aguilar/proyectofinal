package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
	
			final WebDriver driver; 
	
			public loginPage(WebDriver driver) {
				this.driver=driver;
	}

			//Input email
			@FindBy(id="email_create")
			WebElement emailTextBoxCreate;
			
			//Input password
			@FindBy(id="SubmitCreate")
			WebElement createButton;
			
			public void createAccount(String email) throws InterruptedException {
				emailTextBoxCreate.sendKeys(email);
				Thread.sleep(1000);
				createButton.click();
				Thread.sleep(5000);
			}

}
