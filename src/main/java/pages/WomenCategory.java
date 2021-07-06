package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenCategory {

	// ---------- WEB ELEMENTS ---------- //

	// Tops Subcategory
	@FindBy(xpath = "//div[@id='categories_block_left']/div/ul/li/a")
	WebElement TopsBtn;

	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public WomenCategory(WebDriver driver) {
		this.driver = driver;
	}

	public void topsSubcategory() throws InterruptedException {
		TopsBtn.click();
		Thread.sleep(2000);
	}

}
