package ConfirmOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	
	final WebDriver driver; 
	
	public Logout(WebDriver driver) {
		this.driver=driver;
	}
	
	//Log out from the web page
	@FindBy(xpath="//header[@id='header']/div[2]/div/div/nav/div[2]/a")
	WebElement logout;
	
	public void logoutPage() throws InterruptedException {
		logout.click();
		Thread.sleep(5000);
	}
}
