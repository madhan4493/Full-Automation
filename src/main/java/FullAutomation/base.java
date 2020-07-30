package FullAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public static WebDriver driver;
	public Properties prop ;
	
	public WebDriver driverinfo() throws IOException {
		
		prop = new Properties();
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fi);
		//String browser = System.getProperty("browser");
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-kepler-SR1-win32-x86_64 (2)\\selenium-java-3.141.59\\chromedriver.exe");
			
			 driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "D:\\eclipse-java-kepler-SR1-win32-x86_64 (2)\\selenium-java-3.141.59\\geckodriver.exe");
			
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		return driver;
		
		
		
	}
	public void screenshot() throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\Karthick\\Desktop\\error.png"));
	
	}
	
} 

