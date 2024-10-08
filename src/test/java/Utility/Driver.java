package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utility.Driver;

public class Driver {
	
	private static String browserName = System.getProperty("browser","chrome"); // this is for select the browser
	private static final ThreadLocal<WebDriver> LOCAL_DRIVER = new ThreadLocal<>();
	
	public static void setDriver(WebDriver driver) {
		Driver.LOCAL_DRIVER.set(driver);
	}
	
	public static WebDriver getDriver() {
		return LOCAL_DRIVER.get();	
	
	

	}
	
	public static WebDriver getBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			return new ChromeDriver();
			
		case "firefox":
			return new FirefoxDriver();
		
		case "edge":
			return new EdgeDriver();
		default:
			throw new RuntimeException("Browser not found" + browserName + "!");
		}
	}
	
	@BeforeClass
	public static synchronized void setBrowser() {
		WebDriver webDriver = getBrowser(browserName);
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		webDriver.manage().window().maximize();
		setDriver(webDriver);
	}
	
	@AfterClass
	public static synchronized void quitBrowser() {
		getDriver().quit();
	}
}

