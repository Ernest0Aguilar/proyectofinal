package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummary {

	
	final WebDriver driver;
	
	public OrderSummary(WebDriver driver) {
		this.driver=driver;
		
	}
	//----------------------------WEB ELEMENTS---------------------------------//
	
	@FindBy(xpath="//p[@id='cart_navigation']/button/span")
	WebElement confirmOrder;

	//----------------------------INSTRUCTIONS---------------------------------//
	
	public void confirmOrder() throws InterruptedException {
		confirmOrder.click();
		Thread.sleep(2000);

	}
	

}
