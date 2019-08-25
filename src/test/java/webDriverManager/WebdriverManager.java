package webDriverManager;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.Reporter;

import fileReaderManager.FileReaderManager;

public class WebdriverManager {
	
	private WebDriver driver;
	
	String url = null;
	String browser = null;
	
	public WebdriverManager()
	{
		url = FileReaderManager.getinstance().getconfiginstance().getApplicationUrl();
		browser = FileReaderManager.getinstance().getconfiginstance().getBrowserName();
	}
	
	public WebDriver getDriver()
	{
		if(driver == null)
			driver = createDriver();
		return driver;
	}

	public WebDriver createDriver()
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
//			ChromeOptions chrome = new ChromeOptions();
//			chrome.addArguments("headless");  //Headless browser					
//			driver = new ChromeDriver(chrome);		
			
			driver = new ChromeDriver(); // normal brower
		}
		return driver;
		
	}
	
	public void setup()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public void Teardown()
	{
		driver.close();
		driver.quit();
	}
}
