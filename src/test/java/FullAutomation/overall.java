package FullAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class overall extends base {
	
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	
	public void prerequisite() throws IOException {
		driver = driverinfo();
		log.info("driver initialized sucessfully");
		
	}
	@Test(dataProvider="parameterization")
	
	public void firstpage(String Username, String Password) throws IOException {
		
		
		driver.get(prop.getProperty("url"));
		FirstPage fp = new FirstPage(driver);
		fp.loginbutton().click();
		log.info("first page successfully vaidated");
		LoginPage lp = new LoginPage(driver);
		lp.emailspace().sendKeys(Username);
		lp.passwordspace().sendKeys(Password);
		lp.submitbutton().click();
		Assert.assertEquals(lp.title().getText(), "WebServices Testing using SoapUI");
		log.error("login page successfully vaidated");
		
		
		}
	@DataProvider
	public Object[][] parameterization() {
		
		Object[][] data = new Object[2][2];
		data[0][0] = "madhan.vcet21@gmail.com";
		data[0][1] = "password";
		
		data[1][0] = "ghazini.madhan@gail.com";
		data[1][1] = "password";
		return data;
}

	@AfterTest
	public void terminate() {
		driver.close();
		log.info("browser closed");
		log.error("browser closed");
	}
}
