package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentCheckOut {
	
		//----------------------------WEB ELEMENTS---------------------------------//
	
		@FindBy(xpath="//div[@id='HOOK_PAYMENT']/div/div/p/a/span")
		WebElement selectMethod;

		//----------------------------WEB ELEMENTS---------------------------------//
		
		public void selectPaymentMethod() throws InterruptedException {
			selectMethod.click();
			Thread.sleep(2000);

		}
		

}
