package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmation {
	
	//----------------------------WEB ELEMENTS---------------------------------//
	
	@FindBy(xpath="//a[contains(text(),'Back to orders')]")
	WebElement backToOrders;

	//----------------------------WEB ELEMENTS---------------------------------//
	
	public void confirmOrder() throws InterruptedException {
		backToOrders.click();
		Thread.sleep(2000);

	}
	

}
