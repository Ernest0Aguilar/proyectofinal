package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmation {
	
	//----------------------------WEB ELEMENTS---------------------------------//
	
	@FindBy(xpath="//a[contains(text(),'Back to orders')]")
	WebElement backToOrders;
	
	//myAccount button
	@FindBy(xpath="//a[@class='account']")
	WebElement MyAccountBtn;

	//----------------------------WEB ELEMENTS---------------------------------//
	
	public void confirmOrder() throws InterruptedException {
		backToOrders.click();
		Thread.sleep(2000);

	}

	public void ClickMyAccount() throws InterruptedException {
		MyAccountBtn.click();
		Thread.sleep(2000);
	}
	

}
