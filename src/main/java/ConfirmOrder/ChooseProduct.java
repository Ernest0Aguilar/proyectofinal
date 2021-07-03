package ConfirmOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseProduct {
	
	final WebDriver driver; 
	
	public ChooseProduct(WebDriver driver) {
		this.driver=driver;
}
	
	//Choose T-shirt tab
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[3]/a")
	WebElement tshirt;
	
	//Choose product
	@FindBy(xpath="//div[@id='center_column']/ul/li/div/div[2]/h5/a")
	WebElement tshirtSelect;
	
	//Add the product to shopping cart
	@FindBy(xpath="//p[@id='add_to_cart']/button/span")
	WebElement addToCart;
	
	//Proceed to the checkout page
	@FindBy(xpath="//div[@id='layer_cart']/div/div[2]/div[4]/a/span")
	WebElement checkoutSummary;
	
	//Continue with the checkout of the product
	@FindBy(xpath="//div[@id='center_column']/p[2]/a/span")
	WebElement checkoutSignIn;
	
	//Keep on with the checkout
	@FindBy(xpath="//div[@id='center_column']/form/p/button/span")
	WebElement checkoutAddress;
	
	//Agree to the terms of service from the web page
	@FindBy(id="cgv")
	WebElement termsOfService;
	
	//Continue with the checkout after checking the terms of service
	@FindBy(xpath="//form[@id='form']/p/button/span")
	WebElement checkoutShipping;
	
	//Payment options
	@FindBy(xpath="//div[@id='HOOK_PAYMENT']/div/div/p/a")
	WebElement payment;
	
	//Confirm order
	@FindBy(xpath="//p[@id='cart_navigation']/button/span")
	WebElement confirm;
	
	public void shirtTab() throws InterruptedException {
		tshirt.click();
		Thread.sleep(2000);
	}
	
	public void chooseShirt() throws InterruptedException {
		tshirtSelect.click();
		Thread.sleep(2000);
	}
	
	public void addProduct() throws InterruptedException {
		addToCart.click();
		Thread.sleep(2000);
	}
	
	public void proceedToCheckout() throws InterruptedException {
		checkoutSummary.click();
		Thread.sleep(2000);
	}
	
	public void proceedToCheckout2() throws InterruptedException {
		checkoutSignIn.click();
		Thread.sleep(2000);
	}
	
	public void proceedToCheckout3() throws InterruptedException {
		checkoutAddress.click();
		Thread.sleep(2000);
	}
	
	public void proceedToCheckout4() throws InterruptedException {
		termsOfService.click();
		checkoutShipping.click();
		Thread.sleep(2000);
	}
	
	public void payingMethod() throws InterruptedException {
		payment.click();
		Thread.sleep(2000);
	}
	
	public void ConfirmOrder() throws InterruptedException {
		confirm.click();
		Thread.sleep(2000);
	}
}
