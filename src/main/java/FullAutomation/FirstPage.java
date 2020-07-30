package FullAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {
	
	WebDriver driver;
	
	By login = By.xpath("//span[contains(text(),'Login')]");
	
	public WebElement loginbutton() {
		
		return driver.findElement(login);
	} 
	public FirstPage(WebDriver driver) {
		
		this.driver = driver; //this.variable declared inside class = argument variable
	}
}
