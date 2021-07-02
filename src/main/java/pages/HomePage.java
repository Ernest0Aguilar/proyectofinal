package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

		
		final WebDriver driver; 
		
		public HomePage(WebDriver driver) {
			this.driver=driver;
		}
		
		//Sign in link
		@FindBy(xpath= "//a[@class='login']")
		WebElement SignInBtn;

		public void clickSignIn() throws InterruptedException {
			Thread.sleep(2000);
			SignInBtn.click();
			Thread.sleep(3000);
			
		}
		
		

	}