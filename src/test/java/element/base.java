package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Utility.Driver.getDriver;

public class base {
	
	public WebElement getElement (By locator) {
		return getDriver().findElement(locator);
	}
	public void clickelement (By locator) {
		getElement(locator).click();
	}
	
	public String getelementText (By locator) {
		return getElement(locator).getText();
	}


}
