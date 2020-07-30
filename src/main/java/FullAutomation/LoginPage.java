package FullAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

WebDriver driver;
	
	By email = By.id("user_email");
	By password = By.id("user_password");
	By ok = By.xpath("//input[@name='commit']");
	By title = By.className("navbar-brand");
	
	public WebElement emailspace() {
		
		return driver.findElement(email);
	} 
	public WebElement passwordspace() {
		
		return driver.findElement(password);
	}
	public WebElement submitbutton() {
		
		return driver.findElement(ok);
	}
	public WebElement title() {
		
		return driver.findElement(title);
	}
	public LoginPage(WebDriver driver) {
		
		this.driver = driver; //this.variable declared inside class = argument variable
	}
}
