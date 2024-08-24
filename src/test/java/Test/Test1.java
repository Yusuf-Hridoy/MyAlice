package Test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Driver;
import element.LoginPage;

public class Test1 extends Driver{
	
	LoginPage login = new LoginPage();
	
	@Test
	public void checkLogin() throws InterruptedException {
		// this is the test 1 mention in the pdf
		
		getDriver().get("https://myalice-automation-test.netlify.app/");
		
		WebElement giveusername = getDriver().findElement(login.username);
		giveusername.sendKeys("testuser");
		
		WebElement givepassword = getDriver().findElement(login.password);
		givepassword.sendKeys("password");
		
		WebElement clicklogin = getDriver().findElement(login.loginbtn);
		clicklogin.click();
		
		WebElement verifylogin = getDriver().findElement(login.verifyLogin);
		System.out.println(verifylogin.getText());
		
		Thread.sleep(3000);
		
	}

}
