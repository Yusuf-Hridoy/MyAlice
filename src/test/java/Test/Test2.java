package Test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Driver;
import element.LoginPage;
import element.SearchDisplay;

public class Test2 extends Driver {
	
	LoginPage login = new LoginPage();
	SearchDisplay search = new SearchDisplay();
	@Test
	public void SearchNaruto() throws InterruptedException {
		// this is the test 2 mention in the pdf
		
		// this one is to find naruto and verify
		
		getDriver().get("https://myalice-automation-test.netlify.app/");
		
		WebElement giveusername = getDriver().findElement(login.username);
		giveusername.sendKeys("testuser");
		
		WebElement givepassword = getDriver().findElement(login.password);
		givepassword.sendKeys("password");
		
		WebElement clicklogin = getDriver().findElement(login.loginbtn);
		clicklogin.click();
		
		WebElement narutoo = getDriver().findElement(search.search);
		narutoo.sendKeys("naruto");
		Thread.sleep(3000);
		
		WebElement clickosearch = getDriver().findElement(search.clicksearch);
		clickosearch.click();
		
		WebElement narutoverify = getDriver().findElement(search.naruto);
		System.out.println(narutoverify.getText());
		
		Thread.sleep(3000);
		
	}
	@Test
	public void SearchOnePiece() throws InterruptedException {
		
		// this one is to find one piece and verify
		
		getDriver().get("https://myalice-automation-test.netlify.app/");
		
		WebElement giveusername = getDriver().findElement(login.username);
		giveusername.sendKeys("testuser");
		
		WebElement givepassword = getDriver().findElement(login.password);
		givepassword.sendKeys("password");
		
		WebElement clicklogin = getDriver().findElement(login.loginbtn);
		clicklogin.click();
		
		WebElement onepiece = getDriver().findElement(search.search);
		onepiece.sendKeys("one piece");
		Thread.sleep(3000);
		
		WebElement clickosearch = getDriver().findElement(search.clicksearch);
		clickosearch.click();
		
		WebElement onepieceverify = getDriver().findElement(search.onepiece);
		System.out.println(onepieceverify.getText());
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void SearchsevenDeadlySins() throws InterruptedException {
		// this is the test 2 mention in the pdf
		
		// this one is to find seven deadly sins  and verify but it was not avaiable on the site so i verify the not found message 
		
		
		getDriver().get("https://myalice-automation-test.netlify.app/");
		
		WebElement giveusername = getDriver().findElement(login.username);
		giveusername.sendKeys("testuser");
		
		WebElement givepassword = getDriver().findElement(login.password);
		givepassword.sendKeys("password");
		
		WebElement clicklogin = getDriver().findElement(login.loginbtn);
		clicklogin.click();
		
		WebElement sins = getDriver().findElement(search.search);
		sins.sendKeys("Seven Deadly Sins");
		Thread.sleep(3000);
		
		WebElement clickosearch = getDriver().findElement(search.clicksearch);
		clickosearch.click();
		
		WebElement sds = getDriver().findElement(search.notfound);
		System.out.println(sds.getText());
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void verifyRandomSearch		() throws InterruptedException {
		
		// this one for the not found page
		
		
		getDriver().get("https://myalice-automation-test.netlify.app/");
		
		WebElement giveusername = getDriver().findElement(login.username);
		giveusername.sendKeys("testuser");
		
		WebElement givepassword = getDriver().findElement(login.password);
		givepassword.sendKeys("password");
		
		WebElement clicklogin = getDriver().findElement(login.loginbtn);
		clicklogin.click();
		
		WebElement random = getDriver().findElement(search.search);
		random.sendKeys("wwwwwertyuuio");
		Thread.sleep(3000);
		
		WebElement clickosearch = getDriver().findElement(search.clicksearch);
		clickosearch.click();
		
		WebElement sds = getDriver().findElement(search.notfound);
		System.out.println(sds.getText());
		
		Thread.sleep(3000);
		
	}
	
	
	

}
