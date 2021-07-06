package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistory {

	// ---------- WEB ELEMENTS ---------- //

	// PDF icon
	// El [2] lo puse en caso de que haya varios iconos tome el primer icono de pdf
	// Si no funciona, solo seria cambiar el numero en el que apareza con xpath
	// no me seleccionaba si lo ponia con [1]
	@FindBy(xpath = "(//i[@class='icon-file-text large'])[2]")
	WebElement PDFButton;

	// ---------- INSTRUCTIONS ---------- //

	final WebDriver driver;

	public OrderHistory(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickPDF() throws InterruptedException {
		PDFButton.click();
		Thread.sleep(2000);
	}

}
