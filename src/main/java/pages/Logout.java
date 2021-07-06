package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	
	// ---------- WEB ELEMENTS ---------- //

	// Log out button
	@FindBy(xpath = "//header[@id='header']/div[2]/div/div/nav/div[2]/a")
	WebElement logout;
	
	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public Logout(WebDriver driver) {
		this.driver = driver;
	}

	public void logoutPage() throws InterruptedException {
		logout.click();
		Thread.sleep(2000);
	}
}
