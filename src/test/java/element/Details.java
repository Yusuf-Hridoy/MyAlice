package element;

import org.openqa.selenium.By;

public class Details extends base {
	
	public By clickdetails = By.xpath("//p[contains(text(),'Humanity fights for survival against giant humanoi')]//span[@class='text-blue-500 cursor-pointer'][normalize-space()='Details']");
	public By verifytitle = By.xpath("//div[@class='bg-white p-6 rounded-lg shadow-lg w-96']//h3[@class='text-xl font-bold mb-2'][normalize-space()='Attack on Titan']");
	public By verifysurname = By.xpath("//p[@class='text-gray-600 mb-4']");
	public By image = By.xpath("//div[@class='bg-white p-6 rounded-lg shadow-lg w-96']//img[@alt='Attack on Titan']");
	public By close = By.xpath("//button[normalize-space()='Close']");
	

}
