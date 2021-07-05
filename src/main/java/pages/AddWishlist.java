package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddWishlist {

final WebDriver driver;
	
	public AddWishlist(WebDriver driver) {
		this.driver=driver;
	}
	//----------------------------WEB ELEMENTS---------------------------------//
	
	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement searchButton;
	
	@FindBy(xpath="//img[@alt='My Store']")
	WebElement logoImg;
	
	@FindBy(xpath="//img[@alt='Printed Chiffon Dress']")
	WebElement pcd;
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signIn;
	@FindBy(css=".wishlistProd_7")
	WebElement wishlistButton; 

	@FindBy(css=".fancybox-error")
	WebElement aler;
	@FindBy(css=".fancybox-item")
	WebElement closeBtn;	
	//----------------------------Methods---------------------------------//
	public void searchClothes(String clothes) throws InterruptedException {
		searchBox.sendKeys(clothes);
		Thread.sleep(1000);
		searchButton.click();
		Thread.sleep(1000);
	}
	
	public void addToWishlist() throws InterruptedException {
		Actions actionProvider = new Actions(driver);
		actionProvider.moveToElement(pcd).build().perform();
		wishlistButton.click();
		Thread.sleep(4000);
		actionProvider.moveToElement(aler).build().perform();
		closeBtn.click();
	}
}
