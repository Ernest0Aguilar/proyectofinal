package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails  {
	//----------------------------WEB ELEMENTS---------------------------------//
	
	@FindBy(xpath="//span[contains(.,'Add to cart')]")
	WebElement addBtn;
	
	@FindBy(xpath="//span[contains(.,'Proceed to checkout')]")
	WebElement continueBtn;
	
	//----------------------------INSTRUCTIONS---------------------------------//
	
	final WebDriver driver;
	public ProductDetails(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void addToCart() throws InterruptedException {
		addBtn.click();
		Thread.sleep(3000);
	}
	
	public void continuar() throws InterruptedException {
		continueBtn.click();
		Thread.sleep(4000);
	}
	
}
