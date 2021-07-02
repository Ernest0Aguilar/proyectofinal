package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails {
	
	final WebDriver driver;
	
	public ProductDetails(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//Color blue tag
	@FindBy(id="color_14")
	WebElement blueTag;
	
	//Add to cart button
	//@FindBy(xpath="//p[@id='send_friend_button']/button")
	//@FindBy(css=".exclusive > span")
	//@FindBy(xpath="//p[@id='add_to_cart']/button/span")
	//@FindBy(xpath="//div[3]/div/p/button/span")
	
	@FindBy(xpath="//span[contains(.,'Add to cart')]")
	WebElement addBtn;
	
	@FindBy(xpath="//span[contains(.,'Proceed to checkout')]")
	WebElement continuar;
	
	public void clickOnColor() throws InterruptedException {
		blueTag.click();
		Thread.sleep(6000);
	}
	
	public void addToCart() throws InterruptedException {
		addBtn.click();
		Thread.sleep(3000);
	}
	
	public void continuar() throws InterruptedException {
		Thread.sleep(4000);
		continuar.click();
	}
	
}
