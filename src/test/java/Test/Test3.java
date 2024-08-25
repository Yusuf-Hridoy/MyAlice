package Test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Driver;
import element.Details;
import element.LoginPage;

public class Test3 extends Driver {
	
	LoginPage login = new LoginPage();
	Details detail = new Details();
	@Test
	public void VerifyModel() throws InterruptedException {
		
		// this is the test 3 mention in the pdf
		
getDriver().get("https://myalice-automation-test.netlify.app/");
		
		WebElement giveusername = getDriver().findElement(login.username);
		giveusername.sendKeys("testuser");
		
		WebElement givepassword = getDriver().findElement(login.password);
		givepassword.sendKeys("password");
		
		WebElement clicklogin = getDriver().findElement(login.loginbtn);
		clicklogin.click();
		
		WebElement clickdetail = getDriver().findElement(detail.clickdetails);
		clickdetail.click();
		
		Thread.sleep(3000);
		
		WebElement titleverify = getDriver().findElement(detail.verifytitle);
		System.out.println(titleverify.getText());
		
		WebElement surnameverify = getDriver().findElement(detail.verifysurname);
		System.out.println(surnameverify.getText());
		
		WebElement verifyimage = getDriver().findElement(detail.image);
		if (verifyimage.isDisplayed()) {
			System.out.println("Image is there");
		} else {
			System.out.println("Image is not there");
		}
		
		WebElement clickclose = getDriver().findElement(detail.close);
		clickclose.click();
		
		WebElement VerifyModelClose = getDriver().findElement(login.verifyLogin);
		System.out.println(VerifyModelClose.getText());
		
		
		
	}

}
