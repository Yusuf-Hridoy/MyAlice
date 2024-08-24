package element;

import org.openqa.selenium.By;

public class SearchDisplay extends base{
	
	public By search = By.xpath("//input[@id='manga-search']");
	public By clicksearch = By.xpath("//button[normalize-space()='Search']");
	public By naruto = By.xpath("//h3[@id='manga-name']");
	public By onepiece = By.xpath("//h3[@id='manga-name']");
	public By notfound = By.xpath("//p[@class='text-red-500']");

}
