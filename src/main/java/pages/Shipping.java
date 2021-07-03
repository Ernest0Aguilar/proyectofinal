package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shipping {
	
	//----------------------------WEB ELEMENTS---------------------------------//
	
	@FindBy(xpath="//input[@id='cgv']")
	WebElement checkTerms;
	
	@FindBy(xpath="//form[@id='form']/p/button/span")
	WebElement chckBtn;
	
	//----------------------------WEB ELEMENTS---------------------------------//
	
	public void proceedToCheckout() throws InterruptedException {
		checkTerms.click();
		Thread.sleep(2000);
		chckBtn.click();
		Thread.sleep(2000);
	}
	

}
