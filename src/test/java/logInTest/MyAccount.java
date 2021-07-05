package logInTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount {
	
	final WebDriver driver;
	
	public MyAccount(WebDriver driver) {
	this.driver=driver;
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign out')]")
	WebElement Fuera;
	
	//Click on Sign Out button
	public void SignO() throws InterruptedException{
		Fuera.click();
		Thread.sleep(2000);
	}
	
	

}
