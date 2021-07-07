package setPropertyConfig;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

/* Drivers for browsers */
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetConfig {

	public static WebDriver driver;
	public static String propertyOS = ""; // SELECT the browser (EDGE, MOZILLA, CHROME)
	public static String baseURL = "http://automationpractice.com/index.php";
	public static String webDriverOS = "";
	public static String pathDriver = "";

	@BeforeTest
	public void setBaseURL(String propertyOS) {

		try {
			if (propertyOS.equals("EDGE")) {
				System.out.print("EDGE");

				webDriverOS = "webdriver.edge.driver";
				pathDriver = "C:\\Users\\o.tavares.cordova\\Downloads\\web_drivers_general\\msedgedriver.exe";
				driver = new EdgeDriver();
			} else if (propertyOS.equals("MOZILLA")) {
				System.out.print("MOZILLA");

				webDriverOS = "webdriver.gecko.driver";
				pathDriver = "C:\\Users\\o.tavares.cordova\\Downloads\\web_drivers_general\\geckodriver.exe";
				driver = new FirefoxDriver();
			} else if (propertyOS.equals("CHROME")) {
				System.out.print("CHROME");

				webDriverOS = "webdriver.chrome.driver";
				pathDriver = "C:\\Users\\o.tavares.cordova\\Downloads\\web_drivers_general\\chromedriver.exe";
				driver = new ChromeDriver();
			}

			/* GENEREAL Process */
			System.setProperty(webDriverOS, pathDriver);
			driver.get(baseURL);
			driver.manage().window().maximize();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
			
		}// End catch
	} // End method
}
