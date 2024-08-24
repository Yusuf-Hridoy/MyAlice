package element;

import org.openqa.selenium.By;

public class LoginPage extends base {
	
	public By username = By.xpath("//input[@id='username']");
	public By password = By.xpath("//input[@id='password']");
	public By loginbtn = By.xpath("//button[@id='login-btn']");
	public By verifyLogin = By.xpath("//h1[normalize-space()='Manga You Should Read']");

}
