package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FillData {
	
	final WebDriver driver; 
	
	public FillData(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//Radio Button Mr.
	@FindBy(id="id_gender1")
	WebElement radioBtnMr;
	
	//Radio Button Mrs.
		@FindBy(id="id_gender2")
		WebElement radioBtnMrs;
		
	//First name text box
		@FindBy(id="customer_firstname")
		WebElement rgstrFrstName;
		
	//Last name text box
		@FindBy(id="customer_lastname")
		WebElement rgstrLstName;
		
	//Password
		@FindBy(id="passwd")
		WebElement password;
		
	//Day of Birth
		@FindBy(id="days")
		WebElement dayOfBirth;
		
	//Month of Birth
		@FindBy(id="months")
		WebElement monthOfBirth;
		
	//Year of Birth
		@FindBy(id="years")
		WebElement yearOfBirth;
		
	//ADRESS DATA
	
	//Address First Name 
		@FindBy(id="firstname")
		WebElement addressFirstname;
		
	//Address Last Name 
		@FindBy(id="lastname")
		WebElement addressLastname;
	
	//Address 1 
		@FindBy(id="address1")
		WebElement address1;
		
	//City
		@FindBy(id="city")
		WebElement city;
		
	//State
		@FindBy(id="id_state")
		WebElement state;
		
	//ZIP Postal Code
		@FindBy(id="postcode")
		WebElement postalCode;
		
	//Country
		@FindBy(id="id_country")
		WebElement country;
		
	//Mobile number
		@FindBy(id="phone_mobile")
		WebElement mobileNumber;
		
	//Register button
		@FindBy(id="submitAccount")
		WebElement rgstrAccBtn;
		
		public void registerData(String firstName, String lastName, String pass,
				String dayBirth, String monthBirth, String yearBirth, String addressFirst, String addressLast, 
				String address, String city1, String state1, String zipcode, String country1, String mobile) 
						throws InterruptedException {
			radioBtnMr.click();
			Thread.sleep(5000);
			rgstrFrstName.sendKeys(firstName);
			rgstrLstName.sendKeys(lastName);
			password.sendKeys(pass);
			dayOfBirth.sendKeys(dayBirth);
			monthOfBirth.sendKeys(monthBirth);
			yearOfBirth.sendKeys(yearBirth);
			addressFirstname.sendKeys(addressFirst);
			addressLastname.sendKeys(addressLast);
			address1.sendKeys(address);
			city.sendKeys(city1);
			state.sendKeys(state1);
			postalCode.sendKeys(zipcode);
			country.sendKeys(country1);
			mobileNumber.sendKeys(mobile);
			rgstrAccBtn.click();
			
			
			
		}
}
